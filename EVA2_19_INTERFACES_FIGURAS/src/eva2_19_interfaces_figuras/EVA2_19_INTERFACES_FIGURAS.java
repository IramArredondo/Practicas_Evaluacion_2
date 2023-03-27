
package eva2_19_interfaces_figuras;


public class EVA2_19_INTERFACES_FIGURAS {

    
    public static void main(String[] args) {
        
        // NO PODEMOS CREAR INSTANCIAS DE INTERFACES
        
        //Figuras f1 = new Figuras();
        //MostrarDatos mostrar = new MostrarDatos();
        
        Circulo c1 = new Circulo(20);
        c1.imprimirDatos();
        System.out.println("");
        Triangulo t1 = new Triangulo(20, 20);
        t1.imprimirDatos();
    }
    
}
