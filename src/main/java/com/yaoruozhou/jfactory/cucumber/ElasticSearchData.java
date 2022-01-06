package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.github.leeonky.jfactory.cucumber.JData;
import com.github.leeonky.jfactory.cucumber.Table;
import com.yaoruozhou.jfactory.ElasticSearchDataRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ElasticSearchData {

    private final JData jData;
    private final JFactory jFactory;

    public ElasticSearchData(JData jData, JFactory jFactory) {
        this.jData = jData;
        this.jFactory = jFactory;
    }

    @Given("Exists es data {string}:")
    public void prepareEsData(String index, Table table) {
        setRootClass(index);
        jData.prepare(index, table);
    }

    @Then("All es data {string} should be:")
    public void allEsDataShouldBe(String queryExpression, String dalExpression) {
        jData.allShould(queryExpression, dalExpression);
    }

    @Given("Exists {int} es data {string}:")
    public void existsEsData(int number, String index) {
        setRootClass(index);
        jData.prepare(number, index);
    }

    private void setRootClass(String index) {
        ElasticSearchDataRepository dataRepository = (ElasticSearchDataRepository) jFactory.getDataRepository();
        dataRepository.setRootClass(jFactory.specFactory(index).getType().getType());
    }

    @Then("Es data {string} should be:")
    public void esDataShouldBe(String queryExpression, String dalExpression) {
        jData.should(queryExpression, dalExpression);
    }
}
