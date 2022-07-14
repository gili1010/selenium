package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("^Navego a Google$")
    public void navigateToGoogle(){
        google.navigateToGoogle();

    }
    @When("^Ingreso en el buscador Criteria$")
    public void enterSearchCriteria(){
        google.enterCriteria();
    }
    @And("^presiono buscar$")
    public void clickSearchButton(){
        google.clickGoogleSearch();
    }
    @Then("^Obtengo resultados$")
    public void validateResult(){
    }

}
