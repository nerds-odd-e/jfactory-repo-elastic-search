package com.yaoruozhou.jfactory;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;

import java.util.Collection;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class ElasticSearchDataRepositoryImpl implements ElasticSearchDataRepository {

    private final ElasticsearchOperations elasticsearchOperations;
    private Class<?> rootClass;

    public ElasticSearchDataRepositoryImpl(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @Override
    public <T> Collection<T> queryAll(Class<T> type) {
        if (!type.equals(rootClass)) {
            return emptyList();
        }
        return elasticsearchOperations.search(elasticsearchOperations.matchAllQuery(), type)
                .getSearchHits().stream().map(SearchHit::getContent).collect(toList());
    }

    @Override
    public void clear() {

    }

    @Override
    public void save(Object object) {
        if (!object.getClass().equals(rootClass)) {
            return;
        }
        elasticsearchOperations.save(object);
        elasticsearchOperations.indexOps(object.getClass()).refresh();
    }

    @Override
    public void setRootClass(Class<?> clazz) {
        rootClass = clazz;
    }
}
