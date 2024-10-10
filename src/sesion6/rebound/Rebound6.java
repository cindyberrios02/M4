package sesion6.rebound;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rebound6 {
    public void excecute(){
        Persona personaUno = new Persona("Pedro","asdf");
        Persona personaDos = new Persona("Esteban","qwerty");
        Persona personaTres = new Persona("Carla","zxcvb");
        Persona personaCuatro = new Persona("Susana","12345");

        List<Persona> personas = new ArrayList<>();
        personas.add(personaUno);
        personas.add(personaDos);
        personas.add(personaTres);
        personas.add(personaCuatro);

        boolean getIntoApp = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese su nombre de usuario");
            String nombreUsuario = sc.nextLine();

            System.out.println("Ingrese su contraseña");
            String passUsuario = sc.nextLine();

            for (Persona persona : personas) {
                if (persona.getUsuario().equalsIgnoreCase(nombreUsuario) && persona.getPassword().equals(passUsuario)) {
                    getIntoApp = true;
                    break;
                }
            }
            System.out.println("Usuario o contraseña incorrecta.");
        } while (!getIntoApp);

        int opcion;
        do {
            System.out.println("Elija una opcion: \n" +
                    "1- Calcular la raiz Cuadrada de un numero\n" +
                    "2- Ver el valor de PI\n" +
                    "3- Calcular la potencia de un numero\n" +
                    "4- Salir");
            opcion = sc.nextInt();
            sc.nextLine();


            if(opcion == 1){
                System.out.println("Ingrese un numero");
                int numero = sc.nextInt();
                System.out.println(Math.sqrt(numero));
            }
            if (opcion == 2){
                System.out.println("El valor de pi es: ");
                System.out.println(Math.PI);
            }
            if (opcion == 3){
                System.out.println("Ingrese un numero base");
                int base = sc.nextInt();
                System.out.println("Ingrese un numero exponente");
                int exp = sc.nextInt();
                double resultado = Math.pow(base,exp);

                System.out.println(base + "  elevado a la " + exp + " es igual a: "+ resultado);
            }

        } while (opcion != 4);
        System.out.println("Ha salido de la app");

    }
}
