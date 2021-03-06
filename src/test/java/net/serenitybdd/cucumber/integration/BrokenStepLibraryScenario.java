package net.serenitybdd.cucumber.integration;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by john on 23/07/2014.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin="cucumber.runtime.formatter.SerenityReporter",features="src/test/resources/samples/scenario_with_a_broken_step_definition_class.feature")
public class BrokenStepLibraryScenario {}
