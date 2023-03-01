package Colecciones.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej75 {
    public static void main(String[] args) {

//        Example: Original array: [23, -2, 45, 38, 12, 4, 6]
//        Largest gap between sorted elements of the said array: 15
//        Consiste en ordenar una array y que devuelva la cantidad mas grande que haya entre algun numero.

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que tendrá el array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce un numero: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(array);

//        Inicializamos variable con el valor minimo
        int max = Integer.MIN_VALUE;
//        recorremos desde el segundo elemento
        for (int i = 1; i < array.length; i++) {
//            calcular brecha entre el numero actual y anterior
            int gap = array[i] - array[i - 1];
//            si la brecha actual es mayor actualizamos la variable
            if (gap > max) {
                max = gap;
            }
        }
        System.out.println("La mayor brecha entre los numeros ordenados es: " + max);
    }
}
