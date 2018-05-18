package com.example.arnoldo.patronfactory;

import android.widget.Toast;

/**
 * Created by arnoldo on 17/05/18.
 */

public class UsoFactory {
    public static Factura getFactura(String tipo) {
        if (tipo.equals("iva")) {
            return new FacturaIva();
        }

            return new FacturaIvaReducido();
       /* if (tipo.equals("ivaReducido")) {
            return new FacturaIvaReducido();
        }
        else
            return new mensaje();*/

    }
}

