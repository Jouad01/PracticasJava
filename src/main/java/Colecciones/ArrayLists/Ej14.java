package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Ej14 {
    public static void main(String[] args) {
        // Write a Java program of swap two elements in an array list
        ArrayList <String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Amarillo");
        lista.add("Morado");
        System.out.println("Lista sin combinaciones: " + lista);
        Collections.swap(lista, 0, 3);
        System.out.println("Lista con combinaciones: " + lista);

    }
}
