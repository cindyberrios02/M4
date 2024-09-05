package M4Sesion02.Rebound.Ejercicio01;

public  class Producto {
    private String nombre;
    private int valor;

    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = (int) valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }
}
