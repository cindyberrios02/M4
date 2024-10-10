package sesion8.drilling.modelo;

import sesion8.drilling.interfaces.Transaccion;

public class Venta implements Transaccion {
    private Vendedor vendedor;
    private int ganancia;

    public Venta() {
    }

    public Venta(Vendedor vendedor, int ganancia) {
        this.vendedor = vendedor;
        this.ganancia = ganancia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }


    @Override
    public String toString() {
        return "Venta{" +
                "vendedor=" + vendedor +
                ", ganancia=" + ganancia +
                '}';
    }

    @Override
    public void procesarPago(int monto, Vendedor vendedor) {
        System.out.println("Pago procesado por " + vendedor.getNombre() + ". Total: " + monto);
        this.ganancia += monto;
    }
}
