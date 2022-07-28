Feature: Rentas ver deuda Automotor
  Scenario: Ingresar a rentas deudas automotor
    Given Navego a Rentas
    When selecciono pagar y ver deuda
    And selecciono automotor
    And ingreso patente del vehiculo
    And selecciono Concultar
    Then Obtengo resultados