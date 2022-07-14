Feature: Probar busqueda en Google
  Scenario: Busco algo en Google
    Given Navego a Google
    When Ingreso en el buscador Criteria
    And presiono buscar
    Then Obtengo resultados