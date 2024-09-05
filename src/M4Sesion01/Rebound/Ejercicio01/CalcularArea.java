package M4Sesion01.Rebound.Ejercicio01;
import java.util.Scanner;

public class CalcularArea {
    public void ejecutarCalcularArea() {
        //Llame al Scanner scanner, le podria haber puesto sc, o los que usa el profe
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario los datos por la consola (sout)
        System.out.print("Ingrese la base del rectángulo: ");

        //podria ser int, pero double por comas eventualmenteñ
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calculamos el área y el perímetro
        double area = base * altura;
        double perimetro = 2 *(base + altura);

        // Mostramos los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        scanner.close();
    }
}
