package M4Sesion02.Drilling;

import M4Sesion02.Drilling.Ejercicio02.Temperatura;
import M4Sesion02.Drilling.Ejercicio03.CajeroAutomatico;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();
        temperatura.ejecutar();

        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
        cajeroAutomatico.ejecutarCajero();
    }
}
