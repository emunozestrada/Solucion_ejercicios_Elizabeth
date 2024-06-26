package solucionEjercicios;

import javax.swing.*;
import java.util.Scanner;

public class ejercicioCuatro {

    public static double divisionUsuario(double n1, double n2){

        try{
            return n1 / n2;
        }catch(ArithmeticException e){
            return Double.NaN;
        }
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double n1, n2;

        System.out.println("Ingresa el primer numero (numerador): ");
        n1 = lector.nextDouble();
        System.out.println("Ingresa el segundo numero (denominador): ");
        n2 = lector.nextDouble();

        System.out.println("La división es: " + divisionUsuario(n1, n2));
    }
}
