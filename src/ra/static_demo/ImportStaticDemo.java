package ra.static_demo;
//import static

import static ra.static_demo.SystemConfig.*;

public class ImportStaticDemo {
    public static void main(String[] args) {
        //Kết nối đến database, dùng URL, DRIVER, USER_NAME và PASSWORD được khai ba trong lớp SystemConfig
        System.out.println("URL: " + URL);
        System.out.println("DRIVER: " + DRIVER);
        System.out.println("USER_NAME: " + USER_NAME);
        System.out.println("PASSWORD: " + PASSWORD);
    }
}
