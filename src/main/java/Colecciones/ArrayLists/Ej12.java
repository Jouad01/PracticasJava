package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Ej12 {
    public static void main(String[] args) {
        List <String> listaNormal = new ArrayList <>();
        listaNormal.add("1");
        listaNormal.add("2");
        listaNormal.add("3");
        listaNormal.add("4");
        listaNormal.add("5");
        listaNormal.add("6");
        listaNormal.add("7");
        System.out.println("Lista: " + listaNormal);
        List<String> subLista = listaNormal.subList(0, 4);
        System.out.println("Lista de los primeros cuatro elementos: " + subLista);
    }
}
