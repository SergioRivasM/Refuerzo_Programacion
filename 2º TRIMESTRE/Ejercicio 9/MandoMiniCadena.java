package Ejercicio_9;

public class MandoMiniCadena extends MandoADistancia {
    //Atributos
    private int volumen;

    //Constructor
    public MandoMiniCadena(String modelo, int anchura, int altura, int precio, int volumen) {
        super(modelo, anchura, altura, precio);
        this.volumen = volumen;
    }

    //Getter y setter
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //toString
    @Override
    public String toString() {
        return "Volumen: " + volumen + "\n";
    }
}