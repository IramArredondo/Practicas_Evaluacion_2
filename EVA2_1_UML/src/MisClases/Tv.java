
package MisClases;


public class Tv {

    int canal;
    int volumen;
    boolean power;

    //Metodos set
    public void setCanal(int valor) {
        canal = valor;
    }

    public void setVolumen(int valor) {
        volumen = valor;
    }

    public void setPower(boolean valor) {
        power = valor;
    }

    //Metodos get
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean getPower() {
        return power;
    }

    //Imprime datos de la persona
    public void imprimirDatosTv() {
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
}
