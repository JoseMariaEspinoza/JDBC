package com.corenetwork.modelo;

public class Categoria {
    private int id_categoria;
    private String nombre;
    private String description;

    @Override
    public String toString() {
        return "Categoria{" +
                "id_categoria=" + id_categoria +
                ", nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Categoria() {
    }

    public Categoria(int id_categoria, String nombre, String description) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.description = description;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
