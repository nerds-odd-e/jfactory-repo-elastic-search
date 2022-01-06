package com.yaoruozhou.jfactory;

import com.github.leeonky.jfactory.DataRepository;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.Collection;

public class ElasticSearchDataRepository implements DataRepository {

    private final ElasticsearchOperations elasticsearchOperations;

    public ElasticSearchDataRepository(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @Override
    public <T> Collection<T> queryAll(Class<T> type) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void save(Object object) {
        elasticsearchOperations.save(object);
    }
}
