package solucionEjercicios;

import javax.swing.*;

public class CalculosAlumnos {

    private Alumno[] alumnos;

    public CalculosAlumnos(int length) {
        alumnos = new Alumno[length];
    };

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public Alumno getAlumno(int pos) {
        return alumnos[pos];
    }

    public void setAlumno(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public void setAlumnos(Alumno alumnos, int pos) {
        this.alumnos[pos] = alumnos;
    }

    public void agregarAlumnos() {
        for(int i = 0; i < alumnos.length; i++) {
            String name = JOptionPane.showInputDialog("Ingrese el nombre del alumno " + i + ":");
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del alumno" + i));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno" + i + ":"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno" + i + ":"));
            Alumno alumno = new Alumno(name, n1, n2, n3);
            setAlumnos(alumno, i);
        }
    }

    public void showAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            JOptionPane.showMessageDialog(
                    null, "Alumno: " + i +
                            "\nNombre: "+ this.getAlumno(i).getName() +
                            "\nNota 1: " + + this.getAlumno(i).getNota1() +
                            "\nNota 2: " + + this.getAlumno(i).getNota2() +
                            "\nNota 3: " + + this.getAlumno(i).getNota3() +
                            "\nNota definitiva: " + + this.getAlumno(i).getNotaDefinitiva()
            );
        }
    }

    public void showAlumnosString() {
        for (int i = 0; i < alumnos.length; i++) {
            JOptionPane.showMessageDialog(
                    null, "Alumno: " + i + "" +
                            "\n"+ this.getAlumno(i).toString());
        }
    }

    private String obtenerListAlumnosPerdidos() {
        String list = "----------\n";
        for (int i = 0; i < alumnos.length; i++) {
            if(getAlumno(i).getNotaDefinitiva() < 3) {
//                list = list + getAlumno(i).getName();
                list += "\n" + getAlumno(i).getName() + "\n----------";
            }
        }
        return list;
    }

    private String obtenerListAlumnosGanados() {
        String list = "----------\n";
        for (int i = 0; i < alumnos.length; i++) {
            if(getAlumno(i).getNotaDefinitiva() > 2.9) {
//                list = list + getAlumno(i).getName();
                list += "\n" +  getAlumno(i).getName() + "\n----------";

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
        for (int i = 0; i < alumnos.length; i++) {
            suma += this.getAlumno(i).getNotaDefinitiva();
        }
        return suma / alumnos.length;
    }

}
