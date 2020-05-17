package Ejercicio_9;

public class MandoAspiradora extends MandoADistancia {
    //Atributos
    private int velocidad;

    //Constructor
    public MandoAspiradora(String modelo, int anchura, int altura, int precio, int velocidad) {
        super(modelo, anchura, altura, precio);
        this.velocidad = velocidad;
    }

    //Getter y setter
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "Velocidad: " + velocidad + "\n";
    }
}