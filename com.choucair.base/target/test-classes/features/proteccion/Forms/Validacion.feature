#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Validación de Identidad
  El usuario debe poder ingresar al formulario los datos requeridos.
  Se quiere capturar y mostrar en pantalla el punto 9 de las condiciones de uso
  ir a la opción ....mas ventajas

  @CasoExitoso
  Scenario: Diligenciamiento exitoso de todos los campos
    Given Ingresar en proteccion con la Url de prueba
    And Capturar y mostrar en pantalla el punto nueve de las condiciones de uso
    When Diligenciar el formulario Validación de Identidad
    Then Verifico caso exitoso

