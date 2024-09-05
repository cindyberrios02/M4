package M4Sesion02.Rebound.Ejercicio01;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraPago {
    public void ejecutarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el valor del producto " + i);
            int valorProducto = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            productos.add(new Producto("Producto " + i, valorProducto));
            total += valorProducto;
        }

        String metodoPago;
        if (total < 10000) {
            metodoPago = "en efectivo";
        } else if (total <= 20000) {
            metodoPago = "con tarjeta";
        } else {
            metodoPago = "con cheque";
        }

        System.out.println(nombre + " deberas pagar " + metodoPago + " el total de: $" + total);

        scanner.close();
    }


}