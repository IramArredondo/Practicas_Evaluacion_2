
package eva2_4_formato_apa;


public class Articulos extends Documento {
    private String nombreRevista;
    private int volumen;

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String titulo) {
        this.nombreRevista = titulo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
}
