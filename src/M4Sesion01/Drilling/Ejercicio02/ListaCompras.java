package M4Sesion01.Drilling.Ejercicio02;

public class ListaCompras {


    public void ejecutarListaCompras() {

        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int tv = 345100;
        int total = cocina + lavadora + comedor + tv;


        float iva = 0.19F;
        float ivaCompra = total * iva;
        float totalCompraPesosMasIva = total + ivaCompra;
        float dolar = 919.71F;
        float totalCompraDolares = totalCompraPesosMasIva / dolar;


        System.out.println("Articulos comprados: " );
        System.out.println("1) Cocina " + cocina);
        System.out.println("2) Lavadora " + lavadora);
        System.out.println("3) Comedor " + comedor);
        System.out.println("4) TV " + tv);
        System.out.println("El total de su compra es de: $ " + total);
        System.out.printf("El IVA es de: $ %.2f", ivaCompra);
        System.out.printf(" considerando un IVA de %.2f %n", iva);
        System.out.printf("El total más IVA es: $ %.2f %n", totalCompraPesosMasIva);
        System.out.printf("El total de su compra en dólares es de: %.2f %n", totalCompraDolares);
    }
}
