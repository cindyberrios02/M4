package sesion8.drilling.principal;

import sesion8.drilling.modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Producto productoUno = new Vegetal("Platano","123KSV",400,"23-02-2024","23-03-2024");
        Producto productoDos = new Vegetal("Manzana","121KSV",600,"23-02-2024","23-03-2024");
        Producto productoTres = new Vegetal("Pera","129KSV",800,"23-02-2024","23-03-2024");
        Producto productoCuatro = new Vestuario("Polera","ABC123",5000,"s","Verde");
        Producto productoCinco = new Vestuario("Pantalon","ABC124",15000,"s","Verde");
        Producto productoSeis = new Vestuario("Falda","ABC125",10000,"s","Verde");
        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
        productos.add(productoCuatro);
        productos.add(productoCinco);
        productos.add(productoSeis);
        List<Producto> carroDeCompra = new ArrayList<>();
        Vendedor vendedor = new Vendedor("Pedro","15.555.555-K");
        Venta venta =new Venta(vendedor,0);
        int total = 0;
        do {
            System.out.println("Elija una opcion: \n" +
                    "1- Mostrar lista de productos\n" +
                    "2- Comprar\n" +
                    "3- Ver carrito de compras\n" +
                    "4- Pagar\n" +
                    "5- Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            if(opcion == 1){
                for (Producto p : productos){
                    System.out.println(p.toString());
                }
            }
            if (opcion == 2){
                if (carroDeCompra.size() > 10){
                    System.out.println("No es posible agregar mas productos al carro!!!");
                } else {
                    System.out.println("Ingrese el codigo del producto que desea comprar");
                    String codigoBuscar = sc.nextLine();
                    boolean foundProduct = false;
                    for (Producto p : productos) {
                        if (p.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                            carroDeCompra.add(p);
                            System.out.println(p.getNombre() + " Agregado al carro");
                            total +=p.getPrecio();
                            foundProduct = true;
                            break;
                        }
                    }
                    if (!foundProduct) {
                        System.out.println("Codigo no encontrado");
                    }
                }
            }
            if (opcion == 3){
                if (carroDeCompra.size() == 0) {
                    System.out.println("Carro de compra vacio");
                }else{
                    for (Producto p : carroDeCompra){
                        System.out.println(p.toString());
                    }
                }

            }
            if (opcion == 4){
                venta.procesarPago(total,vendedor);
                carroDeCompra.clear();
            }

        } while (opcion != 5);
        System.out.println("Ha salido de la app");

    }
}
