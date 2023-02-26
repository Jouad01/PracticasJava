package edu.daw.Lote;

import java.util.Random;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = input.nextInt();
        input.close();
        Random random = new Random();
        int aleatorio = random.nextInt(num);
        System.out.println("El numero aleatorio es: " + aleatorio);
//        este bucle recorre desde el numero aleatorio hasta 0. i>=0 es para que se detenga en 0
        for (int i = aleatorio; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println("Los numeros impares en orden descendente: " + i);
            }
        }
    }
}

