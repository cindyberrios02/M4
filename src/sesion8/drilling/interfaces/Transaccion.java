package sesion8.drilling.interfaces;

import sesion8.drilling.modelo.Vendedor;

public interface Transaccion {
    void procesarPago(int monto, Vendedor vendedor);

}
