package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("Tesla", 2022, 0, "X");
        cambiarVelocidad(auto, 50);
        Bicicleta bici = new Bicicleta("Montaña", "XX", 0, "Harley Davidson");
        cambiarVelocidad(bici, 10);
        //Object --> SUPERCLASE DE TODAS LAS CLASES DE JAVA
        Object obj = auto;
    }
    
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }

}

//---------------------------------------------
interface DatosVehiculo {

    public abstract void acelerar(int cambio);

    void tablero();
}

//---------------------------------------------
class Vehiculo {

    protected int velocidad;
    private String marca;

    public Vehiculo() {
        velocidad = 0;
        marca = "---";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    //modificar con acelerar del interface MostrarDatos
    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

//----------------------------------------------
class Automovil extends Vehiculo implements DatosVehiculo {

    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "---";
        this.año = 0;
    }

    public Automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
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

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if ((cambioVel) >= 0)//aceptar solo velocidades positivas o cero
        {
            velocidad = cambioVel; //<-- acumulador "acu" velocidad = valocidad + cambio
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automóvil: " + getVelocidad());
    }
}

//-----------------------------------------------------------
class Bicicleta extends Vehiculo implements DatosVehiculo {

    private String tipo; //montaña, pista, etc
    private String rodada; //tipo de llanta

    public Bicicleta() {
        super();
        tipo = "---";
        rodada = "---";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if ((cambioVel) >= 0)//aceptar solo velocidades positivas o cero
        {
            velocidad = cambioVel; //<-- acumulador "acu" velocidad = valocidad + cambio
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad d la bicicleta: " + getVelocidad());
    }

}
