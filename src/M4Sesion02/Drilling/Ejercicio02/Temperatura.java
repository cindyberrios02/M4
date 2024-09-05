package M4Sesion02.Drilling.Ejercicio02;

import java.util.Scanner;

public class Temperatura {
    public void ejecutar() {
        System.out.println("Bienvenido, por favor ingrese temperatura de hoy: ");
        Scanner sc = new Scanner(System.in);
        double temperatura = sc.nextDouble();

        String clima = "";

        if (temperatura <= 10) {
            clima = "Frio";
        }else if (temperatura > 10 && temperatura < 20) {
            clima = "Nublado";
        }else if (temperatura > 20 && temperatura < 30) {
            clima = "Caluroso";
        } else if (temperatura >= 30 ) {
            clima   = "Tropical";
        }

        System.out.println("Hay "+ temperatura + " grados. El tipo de clima  hoy es " + clima);
    }
}
