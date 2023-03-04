package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej17 {
    public static void main(String[] args) {
//        Write a Java program to empty an array list
        ArrayList <String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        System.out.println("Lista: " + lista);
        lista.clear();
        System.out.println("Lista vacía: " + lista);

    }
}
