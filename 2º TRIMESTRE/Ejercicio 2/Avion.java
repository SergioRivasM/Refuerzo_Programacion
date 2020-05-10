package Ejercicio_2;

//Atributos
public class Avion {
    private String aerolinea;
    private int longitud;
    private String modelo;
    protected enum ModoVuelo{MANUAL, CRUCERO, PILOTO_AUTOMATICO};
    private ModoVuelo modoVuelo;
    private static int contadorAviones;

    //Constructor
    public Avion(String aerolinea, int longitud, String modelo, ModoVuelo modoVuelo) {
        this.aerolinea = aerolinea;
        this.longitud = longitud;
        this.modelo = modelo;
        this.modoVuelo = modoVuelo;
        contadorAviones++; //Contador de aviones que va a ser usado en la clase principal
    }

    public static int getContadorAviones() {
        return contadorAviones;
    }

    //Métodos
    public void despegar() {
        System.out.println("*...despegando...*" + "\n");
    }

    public void aterrizar() {
        System.out.println("*...aterrizando...*" + "\n");
    }

    public void volar() {
        System.out.println("*...volando...*" + "\n");
    }

    //Getter y setter
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ModoVuelo getModoVuelo() {
        return modoVuelo;
    }

    public void setModoVuelo(ModoVuelo modoVuelo) {
        this.modoVuelo = modoVuelo;
    }

    //Método toString
    @Override
    public String toString() {
        return "Aerolínea = " + aerolinea + "\n" +
                "Longitud = " + longitud + "\n" +
                "Modelo = " + modelo + "\n" +
                "Modo de vuelo = " + modoVuelo + "\n";
    }
}