package Ejercicio_4;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("- BIENVENIDOS AL AEROPUERTO ALIXAR -" + "\n");

        //Creo los objetos Pasajero
        Pasajero p1 = new Pasajero("Pepe", "Calle Álava 2", 527031, Pasajero.Estado.PENDIENTE);
        Pasajero p2 = new Pasajero("Raúl", "Calle Nueva 45", 926543, Pasajero.Estado.EMBARCADO);
        Pasajero p3 = new Pasajero("Sara", "Calle Barcelona 8", 812740, Pasajero.Estado.EMBARCADO);
        Pasajero p4 = new Pasajero("Mónica", "Avenida central 5", 371348, Pasajero.Estado.EMBARCADO);
        Pasajero p5 = new Pasajero("Manuel", "Calle La Hacienda 76", 701174, Pasajero.Estado.PENDIENTE);

        Pasajero p6 = new Pasajero("Juan", "Calle Dr. Fleming 67", 293160, Pasajero.Estado.EMBARCADO);
        Pasajero p7 = new Pasajero("Lara", "Calle Aragón 12", 140743, Pasajero.Estado.EMBARCADO);
        Pasajero p8 = new Pasajero("Nora", "Calle Rodríguez Marín 24", 301356, Pasajero.Estado.PENDIENTE);
        Pasajero p9 = new Pasajero("Héctor", "Calle Concordia 35", 973612, Pasajero.Estado.PENDIENTE);
        Pasajero p10 = new Pasajero("Lucas", "Calle Soria 21", 182541, Pasajero.Estado.EMBARCADO);

        //Creo los objetos Avion
        Avion a1 = new Avion("Ryanair", 70, "Boeing 737", Avion.ModoVuelo.CRUCERO);
        Avion a2 = new Avion("Iberia", 80, "Airbus A350", Avion.ModoVuelo.MANUAL);

        //Creo los objetos Date
        Date date1 = new Date(2020,10,12); //Creo manualmente objeto Date
        Date date2 = new Date(); //Creo objeto Date que coge la fecha del sistema

        //Creo los objetos Vuelo
        Vuelo vuelo1 = new Vuelo(a1, date2, "San Pablo", "Barajas");
        Vuelo vuelo2 = new Vuelo(a2, date1, "SVQ", "BCN");

        //Añado pasajeros al vuelo
        vuelo1.addPassenger(p1);
        vuelo1.addPassenger(p2);
        vuelo1.addPassenger(p3);
        vuelo1.addPassenger(p4);
        vuelo1.addPassenger(p5);

        vuelo1.addPassenger(p1); //Meto pasajero que ya existe para devolver mensaje de error

        vuelo2.addPassenger(p6);
        vuelo2.addPassenger(p7);
        vuelo2.addPassenger(p8);
        vuelo2.addPassenger(p9);
        vuelo2.addPassenger(p10);

        System.out.println(vuelo1.toString());
        System.out.println("---------------------------");
        System.out.println(vuelo2.toString());

        System.out.println("----------------------------");

        //Borro pasajero del vuelo
        vuelo1.delPassenger(p1.getNumPasaporte());
        System.out.println(vuelo1.toString());

        //Muestro el vuelo con el pasajero anterior borrado
        vuelo1.listPassengers();

        System.out.println("----------------------------");

        Aeropuerto aeropuerto1 = new Aeropuerto("SVQ");

        aeropuerto1.addVuelo(vuelo2); //Sí coincide el origen se tiene que guardar
        aeropuerto1.addVuelo(vuelo1); //No coincide el origen y no se guardará
        System.out.println();
        System.out.println(Arrays.toString(aeropuerto1.getVuelos()));

        System.out.println("-----------------------------");

        //Muestro los pasajeros del vuelo
        aeropuerto1.delVuelo(vuelo2);

        //Muestro la fecha del vuelo
        aeropuerto1.listFecha(date2);



    }
}