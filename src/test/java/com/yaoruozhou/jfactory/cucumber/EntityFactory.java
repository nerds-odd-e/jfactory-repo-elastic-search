package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.yaoruozhou.jfactory.cucumber.factories.Indexes;

public class EntityFactory extends JFactory {

    public EntityFactory() {
        super();
        configFactory();
    }

    private void configFactory() {
        register(Indexes.Factory.class);
    }
}
