package com.pablopuntin.automovil.logica;

import com.pablopuntin.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String marca, String modelo, String motor, String color,
            String patente, int cantPuertas) {
        //creo un auto primero y despues lo enviamos a la persistencia
        Auto auto = new Auto();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Auto> traerAutos() {
      return controlPersis.traerAtos();  
    }

    public void borrarAuto(int idAuto) {
    
        controlPersis.borrarAuto(idAuto);
    }
    
}
