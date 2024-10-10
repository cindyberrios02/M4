package EvaluacionFinal.colegio.servicios;

import java.util.List;

public class PromedioServicioImp {
    public double calcularPromedio(List<Double> notas) {
        if (notas == null || notas.isEmpty()) {
            return 0.0;
        }
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}