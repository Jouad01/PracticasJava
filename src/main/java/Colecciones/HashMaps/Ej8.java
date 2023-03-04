package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej8 {
    public static void main(String[] args) {
//        Write a Java program to test if a map contains a mapping for the specified value
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);
        if (hash.containsValue(3)) {
            System.out.println("Si, contiene el valor");
        } else {
            System.out.println("El mapa no contiene el valor");
        }
    }
}
