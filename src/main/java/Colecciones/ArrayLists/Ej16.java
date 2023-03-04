package Colecciones.ArrayLists;

import java.util.ArrayList;

public class Ej16 {
    public static void main(String[] args) {
//        Write a Java program to clone an array list to another array list
        ArrayList <String> lista1 = new ArrayList<>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");
        System.out.println("Lista 1: " + lista1);
        ArrayList <String> listaClonada = (ArrayList <String>) lista1.clone();
        System.out.println("Lista clonada: " + listaClonada);

    }
}
