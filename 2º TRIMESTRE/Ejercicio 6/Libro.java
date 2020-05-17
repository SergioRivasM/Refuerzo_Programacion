package Ejercicio_6;

public class Libro extends Publicacion implements Prestable {
    //Atributos
    private boolean prestado;

    //Constructor
    public Libro(int isbn, String titulo, int age) {
        super(isbn, titulo, age);
        this.prestado = false;
    }

    //Getter y setter
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void presta() { //Método presta que vale true cuando está prestado
        this.prestado = true;
    }

    @Override
    public void devuelve() { //Método devuelve que vale false cuando es devuelto
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() { //Método boolean para comprobar si está prestado
        return this.prestado;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Prestado: " + prestado + "\n";
    }
}