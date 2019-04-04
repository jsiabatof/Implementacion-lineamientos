package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import net.serenitybdd.core.pages.PageObject;

public class ValidacionIdentidadPage extends PageObject{

	public void Nombre(String string) {
		WebDriver driver = getDriver();
	    driver.switchTo().frame(driver.findElement(By.id("contenido"))).switchTo().frame(driver.findElement(By.id("contenido2")));
	    WebElement iframe1 = driver.findElement(By.id("nombres"));
	    iframe1.sendKeys(string);
	    }

	public void PrimerApellido(String string) {
		WebDriver driver = getDriver();
		WebElement iframe2 = driver.findElement(By.id("primerApellido"));
	    iframe2.sendKeys(string);
	}

	public void SegundoApellido(String string) {
		WebDriver driver = getDriver();
		WebElement iframe3 = driver.findElement(By.id("segundoApellido"));
	    iframe3.sendKeys(string);
	}

	public void Ventajas() {
		WebDriver driver = getDriver();
		WebElement iframe4 = driver.findElement(By.id("tab2"));
	    iframe4.click();
	}

	public void TipoDocumento(String string) {
		WebDriver driver = getDriver();
		WebElement iframe5 = driver.findElement(By.id("tipoIdentificacion"));
	    iframe5.sendKeys(string);
	}

	public void NumeroDocumento(String string) {
		WebDriver driver = getDriver();
		WebElement iframe6 = driver.findElement(By.id("identificacion"));
	    iframe6.sendKeys(string);
	}

	public void FechaExp(String string) {
		WebDriver driver = getDriver();
		WebElement iframe7 = driver.findElement(By.id("fechaExpedicion"));
	    iframe7.sendKeys(string);
	}

	public void Validar() {
		WebDriver driver = getDriver();
		WebElement iframe8 = driver.findElement(By.xpath("//*[@id=\'izquierdoAct\']/div[5]/a"));
	    iframe8.click();
	}

	public void captcha() {
		WebDriver driver = getDriver();
		WebElement iframe8 = driver.findElement(By.id("popup_message"));
		String labelv ="- Ingrese el codigo captcha";
		String strMensaje = iframe8.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
