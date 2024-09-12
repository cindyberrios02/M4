package M4Sesion04.Rebound.Ejercicios;

public class TelefonoMovil {
    int numero;
    String modelo;
    int anio;
    String color;

    public TelefonoMovil(int numero, String modelo, int anio, String color)
    {
        this.numero = numero;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public TelefonoMovil() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "numero=" + numero +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                '}';
    }
}
