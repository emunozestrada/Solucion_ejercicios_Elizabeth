package solucion.ejercicios.cuatro;

import solucion.ejercicios.uno.Operaciones;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        Scanner lector = new Scanner(System.in);

        double n1, n2;

        System.out.println("Ingresa el primer numero (numerador): ");
        n1 = lector.nextDouble();
        System.out.println("Ingresa el segundo numero (denominador): ");
        n2 = lector.nextDouble();

        System.out.println("La división es: " + operaciones.divisionUsuario(n1, n2));
    }
}

