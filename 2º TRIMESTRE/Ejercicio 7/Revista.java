package Ejercicio_7;

import java.util.Date;

public class Revista extends ObjetoInventario {
    //Atributos
    private int num;

    //Constructor
    public Revista(int isbn, String titulo, int age, int num, Date fechaCompra) {
        super(isbn, titulo, age, fechaCompra);
        this.num = num;
    }

    //Getter y setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Número: " + num + "\n";
    }
}
