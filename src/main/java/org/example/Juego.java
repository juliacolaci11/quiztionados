package org.example;

import java.util.List;
import java.util.Scanner;

public class Juego {
    private List<Pregunta> preguntas;
    private Puntaje puntaje;

    public Juego(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
        this.puntaje = new Puntaje();
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getPregunta());
            List<String> opciones = pregunta.getOpciones();
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ". " + opciones.get(i));
            }

            System.out.print("Elige la opción correcta (1-" + opciones.size() + "): ");
            int eleccion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (opciones.get(eleccion - 1).equals(pregunta.getRespuestaCorrecta())) {
                puntaje.agregarPunto();
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta.");
            }
            System.out.println();
        }

        System.out.println("¡Juego terminado! Tu puntaje es: " + puntaje.obtenerPuntos());
    }
}
