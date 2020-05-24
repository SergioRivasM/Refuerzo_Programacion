package EJERCICIOS;

import java.util.Arrays;

public class Ejercicio_13 {
    //Main para probar el método filtraPrimos
    public static void main(String[] args) {
        int[] arrayprimos = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(filtraPrimos(arrayprimos)));

    }

    public static int[] filtraPrimos(int x[]) {
        int[] primos = new int[0]; //Creo el array de primos donde guardaremos esos números primos

        for (int i = 0; i < x.length; i++) { //Recorro el array pasado hasta su longitud
                if (esPrimo(x[i])) { //Reutilizo el método esPrimo para determinar si el número de cada posición es primo o no
                    int primos2[] = Arrays.copyOf(primos, primos.length+1); //Si es primo creamos una copia del array de primos y le vamos sumando una posición más
                    primos2[primos2.length-1] = x[i]; //A la última posición del array primos2 le añado el número primo del array de x pasado
                    primos = primos2; //Paso el contenido de la copia del array de primos2 a primos
                }
        }
        return primos; //Devuelvo el array rellenado solo con los números primos
    }

    public static boolean esPrimo(int num) { //Método de números primos del ejercicio anterior
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}