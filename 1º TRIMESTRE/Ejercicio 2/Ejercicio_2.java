package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben
        //mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = teclado.nextInt();
        System.out.print("Dígitos pares: ");

        //Inicializamos una variable aux para guardar el número introducirlo para darle la vuelta.
        //Inicializamos la variable que va a guardar el número al revés y el número de dígitos
        long aux = num;
        long reves = 0;
        int numDig = 0;

        //Mientras que el número auxiliar sea positivo, le damos la vuelta y vamos cogiendo el último número
        //En cada recorrido sumamos un dígito más al contador
        while (aux > 0) {
            reves = ((reves * 10) + (aux % 10));
            aux /= 10;
            numDig++;
        }

        long dig;
        long suma = 0;

        //En cada recorrido comprobamos que el número sea par, y posteriormente se sumarán todos los pares
        for (int i = 0; i < numDig; i++) {
            dig = reves % 10;
            if (dig % 2 == 0) {
                System.out.print(dig + " ");
                suma += dig;
            }
            reves /= 10;
        }

        //Mostramos la suma de los dígitos pares
        System.out.println();
        System.out.print("Suma de los dígitos pares: " + suma);
    }
}