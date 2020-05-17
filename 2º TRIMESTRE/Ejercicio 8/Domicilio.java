package Ejercicio_8;

public class Domicilio {
    //Atributos
    private String via;
    private int num;
    private String datos;
    private int codPostal;

    //Constructor
    public Domicilio(String via, int num, String datos, int codPostal) {
        this.via = via;
        this.num = num;
        this.datos = datos;
        this.codPostal = codPostal;
    }

    //Getter y setter
    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre de la vía: " + via + "\n" +
                "Número: " + num + "\n" +
                "Otros datos de localización: " + datos + "\n" +
                "Código postal: " + codPostal + "\n";
    }
}
