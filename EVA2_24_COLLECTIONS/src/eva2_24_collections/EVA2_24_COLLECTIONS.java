
package eva2_24_collections;

import java.util.ArrayList;


public class EVA2_24_COLLECTIONS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Collections --> contenedores (tipo de arreglos pero sofisticados)
        ArrayList miArreglo = new ArrayList(); //Guardamos objetos en general (provenientes de la Superclase Objets
        miArreglo.add(new Persona());
        miArreglo.add(new Automovil());
        miArreglo.add(new Perro());
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>(); //<Integer> Solo permite guardar enteros (int).
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);
        
    }
    
}
class Persona{
    
}
class Automovil{
    
}
class Perro{
    
}
