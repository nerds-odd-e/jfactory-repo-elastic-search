package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.cucumber.JData;
import com.github.leeonky.jfactory.cucumber.Table;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ElasticSearchData {

    private final JData jData;

    public ElasticSearchData(JData jData) {
        this.jData = jData;
    }

    @Given("Exists es data {string}:")
    public void prepareEsData(String index, Table table) {
        jData.prepare(index, table);
    }

    @Then("All es data {string} should be:")
    public void allEsDataShouldBe(String queryExpression, String dalExpression) {
        jData.allShould(queryExpression, dalExpression);
    }
}
