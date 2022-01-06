package com.yaoruozhou.jfactory.cucumber.factories;

import com.github.leeonky.jfactory.Spec;
import com.yaoruozhou.jfactory.cucumber.indexes.Index;

public class Indexes {

    public static class Factory extends Spec<Index> {
        @Override
        protected String getName() {
            return "Index";
        }
    }
}
