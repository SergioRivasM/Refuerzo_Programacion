package Ejercicio_6;

public class Revista extends Publicacion {
    //Atributos
    private int num;

    //Constructor
    public Revista(int isbn, String titulo, int age, int num) {
        super(isbn, titulo, age);
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
