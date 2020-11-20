package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.personas.modelos.Datos;
import com.example.personas.modelos.Persona;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Persona> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);

        this.tabla = findViewById(R.id.tabla);
        this.lista = Datos.obtener();

        for (int i=0; i<lista.size(); i++){
            TableRow row = new TableRow(this);
            TextView tv1 = new TextView(this);
            TextView tv2 = new TextView(this);
            TextView tv3 = new TextView(this);
            TextView tv4 = new TextView(this);

            tv1.setText( (i+1)+"" );
            tv2.setText( this.lista.get(i).getCedula() );
            tv3.setText( this.lista.get(i).getNombre() );
            tv4.setText( this.lista.get(i).getApellido() );

            tv1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            row.addView(tv1);
            row.addView(tv2);
            row.addView(tv3);
            row.addView(tv4);

            tabla.addView(row);
        }

    }
}
