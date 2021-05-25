package com.example.demo.models;

public class UsuarioModel {
    private Long id;
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public UsuarioModel() {
    }


}
