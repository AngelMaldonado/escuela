package learning.java.school;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //Students object array initialization
        Student[] students = new Student[] {
                new Student("Angel", "1"),
                new Student("Mario", "2"),
                new Student("Dante", "3"),
                new Student("Dominic", "4")
        };
        System.out.println("Angel de Jesús Maldonado Juárez");

        System.out.println("Los alumnos son...");

        //Scanner -> object that allows to read a keyboard input "scanf()"
        Scanner scanner = new Scanner(System.in);

        //Cycle to print the students objects array
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "-" + students[i].getCode());

            System.out.print("¿Asistió?: ");
            String response = scanner.next("[YNyn]");

            System.out.println(students[i].getName() + (response.equalsIgnoreCase("Y") ? "Si" : "No"));
        }
    }
}
