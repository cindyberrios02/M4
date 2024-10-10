package sesion7.rebound.modelo;

import sesion7.rebound.interfaces.InterfazVehiculo;

public class Auto extends Vehiculo implements InterfazVehiculo {
    private String color;
    private String modelo;

    public Auto(String color, String modelo) {
        super();
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantidadDeRuedas=" + cantidadDeRuedas +
                ", cantidadDeVentanas=" + cantidadDeVentanas +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("El auto se encendio");
    }

    @Override
    public void apagar() {
        System.out.println("El auto se apago");
    }

    @Override
    public void tipoDeBencina(String bencina) {
        System.out.println("Gracias por preferirnos. Bencina " + bencina + " cargada!");
    }
}
