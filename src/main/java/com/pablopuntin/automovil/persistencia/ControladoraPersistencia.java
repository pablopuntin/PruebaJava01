
package com.pablopuntin.automovil.persistencia;

import com.pablopuntin.automovil.logica.Auto;
import com.pablopuntin.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void agregarAutomovil(Auto auto) {
        
        autoJpa.create(auto);
    }

    public List<Auto> traerAtos() {
        return autoJpa.findAutoEntities();
    }

    public void borrarAuto(int idAuto) {
        
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Auto traerAuto(int idAuto) {
     return autoJpa.findAuto(idAuto);
    }

    public void modificarAuto(Auto auto) {
      
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
