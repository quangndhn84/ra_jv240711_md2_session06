package ra.polymorphism;

public class Demo {
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        Overriding2 o2 = new Overriding2();
        o2.talk();
        System.out.println(o2);
    }
}
