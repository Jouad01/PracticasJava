package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej18 {
    public static void main(String[] args) {
//        Write a Java program to test an array list is empty or not
        ArrayList <String> lista = new ArrayList<>();
        System.out.println("Lista vacía: " + lista.isEmpty());
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        System.out.println("Lista con elementos: " + lista.isEmpty());
    }
}
