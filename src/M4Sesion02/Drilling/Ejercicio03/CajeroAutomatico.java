package M4Sesion02.Drilling.Ejercicio03;

import java.util.Scanner;

public class CajeroAutomatico {
    public void ejecutarCajero() {
        int dinero = 1000;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{

            System.out.println("Seleccione la opcion:");
            System.out.println("1) Depositar dinero a mi cuenta");
            System.out.println("2) Retirar dinero de mi cuenta");
            System.out.println("3) Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo inicial es" + dinero);
                    System.out.println("Digite la cantidad que desee depositar");
                    int deposito = sc.nextInt();
                    dinero = dinero + deposito;
                    System.out.println("Saldo actual " + dinero);
                    break;
                case 2:
                    System.out.println("Digite la cantidad que see retirar");
                    int retirar = sc.nextInt();
                    dinero = dinero - retirar;
                    System.out.println("Saldo actual " + dinero);
                    break;
                case 3:
                    System.out.println("Saldo actual " + dinero);
                    System.out.println("Gracias por operar con nosotros");
                    break;

            }

        } while (opcion != 3);
        sc.close();
    }
}
