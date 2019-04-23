package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.deps.com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPuma {
    private Adidas adidas;


    @And("^click on 'futbol' link from Sub menu in 'TENNIS' option$")
    public void goFutbolSection() {
        adidas.futbolSection();
    }

    @And("^click on 'Hombre' option from the 'Adidas' of the main page$")
    public void goToHombreSection() throws Throwable {
        adidas.hombreSection();
    }

    @Given("^'Puma' page is loaded$")
    public void theUserEnterToHome() {
        adidas = LoadPage.loginPage();
    }

    @And("^click on 'Talla' link from Sub menu in 'TENNIS' option$")
    public void goToTallaSection() throws Throwable {
        adidas.tallaSection();
    }

    @And("^click on 'MX 9.5' talla from Sub menu in 'TALLA' option$")
    public void selectTallaSection() throws Throwable {
        adidas.selectTalla();
    }

    @And("^click on 'Add Carrito' option from menu in 'TENNIS' option$")
    public void selectAddCarrito() throws Throwable {
        adidas.addCarrito();
    }

    @And("^select 'Price' option from 'TENNIS' option$")
    public void selectPrice() throws Throwable {
        adidas.selectPrice();
    }

    @And("^select a 'Tennis' from 'CATALOGO' of tennis$")
    public void selectTennis() throws Throwable {
        adidas.selectTennis();
    }

    @Then("^Verify that 'VIEW SHOOPING BAG' is 1$")
    public void verifyThatVIEWSHOOPINGBAGIs() throws Throwable {

    }

    @Then("^Verify 'CANTIDAD' is 1$")
    public void verifyCANTIDADIs() throws Throwable {
        Assert.assertEquals(adidas.selectCantidad(),"1 Artículo");
    }

    @And("^click on 'VER CARRITO' on confirmation of sale$")
    public void clickOnVERCARRITOOnConfirmationOfSale() {
        adidas.selectCarrito();
    }

    @Then("^Verify Zise is MX 9.5$")
    public void verifyQuantityShouldBe(int talla) {
        Assert.assertEquals(adidas.selectZise(), "MX 9.5");
    }

    @Then("Verify Calzado de Fútbol X 18.3 TF title is displayed")
    public void verifyCalzadoDeFútbolXTFTitle() {
        Assert.assertEquals(adidas.selectTitle(), "Calzado de Fútbol X 18.3 TF");
    }

    @Then("Verify Price should be 1,329.00")
    public void verifyCalzadoDeFutbolPrice() {
        Assert.assertEquals(adidas.selectPrecio(),"$1,329");
    }

    @Then("Verify Total should be 1,428.00")
    public void verifyCalzadoDeFútbolTotal() {
        Assert.assertEquals(adidas.selectPrecioTotal(),"$1,428");
    }

    @Then("^Verify that 'VIEW SHOOPING BAG' is \"([^\"]*)\"$")
    public void verifyThatVIEWSHOOPINGBAGIs(String shooping) throws Throwable {
        Assert.assertEquals(adidas.selectShooping(),shooping);
    }
}
