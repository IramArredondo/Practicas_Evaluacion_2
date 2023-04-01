
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;


public class EVA2_22_POLIMORFISMO_FIGURAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Mas de un arreglo --> int[] a,b,c,d;
        //int datos[] = new int[10];
        //Circulo[] circulos = new Circulo[10]; //Solo crea el espacio pero espacios VACIOS
        //un arreglo en java ca de la posición 0 a la N-1
        //N es la cantidad de elementos del arreglo
        //length ->> Longitud del arreglo
        /*
        for(int i = 0; i < circulos.length; i++){
            circulos[i] = new Circulo(i+1);//Creamos cada uno de los objetos
            //Si no se crean los objetos no se pueden usar
            //No existen objetos = NULLPOINTEREXCEPTION
            System.out.println("");
            circulos[i].imprimirDatos();
        }
        */
        //Declaramos arreglo pero aún no se crean
        Figuras[] figuras;
        //Con el Scanner capturamos por el teclado la cantidad de figuras a utilizar
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas figuras quieres capturar?");
        int cant = sc.nextInt(); //nos permite capturar
        //Establecemos cuantos arreglos vamos a usar
        figuras = new Figuras[cant];//Aca creamos el arreglo
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Circulo \n2. Triangulo");
            int figu = sc.nextInt();
            if(figu == 1){
                //Si captura 1 es circulo
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(sc.nextDouble());
                figuras[i] = circu;
            }else{
                //Si captura otra cosa es triangulo
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base: ");
                trian.setBase(sc.nextDouble());
                System.out.println("Introduce la altura: ");
                trian.setAltura(sc.nextDouble());
                figuras[i] = trian;
            }
        }
        //IMPRIMIR LOS RESULTADOS:
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
                //System.out.println("Círculo: ");
                Circulo circu = (Circulo)figuras[i];//(Circulo)<-- esto es un casting
                circu.imprimirDatos();
            }else{
                //System.out.println("Triángulo: ");
                Triangulo trian = (Triangulo)figuras[i];
                trian.imprimirDatos();
            }
            //System.out.println("Área: " + figuras[i].calcularArea());
            //System.out.println("Perimetro: " + figuras[i].calcularPeri());
        }
    }
    
}
