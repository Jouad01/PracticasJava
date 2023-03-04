package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej22 {
    public static void main(String[] args) {
//        Write a Java program to print all the elements of a ArrayList using the position of the elements
        ArrayList <String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        System.out.println("Lista normal: " + lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }
    }
}
