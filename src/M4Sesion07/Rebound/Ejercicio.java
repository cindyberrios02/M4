package M4Sesion07.Rebound;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Ejercicio {
    public static void main(String[] args) {
        // Crear una lista de personas (simulación de una base de datos)
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Alex15", "EmpanadadeQueso"));

        // Solicitar credenciales al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = scanner.nextLine();

        // Validar credenciales
        boolean usuarioEncontrado = false;
        boolean autenticado = false;
        for (Persona persona : personas) {
            if (persona.getUsuario().equals(usuarioIngresado)) {
                usuarioEncontrado = true;
                if (persona.getContraseña().equals(contraseñaIngresada)) {
                    autenticado = true;
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            }
        }

        if (!autenticado) {
            if (usuarioEncontrado) {
                System.out.println("Contraseña incorrecta.");
            } else {
                System.out.println("Usuario no encontrado.");
            }
        } else {
            // Mostrar menú y realizar operaciones
            System.out.println("Bienvenido " + usuarioIngresado);
            while (true) {
                System.out.println("Que desea realizar?");
                System.out.println("1- Calcular la raíz Cuadrada de un número");
                System.out.println("2- Ver el valor de π");
                System.out.println("3- Calcular la potencia de un número");
                System.out.println("0- Salir");

                int opcion = scanner.nextInt();
                if (opcion == 0) {
                    break;
                }

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese un número: ");
                        double numero = scanner.nextDouble();
                        System.out.println("La raíz cuadrada es: " + Math.sqrt(numero));
                        break;
                    case 2:
                        System.out.println("El valor de π es: " + Math.PI);
                        break;
                    case 3:
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        double exponente = scanner.nextDouble();
                        System.out.println("La potencia es: " + Math.pow(base, exponente));
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            }

        }
    }
}