package sesion7.drilling.modelo;

import sesion7.drilling.interfaces.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface {
    private char tipoGastoElectrico;
    private int numeroPuertas;

    public Refrigerador(char tipoGastoElectrico, int numeroPuertas) {
        this.tipoGastoElectrico = tipoGastoElectrico;
        this.numeroPuertas = numeroPuertas;
    }

    public Refrigerador(int precio, int cantidadDisponible, char tipoGastoElectrico, int numeroPuertas) {
        super(precio, cantidadDisponible);
        this.tipoGastoElectrico = tipoGastoElectrico;
        this.numeroPuertas = numeroPuertas;
    }

    public Refrigerador() {
    }

    public int getTipoGastoElectrico() {
        return tipoGastoElectrico;
    }

    public void setTipoGastoElectrico(char tipoGastoElectrico) {
        this.tipoGastoElectrico = tipoGastoElectrico;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Refrigerador{" +
                "tipoGastoElectrico=" + tipoGastoElectrico +
                ", numeroPuertas=" + numeroPuertas +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }

    @Override
    public void cambiarPrecio() {

    }

    @Override
    public void cantidadDisponible() {

    }
}
