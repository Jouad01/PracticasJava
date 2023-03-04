package Colecciones.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej10 {
    public static void main(String[] args) {
//        Write a Java program to shuffle elements in a array list
        List<String> lista = new ArrayList <>();
        lista.add("Persona1");
        lista.add("Persona2");
        lista.add("Persona3");
        lista.add("Persona4");
        lista.add("Persona5");
        System.out.println("Lista antes de mezclarse: " + lista);
        Collections.shuffle(lista);
        System.out.println("Lista mezclada: " + lista);
    }
}
