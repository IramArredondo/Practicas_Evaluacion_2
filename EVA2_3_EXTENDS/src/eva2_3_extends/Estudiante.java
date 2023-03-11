
package eva2_3_extends;

                //Clase Derivada <-- Extiende la clase base;
                //subclase extends SUPERclase <-- Jerarquía
                //Hijo extends Padre
                //Estudiante ia a Persona
public class Estudiante extends Persona {
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
