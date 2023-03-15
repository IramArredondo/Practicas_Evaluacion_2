package eva2_9_super_2;

public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Todas las clases tienen constructor default, sino lo ponemos lo pone java
        Estudiante e1 = new Estudiante("Iram", "Arredondo", 18, "22550296");
        e1.imprimirDatos();
        //-----------------------------------------
        System.out.println("");
        Docentes d1 = new Docentes("Hiram", "Ramírez", 19, "A1B2C3D4");
        d1.imprimirDatos();
        //-----------------------------------------
        System.out.println("");
        Proveedores p1 = new Proveedores("Iran", "ArreRmz",17,"AERI0405HCHE1");
        p1.imprimirDatos();
        

    }
}
