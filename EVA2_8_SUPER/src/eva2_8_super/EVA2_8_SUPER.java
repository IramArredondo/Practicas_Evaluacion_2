package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {
        Animal a1 = new Animal("Perro", 2);
        Mamifero m1 = new Mamifero("Negro", "Perro", 2);
        Canes c1 = new Canes();
        c1.respirar();
        //super() constructor default
        //super(args) constructor (args)
    }
}

class Animal {

    private String nombre;
    private int peso;

    public Animal() {
        System.out.println("ITS ALIVE!!");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE!!(Constructor 2)");
    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

class Mamifero extends Animal {

    private String colorPelo;

    public Mamifero() {
        //super --> apuntador de la superclase
        //Lo pirmero a llamar en un constructor es llamar
        //al constructor de la superclase
        super();//llamada al constructor default
        //java lo pone en automatico
        //recomendacion, agregarlo nosotros siempre.
        System.out.println("Soy un mamifero!!");
    }

    /*
    public Mamifero(String colorPelo) {
        this.colorPelo = colorPelo;
    }
     */
    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la superclase con args.
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero!!(Constructor 2)");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}

class Canes extends Mamifero {

    public Canes() {
        super();
        System.out.println("Soy un can!!");
    }

}
