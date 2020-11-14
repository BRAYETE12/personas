package com.example.personas.modelos;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;

    Persona(String cedula, String nombre, String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    void guardar(){
        Datos.guardar(this);
    }


}
