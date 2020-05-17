package Ejercicio_7;

import java.util.Date;

abstract class ObjetoInventario extends Publicacion{
    private Date fechaCompra;

    public ObjetoInventario(int isbn, String titulo, int age, Date fechaCompra) {
        super(isbn, titulo, age);
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return super.toString() + "Fecha de compra: " + fechaCompra + "\n";
    }
}
