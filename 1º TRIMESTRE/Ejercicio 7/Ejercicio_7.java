package EJERCICIOS;

public class Ejercicio_7 {
    public static void main(String[] args) {
        //Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300.
        //A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha,
        //así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

        int[][] arrayAleatorio = new int[10][10]; //Creo el array de 10 filas y 10 columnas

        for (int i = 0; i < arrayAleatorio.length; i++) { //Recorro la altura y la anchura del array con i y j
            for (int j = 0; j < arrayAleatorio.length; j++) {
                arrayAleatorio[i][j] = (int) (Math.floor(Math.random() * 101) + 200); //Relleno el array con números aleatorios entre 200 y 300
                System.out.print(arrayAleatorio[i][j] + " "); //Muestro el array por pantalla
            }
            System.out.println(); //Salto de línea en cada recorrido para establecer el array de manera cuadrada
        }

        System.out.println("\nLos números de la diagonal son: ");

        for (int i = 0; i < arrayAleatorio.length; i++) { //Recorro el array aleatorio en las posiciones de i
            int numDiag = arrayAleatorio[i][i]; //Guardo en la variable numDiag las posiciones del recorrido anterior
            System.out.print(numDiag + " "); //Muestro los números de la diagonal superior izquierda hasta la inferior derecha
        }

        int i = 0; //Inicializo la variable i
        int max, min; //Creo las variables max y min para guardar el número mayor y el menor de la diagonal

        min = max = arrayAleatorio[i][i];

        for (i = 0; i < arrayAleatorio.length; i++) {
            if (min > arrayAleatorio[i][i]) {
                min = arrayAleatorio[i][i];
            }

            if (max < arrayAleatorio[i][i]) {
                max = arrayAleatorio[i][i];
            }
        }

        System.out.println("\n\nNúmero máximo: " + max); //Muestro por pantalla el número mayor de la diagonal
        System.out.println("Número mínimo: " + min); //Muestro por pantalla el número menor de la diagonal
    }
}
