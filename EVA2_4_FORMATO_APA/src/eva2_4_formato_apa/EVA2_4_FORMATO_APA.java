
package eva2_4_formato_apa;


public class EVA2_4_FORMATO_APA {

    
    public static void main(String[] args) {
        //Libros
        Libros l1 = new Libros();
        l1.setAutor("Iram");
        l1.setTitulo("Las maravitupendas aventuras del chico ardilla");
        l1.setAño(2016);
        l1.setMes("Marzo");
        l1.setDia(24);
        l1.setCiudad("Bógota, Colombia");
        l1.setEditorial("Letras y Colores");
        l1.setnPag(86);
        //Imprimir datos:
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Año: " + l1.getAño());
        System.out.println("Mes: " + l1.getMes());
        System.out.println("Día: " + l1.getDia());
        System.out.println("Ciudad: " + l1.getCiudad());
        System.out.println("Editorial: " + l1.getEditorial());
        System.out.println("Número de páginas: " + l1.getnPag());
    }
    
}
