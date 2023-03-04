package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej20 {
    public static void main(String[] args) {
//        Write a Java program to increase the size of an array list
        ArrayList <String> lista = new ArrayList<>(2);
        lista.add("1");
        lista.add("2");
        System.out.println("Lista sin incrementar: " + lista);
//        ensureCapacity indica el tamaño que queremos que tenga la lista en total
        lista.ensureCapacity(5);
        lista.add("3");
        lista.add("4");
        lista.add("5");
        System.out.println("Lista incrementada: " + lista);

    }
}
