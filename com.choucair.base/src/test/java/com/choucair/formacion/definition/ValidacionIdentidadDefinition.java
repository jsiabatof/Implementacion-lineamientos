package com.choucair.formacion.definition;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.choucair.formacion.steps.ValidacionIdentidadSteps;

import au.com.bytecode.opencsv.CSVReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidacionIdentidadDefinition {
	
	@Steps
	ValidacionIdentidadSteps validacionIdentidadSteps;
	
	@Given("^Ingresar en proteccion con la Url de prueba$")
	public void ingresar_en_proteccion_con_la_Url_de_prueba() {
		validacionIdentidadSteps.ingresar_proteccion();
	}

	@Given("^Capturar y mostrar en pantalla el punto nueve de las condiciones de uso$")
	public void capturar_y_mostrar_en_pantalla_el_punto_nueve_de_las_condiciones_de_uso() {
		validacionIdentidadSteps.captura_condiciones();
	}

	@When("^Diligenciar el formulario Validación de Identidad$")
	public void diligenciar_el_formulario_Validación_de_Identidad() throws Throwable {	
		String CSV_file = "src/test/resources/Datadriven/datosimport.csv";
		CSVReader reader = null;
		try{  			
			reader = new CSVReader(new FileReader(CSV_file));
		    String[] cell=reader.readNext();
		    validacionIdentidadSteps.diligenciar_validacion_identidad(cell);
		    }catch (FileNotFoundException e) {
		    	e.printStackTrace();
		    	}
		}

	@Then("^Verifico caso exitoso$")
	public void verifico_caso_exitoso() {
		validacionIdentidadSteps.verificar_caso_exitoso();
	}
}

