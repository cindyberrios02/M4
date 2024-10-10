package sesion6.drilling;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Drilling6 {
    public void execute(){
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        do {
            System.out.println("Ingrese nuevo nombre de usuario");
            String nombre = sc.nextLine();

            boolean passOk = false;
            String pass = "";
            do {
                System.out.println("Ingrese contraseña");
                pass = sc.nextLine();

                if(pass.length() <= 10){
                    System.out.println("La contraseña debe tener MAS de 10 caracteres");
                }
                if (pass.length() > 10 && countMayus(pass) && countNumbersSymbols(pass)) {
                    passOk = true;
                }
            } while (!passOk);

            System.out.println("Ingrese nombre completo");
            String nombreCompleto = sc.nextLine();

            System.out.println("Ingrese fecha de nacimiento DD-MM-AAAA");
            String fecha = sc.nextLine();
            Persona nuevaPersona = new Persona(nombre, pass, nombreCompleto, fecha);
            personas.add(nuevaPersona);


            System.out.println("Bienvenido " + nombre);
            System.out.println(bienvenida(fecha));
            System.out.println("Lista total de usuarios registrados: ");
            for (int i = 1; i <= personas.size(); i++) {
                System.out.println(i + " - " + personas.get(i - 1).getUsuario());
            }
        } while (personas.size()<10);


    }

    public static boolean countMayus(String pass){
        int contadorMayus = 0;
        for (int i =0; i < pass.length();i++){
            char caracter = pass.charAt(i);
            if(Character.isUpperCase(caracter)){
                contadorMayus++;
            }
        }
        if(contadorMayus < 2){
            System.out.println("Debe tener al menos 2 letras mayusculas");
        }
        return contadorMayus >= 2;
    }
    public static boolean countNumbersSymbols(String pass){
        int contadorNumOrSymbol = 0;
        for (int i =0; i < pass.length();i++){
            char caracter = pass.charAt(i);
            if(!Character.isLetter(caracter)){
                contadorNumOrSymbol++;
            }
        }
        if(contadorNumOrSymbol < 3){
            System.out.println("Debe tener al menos 3 caracteres que sean numeros o simbolos");
        }
        return contadorNumOrSymbol >= 3;
    }
    public static String bienvenida (String fecha){
        LocalDate hoy = LocalDate.now();
        int anioActual = hoy.getYear();
        int edad = anioActual - Integer.parseInt(fecha.substring(fecha.length()-4));
        if (edad >= 18){
            return "Puede pasar a la zona para mayores de 18 años";
        } else {
            return "Bienvenido a la zona para toda la familia";
        }
    }
}
