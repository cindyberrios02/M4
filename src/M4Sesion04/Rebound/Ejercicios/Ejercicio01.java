package M4Sesion04.Rebound.Ejercicios;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {


    public void EjecutarEjercicio01() {

        for (int i = 1; i <=10; i++){
            System.out.println("Estamos en el número : " + i);
        }

        int valor = 1;
        while (valor<=10) {
            System.out.println("Estamos en el número : " + valor);
            valor+=1;
        }

        int numero = 100;
        do {
            numero -= 10;
            System.out.println(numero);
        } while (numero > 20);

        int n=8;
        for(int i=1;i<=n;i++) {
            // int i = 1
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(k);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

}
    public void EjecutarEjercicio02() {
        //Modulo numeros pares
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //ejercicio paises con lista estática, que contiene a
        String[] paises = {"Chile", "Argentina", "Bolivia"};

        for (int i = 0; i < paises.length; i++) {
            if (paises[i].contains("a")) {
                System.out.println(paises[i]);
            }
        }
        //for each que contiene C (camel case)
        for (String pais : paises) {
            if (pais.contains("C")) {
                System.out.println(pais);
            }
        }
        //Stream + lambda + metodo de referencia
        Arrays.stream(paises).filter(pais -> pais.contains("C")).forEach(System.out::println);

    }

}





