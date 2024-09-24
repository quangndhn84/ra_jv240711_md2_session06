package ra.inheritace;

import java.util.Scanner;

public class Student extends Person {
    //Thừa hưởng tất cả thuộc tính, constructors, các phương thức của lớp Person
    //Có các thuộc tính, constructor, phương thưc của riêng nó
    private String studentId;
    private float avgMark;

    public Student() {
    }

    public Student(String name, int age, boolean sex, String address, String studentId, float avgMark) {
        super(name, age, sex, address);
        this.studentId = studentId;
        this.avgMark = avgMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void inputStudent(Scanner scanner) {
        super.inputData(scanner);
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào điểm trung bình:");
        this.avgMark = Float.parseFloat(scanner.nextLine());
    }

    public void displayStudent() {
        super.displayData();
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Avg Mark: " + this.avgMark);
    }

}
