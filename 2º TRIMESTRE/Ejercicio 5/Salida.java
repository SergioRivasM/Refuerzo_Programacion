package Ejercicio_5;

import java.util.Date;

//Atributos
public class Salida {
    private TipoSalida tipo;
    private Ciudadano ciudadano;
    private Date fecha;

    //Constructor
    public Salida(TipoSalida tipo, Ciudadano ciudadano, Date fecha) {
        this.tipo = tipo;
        this.ciudadano = ciudadano;
        this.fecha = fecha;
    }

    //Getter y setter
    public TipoSalida getTipo() {
        return tipo;
    }

    public void setTipo(TipoSalida tipo) {
        this.tipo = tipo;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Método toString
    @Override
    public String toString() {
        return "Tipo = " + tipo + "\n" +
                "Ciudadano = " + ciudadano + "\n" +
                "Date = " + fecha + "\n";
    }
}
