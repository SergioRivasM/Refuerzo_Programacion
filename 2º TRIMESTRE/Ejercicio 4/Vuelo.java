package Ejercicio_4;

import java.util.Arrays;
import java.util.Date;

//Atributos
public class Vuelo {
    private Avion avion;
    private Date fecha;
    private String origen;
    private String destino;
    private Pasajero[] pasajeros;

    //Constructores
    public Vuelo(Avion avion, Date fecha, String origen, String destino) {
        this.avion = avion;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo() {
        super();
    }

    public Vuelo(Avion avion, Date fecha, String origen, String destino, Pasajero[] pasajeros) {
        this.avion = avion;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    //Método para añadir un pasajero a un vuelo
    public void addPassenger(Pasajero p) {
        boolean encontrado = false; //Para controlar si el pasajero se encuentra en el array

        if (pasajeros!=null) {
            for (int i = 0; i < pasajeros.length; i++) { //Recorro el array pasajeros
                if (pasajeros[i].equals(p)) { //Comprobamos si el pasajero que le hemos pasado está ya en el vuelo
                    System.out.println("El pasajero " + p.getNombre() + " ya está en este vuelo" + "\n");
                    encontrado = true;
                }
            }

            if (encontrado==false) {
                Pasajero[] p1 = new Pasajero[pasajeros.length+1]; //Creo el nuevo array con la nueva capacidad
                for (int i = 0; i <pasajeros.length ; i++) { //Copio el array anterior
                    p1[i] = pasajeros[i];
                }
                p1[pasajeros.length] = p; //Cambio el nuevo array por el anterior
                pasajeros = p1;
            }

        } else {
            pasajeros = new Pasajero[1];
            pasajeros[0] = p;
        }
    }

    //Método para borrar pasajero de un vuelo
    public void delPassenger(int numP) {
        boolean borrado = false;

        for (int i = 0; i < pasajeros.length; i++) { //Recorremos el array de pasajeros
            if (pasajeros[i].getNumPasaporte() == numP) { //Comprobamos si el pasaporte del pasajero es el mismo que le hemos pasado
                System.out.println("El pasajero con pasaporte " + numP + " ha sido hallado y borrado" + "\n");
                pasajeros[i] = null; //Dejamos en null el espacio del pasajero borrado
                borrado = true;
            }
        }
        if (borrado == false) {
            System.out.println("Pasaporte no encontrado entre la lista de pasajeros");
        }
    }

    //Método para mostrar la lista de pasajeros
    public void listPassengers() {
        System.out.println(Arrays.toString(pasajeros) + "\n");
    }

    //Getter y setter
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    //Método toString
    @Override
    public String toString() {
        return "Avión = " + avion + "\n" +
                "Fecha = " + fecha + "\n" +
                "Aeropuerto de origen = " + origen + "\n" +
                "Aeropuerto de destino = " + destino + "\n" +
                "Pasajeros = " + Arrays.toString(pasajeros) + "\n";
    }
}
