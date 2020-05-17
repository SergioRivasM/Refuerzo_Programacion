package Ejercicio_9;

public class MandoAireAcondicionado extends MandoADistancia {
    //Atributos
    private enum modo{FRIO, CALOR};
    private int temperatura;
    private int velocidad;

    //Constructor
    public MandoAireAcondicionado(String modelo, int anchura, int altura, int precio, int temperatura, int velocidad) {
        super(modelo, anchura, altura, precio);
        this.temperatura = temperatura;
        this.velocidad = velocidad;
    }

    //Getter y setter
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "Temperatura: " + temperatura + "\n" +
                "Velocidad: " + velocidad + "\n";
    }
}