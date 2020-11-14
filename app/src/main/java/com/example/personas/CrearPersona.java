package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.personas.modelos.Persona;

public class CrearPersona extends AppCompatActivity {

    private EditText cedula, nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_persona);

        this.cedula = findViewById(R.id.txCedula);
        this.nombre = findViewById(R.id.txNombre);
        this.apellido = findViewById(R.id.txApellido);

    }

    public void guardar(View v){
        String c = this.cedula.getText().toString();
        String n = this.nombre.getText().toString();
        String a = this.apellido.getText().toString();

        Persona p = new Persona(c, n, a);
        p.guardar();

        this.limpiar();
        Toast.makeText(this, "Persona guardada exitosamente", Toast.LENGTH_LONG);

    }

    public void limpiar(View v){
        this.limpiar();
    }

    public void limpiar(){
        this.cedula.setText("");
        this.nombre.setText("");
        this.apellido.setText("");
        this.cedula.requestFocus();
    }
}
