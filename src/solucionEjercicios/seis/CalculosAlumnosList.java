package solucionEjercicios.seis;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CalculosAlumnosList {

    private List<Alumno> alumnos;

    public CalculosAlumnosList() {
        alumnos = new ArrayList<>();
    };

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public Alumno getAlumnos(int pos) {
        return alumnos.get(pos);
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public void agregarAlumno() {
            String name = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del alumno"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno"));
            Alumno alumno = new Alumno(name, n1, n2, n3);
            alumnos.add(alumno);
    }

    public void showAlumnos() {
        for (int i = 0; i < alumnos.size(); i++) {
            JOptionPane.showMessageDialog(
                    null, "Alumno: " + i +
                            "\nNombre: "+ this.getAlumnos().get(i).getName() +
                            "\nNota 1: " + + this.getAlumnos().get(i).getNota1() +
                            "\nNota 2: " + + this.getAlumnos().get(i).getNota2() +
                            "\nNota 3: " + + this.getAlumnos().get(i).getNota3() +
                            "\nNota definitiva: " + + this.getAlumnos().get(i).getNotaDefinitiva()
            );
        }
        JOptionPane.showMessageDialog(null, "Ahora con forEach");
        AtomicInteger count = new AtomicInteger(1);
        alumnos.forEach(alumno -> {
            JOptionPane.showMessageDialog(
                    null, "Alumno: " + count +
                            "\nNombre: "+ alumno.getName() +
                            "\nNota 1: " + alumno.getNota1() +
                            "\nNota 2: " + alumno.getNota2() +
                            "\nNota 3: " + alumno.getNota3() +
                            "\nNota definitiva: " + alumno.getNotaDefinitiva()
            );
            count.getAndIncrement();
        });
    }

    public void showAlumnosString() {
        for (int i = 0; i < alumnos.size(); i++) {
            JOptionPane.showMessageDialog(
                    null, "Alumno: " + i + "" +
                            "\n"+ this.getAlumnos().get(i).toString());
        }
    }

    private String obtenerListAlumnosPerdidos() {
        String list = "----------\n";
        for (int i = 0; i < alumnos.size(); i++) {
            if(this.getAlumnos().get(i).getNotaDefinitiva() < 3) {
//                list = list + this.getAlumnos().get(i).getName();
                list += "\n" + this.getAlumnos().get(i).getName() + "\n----------";
            }
        }

//        Desde Java 8
        List<Alumno> alumnosPierden = alumnos.stream()
                .filter(alumno -> alumno.getNotaDefinitiva() < 3)
                .collect(Collectors.toList());

// Desde Java 16
//        List<Alumno> alumnosPierden = alumnos.stream()
//                .filter(alumno -> alumno.getNotaDefinitiva() < 3).toList();

        return list;
    }

    private String obtenerListAlumnosGanados() {
        String list = "----------\n";
        for (int i = 0; i < alumnos.size(); i++) {
            if(this.getAlumnos().get(i).getNotaDefinitiva() > 2.9) {
//                list = list + this.getAlumnos().get(i).getName();
                list += "\n" +  this.getAlumnos().get(i).getName() + "\n----------";

            }
        }
        return list;
    }

    public void listAlumnos() {
        JOptionPane.showMessageDialog(null, "La lista de alumnos que pierden la materia son los siguientes");
        JOptionPane.showMessageDialog(null, this.obtenerListAlumnosPerdidos());
        JOptionPane.showMessageDialog(null, "La lista de alumnos que ganan la materia son los siguientes");
        JOptionPane.showMessageDialog(null, this.obtenerListAlumnosGanados());
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            suma += this.getAlumnos().get(i).getNotaDefinitiva();
        }
        return suma / alumnos.size();
    }

}
