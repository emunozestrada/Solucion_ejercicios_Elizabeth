package solucion.ejercicios.tres;

public class EjercicioTres {

    //Creando objetos particulares de tipo Persona:
    public static void main(String[] args){
        Persona personaUno = new Persona("Rosa", 33);
        Persona personaDos = new Persona("Roxana", 24);

        personaUno.mostrarInfo();
        System.out.println();
        personaDos.mostrarInfo();

        System.out.println("\n ********** Sugerencia **************");

        System.out.println(personaUno.mostrarInfoRefactor());
        System.out.println(personaDos.mostrarInfoRefactor());

    }
}
