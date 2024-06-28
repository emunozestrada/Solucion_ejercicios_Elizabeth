package solucionEjercicios;

public class Alumno {
    private String name;
    private double nota1, nota2, nota3, notaDefinitiva;

    public Alumno() {

    }

    //    sobrercargar un constructor para establecer valores de inicio
    public Alumno(String name, double nota1, double nota2, double nota3, double notaDefinitiva, ) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaDefinitiva = (nota1 + nota2 + nota3)/3;
    }




    public static void main(String[] args) {

    }
}
