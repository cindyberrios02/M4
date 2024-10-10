package sesion7.rebound.modelo;

public abstract class Vehiculo {
    protected int cantidadDeRuedas;
    protected int cantidadDeVentanas;

    public Vehiculo(int cantidadDeRuedas, int cantidadDeVentanas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.cantidadDeVentanas = cantidadDeVentanas;
    }

    public Vehiculo() {
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public int getCantidadDeVentanas() {
        return cantidadDeVentanas;
    }

    public void setCantidadDeVentanas(int cantidadDeVentanas) {
        this.cantidadDeVentanas = cantidadDeVentanas;
    }

    public abstract void encender();
    public abstract void apagar();

}
