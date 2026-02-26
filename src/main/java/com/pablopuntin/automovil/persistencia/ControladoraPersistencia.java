
package com.pablopuntin.automovil.persistencia;

import com.pablopuntin.automovil.logica.Auto;
import java.util.List;


public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void agregarAutomovil(Auto auto) {
        
        autoJpa.create(auto);
    }

    public List<Auto> traerAtos() {
        return autoJpa.findAutoEntities();
    }
    
}
