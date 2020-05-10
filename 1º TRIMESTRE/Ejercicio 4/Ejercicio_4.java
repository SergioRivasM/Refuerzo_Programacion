package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        //Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
        //Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

        Scanner teclado = new Scanner(System.in);
        int altura = 0;

        do {
            System.out.print("Por favor, introduzca la altura de la X (debe ser impar y mayor o igual a 3): ");
            altura = teclado.nextInt();

            //Repetimos el mensaje anterior si se introduce un número menor que 3 o un número par
        } while (altura < 3 || altura % 2 == 0);
        //Recorremos fila y col hasta la altura introducida
        for (int fila = 1; fila <= altura; fila++) {
            for (int col = 1; col <= altura; col++) {
                //Si se cumple alguna de las condiciones, pintamos los asteriscos fila a fila para crear la X
                if ((fila == col) || (col == (altura-fila)+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}