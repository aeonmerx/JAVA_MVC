package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Revista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del controlador
        BibliotecaController controller = new BibliotecaController();

        // Crear instancias de libros
        Libro libro1 = new Libro("L001", "El Quijote", 1605, "Editorial A", "Miguel de Cervantes", 300, false);
        Libro libro2 = new Libro("L002", "Cien años de soledad", 1967, "Editorial B", "Gabriel García Márquez", 400, false);
        Libro libro3 = new Libro("L003", "Harry Potter y la piedra filosofal", 1997, "Editorial C", "J.K. Rowling", 350, false);

        // Crear instancias de revistas
        Revista revista1 = new Revista("R001", "National Geographic", 2021, "Editorial D", 123, "Mensual");
        Revista revista2 = new Revista("R002", "Time", 2021, "Editorial E", 456, "Semanal");
        Revista revista3 = new Revista("R003", "Scientific American", 2021, "Editorial F", 789, "Mensual");

        // Agregar libros y revistas al controlador
        controller.agregarPublicacion(libro1);
        controller.agregarPublicacion(libro2);
        controller.agregarPublicacion(libro3);
        controller.agregarPublicacion(revista1);
        controller.agregarPublicacion(revista2);
        controller.agregarPublicacion(revista3);

        // Mostrar información de libros y revistas
        System.out.println("Listado de libros:");
        controller.mostrarLibros();
        System.out.println("\nListado de revistas:");
        controller.mostrarRevistas();

        // Prestar un libro
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el código del libro que desea prestar: ");
        String codigoLibro = scanner.nextLine();
        if (controller.prestarLibro(codigoLibro)) {
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No se pudo prestar el libro. Quizás ya está prestado o no existe.");
        }

        // Mostrar información de libros después del préstamo
        System.out.println("\nListado de libros después del préstamo:");
        controller.mostrarLibros();
    }
}
