package Ejercicio_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("- BIENVENIDOS AL AEROPUERTO ALIXAR -" + "\n");

        //Creo los objetos Avion
        Avion a1 = new Avion("Ryanair", 70, "Boeing 737", Avion.ModoVuelo.CRUCERO);
        Avion a2 = new Avion("Iberia", 80, "Airbus A350", Avion.ModoVuelo.MANUAL);

        //Creo los objetos Pasajero
        Pasajero p1 = new Pasajero("Pepe", "Calle Álava 2", 527031, Pasajero.Estado.PENDIENTE);
        Pasajero p2 = new Pasajero("Raúl", "Calle Nueva 45", 926543, Pasajero.Estado.EMBARCADO);
        Pasajero p3 = new Pasajero("Sara", "Calle Barcelona 8", 812740, Pasajero.Estado.EMBARCADO);
        Pasajero p4 = new Pasajero("Mónica", "Avenida central 5", 371348, Pasajero.Estado.EMBARCADO);
        Pasajero p5 = new Pasajero("Javier", "Calle La Hacienda 76", 701174, Pasajero.Estado.PENDIENTE);

        //Uso y llamo a los métodos necesarios
        System.out.println("Los pasajeros " + p1.getNombre() + " y " + p5.getNombre() + " acudan al registro.");
        System.out.println("Registro de " + p1.getNombre() + ":");
        System.out.println(p1.toString());

        System.out.println("Registro de " + p5.getNombre() + ":");
        System.out.println(p5.toString());

        System.out.println("El avión de la aerolinea " + a1.getAerolinea() + " está a punto de cerrar sus puertas." + "\n");

        System.out.println("El pasajero con número de pasaporte " + p1.getNumPasaporte() + " acuda a la entrada de su avión.");
        p1.sonreir();
        System.out.println();

        System.out.println("El pasajero " +p1.getNombre() + " está yendo hacia la puerta de su avión.");
        p1.andar();

        System.out.println("El pasajero " +p2.getNombre() + " ha llegado a la puerta de su avión.");
        p1.embarcar();

        System.out.println("El avión de la aerolínea " + a2.getAerolinea() + " va a despegar.");
        a2.despegar();

        System.out.println("Las pasajeras " + p3.getNombre() + " y " + p4.getNombre() + " tienen ganas de despegar.");
        p3.sonreir();
        p4.sonreir();
        System.out.println();

        System.out.println("El avión " + a2.getModelo() + " de la aerolínea " + a2.getAerolinea() + " está en el aire.");
        a2.volar();

        System.out.println("El avión " + a2.getModelo() + " de la aerolínea " + a2.getAerolinea() + " está volando en modo " + a2.getModoVuelo() + "\n");

        System.out.println("El avión de la aerolínea " + a2.getAerolinea() + " va a aterrizar.");
        a2.aterrizar();

    }
}