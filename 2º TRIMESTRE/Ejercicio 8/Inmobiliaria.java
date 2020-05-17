package Ejercicio_8;

import java.util.ArrayList;

public class Inmobiliaria {
    //Atributos
    private ArrayList<Vivienda> viviendas;

    //Constructor
    public Inmobiliaria(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }


    public void altaVivienda(Vivienda v) {
        if (this.viviendas.contains(v)) { //Compruebo si en la lista está la vivienda que le hemos pasado por parámetro
            int i = this.viviendas.indexOf(v); //Creo variable y le asigno la vivienda pasada
            this.viviendas.get(i).setDisponible(true); //Indico que esté disponible
        } else { //Para el caso de que no esté en la lista
            v.setDisponible(true); //La añado a la lista y la hago también disponible
            this.viviendas.add(v);
        }
    }

    public void altaOferta(Vivienda v, Oferta o) {
        int i = this.viviendas.indexOf(v); //Creo variable y le asigno la vivienda pasada
        this.viviendas.get(i).getOfertasCompra().add(o); //Cojo la lista de ofertas de compras y le añado una nueva oferta
    }

    public void bajaVivienda(Vivienda v) {
        int i = this.viviendas.indexOf(v); //Creo variable y le asigno la vivienda pasada
        this.viviendas.get(i).setDisponible(false); //Indico que la vivienda ya no está disponible
        this.viviendas.get(i).getOfertasCompra().clear(); //Cojo la lista de ofertas de compras y le borro la oferta creada
    }

    public ArrayList<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    //toString
    @Override
    public String toString() {
        return "Lista de viviendas: " + viviendas + "\n";
    }
}
