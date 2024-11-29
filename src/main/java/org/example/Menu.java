package org.example;

import java.util.Scanner;

public class Menu {
    private Juego juego;

    public Menu(Juego juego) {
        this.juego = juego;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== MENÚ DEL JUEGO ===");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    juego.iniciarJuego();
                    continuar = false;
                    break;
                case 2:
                    System.out.println("¡Gracias por jugar!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
