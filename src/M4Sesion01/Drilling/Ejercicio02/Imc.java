package M4Sesion01.Drilling.Ejercicio02;

import java.util.Scanner;

public class Imc {

    public void calcularIMC(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso para calcular el IMC en kg:");
        double peso = sc.nextDouble();

        System.out.println("Ingrese la altura para calcular el IMC en metros:");
        double altura = sc.nextDouble();

        System.out.println("Calculando su IMC...");
        double IMC = peso / (Math.pow(altura, 2));
        System.out.printf("Su índice de masa muscular IMC es: %.2f %n", IMC);

        sc.close();
    }

}

