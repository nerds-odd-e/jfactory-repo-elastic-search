package com.yaoruozhou.jfactory.cucumber.factories;

import com.github.leeonky.jfactory.Spec;
import com.yaoruozhou.jfactory.cucumber.indexes.IndexWithChild;

public class IndexesWithChild {

    public static class Factory extends Spec<IndexWithChild> {
        @Override
        protected String getName() {
            return "IndexWithChild";
        }
    }
}
