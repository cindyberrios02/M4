import java.util.Arrays;
import java.util.Scanner;

public class DrillingExcercise {
    public void executeOne(){
//        int[] listaCompras ={299990,234540,159990,345100} ;
//        int total = Arrays.stream(listaCompras).sum();
        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int televisor = 345100;
        int total = cocina + lavadora + comedor + televisor;
        final float IVA = 0.19F;
        float totalIva = total * IVA;
        float totalMasIva = totalIva + total;
        //float dolar = 798.9F;
        float dolar = 913.24F;
        System.out.println("El total de su compra es: "+ total);
        System.out.println("El IVA es: "+ totalIva);
        System.out.println("El total mas iva es: "+ totalMasIva);
        System.out.printf("El total de su compra es: %.2f\n\n", totalMasIva/dolar);
    }
    public void executeTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en Kg:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros:");
        double altura = sc.nextDouble();
        double imc = peso / Math.pow(altura,2);
        System.out.printf("Su indice de masa muscular es: %.2f\n",imc);
        sc.close();
    }
}
