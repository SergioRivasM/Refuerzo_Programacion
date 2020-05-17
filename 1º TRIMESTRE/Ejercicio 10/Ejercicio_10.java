package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        //Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
        //Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.
        //No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien.
        //Dentro de la pecera hay que colocar de forma aleatoria un pececito,
        //que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int h = teclado.nextInt();

        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int w = teclado.nextInt();

        int x = (int) ((Math.random() * (w - 1)) + 1); //Establecemos de forma aleatoria la posicion x para introducir el pez
        int y = (int) ((Math.random() * (h - 1)) + 1); //Establecemos de forma aleatoria la posicion y para introducir el pez

        for (int ver = 0; ver < h; ver++) { //Recorrido para establecer los asteriscos del lado vertical del cuadro hasta el número introducido en la variable h
            for (int hor = 0; hor < w; hor++) { //Recorrido para establecer los asteriscos del lado horizontal del cuadro hasta el número introducido en la variable w
                if ((hor == 0) || (hor == w - 1) || (ver == 0) || (ver == h - 1)) { //Si alguna de estas condiciones se cumple
                    System.out.print("* "); //Pintamos el asterisco
                } else if ((hor == x) && (ver == y)) { //Si estas dos condiciones se cumple
                    System.out.print("& "); //Pintamos el pez en forma de &
                } else { //De lo contrario a las dos anteriores opciones
                    System.out.print("  "); //Pintamos espacios en blanco
                }
            }
            System.out.println();
        }
    }
}