package M4Sesion04;

import M4Sesion04.Rebound.Ejercicios.Ejercicio01;
import M4Sesion04.Rebound.Ejercicios.Persona;
import M4Sesion04.Rebound.Ejercicios.TelefonoMovil;

public class Main {
    public static void main(String[] args) {
        Ejercicio01 ejercicio01 = new Ejercicio01();

        ejercicio01.EjecutarEjercicio01();

        TelefonoMovil telefonoMovil = new TelefonoMovil(123,"Nokia",2011,"Black");
        System.out.println(telefonoMovil.toString());

        Persona persona1 = new Persona("Cindy",32,68,1.56);
        Persona persona2 = new Persona("Adita",4,16,1.00);
        Persona persona3 = new Persona("Luis",39,76,1.70);
        Persona persona4 = new Persona("Marisol",64,50,1.50);
        Persona persona5 = new Persona("Grace",5,20,1.10);

        imprimirResultados(persona1);
        imprimirResultados(persona2);
        imprimirResultados(persona3);
        imprimirResultados(persona4);
        imprimirResultados(persona5);
    }

    public static void calculoImc(Persona persona){
        double IMC = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        System.out.printf("Su índice de masa muscular IMC es: %.2f %n", IMC);
        if(IMC>25){
            System.out.println("Usted es OBESO, baje de peso");
        }else {
            System.out.println("Usted tiene un IMC normal");
        }

    }
    public static void calcularEdad(Persona persona){
        System.out.println("Su edad es: " + persona.getEdad());
        if(persona.getEdad()>=18){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }

    }

    public static void imprimirResultados(Persona persona){
        System.out.println("-------------------");
        System.out.println(persona.getNombre()+" :");
        System.out.println(" ");
        System.out.println("Calculando su IMC....");
        calculoImc(persona);
        System.out.println(" ");
        calcularEdad(persona);
        System.out.println(" ");
        System.out.println(persona);
    }

}
