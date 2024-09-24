package ra.polymorphism;

public class OverloadingDemo {
    //C1: Thay đổi số luượng tham số
    public int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int addTwoNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    //C2. Thay đổi thứ tự tham số
    public void test(int number, String name) {

    }

    public void test(String name, int number) {

    }

    //C3: Thay đổi kiểu dữ liệu của tham số
    public float addTwoNumbers(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }
}
