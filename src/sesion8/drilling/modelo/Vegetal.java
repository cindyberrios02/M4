package sesion8.drilling.modelo;

import java.time.LocalDate;

public class Vegetal extends Producto {
    private String fechaEnvasado;
    private String fechaCaducidad;

    public Vegetal() {

    }

    public Vegetal(String fechaEnvasado, String fechaCaducidad) {
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Vegetal(String nombre, String codigo, int precio, String fechaEnvasado, String fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    @Override
    public String toString() {
        return "Vegetal{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", fechaCaducidad=" + fechaCaducidad +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
