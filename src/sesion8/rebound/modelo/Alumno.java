package sesion8.rebound.modelo;

public class Alumno extends Persona{
    private Profesor profesor;
    private String hobbie;

    public Alumno() {
    }

    public Alumno(Profesor profesor, String hobbie) {
        this.profesor = profesor;
        this.hobbie = hobbie;
    }

    public Alumno(String nombre, String identificador, Profesor profesor, String hobbie) {
        super(nombre, identificador);
        this.profesor = profesor;
        this.hobbie = hobbie;
    }

    @Override
    public void leerEjercicio() {

    }

    @Override
    public void realizarEjercicio() {

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", profesor=" + profesor + '\'' +
                ", hobbie='" + hobbie + '\'' +
                '}';
    }
}
