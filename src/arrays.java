import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // hacer un programa que permita al usuario ingresar 5 numeros y mostrarlos

        // primero hay que preguntar al usuario que ingrese un numero
        // Para ingresar un numero tenemos que usa Scanner

        //Aca estamos declarando el teclado

        /*
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        //Esto va a esperar que el usuario ingrese un numero
        // Este numero se va a guardar en una variable (numero)
        int numero = teclado.nextInt();

        System.out.println(numero);
        */


        //-------------------------
        /*
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        System.out.println(numero);
        */


        // Vamos a crear un array y guardar todos los numeros en el array

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        while (contador < 5) {
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros [contador] = numero;
            contador++;

        }

        contador = 0;
        while (contador<5){
            System.out.println(numeros[contador]);
            contador++;
        }



    }
}
