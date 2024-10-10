package sesion7.drilling.principal;

import sesion7.drilling.modelo.Cocina;
import sesion7.drilling.modelo.Producto;
import sesion7.drilling.modelo.Refrigerador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cocina cocina = new Cocina(159000, 98, 6);
        Refrigerador refri = new Refrigerador(468990, 56, 'A', 3);


        Scanner sc = new Scanner(System.in);
        int producto = 0;
        Producto compra = new Producto();
        do {
            System.out.println("¿Seleccione el producto que desea comprar?");
            System.out.println("1-Cocina");
            System.out.println("2-Refrigerador");
            producto = Integer.parseInt(sc.nextLine());
            if (producto == 1) compra = cocina;
            if (producto == 2) compra = refri;
        } while (producto < 1 || producto > 2);

        System.out.println("Valor: " + compra.getPrecio());
        if (compra instanceof Cocina) {
            System.out.println("Cuenta con: " + ((Cocina) compra).getCantidadQuemadores() + " quemadores");
        } else {
            System.out.println("Cuenta con: " + ((Refrigerador) compra).getNumeroPuertas() + " puertas");
        }

        System.out.println("Articulos disponibles: " + compra.getCantidadDisponible());

        System.out.println("¿Presione Y para continuar. N para cancelar");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            if (compra instanceof Cocina) {
                System.out.println("Desea incluir un gas por 5000 pesos? si o no");
                if (sc.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Felicidades! Ha comprado su cocina incluyendo un gas");
                } else {
                    System.out.println("Su compra no se incluye gas");
                }
            }
            System.out.println("Nueva cantidad de articulos disponible: "+ (compra.getCantidadDisponible()-1));
        } else {
            System.out.println("Finalizando programa");
        }
    }
}
