import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int contador = 0;


        do {
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros [contador] = numero;
            contador++;

        } while (contador< numeros.length);

        /*
        while (contador < numeros.length) {
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros [contador] = numero;
            contador++;
        }
         */

        /*

        contador = 0;
        while (contador< numeros.length){
            System.out.println(numeros[contador]);
            contador++;
        }

         */




    }
}
