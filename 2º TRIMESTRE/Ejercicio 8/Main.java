package Ejercicio_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Oferta> ofertasCompra = new ArrayList<>(); //Creo el ArrayList de ofertas de compra

        //Creo los objetos tipo Persona
        Persona p1 = new Persona("12345678G", "Pepe");
        Persona p2 = new Persona("94456324L", "Antonio");
        Persona p3 = new Persona("07653276T", "Raúl");

        //Añado ofertas de compra al ArrayList de Oferta
        ofertasCompra.add(new Oferta(p1, 1500));
        ofertasCompra.add(new Oferta(p2, 3000));
        ofertasCompra.add(new Oferta(p3, 1000));

        //Creo objeto tipo Domicilio
        Domicilio d1 = new Domicilio("Calle Nueva", 80, "Hola", 41920);

        //Creo objetos de tipo Vivienda
        Vivienda v1 = new Vivienda("1234", 2005,d1, p1, true, ofertasCompra);
        Vivienda v2 = new Vivienda("5678", 2019,d1, p1, false, ofertasCompra);

        ArrayList<Vivienda> viviendas = new ArrayList<>(); //Creo el ArrayList de lista de viviendas

        //Añado al ArrayList de viviendas las viviendas creadas anteriormente
        viviendas.add(v1);
        viviendas.add(v2);

        v1.ordenaOfertas(true); //Ordeno las ofertas por orden ascendente (true)
        System.out.println(v1.getOfertasCompra()); //Muestro la lista de ofertas

        v1.ordenaOfertas(false); //Ordeno las ofertas por orden descendente (false)
        System.out.println(v1.getOfertasCompra()); //Muestro la lista de ofertas

        //Creo un objeto de tipo Inmobiliaria
        Inmobiliaria i1 = new Inmobiliaria(viviendas);

        //Doy de alta una vivienda en la lista de viviendas
        i1.altaVivienda(v2);

        //Muestro por pantalla y compruebo si la vivienda 'v2' está disponible
        System.out.println(v2.isDisponible());

        //Creo un objeto de tipo Oferta
        Oferta o1 = new Oferta(p1, 2600);

        //Doy de alta una nueva oferta pasandole la vivienda 'v1' y una oferta 'o1'
        i1.altaOferta(v1, o1);

        //Muestro por pantalla las ofertas de compra de 'v1'
        System.out.println(v1.getOfertasCompra());

        //Doy de baja la vivienda 'v2' borrando su contenido
        i1.bajaVivienda(v2);

        //Muestro por pantalla y compruebo si la vivienda 'v2' está disponible una vez que se ha borrado
        System.out.println(v2.isDisponible());
        //Muestro por pantalla y comprueblo que la lista de compras de la vivienda 'v2' está vacía
        System.out.println(v2.getOfertasCompra());

    }
}
