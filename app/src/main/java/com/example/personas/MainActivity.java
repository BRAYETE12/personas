package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private  String[] list;
    private ArrayAdapter<String> adapter;
    private  Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista =  findViewById(R.id.listado);

        list = getResources().getStringArray(R.array.opciones);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        intent = new Intent(MainActivity.this, CrearPersona.class );
                        startActivity( intent );
                        break;

                    case 1:
                        intent = new Intent(MainActivity.this, ListarPersonas.class );
                        startActivity( intent );
                        break;


                }
            }
        });
    }
}
