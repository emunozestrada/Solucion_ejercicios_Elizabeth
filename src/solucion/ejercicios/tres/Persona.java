package solucion.ejercicios.tres;

public class Persona {
    // Atributos (nombre, edad)
    private String name;
    private int age;

    // Constructor
    public Persona(){

    }
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }

    //Sugerencia: el método mostrarInfo lo podías crear de esta manera
    public String mostrarInfoRefactor() {
        return "Nombre: " + name + "\nEdad: " + age;
    }

}
