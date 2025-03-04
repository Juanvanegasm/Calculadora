import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        boolean cont = true;
        int num1 = 0;
        int num2 = 0;
        String operador;
        double resultado = 0;
        boolean operacionValida;

        System.out.println("CALCULADORA");


        num1 = ale.nextInt(100) + 1;
        num2 = ale.nextInt(100) + 1;

        while (cont) {
            System.out.println("Numeros: " + num1 + " y " + num2);
            System.out.print("Ingrese un operador (+, -, *, /, ^, %): ");
            operador = teclado.next();


            operacionValida = true;


            if (operador.equals("+")) {
                resultado = num1 + num2;
            } else if (operador.equals("-")) {
                resultado = num1 - num2;
            } else if (operador.equals("*")) {
                resultado = num1 * num2;
            } else if (operador.equals("/")) {
                resultado = (double) num1 / num2;
            } else if (operador.equals("^")) {
                resultado = Math.pow(num1, num2);
            } else if (operador.equals("%")) {
                resultado = num1 % num2;
            } else {
                System.out.println("Operador no válido. Inténtelo de nuevo.");
                operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("¿Desea realizar otra operación? (1. Sí  2. No): ");
            int opcion = teclado.nextInt();

            cont = (opcion == 1);
        }

        System.out.println("Gracias por usar la calculadora.");
        teclado.close();
    }
}


