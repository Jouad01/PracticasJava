package Colecciones.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ej9 {
    public static void main(String[] args) {
//        Write a Java program to create a set view of the mappings contained in a map
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);
        Set<Map.Entry<String, Integer>> entrySet = hash.entrySet();

        // imprime correctamente el conjunto de mapeos
        System.out.println("Vista de conjunto de mapeos:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
