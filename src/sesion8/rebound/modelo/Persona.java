package sesion8.rebound.modelo;

public abstract class Persona {
    protected String nombre;
    protected String identificador;

    public Persona() {
    }

    public Persona(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public abstract void leerEjercicio();
    public abstract void realizarEjercicio();
}
