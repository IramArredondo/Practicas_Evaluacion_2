
package eva2_21_polimorfismo;


public class EVA2_21_POLIMORFISMO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante("Iram", "Arredondo", 19, "22550296");
        
        e1.imprimirDatos();
        Docentes d1 = new Docentes("Zeus", "Gonzalez", 40, "A6");
        d1.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES
        //COMO OBJETOS DE LA SUPERCLASE
        //AL REVÉS NO SE PUEDE
        //POLIMORFISMO:
        //Asigno un objeto de tipo estudiante
        //a una variable de tipo persona
        Persona perso = e1;
        //perso. <-- Estoy GENERALIZANDO (simplificandp)
        Persona perso2 = d1;
        Persona perso3 = new Persona();
        //particular --> general
        //Es imposible convertir una persona en un estudiante debido a que PERSONA no tiene nControl ¿de donde lo saca?
        //Estudiante solo OCULTA el nControl cuando pasa a ser una PERSONA
        //Estudiante e2 = perso3;
        
    }
    
}
