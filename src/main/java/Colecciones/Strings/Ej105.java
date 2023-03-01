package Colecciones.Strings;

import java.util.Scanner;

public class Ej105 {
    public static void main(String[] args) {
//        Ej: aa' has occured 3 times in 'abcd abc aabc baa abcaa'
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        System.out.println("Introduce una palabra: ");
        String palabra = input.nextLine();
        input.close();
        int contador = 0;
        int index = 0;
        while (index != -1) {
            index = frase.indexOf(palabra, index);
            if (index != -1) {
                contador++;
                index += palabra.length();
            }
        }
        System.out.println("La palabra " + palabra + " aparece " + contador + " veces en la frase");

    }
}
