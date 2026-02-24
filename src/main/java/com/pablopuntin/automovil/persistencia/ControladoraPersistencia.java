
package com.pablopuntin.automovil.persistencia;

import com.pablopuntin.automovil.logica.Auto;


public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void agregarAutomovil(Auto auto) {
        
        autoJpa.create(auto);
    }
    
}
