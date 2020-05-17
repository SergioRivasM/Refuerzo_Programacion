package Ejercicio_8;

public class Persona {
    //Atributos
    private String nif;
    private String nombre;

    //Constructor
    public Persona(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    //Getter y setter
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "NIF: " + nif + "\n" +
                "Nombre: " + nombre;
    }
}