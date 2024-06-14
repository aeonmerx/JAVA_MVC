package com.biblioteca.model;

public class Revista extends Publicacion {
    private int numero;
    private String periodicidad;

    public Revista(String codigo, String titulo, int añoPublicacion, String editorial, int numero, String periodicidad) {
        super(codigo, titulo, añoPublicacion, editorial);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", añoPublicacion=" + getAñoPublicacion() +
                ", editorial='" + getEditorial() + '\'' +
                ", numero=" + numero +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
