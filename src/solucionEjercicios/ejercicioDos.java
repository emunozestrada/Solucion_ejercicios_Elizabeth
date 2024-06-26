package solucionEjercicios;

import java.util.Scanner;

public class ejercicioDos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double numero;

        System.out.println("Ingresa un numero: ");
        numero = lector.nextDouble();

        if (numero > 0) {
            System.out.println("\n El numero ingresado es positivo");

        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo");

        } else {
            System.out.println("El número ingresado es igual a cero");
        }
    }
}

