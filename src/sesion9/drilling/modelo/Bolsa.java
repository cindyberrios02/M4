package sesion9.drilling.modelo;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private ArrayList<T> bolsaCompras;
    private int tamanio;

    public Bolsa() {
    }

    public Bolsa(ArrayList<T> bolsaCompras, int tamanio) {
        this.bolsaCompras = bolsaCompras;
        this.tamanio = tamanio;
    }

    public List<T> getBolsaCompras() {
        return bolsaCompras;
    }

    public void setBolsaCompras(ArrayList<T> bolsaCompras) {
        this.bolsaCompras = bolsaCompras;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void agregar(T item) {
        if (bolsaCompras.size() < tamanio) {
            bolsaCompras.add(item);
        } else {
            System.out.println("La bolsa está llena. No se pueden agregar más items.");
        }
    }

    @Override
    public String toString() {
        return "Bolsa{" +
                "bolsaCompras=" + bolsaCompras +
                ", tamanio=" + tamanio +
                '}';
    }
}
