package ejecucion;

import dominio.Dificultad;
import dominio.Juegos;
import dominio.Personaje;

public class Principal {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        // objetos de clases
        Dificultad dificultad = new Dificultad(); // instanciar una clase
        Juegos juegos = new Juegos();
        Personaje personaje = new Personaje();
        personaje.escribirDatos();

    }
}