package Colecciones.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    public static void main(String[] args) {
//        Write a Java program to associate the specified value with the specified key in a HashMap
        HashMap <Integer, String> hash = new HashMap <>();
        hash.put(1, "Max");
        hash.put(2, "Jake");
        hash.put(3, "Lung");
        hash.put(4, "Jon");
        for(Map.Entry<Integer, String> entry: hash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
