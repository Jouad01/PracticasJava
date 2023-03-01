package Colecciones.Strings;

import java.util.Scanner;

public class Ej111 {
    public static void main(String[] args) {
//        Input a string: Exercises Practice Solution
//        Input a word to remove: Solution
//        New string, after removing the said word: Exercises Practice
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        System.out.println("Introduce la palabra que quieres eliminar: ");
        String palabra = input.nextLine();
        input.close();
        String[] palabras = frase.split(" ");
        String nuevaFrase = "";
        for (int i = 0; i < palabras.length; i++) {
            while (palabras[i].equals(palabra)) {
//                si la palabra coincide con la que se quiere eliminar, se sustituye por un espacio
                palabras[i] = "";
            }
//            se va concatenando la frase con las palabras que no coinciden con la que se quiere eliminar
            nuevaFrase = nuevaFrase + palabras[i] + " ";
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    }
}
