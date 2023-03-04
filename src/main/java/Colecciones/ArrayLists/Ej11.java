package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej11 {
    public static void main(String[] args) {
//        Write a Java program to reverse elements in a array list
        List<String > lista = new ArrayList <>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        System.out.println("Lista normal: " + lista);
        Collections.reverse(lista);
        System.out.println("Lista al reves: " + lista);
    }
}
