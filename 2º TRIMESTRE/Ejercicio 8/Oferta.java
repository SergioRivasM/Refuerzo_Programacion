package Ejercicio_8;

public class Oferta implements Comparable<Oferta> {
    //Atributos
    private Persona persona;
    private int importe;

    //Constructor
    public Oferta(Persona persona, int importe) {
        this.persona = persona;
        this.importe = importe;
    }

    //Getter y setter
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    //Método compareTo para el orden ascendente y descendente del importe de las ofertas
    public int compareTo(Oferta o) {
        if (this.importe > o.importe) { //Orden ascendente
            return 1;
        }
        if (this.importe < o.importe) { //Orden descendente
            return -1;
        } else {
            return 0;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Persona que ha efectuado la oferta: \n" + persona + "\n" +
                "Importe: " + importe + "\n\n";
    }
}