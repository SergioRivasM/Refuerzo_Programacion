package Ejercicio_9;

abstract class MandoADistancia {
    //Atributos
    private String modelo;
    private int anchura;
    private int altura;
    private int precio;
    private enum estado{ENCENDIDO, APAGADO};

    //Constructor
    public MandoADistancia(String modelo, int anchura, int altura, int precio) {
        this.modelo = modelo;
        this.anchura = anchura;
        this.altura = altura;
        this.precio = precio;
    }

    /*public boolean apagar() {

    }

    public boolean encender() {

    }*/

    //Getter y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" +
                "Anchura: " + anchura + "\n" +
                "Altura: " + altura + "\n" +
                "Precio: " + precio + "\n";
    }
}