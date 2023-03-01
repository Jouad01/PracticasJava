package Colecciones.Strings;

import java.util.Scanner;

public class Ej106 {
    public static void main(String[] args) {
//        Original string: PHP
//        After repeating 7 times: PHPPHPPHPPHPPHPPHPPHP
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = input.nextLine();
        System.out.print("Introduce el numero de veces que quieres que se repita: ");
        int repetir = input.nextInt();
        input.close();
        String resultado = "";
        for (int i = 0; i < repetir; i++){
            resultado = resultado + palabra;
        }
        System.out.println(resultado);
    }

}
