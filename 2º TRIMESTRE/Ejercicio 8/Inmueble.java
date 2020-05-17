package Ejercicio_8;

public class Inmueble {
    //Atributos
    private String refCatas;
    private int anioCons;
    private Domicilio domicilio;

    //Constructor
    public Inmueble(String refCatas, int anioCons, Domicilio domicilio) {
        this.refCatas = refCatas;
        this.anioCons = anioCons;
        this.domicilio = domicilio;
    }

    //Getter y setter
    public String getRefCatas() {
        return refCatas;
    }

    public void setRefCatas(String refCatas) {
        this.refCatas = refCatas;
    }

    public int getAnioCons() {
        return anioCons;
    }

    public void setAnioCons(int anioCons) {
        this.anioCons = anioCons;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    //toString
    @Override
    public String toString() {
        return "Referencia catastral: " + refCatas + "\n" +
                "Año de construcción: " + anioCons + "\n" +
                "Domicilio: " + domicilio + "\n";
    }
}
