package solucionEjercicios.seis;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioSeisList {

    static CalculosAlumnosList calculosAlumnos;

    public static void main(String[] args) {
        int opcion = -1;
        calculosAlumnos = new CalculosAlumnosList();
        do {
            try {
                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                " ******** menu ******** " +
                                        "\n 1. Registrar alumno" +
                                        "\n 2. Visualizar los alumnos" +
                                        "\n 3. Visualizar quienes ganaron y perdieron la materia" +
                                        "\n 4. Calcular el promedio del grupo" +
                                        "\n 5. Salir"
                        )
                );
                menu(opcion);
            } catch (Exception e) {
                System.out.println("No se ingresó una opción valida: " + e.getMessage());
            }
        } while (opcion != 5);

    }

    public static void menu(int opcion) {
        switch (opcion) {
            case 1 -> calculosAlumnos.agregarAlumno();
            case 2 -> {
                calculosAlumnos.showAlumnos();
                JOptionPane.showMessageDialog(null, "Ahora con toString()");
                calculosAlumnos.showAlumnosString();
            }
            case 3 -> calculosAlumnos.listAlumnos();
            case 4 -> JOptionPane.showMessageDialog(
                    null, "El promedio del grupo es: " + calculosAlumnos.promedio()
            );
            case 5 -> JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            default -> System.out.println("No seleccionó una opción valida");
        }
    }




}
