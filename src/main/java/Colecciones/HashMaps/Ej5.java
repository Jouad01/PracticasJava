package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej5 {
    public static void main(String[] args) {
//         Write a Java program to check whether a map contains key-value mappings (empty) or not
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);
        System.out.println("¿El mapa está vacío? " + hash.isEmpty());

    }
}
