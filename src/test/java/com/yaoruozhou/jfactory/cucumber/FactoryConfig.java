package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.yaoruozhou.jfactory.ElasticSearchDataRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

@Configuration
public class FactoryConfig {

    @Bean
    public JFactory factorySet(ElasticsearchOperations elasticsearchOperations) {
        return new EntityFactory(new ElasticSearchDataRepositoryImpl(elasticsearchOperations));
    }

}
