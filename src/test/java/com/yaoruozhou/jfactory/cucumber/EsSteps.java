package com.yaoruozhou.jfactory.cucumber;

import com.yaoruozhou.jfactory.cucumber.indexes.Index;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {CucumberConfig.class}, loader = SpringBootContextLoader.class)
@CucumberContextConfiguration
public class EsSteps {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Before
    public void cleanUp() {
        elasticsearchOperations.indexOps(Index.class).delete();
    }

}
