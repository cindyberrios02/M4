package M4Sesion01.Drilling;

import M4Sesion01.Drilling.Ejercicio02.Imc;
import M4Sesion01.Drilling.Ejercicio02.ListaCompras;

public class Main {

    public static void main(String[] args) {

        ListaCompras lista = new ListaCompras();
        lista.ejecutarListaCompras();

        Imc imc = new Imc();
        imc.calcularIMC();

    }
}
