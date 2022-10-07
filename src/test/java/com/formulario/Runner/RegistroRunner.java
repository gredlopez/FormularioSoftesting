package com.formulario.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/formularioSoft.feature",
        glue = "com.formulario.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RegistroRunner {
}
