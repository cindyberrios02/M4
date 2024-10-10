package sesion5.rebound;

import java.util.Scanner;

public class Rebound5 {

    public void execute() {
        String[] asignaturas = new String[5];
        double[] notas = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nombre de la asignatura");
            asignaturas[i] = sc.nextLine();

            System.out.println("Ingrese el promedio de la asignatura " + asignaturas[i]);
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Sus notas son las siguentes");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(asignaturas[i] + " = " + notas[i]);
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("Su promedio general es = " + suma/notas.length);
    }
}
