package sesion7.drilling.modelo;

public class Producto {
    protected int precio;
    protected int cantidadDisponible;

    public Producto() {
    }

    public Producto(int precio, int cantidadDisponible) {
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
