package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.proteccion.com/wps/portal/proteccion/web/home/general/solicita-clave")
public class ProteccionIngresarPage extends PageObject {
	
	@FindBy(xpath="(//P[text()='Condiciones de uso'])[1]")
	public WebElementFacade btnCondiciones;
	
	public void captura() {
		getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 200)", " ");
		btnCondiciones.click();
		getJavascriptExecutorFacade().executeScript("window.scrollBy(0, 2400)", " ");
		Serenity.takeScreenshot();
		getDriver().navigate().back();
	}


}
