package sesion9.drilling.modelo;

public class Zapato {
    private String marca;

    public Zapato() {
    }

    public Zapato(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
