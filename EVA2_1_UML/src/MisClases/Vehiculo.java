
package MisClases;


public class Vehiculo {
    String marca;
    String modelo;
    int año;
    

    //Metodos set
    public void setMarca(String valor){
        marca = valor;
    }
    public void setNombre(String valor){
        modelo = valor;
    }
    public void setAño(int valor){
        año = valor;
    }
    //Metodos get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    //Imprime datos de la persona
    public void imprimirDatosVehiculo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
