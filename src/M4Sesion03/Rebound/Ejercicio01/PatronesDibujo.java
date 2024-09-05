package M4Sesion03.Rebound.Ejercicio01;

import java.util.Scanner;

public class PatronesDibujo {
    public void dibujar() {

        System.out.println("Digite un numero al azar");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Patron 1:");
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println("\n\nPatron 2:");
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                //System.out.print(j);
                if (i == 1 || j == 1 || i == numero || j == numero) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
