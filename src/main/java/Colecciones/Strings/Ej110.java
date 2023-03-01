package Colecciones.Strings;

import java.util.Scanner;

public class Ej110 {
    public static void main(String[] args) {
//      PENDIENTE
//        Original String: abcdaa
//        Number of duplicate characters in the said String (Occurs more than twice.): 1
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        input.close();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            for (int j = i + 1; j < frase.length() - 1; j++){
                if (frase.indexOf(frase.charAt(i)) == frase.indexOf(frase.charAt(j))){
                    contador++;
                    break;
                }
            }
        } System.out.println("El numero de caracteres repetidos es: " + contador);
    }
}
