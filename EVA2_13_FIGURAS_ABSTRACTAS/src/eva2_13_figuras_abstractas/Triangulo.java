package eva2_13_figuras_abstractas;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo() {
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
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPeri() {
        double hipotenusa;
        hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return base + altura + hipotenusa;
    }

    public String toString() {
        String cade = "Datos triángulo\n"
                + "Área " + calcularArea() + "\n"
                + "Perimetro: " + calcularPeri();
        return cade;
    }
}
