package solucion.ejercicios.cinco;

import solucion.ejercicios.uno.Operaciones;

import javax.swing.*;
import java.util.Scanner;

public class EjercicioCinco {


    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

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
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion \n 1. Suma \n 2. Resta \n 3. División  \n 4. Multiplicación \n 5. Salir"));
                System.out.println("opc == 1: " + (opc == 1));
                if (opc == 1) {
                    JOptionPane.showMessageDialog(null, "Resultado de la suma: " + operaciones.sumaUsuario(num1, num2));
                    System.out.println("Resultado de la suma: " + operaciones.sumaUsuario(num1, num2));
                } else if (opc == 2) {
                    JOptionPane.showMessageDialog(null, "Resultado de la resta: " + operaciones.restaUsuario(num1, num2));
                    System.out.println("Resultado de la resta: " + operaciones.restaUsuario(num1, num2));
                } else if (opc == 3) {

                    if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Resultado de la división: " + operaciones.divisionUsuario(num1, num2));
                        System.out.println("Resultado de la división: " + operaciones.divisionUsuario(num1, num2));
                    }else{
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        System.out.println("No se puede dividir por cero.");
                    }
                } else if (opc == 4) {
                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + operaciones.multiplicacionUsuario(num1, num2));
                    System.out.println("Resultado de la multiplicación: " + operaciones.multiplicacionUsuario(num1, num2));
                } else if (opc == 5) {
                    continuar = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción del 1 al 5.");
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has elegido una opción válida");
                System.out.println("No has elegido una opción válida");
            }
        }while (continuar);
        JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora");
        System.out.println("Gracias por usar la calculadora");
        lector.close();
    }
}

