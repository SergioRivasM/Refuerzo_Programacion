package Ejercicio_8;

import java.util.ArrayList;
import java.util.Collections;


public class Vivienda extends Inmueble {
    //Atributos
    private Persona persona;
    private enum tipo{CASA, PISO, OTRO};
    private boolean disponible;
    private ArrayList<Oferta> ofertasCompra;

    //Constructor
    public Vivienda(String refCatas, int anioCons, Domicilio domicilio, Persona persona, boolean disponible, ArrayList<Oferta> ofertasCompra) {
        super(refCatas, anioCons, domicilio);
        this.persona = persona;
        this.disponible = disponible;
        this.ofertasCompra = ofertasCompra;
    }

    public void ordenaOfertas(boolean ascendente){
        ArrayList<Oferta> a = this.ofertasCompra; //Creo ArrayList de Oferta
        if (ascendente) { //Compruebo si es ascendente (true)
            Collections.sort(a); //Ordeno de forma ascendente con el método collections sort
        } else { //En el caso de ordenar de forma descendente
            Collections.sort(a); //Ordeno de nuevo de forma ascendente
            Collections.reverse(a); //Y le doy la cuelta con collections reverse para ordenarlo de forma descendente
        }
    }

    //Getter y setter
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ArrayList<Oferta> getOfertasCompra() {
        return ofertasCompra;
    }

    public void setOfertasCompra(ArrayList<Oferta> ofertasCompra) {
        this.ofertasCompra = ofertasCompra;
    }

    //Método equals para comprobar si la vivienda pasada es son iguales mediante la ref catastral
    @Override
    public boolean equals(Object o) {
        Vivienda v = (Vivienda) o;
        return getRefCatas().equals(v.getRefCatas());
    }

    //toString
    @Override
    public String toString() {
        return "Persona: " + persona + "\n" +
                "Disponibilidad de venta: " + disponible + "\n" +
                "Lista de ofertas de compra: " + ofertasCompra + "\n";
    }
}