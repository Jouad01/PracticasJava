package edu.daw.MiscelaneaEjercicios;

import java.util.Arrays;

public class Katas {
    public static void main(String[] args) {
//        System.out.println("El numero de vocales es: " + vowels("Hola mundo"));
//        System.out.println("La longitud de la palabra mas corta es: " + shortestWord("Hola mundo"));
//        System.out.println("La cadena en mayusculas es: " + MakeupperCase("Hola mundo"));
//        System.out.println("La cadena acumulada es: " + accum("Hola mundo"));
//        System.out.println("Es isoagrama: " + isIsogram("Abecedario"));
        String sentence = "Esto es una prueba de reversión de palabras";
        String resultado = spinWords(sentence);
        System.out.println(resultado);
    }

    public static String numberToString(int num) {
        String convert = String.valueOf(num);
        return convert;
    }

    public static int vowels(String str) {
        int num_vowel = 0;
        String words = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
//            si la variable words contiene el caracter de la posicion i de la variable str
//            se suma 1 a la variable num_vowel por lo tanto se cuenta el numero de vocales
            if (words.contains(String.valueOf(str.charAt(i)))) {
                num_vowel++;
            }
        }
        return num_vowel;
    }

    public static int shortestWord(String s) {
//        se crea un array de String y se le asigna el valor de la variable s
//        separada por espacios con el metodo split porque sino se separa por cada caracter
        String[] words = s.split(" ");
//        se crea una variable de tipo int y se le asigna el valor de la longitud. words[0] es la primera palabra
//        de esa manera se asigna el valor de la longitud de la primera palabra a la variable shortest
        int shortest = words[0].length();
//        se crea un bucle for que recorre el array words desde la posicion 1 hasta el final
        for (int i = 1; i < words.length; i++) {
//            si la longitud de la palabra en la posicion i es menor que la variable shortest
            if (words[i].length() < shortest) {
//                se le asigna a la variable shortest el valor de la longitud de la palabra en la posicion i
                shortest = words[i].length();
            }
        }
        return shortest;
    }

    public static String MakeupperCase(String str) {
        return str.toUpperCase();
    }

    public static String accum(String s) {
        // accum("abcd") -> "A-Bb-Ccc-Dddd"
        // accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        // accum("cwAt") -> "C-Ww-Aaa-Tttt"
        int posicion = 0;
        String palabras = "";
        for (int i = 0; i < s.length(); i++) {
            palabras = palabras + s.toUpperCase().charAt(posicion);
            for (int j = 0; j < posicion; j++) {
                palabras = palabras + s.toLowerCase().charAt(posicion);
            }
//            el -1 indica que no se añade el guion a la ultima palabra
            if (posicion < s.length() - 1) {
                palabras += "-";
            }
            posicion++;
        }
        return palabras;
    }


    public static boolean isPrime(int num) {
        boolean esPrimo = false;
        if (num <= 0 || num == 1) {
            return esPrimo;
        }
        int num2 = 2;
        double valor = 0.5;
        double cuadrado = Math.pow(num, valor);
        while (num2 <= cuadrado) {
            if (num % num2 == 0) {
                return esPrimo;
            }
            num2++;
        }
        return !esPrimo;
    }

//    Isoagrama es una palabra que no tiene letras repetidas
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        boolean falso = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return falso;
                }
            }
        }
        return !falso;
    }

    public static String spinWords(String sentence) {
//        Metodo que recibe una cadena de texto y si la longitud de una palabra es mayor o igual a 5
//        la invierte y la devuelve
        String[] separate = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        int cont = 0;
        while (cont < separate.length) {
            String wordTotal = separate[cont];
            if (wordTotal.length() >= 5) {
                StringBuilder reversedText = new StringBuilder();
//                se recorre la palabra desde el final hasta el principio
                for (int i = wordTotal.length() - 1; i >= 0; i--) {
                    reversedText.append(wordTotal.charAt(i));
                }
                wordTotal = reversedText.toString();
            }
            result.append(wordTotal);
            cont++;
            if (cont < separate.length) {
                result.append(" ");
            }
        }
        return result.toString();
    }

//    o

//    public static String spinWords(String sentence) {
//
//        return Arrays.asList(sentence.split(" ")).stream()
//                .map(word ->
//                        word.length() >= 5
//                                ? new StringBuilder(word).reverse().toString()
//                                : word)
//                .collect(Collectors.joining(" "));
//
//    }


    public static int sortDesc(final int num) {

        //  Input: 42145 Output: 54421
        //  Input: 145263 Output: 654321
        //  Input: 123456789 Output: 987654321

//        Convierte el número entero en una cadena
        String numString = String.valueOf(num);
//        Convierte la cadena en un array de caracteres.
        char[] numChar = numString.toCharArray();
//        Orden ascendente
        Arrays.sort(numChar);
//        Variable que almacenara numeros ordenados
        String numString2 = "";
//        Bucle recorre de forma descendente. Se detiene al llegar a 0. -1 Para comenzar desde el ultimo
        for (int i = numChar.length - 1; i >= 0; i--) {
//            Añade el caracter actual al final de la cadena
            numString2 += numChar[i];
        }
//        Convierte la cadena en int
        int numInt = Integer.parseInt(numString2);
        return numInt;
    }
}