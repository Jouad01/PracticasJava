package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej13 {
    public static void main(String[] args) {
//        Write a Java program to compare two array lists
        ArrayList <String> lista1 = new ArrayList<>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");
        lista1.add("5");
        ArrayList <String> lista2 = new ArrayList<>();
        lista2.add("11");
        lista2.add("22");
        lista2.add("33");
        lista2.add("4");
        lista2.add("5");
        ArrayList <String> lista3 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i).equals(lista2.get(i))) {
                lista3.add(lista1.get(i));
            }
        }
        System.out.println("Los elementos comunes son: " + lista3);

    }
}
