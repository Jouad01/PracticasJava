package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej77 {
    public static void main(String[] args) {
        //  Example: Original array: [1, -2, 5, -4, 3, -6]
        //  Check the said array of integers alternates between positive and negative values!true
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce el numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        boolean positivo = array[0] > 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > 0 != positivo) {
                positivo = !positivo;
            } else {
                System.out.println("Error. Vuelve a intentarlo.");
            }
        }

        System.out.println("Es true. Aqui el resultado " + Arrays.toString(array));

    }
}
