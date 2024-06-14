package com.biblioteca.model;

public abstract class Publicacion {
    private String codigo;
    private String titulo;
    private int añoPublicacion;
    private String editorial;

    public Publicacion(String codigo, String titulo, int añoPublicacion, String editorial) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}