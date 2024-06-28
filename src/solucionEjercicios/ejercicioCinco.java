package solucionEjercicios;

import javax.swing.*;
import java.util.Scanner;

public class ejercicioCinco {
    public static double sumaUsuario(double num1, double num2){
        return num1 + num2;

    }
    public static double restaUsuario(double num1, double num2){
        return num1 - num2;

    }
    public static double divisionUsuario(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplicacionUsuario(double num1, double num2){
        return num1 * num2;

    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double num1, num2;
        int opc;
        boolean continuar = true;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:"));


        do{
            System.out.println("\n1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. Salir");
            System.out.println("Elija la operación desea ejecutar?: ");



            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion \n 1. Suma \n 2. Resta \n 3. Multiplicación  \n 4. División \n 5. Salir"));
                if (opc == 1) {
                    System.out.println("Resultado de la suma: " + sumaUsuario(num1, num2));
                } else if (opc == 2) {
                    System.out.println("Resultado de la resta: " + restaUsuario(num1, num2));
                } else if (opc == 3) {
                    if (num2 != 0) {
                        System.out.println("Resultado de la división: " + divisionUsuario(num1, num2));
                    }else{
                        System.out.println("No se puede dividir por cero.");
                    }
                } else if (opc == 4) {
                    System.out.println("Resultado de la multiplicación: " + multiplicacionUsuario(num1, num2));
                } else if (opc == 5) {
                    continuar = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción del 1 al 5." );
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
                }
            } catch (Exception e) {
                System.out.println("No has elegido una opción válida");
            }
        }while (continuar);

        System.out.println("Gracias por usar la calculadora");
        lector.close();
    }
}

