package Ejercicio_5;

import java.util.Date;

//Atributos
public class Ciudadano {
    private String nombre;
    private String dni;
    private int edad;
    private Salida salidas[];

    //Constructores
    public Ciudadano(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.salidas = new Salida[0];
    }

    public Ciudadano() {
        super();
    }

    public Ciudadano(String nombre, String dni, int edad, Salida[] salidas) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.salidas = salidas;
    }

    //Método para añadir una salida al ciudadano
    public void addSalida(Salida salida) { //No compruebo condición ya que no puede haber 2 salidas en el mismo instante
        Salida[] s1 = new Salida[salidas.length + 1]; //Creo el nuevo array con la nueva capacidad
        for (int i = 0; i < salidas.length; i++) { //Copio el array anterior
            s1[i] = salidas[i];
        }
        s1[salidas.length] = salida; //Cambio el nuevo array por el anterior
        salidas = s1;
    }

    //Método para contar las veces que el ciudadano sale
    public int vecesSalida(Date fecha) {
        int contador = 0; //Creamos una variable contador para contar las salidas del ciudadano

        for (int i = 0; i < salidas.length; i++) {
            if (salidas[i].getFecha().equals(fecha)) {
                contador++;
            }
        }
        return contador;
    }

    //Método para calcular la multa según las salidas
    public int calcularMulta() {
        int contCompra = 0; //Creo contadores para cada salida de manera independiente
        int contDeporte = 0;
        int contPaseo = 0;
        int multa = 0;

        for (int i = 0; i < salidas.length; i++) { //Recorremos el array de salidas
            if (salidas[i].getTipo().equals(TipoSalida.COMPRA)) { //Comprobamos el tipo de salida
                contCompra++;
            }

            if (salidas[i].getTipo().equals(TipoSalida.DEPORTE)) {
                contDeporte++;
            }

            if (salidas[i].getTipo().equals(TipoSalida.PASEO)) {
                contPaseo++;
            }
        }

        if (contCompra >= 1) {
            contCompra = contCompra-1 ;
        }

        if (contDeporte >= 1) {
            contDeporte = contDeporte-1;
        }

        if (contPaseo >= 1) {
            contPaseo = contPaseo-1;
        }

        multa = (contCompra + contDeporte + contPaseo) * 600; //Multiplicamos por 600 las veces que salga según el tipo de salida

        return multa; //Devolvemos la variable multa
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método toString
    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "DNI = " + dni + "\n" +
                "Edad = " + edad + "\n";
    }
}
