package EJERCICIOS;

import java.util.Arrays;

public class Ejercicio_15 {
    public static void main(String[] args) {
        //Main para probar el método filtraCapicuas
        int[] arrayCapicuas = {232, 3123, 4114, 5, 609, 666};

        System.out.println(Arrays.toString(filtraCapicuas(arrayCapicuas)));

    }

    public static int[] filtraCapicuas(int x[]) {
        int[] capicuas = new int[0]; //Creo el array donde guardaremos los números que sean capicúa

        for (int i = 0; i < x.length; i++) { //Recorro el array pasado hasta su longitud
            if (esCapicua(x[i])) { //Reutilizo el método esCapicua para determinar si el número de cada posición es capicua o no
                int capicuas2[] = Arrays.copyOf(capicuas, capicuas.length+1); //Si es capicúa creamos una copia del array de capicuas y le vamos sumando una posición más
                capicuas2[capicuas2.length-1] = x[i]; //A la última posición del array capicuas2 le añado el número capicua del array de x pasado
                capicuas = capicuas2; //Paso el contenido de la copia del array de capicuas2 a capicuas
            }
        }
        return capicuas; //Devuelvo el array rellenado solo con los números capicua
    }

    public static boolean esCapicua(int num) { //Método de números capicua del ejercicio anterior
        if (num == voltea(num)) {
            return true;
        } else {
            return false;
        }
    }

    public static int voltea(int num) { //Método de voltear un número del ejercicio anterior
        int reves = 0;
        int resto;
        while (num > 0) {
            resto = num%10;
            reves = reves*10 + resto;
            num /= 10;
        }
        return reves;
    }
}