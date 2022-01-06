package com.yaoruozhou.jfactory;

import com.github.leeonky.jfactory.DataRepository;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;

import java.util.Collection;

import static java.util.stream.Collectors.toList;

public class ElasticSearchDataRepository implements DataRepository {

    private final ElasticsearchOperations elasticsearchOperations;

    public ElasticSearchDataRepository(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @Override
    public <T> Collection<T> queryAll(Class<T> type) {
        return elasticsearchOperations.search(elasticsearchOperations.matchAllQuery(), type)
                .getSearchHits().stream().map(SearchHit::getContent).collect(toList());
    }

    @Override
    public void clear() {

    }

    @Override
    public void save(Object object) {
        elasticsearchOperations.save(object);
        elasticsearchOperations.indexOps(object.getClass()).refresh();
    }
}
