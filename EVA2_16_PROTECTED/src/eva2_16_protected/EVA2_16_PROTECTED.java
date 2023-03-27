package eva2_16_protected;

public class EVA2_16_PROTECTED {

    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase obj = new SuperClase();
        obj.dato = 100;
    }

}

class SuperClase {

    protected int dato;

}
class subClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor del dato es de: " + dato);
    }
}