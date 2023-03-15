
package eva2_9_super_2;

                //Clase Derivada <-- Extiende la clase base;
                //subclase extends SUPERclase <-- Jerarquía
                //Hijo extends Padre
                //Estudiante ia a Persona
public class Estudiante extends Persona {
    private String noControl;
    
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.noControl = "-----";
    }
    public Estudiante(String nombre ,String apellido ,int edad ,String noControl){
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //Override: OCULTA EL MÉTODO CON LA MISMA FIRMA EN LA 
    //SUPERCLASE, EN ESTE CASO REMPLAZA A imprimirDatos() de Persona
    @Override
    public void imprimirDatos(){
        /*
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Número de control: " + getNoControl());
        */
        super.imprimirDatos();
        System.out.println("Número de control: " + getNoControl());
    }
}
