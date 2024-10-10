package EvaluacionFinal.colegio.servicios;

import EvaluacionFinal.colegio.modelos.Alumno;
import EvaluacionFinal.colegio.modelos.Materia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlumnoServicio {
    private Map<String, Alumno> listaAlumnos;

    public AlumnoServicio() {
        this.listaAlumnos = new HashMap<>();
    }

    public void crearAlumno(Alumno alumno) {
        listaAlumnos.put(alumno.getRut(), alumno);
    }

    public void agregarMateria(String rutAlumno, Materia materia) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno != null) {
            alumno.getMaterias().add(materia);
        }
    }

    public List<Materia> materiasPorAlumnos(String rutAlumno) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno != null) {
            return alumno.getMaterias().stream().collect(Collectors.toList());
        }
        return null;
    }

    public Map<String, Alumno> listarAlumnos() {
        return listaAlumnos;
    }
}

