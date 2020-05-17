package Ejercicio_9;

public class MandoTV extends MandoADistancia {
    //Atributos
    private int volumen;
    private String canal;

    //Constructor
    public MandoTV(String modelo, int anchura, int altura, int precio, int volumen, String canal) {
        super(modelo, anchura, altura, precio);
        this.volumen = volumen;
        this.canal = canal;
    }

    //Getter y setter
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    //toString
    @Override
    public String toString() {
        return "Volumen: " + volumen + "\n" +
                "Canal: " + canal + "\n";
    }
}