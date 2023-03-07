package MisClases;




public class Persona {
    int id;
    String nombre;
    int edad;
    

    //Metodos set
    public void setId(int valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    //Metodos get
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //Imprime datos de la persona
    public void imprimirDatosPersona(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
