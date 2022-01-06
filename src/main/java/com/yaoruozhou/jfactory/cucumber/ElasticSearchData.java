package com.yaoruozhou.jfactory.cucumber;

import io.cucumber.java.en.Given;
import com.github.leeonky.jfactory.cucumber.Table;

public class ElasticSearchData {

    @Given("Exists es data {string}:")
    public void exists_es_data(String index, Table table) {
    }
}
