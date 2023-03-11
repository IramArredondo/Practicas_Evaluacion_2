
package eva2_7_this;


public class EVA2_7_THIS {

    
    public static void main(String[] args) {
        //this no se puede usar en un metodo estatico (static)
        //this no es visible en el exterior.
        //this solo funciona internamente, no existe fuera de los objetos.
    }
    
    public void imprimir(){
        //aqui tambien es visible this
    }
    
}

    //rhis es una referencia a una instancia de la clase.
    //todos los objetos tienen this.
    //pueden usar this en cualquier clase.
    class Persona{
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
            //this.nombre es el atributo de la clase
            //nombre es la variable (parámetro) declarado en el método
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
            //this permite referenciar al atributo nombre declarado en la clase persona
        }
        
        public void imprimirDatos(){
            System.out.println("El nombre es: " + this.nombre);
        }
    }