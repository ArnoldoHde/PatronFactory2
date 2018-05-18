package com.example.arnoldo.patronfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtTipo,edtId,edtImporte;
Button btnIva,btnIvaReducido;
//TextView tvMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtId=findViewById(R.id.edtId);
        //edtTipo=findViewById(R.id.edtTipo);
        edtImporte=findViewById(R.id.edtImporte);
        btnIva=findViewById(R.id.btnIva);
       // btnIvaReducido=findViewById(R.id.btnIvaReducido);
        //tvMostrar=findViewById(R.id.tvMostrar);
        btnIva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String tipoFactura=edtTipo.toString();
                int id=Integer.parseInt(edtId.getText().toString());
                int importe=Integer.parseInt(edtImporte.getText().toString());

                Factura factura=UsoFactory.getFactura("");
                factura.setId(id);
                factura.setImporte(importe);
                double iva=factura.getImporteIva();

                Toast.makeText(MainActivity.this, "El iva es" +iva, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
