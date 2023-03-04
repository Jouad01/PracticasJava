package edu.daw.MiscelaneaEjercicios;

import java.util.Scanner;

public class Ecuacion2Grado {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce el valor de a: ");
            int a = input.nextInt();
            System.out.println("Introduce el valor de b: ");
            int b = input.nextInt();
            System.out.println("Introduce el valor de c: ");
            int c = input.nextInt();

            double d = (Math.pow(b, 2) - (4 * a * c));
            if (d < 0){
                System.out.println("Es un número negativo. No se puede calcular. ");
            } else {
                double sol1 = (-b + Math.sqrt(d) / (2*a));
                double sol2 = (-b - Math.sqrt(d) / (2*a));
                System.out.println("---------Soluciones---------");
                System.out.println("Solucion 1: " + sol1);
                System.out.println("Solucion 2: " + sol2);
            }
        }
}

