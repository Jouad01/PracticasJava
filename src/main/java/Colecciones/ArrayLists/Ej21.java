package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej21 {
    public static void main(String[] args) {
//        Write a Java program to replace the second element of a ArrayList with the specified element
        ArrayList <String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        System.out.println("Lista: " + lista);
//        1 indica posicion del elemento a reemplazar
        lista.set(1, "4");
        System.out.println("Lista con elemento reemplazado: " + lista);
    }
}
