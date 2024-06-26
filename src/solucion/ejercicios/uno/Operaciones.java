package solucion.ejercicios.uno;

public class Operaciones {

    public double sumaUsuario(double n1, double n2){
        return n1 + n2;

    }
    public double restaUsuario(double n1, double n2){
        return n1 - n2;

    }
    public double multiplicacionUsuario(double n1, double n2){
        return n1 * n2;

    }
    public double divisionUsuario(double n1, double n2){
        try{
            return n1 / n2;
        }catch(ArithmeticException e){
            return Double.NaN;
        }
    }
}
