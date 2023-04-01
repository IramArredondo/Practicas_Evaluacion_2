
package eva2_25_has.a.direccion;


public class EVA2_25_HASADIRECCION {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Personas perso1 = new Personas();
        perso1.setNombre("Iram");
        perso1.setApellido("Arredondo");
        perso1.setEdad(19);
        //Para asignar la direccion, debemos crear un objeto de tipo direccion
        /*Direccion dir = new Direccion("Industrias", 11101, "Complejo industrial Chihuahua", "31136", "Chihuahua", "Chihuahua");
        dir.setCalle("Industrias");
        dir.setNumero(11101);
        dir.setColonia("Complejo industrial Chihuahua");
        dir.setCodigoPostal("31136");
        dir.setCiudad("Chihuahua");
        dir.setEstado("Chihuahua");
        perso1.setDireccion(dir);*/
        perso1.imprimirDatos();
        
    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String codigoPostal;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "---";
        this.ciudad = "---";
        this.codigoPostal = "---";
        this.colonia = "---";
        this.estado = "---";
        this.numero = 0;
    }

    public Direccion(String calle, int numero, String colonia, String codigoPostal, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("DIRECCIÓN: ");
        System.out.println(calle + " # " + numero + ", " + colonia + "\n C.P. " + codigoPostal + ", " + ciudad + ", " + estado);
    }
}

class Personas{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;//Persona has-a (tiene una) direccion , Persona is a Direccion es INCORRECTO

    public Personas() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
        this.direccion = null;//NO EXISTE EL OBJETO DIRECCION
    }

    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("PERSONA:");
        System.out.println(nombre + " " + apellido + ", " + edad + " años. ");
        if(direccion == null)
            System.out.println("Sin direccion");
        else
            direccion.imprimirDatos();
    }
}

class Sucursal{
    private String nombreSucursal;
    private Direccion direccion;
    
}