package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.yaoruozhou.jfactory.ElasticSearchDataRepository;
import com.yaoruozhou.jfactory.cucumber.factories.Indexes;

public class EntityFactory extends JFactory {

    public EntityFactory(ElasticSearchDataRepository elasticSearchDataRepository) {
        super(elasticSearchDataRepository);
        configFactory();
    }

    private void configFactory() {
        register(Indexes.Factory.class);
    }
}
