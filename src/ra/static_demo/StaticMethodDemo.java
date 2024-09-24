package ra.static_demo;

public class StaticMethodDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Sinh viên 1 tính tổng 2 số 3 và 5: " + student1.addTwoNumber(3, 5));
        Student student2 = new Student();
        System.out.println("Sinh viên 2 tính tổng 2 số 3 và 5: " + student2.addTwoNumber(3, 5));
        System.out.println("Sinh viên 3 tính tổng 2 số 3 và 5: " + Student.addTwoNumber(3, 5));
    }
}
