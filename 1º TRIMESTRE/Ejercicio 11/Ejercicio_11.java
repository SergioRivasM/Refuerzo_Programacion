package EJERCICIOS;

public class Ejercicio_11 {

    //Main para probar los métodos creados
    public static void main(String[] args) {
        System.out.println(esCapicua(232));
        System.out.println(esCapicua(233) + "\n");

        System.out.println(esPrimo(17));
        System.out.println(esPrimo(12) + "\n");

        System.out.println("El siguiente número primo es " + siguientePrimo(13));

        System.out.println("La potencia es: " + potencia(2,3));

        System.out.println("El número tiene " + digitos(12345) + " dígitos");

        System.out.println("El número al revés: " + voltea(12345));

    }

    public static boolean esCapicua(int num) { //Método para comprobar si un número es capicúo o no
        if (num == voltea(num)) { //Reutilizo el método 'voltea' ya que para comprobar si es capicúa hay que darle la vuelta al número para ver si se lee igual de un lado que de otro
            return true; //Devuelve true si es capicúa
        } else {
            return false; //Devuelve false si no es capicúa
        }
    }

    public static boolean esPrimo(int num) { //Método para comprobar si un número es primo
        for (int i = 2; i < num; i++) { //Recorro los números hasta el que le paso por parámetro
            if (num % i == 0) { //Compruebo si el resto de dividir el número recorrido por el pasado es igual a 0, significa que no es primo
                return false; //Devuelve false si no es primo
            }
        }
        return true; //Devuelve true si es primo
    }

    public static int siguientePrimo(int num) { //Método para sacar el siguiente número primo al introducido
        while (!esPrimo(++num)); //Reutilizo el método 'esPrimo' y digo que mientras el número no sea primo, hago preincremento del número

        return num; //Delvuelve el siguiente primo al introducido
    }

    public static double potencia(int base, int exp) { //Método que devuelve la potencia con la base y el exponente
        int res = 1; //Inicializo la variable resultado en 1 para poder multiplicarlo posteriormente por la base
        for (int i = 0; i < exp; i++) { //Recorro i hasta el exponente
            res *= base; //Voy multiplico el resultado por la base para sacar la potencia
        }
        return res; //Devuelvo el resultado, la potencia
    }

    public static int digitos(int num) { //Método para contar los dígitos que tiene un número pasado
        int cont = 0; //Inicializo el contador en 0
        while (num >= 1) { //Comprobamos que el número pasado sea mayor o igual a 1
            num /= 10; //Dividimos entre 10 para ir cogiendo el último dígito
            cont++; //Sumamos un número al contador
        }
        return cont; //Devolvemos el contador, el número de dígitos que tiene el número
    }

    public static int voltea(int num) { //Método para darle la vuelta a un número pasado
        int reves = 0; //Inicializo reves en 0
        int resto; //Variable donde guardaremos el resto de un número
        while (num > 0) { //COmprobamos que el número pasado sea mayor que 0
            resto = num%10; //Le damos a resto el valor del resto de dividir el número entre 10
            reves = reves*10 + resto; //Multiplicamos reves por 10 y le sumamos el resto
            num /= 10; //Dividimos entre 10 para ir colocando los últimos números al principio
        }
        return reves; //Devolvemos el número volteado
    }
}