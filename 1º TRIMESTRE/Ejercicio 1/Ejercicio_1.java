package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Escribe un programa que lea un número n e imprima una pirámide de números con n filas

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide de números: ");
        int altura = teclado.nextInt();

        int fila = 1; //Inicializamos fila con al menos el valor 1, el valor mínimo de la primera fila de la pirámide
        int i; //Inicializamos la variable i para usarla posteriormente
        int espacios = altura - 1; //Restamos 1 a la altura introducida para determinar los espacios que necesitamos

        //Bucle while donde comprobará que la fila siempre sea menor o igual que la altura introducida
        while (fila <= altura) {

            //Insertamos los espacios hasta llegar a igualar el límite de la variable espacios creada anteriormente
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            //Insertamos las filas de números empezando siempre por 1
            for (i = 1; i < fila; i++) {
                System.out.print(i);
            }

            //Igualamos i a la fila y decrece para rellenar la pirámide en el orden de números adeacuado
            //siempre quedando el número mayor en medio
            for (i = fila; i > 0; i--) {
                System.out.print(i);
            }

            espacios--; //Decrece el número de espacios por cada recorrido para añadir una fila más larga
            fila++; //Sumamos una fila nueva por cada recorrido

            System.out.println();

        }
    }
}