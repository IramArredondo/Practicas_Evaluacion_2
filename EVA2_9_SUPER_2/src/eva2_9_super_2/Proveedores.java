package eva2_9_super_2;

//Proveedores ia-a (es una) persona
public class Proveedores extends Persona {

    private String rfc;

    public Proveedores() {
        rfc = "--------";
    }

    public Proveedores(String nombre, String apellido, int edad, String rfc) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: " + getRfc());
    }
}
