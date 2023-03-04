package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej3 {
    public static void main(String[] args) {
//        Write a Java program to copy all of the mappings from the specified map to another map
        HashMap <String, Integer> hash = new HashMap <>();
        HashMap <String, Integer> hash2 = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("Primer mapa: " + hash);
        hash2.put("E", 5);
        hash2.put("F", 6);
        hash2.put("G", 7);
        hash2.put("H", 8);
        System.out.println("Segundo mapa: " + hash2);

        hash2.putAll(hash);
        System.out.println("NUEVOS VALORES DEL MAPA: " + hash2);
    }
}
