package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cargar preguntas desde archivo JSON
        JsonReader jsonReader = new JsonReader();
        List<Pregunta> preguntas = jsonReader.leerPreguntas("src/main/resources/base-preguntas.json");

        if (preguntas != null && !preguntas.isEmpty()) {
            // Crear el juego
            Juego juego = new Juego(preguntas);
            // Crear y mostrar el menú
            Menu menu = new Menu(juego);
            menu.mostrarMenu();
        } else {
            System.out.println("No se pudieron cargar las preguntas.");
        }
    }
}
