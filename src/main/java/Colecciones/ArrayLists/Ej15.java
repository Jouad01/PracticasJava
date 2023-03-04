package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej15 {
    public static void main(String[] args) {
//        Write a Java program to join two array lists
        ArrayList <String> lista1 = new ArrayList<>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        System.out.println("Lista 1: " + lista1);
        ArrayList <String> lista2 = new ArrayList<>();
        lista2.add("4");
        lista2.add("5");
        lista2.add("6");
        System.out.println("Lista 2: " + lista2);
        ArrayList <String> lista3 = new ArrayList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);
        System.out.println("Lista combinada: " + lista3);
    }
}
