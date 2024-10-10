package EvaluacionFinal.colegio.servicios;

import EvaluacionFinal.colegio.modelos.Alumno;
import EvaluacionFinal.colegio.modelos.Materia;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArchivoServicio {
    private List<Alumno> alumnosACargar;
    private PromedioServicioImp promediosServicioImp;

    public ArchivoServicio() {
        this.alumnosACargar = new ArrayList<>();
        this.promediosServicioImp = new PromedioServicioImp();
    }

    public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ruta + "/promedios.txt"))) {
            for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
                Alumno alumno = entry.getValue();
                for (Materia materia : alumno.getMaterias()) {
                    double promedio = promediosServicioImp.calcularPromedio(materia.getNotas());
                    writer.printf("Alumno : %s - %s%n", alumno.getRut(), alumno.getNombre());
                    writer.printf("Materia : %s - Promedio : %.1f%n", materia.getNombre(), promedio);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al exportar datos: " + e.getMessage());
        }
    }
}