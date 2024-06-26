package solucionEjercicios;
import java.util.Scanner;

public class ejercicioUno {

    public static double sumaUsuario(double n1, double n2){
        return n1 + n2;

    }
    public static double restaUsuario(double n1, double n2){
        return n1 - n2;

    }
    public static double multiplicacionUsuario(double n1, double n2){
        return n1 * n2;

    }
    public static double divisionUsuario(double n1, double n2){
        return n1 / n2;

    }

    public static void main(String[] args) {

        //Operaciones con dos números solicitados al usuario:
        Scanner lector = new Scanner(System.in);

        double n1, n2;
        int opc;

        System.out.println("Ingresa el primer numero: ");
        n1 = lector.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        n2 = lector.nextDouble();

        System.out.println("\n1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");
        System.out.println("Qué operación desea ejecutar?: ");
        opc = lector.nextInt();

        if(opc == 1){
            System.out.println("La suma es: " + sumaUsuario(n1, n2));
        } else if(opc == 2){
            System.out.println("La resta es: " + restaUsuario(n1, n2));
        }else if(opc == 3){
            System.out.println("La multiplicación es: " + multiplicacionUsuario(n1, n2));
        }else if (opc == 4){
            System.out.println("La división es: " + divisionUsuario(n1, n2));
        }else{
            System.out.println("Ingresó una opción no válida");
        }


        //Definición de variables primitivas, dando valores directos:
        byte numeroA = 64;
        byte numeroB = -105;
        byte numeroC = 120;
        int numeroD = 8;
        int numeroE = 15;
        double numeroF = 10.67;
        float numeroG = 12.7895645f;
        boolean esMenorQue = numeroA < numeroB;
        boolean esMayorQue = numeroA > numeroB;
        boolean sonIguales = numeroA == numeroB;
        boolean sonDiferentes = numeroA != numeroB;

        //suma entre variables del mismo tipo y diferente tipo numérico:
        int suma = numeroD + numeroE;
        System.out.println("la suma de los dos numeros es: " + suma);

        //Java convierte los valores de tipo byte en int durante la suma, si se pone byte salta error
        int sumaUno = numeroA + numeroB;

        // para convertir el resultado de la suma en byte (da el mismo resultado)
        byte sumaUnoByte = (byte) sumaUno;

        System.out.println("La suma de los numeros es: " + sumaUno);
        System.out.println("La suma de los numeros es: " + sumaUnoByte);

        int sumaDos = numeroA + numeroC;
        System.out.println("La suma de los numeros A y C es: " + sumaDos);

        double sumaTres = numeroC + numeroF;
        System.out.println("La suma entre los numeros C y F es: " + sumaTres);

        double sumaCuatro = numeroA + numeroF;
        System.out.println("La suma de los números A y F es: " + sumaCuatro);

        double sumaCinco = numeroF + numeroG;
        System.out.println("La suma de los números F y G es: " + sumaCinco);



        //Resta entre variables del mismo tipo y diferente tipo numérico:
        int restaUno = numeroA - numeroB;

        System.out.println("La resta de los numeros es: " + restaUno);

        int restaDos = numeroA - numeroC;
        System.out.println("La resta de los numeros A y C es: " + restaDos);

        double restaTres = numeroC - numeroF;
        System.out.println("La resta entre los numeros C y F es: " + restaTres);

        double restaCuatro = numeroA - numeroF;
        System.out.println("La resta de los números A y F es: " + restaCuatro);


        //Multiplicación entre variables del mismo tipo y diferente tipo numérico:
        int multiplicacionUno = numeroA * numeroB;

        System.out.println("La multiplicación de los numeros es: " + multiplicacionUno);

        int multiplicacionDos = numeroA * numeroC;
        System.out.println("La multiplicación de los numeros A y C es: " + multiplicacionDos);

        double multiplicacionTres = numeroC * numeroF;
        System.out.println("La multiplicación entre los numeros C y F es: " + multiplicacionTres);

        double multiplicacionCuatro = numeroA * numeroF;
        System.out.println("La resta de los números A y F es: " + multiplicacionCuatro);


        //División entre variables del mismo tipo y diferente tipo numérico:
        int divisionUno = numeroA / numeroB;

        System.out.println("La división de los numeros es: " + divisionUno);

        int divisionDos = numeroA / numeroC;
        System.out.println("La division de los numeros A y C es: " + divisionDos);

        double divisionTres = numeroC / numeroF;
        System.out.println("La división entre los numeros C y F es: " + divisionTres);

        double divisionCuatro = numeroA / numeroF;
        System.out.println("La división de los números A y F es: " + divisionCuatro);

        //Módulo entre variables del mismo tipo y diferente tipo numérico:
        int moduloUno = numeroA % numeroB;

        System.out.println("El módulo de los numeros es: " + moduloUno);

        int moduloDos = numeroA % numeroC;
        System.out.println("El módulo de los numeros A y C es: " + moduloDos);

        double moduloTres = numeroC % numeroF;
        System.out.println("El módulo entre los numeros C y F es: " + moduloTres);

        double moduloCuatro = numeroA % numeroF;
        System.out.println("El módulo de los números A y F es: " + moduloCuatro);


    }
}
