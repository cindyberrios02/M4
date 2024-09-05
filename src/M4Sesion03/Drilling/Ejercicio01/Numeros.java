package M4Sesion03.Drilling.Ejercicio01;

import java.util.Scanner;

public class Numeros {
    public void ejecutar() {
        int num1= 0;

        do {
            System.out.println("Ingrese numero del 1 al 100");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            if (num1 <1 || num1 > 100) {
                System.out.println("Numero invalido");
            }
        }
        while (num1 <1 || num1 > 100);
        int contarPar = 0;
        int contarImpar = 0;

        for (int i = 1; i <= num1; i++) {
            if (i % 2 == 0) {
                contarPar++;
            } else {
                contarImpar++;
            }
        }
        System.out.println("El total de numeros pares es " + contarPar);
        System.out.println("El total de numeros impares es " + contarImpar);

        System.out.println("Fin del programa");

    }
}
