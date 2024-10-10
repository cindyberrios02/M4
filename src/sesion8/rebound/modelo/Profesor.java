package sesion8.rebound.modelo;

public class Profesor extends Persona{

    private String especialidad;
    public Profesor() {}
    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor( String especialidad,String nombre, String identificador) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    @Override
    public void leerEjercicio() {

    }

    @Override
    public void realizarEjercicio() {

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                '}';
    }
}
