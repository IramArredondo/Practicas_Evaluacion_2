
package eva2_20_vehiculo;


public class Automovil extends Vehiculo implements ControlVelocidad{
    private String modelo;
    private int año;
    private String motor;

    public Automovil() {
    }

    public Automovil(String modelo, int año, int velocidad, String marca, String tipo,String motor) {
        super(velocidad, marca, tipo);
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int acelerar() {
        if (velocidad >= 0) {
            velocidad++;
        } else {
            velocidad = 0;
        }
        return velocidad;
    }

    @Override
    public int detener() {
        if (velocidad>0){
        velocidad--;
        }else{
            velocidad = 0;
        }
        return velocidad;
    }

    @Override
    public void imprimirVel() {
        System.out.println(velocidad);
    }
    
    
}
