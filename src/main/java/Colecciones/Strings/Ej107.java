package Colecciones.Strings;

import java.util.Scanner;

public class Ej107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        System.out.println("Introduce una letra para saber cuantas veces aparece: ");
        String letra = input.nextLine();
        input.close();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("Tu letra " + letra + " aparece " + contador + " veces.");
    }
}
