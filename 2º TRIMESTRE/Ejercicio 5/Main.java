package Ejercicio_5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha1 = new Date();

        //Creamos el ciudadano
        Ciudadano c1 = new Ciudadano("Pepe", "1234567G", 35);

        //Creamos las distintas salidas
        Salida s1 = new Salida(TipoSalida.COMPRA, c1, fecha1);
        Salida s2 = new Salida(TipoSalida.COMPRA, c1, fecha1);
        Salida s3 = new Salida(TipoSalida.COMPRA, c1, fecha1);

        //Añadimos varias salidas iguales al ciudadano para comprobar la multa
        c1.addSalida(s1);
        c1.addSalida(s2);
        c1.addSalida(s3);

        System.out.println("El ciudadano "+ c1.getNombre()+ " en el mismo día ha salido " + c1.vecesSalida(fecha1) + " veces");

        System.out.println("Su multa es " + c1.calcularMulta() + " euros");
    }
}
