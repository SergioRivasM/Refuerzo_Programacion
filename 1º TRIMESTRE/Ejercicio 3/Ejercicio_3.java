package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura.
        //Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        //Recorremos la variable i y j hasta la altura introducida
        for (int i = 1; i < altura; i++) {
            for (int j = 1; j <= altura; j++) {
                //Si la condición se cumple, pintamos los asteriscos para definir los lados de la U
                if ((j == 1) || (j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //Salto de línea en cada recorrido para ir pintando los asteriscos hacia abajo
            System.out.println();
        }

        for (int i = 1; i < altura; i++) {
            //Si la condición se cumple, pintamos los asteriscos para definir la base de la U
            if ((i == 1) || (i == altura)) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }
}