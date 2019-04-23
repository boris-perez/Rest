Feature: machine

  Scenario:Comprar un tennis Adidas
    Given 'Puma' page is loaded
    And click on 'Hombre' option from the 'Adidas' of the main page
    And click on 'futbol' link from Sub menu in 'TENNIS' option
    And select 'Price' option from 'TENNIS' option
    And select a 'Tennis' from 'CATALOGO' of tennis
    And click on 'Talla' link from Sub menu in 'TENNIS' option
    And click on 'MX 9.5' talla from Sub menu in 'TALLA' option
    And click on 'Add Carrito' option from menu in 'TENNIS' option
    Then Verify that 'VIEW SHOOPING BAG' is "1 artículo"
    Then Verify Total should be 1,428.00
    Then Verify Price should be 1,329.00
    And click on 'VER CARRITO' on confirmation of sale
    Then Verify Calzado de Fútbol X 18.3 TF title is displayed
    Then Verify Zise is MX 9.5
    Then Verify 'CANTIDAD' is 1

