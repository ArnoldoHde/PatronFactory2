package com.example.arnoldo.patronfactory;

/**
 * Created by arnoldo on 17/05/18.
 */

public class FacturaIva extends Factura {
    @Override
    public double getImporteIva() {
        return getImporte()*1.21;
    }

    /*@Override
    public String mensaje() {
        return null;
    }*/
}
