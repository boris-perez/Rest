Feature: machine

  Background:
    Given 'Puma' page is loaded
    And click on 'Hombre' option from the 'Adidas' of the main page

  Scenario:Comprar un tennis Adidas
    Given click on 'futbol' link from Sub menu in 'TENNIS' option
    And click on 'Hombre' option from the 'Adidas' of the main page
    And click on 'futbol' link from Sub menu in 'TENNIS' option
    And click on 'Talla' link from Sub menu in 'TENNIS' option
    And click on 'MX 9.5' talla from Sub menu in 'TALLA' option