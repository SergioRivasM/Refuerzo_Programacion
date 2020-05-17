package Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        //Creo objetos de tipo Libro
        Libro l1 = new Libro(97884, "Fahrenheit 451", 2018);
        Libro l2 = new Libro(51258, "EL Hombre En El Castillo", 2014);
        Libro l3 = new Libro(71340, "Guerra Mundial Z", 2015);
        Libro l4 = new Libro(60924, "Estelar", 2020);

        //Creo objetos tipo Revista
        Revista r1 = new Revista(49714, "Muy Interesante", 2019, 127);
        Revista r2 = new Revista(61248, "Quo", 2017, 542);
        Revista r3 = new Revista(49714, "Coches", 2015, 256);

        System.out.println("\n--- LIBROS ---\n");

        System.out.println(l1); //Muestro por pantalla el objeto Libro 'l1'
        l1.presta(); //Llamo al método 'presta' para prestar el libro 'l1'

        if (l1.estaPrestado()) { //Compruebo si un libro está prestado o no
            System.out.println("El libro '" + l1.getTitulo() + "' ha sido prestado." + "\n");
        }

        System.out.println(l1); //Vuelvo a mostrar el contenido de 'l1' para comprobar los cambios
        l1.devuelve(); //Llamo al método 'devuelve' para devolver el libro 'l1'
        System.out.println("El libro '" + l1.getTitulo() + "' ha sido devuelto." + "\n");

        l2.presta(); //Llamo al método 'presta' para prestar el libro 'l2'

        if (l2.estaPrestado()) { //Compruebo si un libro está prestado o no
            System.out.println("El libro '" + l2.getTitulo() + "' ha sido prestado." + "\n");
        }

        System.out.println(l2); //Muestro el contenido de 'l2'
        System.out.println(l3); //Muestro el contenido de 'l3'
        System.out.println(l4); //Muestro el contenido de 'l4'

        System.out.println("\n--- REVISTAS ---\n");

        System.out.println(r1); //Muestro el contenido de la revista 'r1'
        System.out.println(r2); //Muestro el contenido de la revista 'r2'
        System.out.println(r3); //Muestro el contenido de la revista 'r3'

    }
}
