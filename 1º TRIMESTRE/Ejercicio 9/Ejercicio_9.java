package EJERCICIOS;

public class Ejercicio_9 {
    public static void main(String[] args) {
        //Realiza un generador de melodía con las siguientes condiciones:
        //a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
        //b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
        //c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1).
        //El final de la melodía se marca con dos barras.
        //d) La última nota de la melodía debe coincidir con la primera.

        int grupo = 4 * (int) (Math.random() * 7 + 1); //Creamos aleatoriamente el número de notas que va a haber en total
        String notas = ""; //Inicializamos la cadena de notas
        String primeraNota = ""; //Inicialiamos la cadena de primeraNota

        for (int i = 1; i <= grupo; i++) { //Bucle para recorrer hasta el número de notas
            int nota = (int) (Math.random() * 7); //Establecer el número de la nota para ir añadiendola al grupo en orden aleatorio
            switch (nota) { //Con un switch establecemos el número para cada nota
                case 0:
                    notas = "DO";
                    break;
                case 1:
                    notas = "RE";
                    break;
                case 2:
                    notas = "MI";
                    break;
                case 3:
                    notas = "FA";
                    break;
                case 4:
                    notas = "SOL";
                    break;
                case 5:
                    notas = "LA";
                    break;
                case 6:
                    notas = "SI";
                    break;
                default:
            }

            if (i == 1) { //Comprobamos si i es igual a 1 para establecer la primera nota de la inserción
                primeraNota = notas;
            }

            if (i == grupo) { //Cuando la i sea igual a la última nota
                notas = primeraNota; //Establecemos que la última nota sea igual que la primera
            }

            System.out.print(notas + " "); //Mostramos por pantalla las notas

            if (i == grupo) { //Cuando se llegue al final del número de grupos
                System.out.print("||"); //Metemos 2 barras al final
            } else if (i % 4 == 0) { //Cuando saltemos de un grupo al siguiente
                System.out.print("| "); //Metemos una barra entre grupos
            }
        }
    }
}