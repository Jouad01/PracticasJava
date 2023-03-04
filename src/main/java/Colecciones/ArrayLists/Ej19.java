package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej19 {
    public static void main(String[] args) {
//         Write a Java program to trim the capacity of an array list the current list size.
        ArrayList <Integer> lista = new ArrayList<>(10);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        System.out.println("Lista normal: " + lista);
        lista.trimToSize();
//        trimtToSize() recorta la capacidad de la lista al tamaño actual de la lista
        System.out.println("Lista con capacidad recortada: " + lista);
    }
}
