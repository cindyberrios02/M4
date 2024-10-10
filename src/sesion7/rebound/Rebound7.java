package sesion7.rebound;

import sesion7.rebound.modelo.Auto;
import sesion7.rebound.modelo.Bicicleta;
import sesion7.rebound.modelo.Vehiculo;

import java.util.Scanner;

public class Rebound7 {
    public void execute() {
        Auto miAuto = new Auto("Verde","Chery");
        Bicicleta miBici = new Bicicleta("Pistera");

        //miAuto.setCantidadDeRuedas(4);
        //miAuto.setCantidadDeVentanas(5);
        //miAuto.encender();
        //miAuto.apagar();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! que bencina va a cargar?");
        String bencina = sc.nextLine();
        miAuto.tipoDeBencina(bencina);

        miBici.setTipoDeBicicleta("Electrica");
        miBici.encender();

        //System.out.println(miAuto.toString());


    }
}
