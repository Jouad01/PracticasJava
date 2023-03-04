package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej6 {
    public static void main(String[] args) {
//        Write a Java program to get a shallow copy of a HashMap instance.
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);
        HashMap <String, Integer> hash2 = new HashMap <>();
        hash2.putAll(hash);
        System.out.println("Mapa copiado: " + hash2);
    }
}
