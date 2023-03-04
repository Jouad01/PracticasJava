package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej12 {
    public static void main(String[] args) {
//        Write a Java program to get a collection view of the values contained in this map
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);

        System.out.println("Valores: " + hash.values());
    }
}
