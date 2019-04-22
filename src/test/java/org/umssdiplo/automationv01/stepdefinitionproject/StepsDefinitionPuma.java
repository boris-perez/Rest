package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPuma {
    private Adidas adidas;


    @Given("^click on 'futbol' link from Sub menu in 'TENNIS' option$")
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
}
