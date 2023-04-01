
package eva2_22_polimorfismo_figuras;


public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triangulo() {
        this.altura = 0;
        this.base = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip = /*Math.sqrt((base*base)+(altura*altura)); --> */ Math.hypot(base, altura);
        return hip + base + altura;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("TRIANGULO");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPeri());
    }
    
    
    
    
}
