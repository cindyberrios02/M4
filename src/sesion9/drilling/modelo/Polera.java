package sesion9.drilling.modelo;

public class Polera {
    private String color;

    public Polera() {
    }

    public Polera(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Polera{" +
                "color='" + color + '\'' +
                '}';
    }
}
