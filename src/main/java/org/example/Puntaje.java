package org.example;

public class Puntaje {
    private int puntos;

    public Puntaje() {
        this.puntos = 0;
    }

    public void agregarPunto() {
        puntos++;
    }

    public int obtenerPuntos() {
        return puntos;
    }
}
