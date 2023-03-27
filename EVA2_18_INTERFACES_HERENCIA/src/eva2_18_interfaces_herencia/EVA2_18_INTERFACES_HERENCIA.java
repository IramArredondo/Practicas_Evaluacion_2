
package eva2_18_interfaces_herencia;


public class EVA2_18_INTERFACES_HERENCIA {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    public abstract void A();
}

interface intB{
    void B(); //Implicitamente esta escrito el public abstract
}

interface intC extends intA, intB{
    void C();
}

class Prueba implements intC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}