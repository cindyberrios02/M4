package sesion9.rebound.principal;

import sesion9.rebound.modelo.Alumno;
import sesion9.rebound.modelo.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> listaMixta = new ArrayList<>();
        Profesor profesor = new Profesor("Juan","25-09-1995");
        Alumno alumno1 = new Alumno("Ignacio","21-05-2014","Tarea1");
        Alumno alumno2 = new Alumno("Javier","22-08-2014","Tarea2");
        Alumno alumno3 = new Alumno("Rodrigo","23-09-2014","Tarea3");
        listaMixta.add(profesor);
        listaMixta.add(alumno1);
        listaMixta.add(alumno2);
        listaMixta.add(alumno3);

        //simpleName + nombre
        simpleNameAndName(listaMixta);
        //superClase
        superClass(listaMixta);
        //listaCompleta
        listaPersonas(listaMixta);
    }

    public static <T> void simpleNameAndName(List<T> lista){
        System.out.println("------ SimpleName + Nombre ------");
        for(T persona: lista){
            if (persona instanceof Profesor) {
                System.out.println(persona.getClass().getSimpleName() + " - "+ ((Profesor) persona).getNombre());
            }
            if (persona instanceof Alumno){
                System.out.println(persona.getClass().getSimpleName() + " - "+ ((Alumno) persona).getNombre());
            }
        }
        System.out.println(" ");
    }
    public static <T> void superClass(List<T> lista){
        System.out.println("------ Super clase de cada uno ------");
        for(T persona: lista){
            System.out.println(persona.getClass().getSuperclass());
        }
        System.out.println(" ");
    }
    public static <T> void listaPersonas(List<T> lista){
        System.out.println("------ Lista completa de individuos ------");
        for(T persona: lista){
            System.out.println(persona);
        }
        System.out.println(" ");
    }


}
