
package eva2_17_interfaces;


public class EVA2_17_INTERFACES {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos md = new MostrarDatos();
        Persona p =  new Persona("Iram", 19);
        p.imprimirDatos();
        System.out.println("");
        Computadora c1 = new Computadora("Intel Celeron", 8, 10000, "Laptop");
        c1.imprimirDatos();
    }
    
}
