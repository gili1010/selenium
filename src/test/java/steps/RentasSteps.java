package steps;

import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RentasPage;

public class RentasSteps {
    RentasPage google = new RentasPage();

    @Given("^Navego a Rentas$")
    public void navigateToRentas(){
        google.navigateToRentas();

    }
    @When("^selecciono pagar y ver deuda$")
    public void clickPagaryVerDeuda(){
        google.clickPagaryVerDeuda();
    }
    @And("^selecciono automotor$")
    public void clickAutomotor(){
        google.clickAutomotor();
    }
    @And("^ingreso patente del vehiculo$")
    public void ingresarPatente(){
        google.ingresarPatente();
    }
    @And("^selecciono Concultar$")
    public void clickConsultar(){
        google.clickConsultar();
    }
    @Then("^Obtengo resultados$")
    public void validateResult(){
        Assert.assertEquals("Detalle de cuotas",google.validateResult());
    }

}
