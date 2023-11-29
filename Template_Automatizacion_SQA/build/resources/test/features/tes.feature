Feature: Ejercicos en page NotePad
  Yo como postulante automatizador qa
  deseo ingtresar a la pagina online-notepad
  para realizar ejercicios de automatizacion.

  Scenario: Crear una nota de texto enriquecido con
  letra en negrita
    Given me dijiro a la pagina de NotePad
    When selecciono nota de texto enriquecido
    And envio el texto "Hola este es un texto de prueba"
    Then valido que el texto este presente