
package eva2_20_vehiculo;


public abstract class Vehiculo {
    protected int velocidad;
    protected String marca;
    protected String tipo;

    public Vehiculo() {
        velocidad = 0;
    }

    public Vehiculo(int velocidad, String marca, String tipo) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
