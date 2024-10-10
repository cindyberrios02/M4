package sesion5.drilling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drilling5 {
    public void execute(){
        List<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elija una opcion: \n" +
                    "1- Ver productos\n" +
                    "2- Agregar producto\n" +
                    "3- Modificar producto\n" +
                    "4- Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            Producto productoUno = new Producto("Chocolate",500,"Chocolate amargo, 500 gr.");
            Producto productoDos = new Producto("Leche",800,"Leche entera, 1 litro.");
            Producto productoTres = new Producto("Arroz",900,"Arroz grado 2, 1 kilo.");
            productos.add(productoUno);
            productos.add(productoDos);
            productos.add(productoTres);

            if(opcion == 1){
                for (Producto p : productos){
                    System.out.println(p.toString());
                }
            }
            if (opcion == 2){
                if (productos.size() >= 7){
                    System.out.println("No es posible crear mas productos");
                } else {
                    Producto productoAgregado = new Producto();

                    System.out.println("Ingrese el nombre del producto");
                    productoAgregado.setNombre(sc.nextLine());

                    System.out.println("Ingrese el valor del producto");
                    productoAgregado.setValor(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Ingrese la descripcion del producto");
                    productoAgregado.setDescripcion(sc.nextLine());

                    productos.add(productoAgregado);
                }

            }
            if (opcion == 3){

                System.out.println("Ingrese el numero del producto a modificar");

                for (int i = 1 ; i <= productos.size(); i++){
                    System.out.println(i+ " - " + productos.get(i-1).toString());
                }
                int idProducto = sc.nextInt()-1;
                sc.nextLine();

                Producto productoModificable = productos.get(idProducto);

                System.out.println("Ingrese el nuevo nombre del producto");
                productoModificable.setNombre(sc.nextLine());

                System.out.println("Ingrese el nuevo valor del producto");
                productoModificable.setValor(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingrese la nueva descripcion del producto");
                productoModificable.setDescripcion(sc.nextLine());

                productos.set(idProducto,productoModificable);
            }

        } while (opcion != 4);
        System.out.println("Ha salido de la app");

    }
}
