package Ejercicio_4;

//Atributos
public class Pasajero {
    private String nombre;
    private String direccion;
    private int numPasaporte;
    protected enum Estado{EMBARCADO, PENDIENTE};
    private Estado estado;
    private static int contadorPasajeros;

    //Constructor
    public Pasajero(String nombre, String direccion, int numPasaporte, Estado estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numPasaporte = numPasaporte;
        this.estado = estado;
        contadorPasajeros++;
    }

    public static int getContadorPasajeros() {
        return contadorPasajeros;
    }

    //Métodos
    public void embarcar() {
        System.out.println("*...embarcando...*" + "\n");
    }

    public void sonreir() {
        System.out.println("*sonríe*");
    }

    public void andar() {
        System.out.println("*...andando...*" + "\n");
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //Método toString
    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "Dirección = " + direccion + "\n" +
                "Número de pasaporte = " + numPasaporte + "\n" +
                "Estado = " + estado + "\n";
    }
}