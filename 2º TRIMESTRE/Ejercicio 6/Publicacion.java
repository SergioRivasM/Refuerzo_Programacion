package Ejercicio_6;

abstract class Publicacion {
    //Atributos
    private int isbn;
    private String titulo;
    private int age;

    //Constructor
    public Publicacion(int isbn, String titulo, int age) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.age = age;
    }

    //Getter y setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString
    @Override
    public String toString() {
        return "ISBN: " + isbn + "\n" +
                "Título: " + titulo + "\n" +
                "Año de publicación: " + age + "\n";
    }
}