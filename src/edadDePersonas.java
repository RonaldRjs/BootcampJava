import java.util.Scanner;

public class edadDePersonas {
    public static void main(String[] args) {

        System.out.println("Que edad tienes");

        Scanner cargaDeDatos = new Scanner(System.in);
        int edad = cargaDeDatos.nextInt();

        // int edad = 30;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }else {

        System.out.println("Es menor de edad");

        }

    }
}
