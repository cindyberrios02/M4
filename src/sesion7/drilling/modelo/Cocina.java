package sesion7.drilling.modelo;

import sesion7.drilling.interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface {
    private int cantidadQuemadores;

    public Cocina(int cantidadQuemadores) {
        this.cantidadQuemadores = cantidadQuemadores;
    }

    public Cocina(int precio, int cantidadDisponible, int cantidadQuemadores) {
        super(precio, cantidadDisponible);
        this.cantidadQuemadores = cantidadQuemadores;
    }

    public Cocina() {
    }

    public Cocina(int precio, int cantidadDisponible) {
        super(precio, cantidadDisponible);
    }

    public int getCantidadQuemadores() {
        return cantidadQuemadores;
    }

    public void setCantidadQuemadores(int cantidadQuemadores) {
        this.cantidadQuemadores = cantidadQuemadores;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "cantidadQuemadores=" + cantidadQuemadores +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }

    @Override
    public void incluyeGas() {

    }

    @Override
    public void cambiarPrecio() {

    }

    @Override
    public void cantidadDisponible() {

    }
}
