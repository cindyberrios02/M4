package EvaluacionFinal.colegio.vistas;

import EvaluacionFinal.colegio.modelos.Alumno;
import EvaluacionFinal.colegio.modelos.Materia;
import EvaluacionFinal.colegio.modelos.MateriaEnum;
import EvaluacionFinal.colegio.servicios.AlumnoServicio;
import EvaluacionFinal.colegio.servicios.ArchivoServicio;
import EvaluacionFinal.colegio.utilidades.Utilidad;

import java.util.List;

public class Menu extends MenuTemplate {
    private AlumnoServicio alumnoServicio;
    private ArchivoServicio archivoServicio;

    public Menu() {
        this.alumnoServicio = new AlumnoServicio();
        this.archivoServicio = new ArchivoServicio();
    }

    @Override
    protected void exportarDatos() {
        System.out.println("\n--- Exportar Datos ---");
        System.out.print("Ingresa la ruta en donde se exportará el archivo: ");
        String ruta = scanner.nextLine();
        archivoServicio.exportarDatos(alumnoServicio.listarAlumnos(), ruta);
        System.out.println("Datos exportados correctamente.");
    }

    @Override
    protected void crearAlumno() {
        System.out.println("\n--- Crear Alumno ---");
        Alumno alumno = new Alumno();

        System.out.print("Ingresa RUT: ");
        alumno.setRut(scanner.nextLine());

        System.out.print("Ingresa nombre: ");
        alumno.setNombre(scanner.nextLine());

        System.out.print("Ingresa apellido: ");
        alumno.setApellido(scanner.nextLine());

        System.out.print("Ingresa dirección: ");
        alumno.setDireccion(scanner.nextLine());

        alumnoServicio.crearAlumno(alumno);
        System.out.println("--- ¡Alumno agregado! ---");
    }

    @Override
    protected void agregarMateria() {
        System.out.println("\n--- Agregar Materia ---");
        System.out.print("Ingresa rut del Alumno: ");
        String rut = scanner.nextLine();

        System.out.println("1. MATEMATICAS");
        System.out.println("2. LENGUAJE");
        System.out.println("3. CIENCIA");
        System.out.println("4. HISTORIA");
        System.out.print("Selecciona una Materia: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        MateriaEnum materiaEnum = switch (opcion) {
            case 1 -> MateriaEnum.MATEMATICAS;
            case 2 -> MateriaEnum.LENGUAJE;
            case 3 -> MateriaEnum.CIENCIA;
            case 4 -> MateriaEnum.HISTORIA;
            default -> null;
        };

        if (materiaEnum != null) {
            Materia materia = new Materia(materiaEnum);
            alumnoServicio.agregarMateria(rut, materia);
            System.out.println("--- ¡Materia agregada! ---");
        }
    }

    @Override
    protected void agregarNotaPasoUno() {
        System.out.println("\n--- Agregar Nota ---");
        System.out.print("Ingresa rut del Alumno: ");
        String rut = scanner.nextLine();

        List<Materia> materias = alumnoServicio.materiasPorAlumnos(rut);
        if (materias != null && !materias.isEmpty()) {
            System.out.println("Alumno tiene las siguientes materias agregadas:");
            for (int i = 0; i < materias.size(); i++) {
                System.out.println((i + 1) + "." + materias.get(i).getNombre());
            }

            System.out.print("Seleccionar materia: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion > 0 && opcion <= materias.size()) {
                System.out.print("Ingresar nota: ");
                double nota = scanner.nextDouble();
                scanner.nextLine();

                Materia materia = materias.get(opcion - 1);
                materia.agregarNota(nota);
                System.out.println("--- ¡Nota agregada a " + materia.getNombre() + "! ---");
            }
        }
    }

    @Override
    protected void listarAlumnos() {
        System.out.println("\n--- Listar Alumnos ---");
        alumnoServicio.listarAlumnos().forEach((rut, alumno) -> {
            System.out.println("Datos Alumno");
            System.out.println("RUT: " + alumno.getRut());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Dirección: " + alumno.getDireccion());
            System.out.println("Materias:");
            alumno.getMaterias().forEach(materia -> {
                System.out.println(materia.getNombre());
                System.out.print("Notas: ");
                System.out.println(materia.getNotas());
            });
            System.out.println("------------------------");
        });
    }

        @Override
        protected void terminarPrograma() {
            System.out.println("\n--- Finalizando programa ---");
            System.out.println("¡Gracias por usar el sistema!");
            scanner.close();
            System.exit(0);
    }
}