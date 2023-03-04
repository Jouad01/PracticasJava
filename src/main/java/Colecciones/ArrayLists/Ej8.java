package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
//        Write a Java program to sort a given array list
        // Se ordenan de forma alfabetica
        List<String> listaPalabras = new ArrayList<String>();
        listaPalabras.add("Bicicleta");
        listaPalabras.add("Arbol");
        listaPalabras.add("Dado");
        listaPalabras.add("Casa");
        listaPalabras.add("Escuela");
        System.out.println("Lista de palabras: " + listaPalabras);
        Collections.sort(listaPalabras);
        System.out.println("Lista de palabras ordenadas: " + listaPalabras);
    }
}
