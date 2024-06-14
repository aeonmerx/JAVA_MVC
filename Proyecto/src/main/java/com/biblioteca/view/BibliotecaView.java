package com.biblioteca.view;

import com.biblioteca.controller.BibliotecaController;
import com.biblioteca.model.Libro;
import com.biblioteca.model.Revista;

public class BibliotecaView {
    private BibliotecaController controller;

    public BibliotecaView(BibliotecaController controller) {
        this.controller = controller;
    }

    public void mostrarLibros() {
        System.out.println("Listado de libros:");
        for (Libro libro : controller.getLibros()) {
            System.out.println(libro);
        }
    }

    public void mostrarRevistas() {
        System.out.println("Listado de revistas:");
        for (Revista revista : controller.getRevistas()) {
            System.out.println(revista);
        }
    }

    // Otros métodos para interactuar con el usuario
}
