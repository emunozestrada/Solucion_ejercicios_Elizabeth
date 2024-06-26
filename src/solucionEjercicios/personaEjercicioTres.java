package solucionEjercicios;

public class personaEjercicioTres {
    // Atributos (nombre, edad)
    private String name;
    private int age;


    // Constructor
    public personaEjercicioTres(){

    }
    public personaEjercicioTres(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);

    }

    //Creando objetos particulares de tipo Persona:
    public static void main(String[] args){
        personaEjercicioTres personaUno = new personaEjercicioTres("Rosa", 33);
        personaEjercicioTres personaDos = new personaEjercicioTres("Roxana", 24);

        personaUno.mostrarInfo();
        System.out.println();
        personaDos.mostrarInfo();

    }
}
