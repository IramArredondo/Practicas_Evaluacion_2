
package eva2_9_super_2;

            //Docentes ia-a persona
public class Docentes extends Persona {
    private String plaza;
    
    public Docentes(){
        plaza = "--------";
    }
    public Docentes(String nombre ,String apellido ,int edad ,String plaza){
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: " + getPlaza());
    }
}
