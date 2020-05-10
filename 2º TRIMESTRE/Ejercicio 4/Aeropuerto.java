package Ejercicio_4;

import java.util.Arrays;
import java.util.Date;

//Atributos
public class Aeropuerto {
    private String nombre;
    private Vuelo vuelos[];

    //Constructores
    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        this.vuelos = new Vuelo[0];
    }

    public Aeropuerto() {
        super();
    }

    public Aeropuerto(String nombre, Vuelo[] vuelos) {
        this.nombre = nombre;
        this.vuelos = vuelos;
    }

    //Método para añadir un vuelo
    public void addVuelo(Vuelo vuelo) {
        if (vuelo.getOrigen().equals(this.nombre)) { //Comprobamos si el aeropuerto de origen coincide con el que le pasamos
            Vuelo[] vuelosCopia = new Vuelo[vuelos.length + 1]; //Creo el nuevo array con la nueva capacidad
            for (int i = 0; i < vuelos.length; i++) { //Copio el array anterior
                vuelosCopia[i] = vuelos[i];
            }
            vuelosCopia[vuelos.length] = vuelo; //Cambio el nuevo array por el anterior
            vuelos = vuelosCopia;
        } else {
            System.out.println("No se puede guardar un vuelo que no salga de este aeropuerto");
        }
    }

    //Método para borrar un vuelo
    public void delVuelo(Vuelo vuelo) {
        if (vuelos != null) {
            for (int i = 0; i < vuelos.length; i++) { //Recorremos el array de vuelos
                if (vuelos[i].equals(vuelo)) { //Comprobamos si el vuelo es el mismo que le hemos pasado
                    System.out.println("Vuelo " + vuelo.getOrigen() + " dirección a " + vuelo.getDestino() + " encontrado. Borrando..." + "\n");
                    vuelos[i] = null; //Dejamos en null el espacio del vuelo borrado
                }
            }
        }
    }

    //Método para mostrar los vuelos con determinada fecha
    public void listFecha(Date date) {
        boolean encontrado = false;

        for (int i = 0; i < vuelos.length; i++) { //Recorremos el array de vuelos
            if (vuelos[i].getFecha().equals(date)) { //Comprobamos si la fecha es la misma que le hemos pasado
                System.out.println("Vuelo con fecha " + date + " encontrado: " + vuelos[i].toString());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado ningún vuelo con la fecha " + date);
        }
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo[] getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    //Método toString
    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "Vuelos = " + Arrays.toString(vuelos) + "\n";
    }
}