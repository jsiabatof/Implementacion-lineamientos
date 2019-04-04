package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ProteccionIngresarPage;
import com.choucair.formacion.pageobjects.ValidacionIdentidadPage;

import net.thucydides.core.annotations.Step;

public class ValidacionIdentidadSteps {
	
	ProteccionIngresarPage proteccionIngresarPage;
	ValidacionIdentidadPage validacionIdentidadPage;
	
	@Step
	public void ingresar_proteccion() {
		proteccionIngresarPage.open();
	}
	
	@Step
	public void captura_condiciones() {
		proteccionIngresarPage.captura();
	}
	
	@Step
	public void diligenciar_validacion_identidad(String[] cell) {
		int i=0;
		validacionIdentidadPage.Nombre(cell[i].split(";")[0]);
		validacionIdentidadPage.PrimerApellido(cell[i].split(";")[1]);
		validacionIdentidadPage.SegundoApellido(cell[i].split(";")[2]);
		validacionIdentidadPage.Ventajas();
		validacionIdentidadPage.TipoDocumento(cell[i].split(";")[3]);
		validacionIdentidadPage.NumeroDocumento(cell[i].split(";")[4]);
		validacionIdentidadPage.FechaExp(cell[i].split(";")[5]);
		validacionIdentidadPage.Validar();
	}

	public void verificar_caso_exitoso() {
		validacionIdentidadPage.captcha();
	}
}
