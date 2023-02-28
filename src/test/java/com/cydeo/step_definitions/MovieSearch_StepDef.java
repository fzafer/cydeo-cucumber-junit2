package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

public class MovieSearch_StepDef {


    @Given("I like {string}")
    public void ı_like(String string) {
        System.out.println("given " + string);

    }

    @Given("I like")
    public void ı_like(List<String> movieTypesList) {
       // public void ı_like(io.cucumber.datatable.DataTable dataTable) {

        System.out.println("given " + movieTypesList);
            // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I like below movies with certain types")
    public void ı_like_below_movies_with_certain_types(Map<String, String> movieTypesMap) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("given " + movieTypesMap);

    }

    @When("I go to homepage")
    public void ı_go_to_homepage() {
        System.out.println("when");
    }
    @Then("I should get right recommendation")
    public void ı_should_get_right_recommendation() {
        System.out.println("then");
    }

    int actualResult;
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("given, calc is open");
    }
    @When("I add {int} with {int}")
    public void ı_add_with(int int1, Integer int2) {
        System.out.println("I add " + int1 + " with " + int2);
        actualResult = int1 + int2;
    }
    @Then("I should get {int}")
    public void ı_should_get(int expectedResult) {
        System.out.println("then I should get " + expectedResult);
        Assert.assertEquals(expectedResult, actualResult);
    }


}
