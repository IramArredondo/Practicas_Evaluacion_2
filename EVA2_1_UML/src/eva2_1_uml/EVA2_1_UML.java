
package eva2_1_uml;

import MisClases.Vehiculo;
import MisClases.Persona;
import MisClases.Tv;


public class EVA2_1_UML {

    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.imprimirDatosPersona();
        
        Vehiculo v1 = new Vehiculo();
        v1.imprimirDatosVehiculo();
        
        Tv tv1 = new Tv();
        tv1.imprimirDatosTv();
    }
    
}
