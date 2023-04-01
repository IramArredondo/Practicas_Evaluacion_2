package eva2_20_vehiculo;

public class Bicicleta extends Vehiculo implements ControlVelocidad {

    private String rueda;
    private String cuadro;
    private String accesorio;

    public Bicicleta() {
    }

    public Bicicleta(String rueda, String cuadro, String accesorio, int velocidad, String marca, String tipo) {
        super(velocidad, marca, tipo);
        this.rueda = rueda;
        this.cuadro = cuadro;
        this.accesorio = accesorio;
    }

    public String getRueda() {
        return rueda;
    }

    public void setRueda(String rueda) {
        this.rueda = rueda;
    }

    public String getCuadro() {
        return cuadro;
    }

    public void setCuadro(String cuadro) {
        this.cuadro = cuadro;
    }

    public String getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
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
        if (velocidad > 0) {
            velocidad--;
        } else {
            velocidad = 0;
        }
        return velocidad;
    }

    @Override
    public void imprimirVel() {
        System.out.println(velocidad);
    }

}
