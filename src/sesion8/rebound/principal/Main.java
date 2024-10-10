package sesion8.rebound.principal;

import sesion8.rebound.modelo.Alumno;
import sesion8.rebound.modelo.Profesor;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Historia","Francisca Vargas","15486-9");
        Alumno alumno1 = new Alumno("Rodrigo Fernandez","256781-5",profesor,"Hacer maraton de Netflix");
        Alumno alumno2 = new Alumno("Carmen Araya","256782-5",profesor,"Jugar Futbol");
        Alumno alumno3 = new Alumno("Sergio Fuentes","256783-5",profesor,"Leer comics y mangas");

        System.out.println("El curso esta compuesto por: ");
        System.out.println(profesor);
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
}
