package sesion9.drilling.principal;

import sesion9.drilling.modelo.Bolsa;
import sesion9.drilling.modelo.Polera;
import sesion9.drilling.modelo.Zapato;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bolsa<Object> compras = new Bolsa<>();
        compras.setBolsaCompras(new ArrayList<>());
        System.out.println("Definir tamaño bolsa");
        int tamanioBolsa = Integer.parseInt(sc.nextLine());
        int eleccionBolsa = 0;
        compras.setTamanio(tamanioBolsa);
        do {
            System.out.println("Elegir bolsa: ");
            System.out.println("1-Zapatos");
            System.out.println("2-Poleras");
            eleccionBolsa = Integer.parseInt(sc.nextLine());
        } while (eleccionBolsa < 1 || eleccionBolsa > 2);
        int opcion = 0;
        do {
            System.out.println("Elija una opcion: \n" +
                    "1- Lista de productos\n" +
                    "2- Agregar\n" +
                    "3- Salir");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                if(compras.getBolsaCompras().size()==0){
                    System.out.println("No hay productos en la bolsa");
                }
                for (Object p : compras.getBolsaCompras()) {
                    System.out.println(p.toString());
                }
            }
            if (opcion == 2) {
                if (eleccionBolsa == 1) {
                    System.out.println("Agregue nuevo zapato: ");
                    System.out.println("Marca de zapato?");
                    String marca = sc.nextLine();
                    Zapato zapato = new Zapato(marca);
                    compras.agregar(zapato);
                } else {
                    System.out.println("Agregue nuevo polerra: ");
                    System.out.println("Color de polera?");
                    String color = sc.nextLine();
                    Polera polera = new Polera(color);
                    compras.agregar(polera);
                }

            }

        } while (opcion != 3);
        System.out.println("Ha salido de la app");

    }


}

