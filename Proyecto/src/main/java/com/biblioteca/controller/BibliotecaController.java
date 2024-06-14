package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Publicacion;
import com.biblioteca.model.Revista;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private List<Publicacion> publicaciones;

    public BibliotecaController() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public boolean prestarLibro(String codigo) {
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Libro && pub.getCodigo().equals(codigo)) {
                Libro libro = (Libro) pub;
                return libro.prestar();
            }
        }
        return false;
    }

    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>();
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Libro) {
                libros.add((Libro) pub);
            }
        }
        return libros;
    }

    public List<Revista> getRevistas() {
        List<Revista> revistas = new ArrayList<>();
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Revista) {
                revistas.add((Revista) pub);
            }
        }
        return revistas;
    }

    public void mostrarLibros() {
        System.out.println("Listado de libros:");
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Libro) {
                System.out.println(pub);
            }
        }
    }

    public void mostrarRevistas() {
        System.out.println("Listado de revistas:");
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Revista) {
                System.out.println(pub);
            }
        }
    }
}
