package Colecciones.Arrays;

import java.util.Scanner;

public class Ej74 {
    public static void main(String[] args) {
//        Write a Java program to find all triplets equal to a given sum in a unsorted array of integers
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros del array: ");
        int numeros = input.nextInt();
        int[] array = new int[numeros];
        System.out.println("Introduce un numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Introduce el numero que quieres buscar: ");
        int sumaNumero = input.nextInt();
        input.close();

        if (array.length < 3) {
            System.out.println("No hay tripletas");
        } else {
            boolean encontrado = false;
//            numeros - 2 para asegurarse que haya al menos dos numeros apartir de ese, -1 igual
            for (int i = 0; i < numeros - 2; i++) {
//                j + 1 para evitar que sumen mismos numeros
                for (int j = i + 1; j < numeros - 1; j++) {
                    for (int k = j + 1; k < numeros; k++) {
                        if (array[i] + array[j] + array[k] == sumaNumero) {
                            int resultado = array[i] + array[j] + array[k];
                            System.out.println("Las posibles combinaciones son: " + array[i] + " " + array[j] + " " + array[k] + " y dan como resultado " + resultado);
                            encontrado = true;
                        }
                    }
                }
            }
            if (!encontrado) {
                System.out.println("No hay tripletas que sumen " + sumaNumero);
            }
        }
    }
}