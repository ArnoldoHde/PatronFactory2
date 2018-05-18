package com.example.arnoldo.patronfactory;

import android.widget.Toast;

/**
 * Created by arnoldo on 17/05/18.
 */

public class FacturaIvaReducido extends Factura {
    @Override
    public double getImporteIva() {
       return getImporte()*1.07;

    }

   /* @Override
    public String mensaje() {
        return null;
    }*/
}
