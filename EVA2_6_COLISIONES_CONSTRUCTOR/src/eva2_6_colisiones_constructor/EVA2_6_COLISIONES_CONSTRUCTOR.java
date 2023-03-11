
package eva2_6_colisiones_constructor;


public class EVA2_6_COLISIONES_CONSTRUCTOR {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANIMAL");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        //-------------------------------------
        System.out.println("");
        System.out.println("MAMIFERO");
        Mamifero mamifero = new Mamifero();
        //mamifero.comer();
        //mamifero.respirar();
    }
    
}
