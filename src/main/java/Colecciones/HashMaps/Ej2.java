package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej2 {
    public static void main(String[] args) {
//        Write a Java program to count the number of key-value (size) mappings in a map
        HashMap<String, Integer> hash = new HashMap <>();
        hash.put("Jacket", 1);
        hash.put("Mons", 2);
        hash.put("Tenm", 3);
        hash.put("Lit", 4);
        System.out.println("El tamaño del mapa es de: " + hash.size());
    }
}
