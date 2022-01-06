package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.yaoruozhou.jfactory.cucumber.indexes.Index;
import com.yaoruozhou.jfactory.cucumber.indexes.IndexWithChild;
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

    @Autowired
    JFactory jFactory;

    @Before
    public void cleanUp() {
        elasticsearchOperations.indexOps(Index.class).delete();
        elasticsearchOperations.indexOps(IndexWithChild.class).delete();
    }

}
