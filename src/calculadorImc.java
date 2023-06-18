import java.util.Scanner;

public class calculadorImc {
    public static void main(String[] args) {

        // peso en kg / altura en mts al 2 cuadrado

        System.out.println("Ingresa tu peso en Kg");
        Scanner inputPeso = new Scanner(System.in);
        double peso = inputPeso.nextDouble();
        // En la linea anterior se cambia a nextDouble()

        System.out.println("Ingresa tu altura en mtrs");
        Scanner inputAltura = new Scanner(System.in);
        double altura = inputAltura.nextDouble();
        // En la linea anterior se cambia a nextDouble()


        //double peso = 62.5;
        //double altura = 1.6;
        double indiceDeMasaCorporal  = peso / (altura*altura);

        System.out.println( "Tu indice  de masa corporal es: " + indiceDeMasaCorporal);

        // Mayor A 30 -> Obesidad
        if ((indiceDeMasaCorporal >= 30)) {
            System.out.println(" Estas obesp, bajale a las salchipapas");
        }
        // 25 y 30 -> Sobrepeso
        if (indiceDeMasaCorporal >= 25 && indiceDeMasaCorporal < 30) {
            System.out.println(" Tienes sobrepeso , bajale a las gaseosas");
        }
        // 18.5 y 25 -> Normal
        if (indiceDeMasaCorporal >= 18.5 && indiceDeMasaCorporal < 25) {
            System.out.println(" Tu peso esta en el rango de lo Normal");
        }
        // menor a 18.6 -> delgadez
        if (indiceDeMasaCorporal < 18.5){
            System.out.println("Estas bajo de peso, subele a las salchipapas");
        }

    }
}
