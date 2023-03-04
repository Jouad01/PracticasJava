package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej9 {
    public static void main(String[] args) {
//        Write a Java program to copy one array list into another
        List<String> lista = new ArrayList <>();
        lista.add("12");
        lista.add("13");
        lista.add("14");
        System.out.println("Primera lista: " + lista);
        List<String> lista2 = new ArrayList <>();
        lista2.add("caracoles");
        lista2.add("lechugas");
        lista2.add("manzanas");
        System.out.println("Segunda lista: " + lista2);
        Collections.copy(lista, lista2);
        System.out.println("Lista2 copiada a lista1: ");
        System.out.println("Nueva primera lista: " + lista);
        System.out.println("Nueva segunda lista: " + lista2);


    }
}
