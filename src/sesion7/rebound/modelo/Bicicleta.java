package sesion7.rebound.modelo;

import sesion7.rebound.interfaces.InterfazVehiculo;

public class Bicicleta extends Vehiculo {
    private String tipoDeBicicleta;

    public Bicicleta() {
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }

    public Bicicleta(String tipoDeBicicleta) {
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    public String getTipoDeBicicleta() {
        return tipoDeBicicleta;
    }

    public void setTipoDeBicicleta(String tipoDeBicicleta) {
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoDeBicicleta='" + tipoDeBicicleta + '\'' +
                '}';
    }


}
