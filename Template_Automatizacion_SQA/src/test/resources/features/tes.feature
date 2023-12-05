Feature: Ejercicos en page NotePad
  Yo como postulante automatizador qa
  deseo ingtresar a la pagina online-notepad
  para realizar ejercicios de automatizacion.

  Scenario Outline: Crear una nota de texto enriquecido con letra en negrita
    Given me dijiro a la pagina de NotePad
    When selecciono nota de texto enriquecido
    And envio el texto <ejemplo>
    Then valido que el texto este presente
    Examples:
      | ejemplo                         |
      | Hola este es un texto de prueba |

#  Scenario: Eliminar un artículo de una lista de 5 elementos
#    Given me dijiro a la pagina de NotePad
#    When seleccion lista de tareas
#    And agrego seis tareas
#    Then elimino una de las tareas
