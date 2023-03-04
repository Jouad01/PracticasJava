package Colecciones.HashMaps;

import java.util.HashMap;

public class Ej10 {
    public static void main(String[] args) {
//        Write a Java program to get the value of a specified key in a map
        HashMap <String, Integer> hash = new HashMap <>();
        hash.put("A", 1);
        hash.put("B", 2);
        hash.put("C", 3);
        hash.put("D", 4);
        System.out.println("MAPA: " + hash);

        System.out.println("El valor de la clave C es: " + hash.get("C"));
    }
}
