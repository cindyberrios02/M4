package EvaluacionFinal.colegio.modelos;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private Set<Materia> materias;

    public Alumno() {
        this.materias = new HashSet<>();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {

        this.rut = rut;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public Set<Materia> getMaterias() {

        return materias;
    }

    public void setMaterias(Set<Materia> materias) {

        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", materias=" + materias + "]";
    }
}