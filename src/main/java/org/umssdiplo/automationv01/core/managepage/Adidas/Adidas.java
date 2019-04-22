package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Adidas extends BasePage {
    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > a")
    private WebElement hombreSection;

    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > div > div > div > div > div > div > div > div > div.main-line > div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement futbol;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-s-12.col-l-17.col-xl-18.no-gutters-s > div.product-container___3GvlZ > div:nth-child(2) > div > div > div > div.gl-product-card__media > a > img.gl-product-card__image-hover")
    private WebElement tennis;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-l-7.col-xl-6.no-gutters-s > div > div:nth-child(2) > div.title___1MG81 > span.gl-label.gl-label--l.gl-label--bold")
    private WebElement talla;


    public void hombreSection() {
        CommonEvents.clickButton(hombreSection);
    }

    public void futbolSection() {

        CommonEvents.hoverButton(hombreSection);
    }

    public void tallaSection() {
        CommonEvents.clickButton(futbol);
        CommonEvents.clickButton(talla);
    }

    public void selectTalla(){

    }
}
