package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej7 {
    public static void main(String[] args) {
//        Write a Java program to test if a map contains a mapping for the specified key
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);
        if (hash.containsKey("C")) {
            System.out.println("El mapa contiene el valor " + hash.get("C"));
        } else {
            System.out.println("El mapa no contiene el valor 3");
        }
    }
}
