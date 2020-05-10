package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los 5 números consecutivos a partir del
        //número introducido. Al lado de cada número se debe indicar si se trata de un primo o no.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = teclado.nextInt();

        //Inicializamos las variables primo y el contador
        boolean primo = true;
        int cont = 0;

        while (cont < 5) { //Establecemos que muestre solo los 5 números consecutivos a partir del introducido
            System.out.print(num);
            primo = true;

            for (int i = 2; i < num; i++) { //Recorremos los números y comprobamos si son primos
                if (num%i == 0) {
                    primo = false;
                }
            }

            //Si el número es primo, lo pintamos por pantalla
            if (primo) {
                System.out.println(" es primo");
            } else {
                System.out.println(" no es primo");
            }

            //Sumamos un número y aumentamos el contador para pasar al siguiente número recorrido, hasta 5
            num++;
            cont++;
        }
    }
}