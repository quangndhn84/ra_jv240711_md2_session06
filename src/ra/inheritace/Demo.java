package ra.inheritace;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        student.inputStudent(scanner);
        student.displayStudent();
    }
}
