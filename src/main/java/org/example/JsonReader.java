package org.example;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public List<Pregunta> leerPreguntas(String rutaArchivo) {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader(rutaArchivo);
            Pregunta[] preguntasArray = gson.fromJson(reader, Pregunta[].class);
            return List.of(preguntasArray);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de preguntas.");
            e.printStackTrace();
            return null;
        }
    }
}
