package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Iram", 18);
        System.out.println(p1);
        System.out.println(p2);
        
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        nombre = "----"; 
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        //NO ESTAMOS INVOCANDO EL MÉTODO SOBREESCRITO DE LA SUPERCLASE
        //AQUÍ ESTAMOS REEMPLAZANDO TAOTALMENTE A toString DE LA SUPERCLASE
        String cade = "Datos\n" +
                      "Nombre: " + nombre + "\n" +
                      "Edad: " + edad;
        return cade;
    }
}
