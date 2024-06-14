package com.biblioteca.model;

public class Libro extends Publicacion {
    private String autor;
    private int numeroPaginas;
    private boolean prestado;

    public Libro(String codigo, String titulo, int añoPublicacion, String editorial, String autor, int numeroPaginas, boolean prestado) {
        super(codigo, titulo, añoPublicacion, editorial);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", añoPublicacion=" + getAñoPublicacion() +
                ", editorial='" + getEditorial() + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", prestado=" + prestado +
                '}';
    }
}
