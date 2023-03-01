package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej76 {
    public static void main(String[] args) {
        // Example:
        // Original array: [1, 2, 5, 0, 4, 3, 6]
        // Check consecutive numbers in the said array!true
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce el numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(array);
        boolean resultado = true;
        for (int j = 1; j < array.length; j++) {
            if (array[j] - array[j - 1] != 1) {
                resultado = false;
                break;
            }
        }

        if (resultado) {
            System.out.println("Es true. Aquí el resultado: " + Arrays.toString(array));
        }


    }
}
