package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {
    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > a")
    private WebElement hombreSection;

    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > div > div > div > div > div > div > div > div > div.main-line > div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement futbol;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-s-12.col-l-17.col-xl-18.no-gutters-s > div.product-container___3GvlZ > div:nth-child(2) > div > div > div > div.gl-product-card__media > a > img.gl-product-card__image-hover")
    private WebElement tennis;

    @FindBy(css = "#app > div > div > div.empty_pdp_space_reserver___IFQzq > div > div.hero___2YuNz > div.container.hero_container___nM-YT > div.order_information___z33d1.col-s-12.col-l-8.col-hg-6.col-xl-7.no-gutters > div > div > form > div.row.no-gutters.size_quantity_row___1pgH7 > div.col-s-9.col-product-size___3NjQd > div > div > button > svg")
    private WebElement talla;

    @FindBy(css = "#app > div > div > div.empty_pdp_space_reserver___IFQzq > div > div.hero___2YuNz > div.container.hero_container___nM-YT > div.order_information___z33d1.col-s-12.col-l-8.col-hg-6.col-xl-7.no-gutters > div > div > form > div.row.no-gutters.size_quantity_row___1pgH7 > div.col-s-9.col-product-size___3NjQd > div > div > div > div > ul > li:nth-child(9) > button")
    private WebElement selectTalla;

    @FindBy(css = "#app > div > div > div.empty_pdp_space_reserver___IFQzq > div > div.hero___2YuNz > div.container.hero_container___nM-YT > div.order_information___z33d1.col-s-12.col-l-8.col-hg-6.col-xl-7.no-gutters > div > div > form > div.row.no-gutters.add_to_bag_container___16ts0.null > button")
    private WebElement selectAddCarrito;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-s-12.col-l-17.col-xl-18.no-gutters-s > div.product-container___3GvlZ > div:nth-child(2) > div > div > div > div.gl-product-card__details > a > div.gl-product-card__details-main > div.gl-price > span.gl-price__value.gl-price__value--sale")
    private WebElement selectPrice;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-s-12.col-l-17.col-xl-18.no-gutters-s > div.product-container___3GvlZ > div:nth-child(2) > div > div > div > div.gl-product-card__media > a > img")
    private WebElement selectTennis;

    @FindBy(css = "#modal-root > div > div > div > div > div > div.row.no-gutters.gl-hidden-s-m.modal-cart-info > div.col-l-12 > div > a.gl-cta.gl-cta--primary.gl-cta--full-width.gl-vspacing-s")
    private WebElement selectVerCarrito;

    @FindBy(css = "#content > div.cart-wrapper.row > div.container.clearfix > div.col-8 > div:nth-child(1) > div.col-4.title-wrapper > h1 > span")
    private WebElement cantidad;

    @FindBy(css = "#modal-root > div > div > div > div > div > div.row.no-gutters.gl-hidden-s-m.modal-cart-info > div.col-l-12 > div > div.gl-body--s.gl-no-margin-bottom")
    private WebElement shooping;

    @FindBy(css = "#modal-root > div > div > div > div > div > div.row.no-gutters.gl-hidden-s-m.modal-cart-info > div.col-l-12 > div > div.gl-body--s.price-rows___1DUOj > div:nth-child(1) > div.gl-price > span")
    private WebElement precio;

    @FindBy(css = "#modal-root > div > div > div > div > div > div.row.no-gutters.gl-hidden-s-m.modal-cart-info > div.col-l-12 > div > div:nth-child(6) > div.price-row___3Kw5S > strong > div > span")
    private WebElement precioTotal;

    @FindBy(css = "#shipment_wrapper_0_0 > div.detailscolumn > div.product > div.productattributes > div > div.attribute.attribute_size > span.value")
    private WebElement tamanio;

    @FindBy(css = "#shipment_wrapper_0_0 > div.detailscolumn > div.product > a")
    private WebElement title;


    public void hombreSection() {
        CommonEvents.hoverButton(hombreSection);
    }

    public void futbolSection() {
        CommonEvents.clickButton(futbol);
    }

    public void tallaSection() {
        CommonEvents.clickButton(talla);
    }

    public void selectTalla(){
        CommonEvents.clickButton(selectTalla);
    }

    public void addCarrito(){
        CommonEvents.clickButton(selectAddCarrito);
    }

    public void selectPrice(){
        CommonEvents.getTextContent(selectPrice);
    }

    public void selectTennis(){
        CommonEvents.clickButton(selectTennis);
    }

    public void selectCarrito(){
        CommonEvents.clickButton(selectVerCarrito);
    }

    public String selectTitle(){
        return title.getText();
    }

    public String selectShooping(){
        return shooping.getText();
    }

    public String selectZise(){
        return tamanio.getText();
    }

    public String selectPrecio(){
        return precio.getText();
    }

    public String selectPrecioTotal(){
        return precioTotal.getText();
    }

    public String selectCantidad(){
        return cantidad.getText();
    }
}
