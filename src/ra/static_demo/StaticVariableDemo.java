package ra.static_demo;

public class StaticVariableDemo {
    public static void main(String[] args) {
        //lần duy nhất,view = 0;
        RikkeiAcademy guest1 = new RikkeiAcademy();
        guest1.visited();//view = 1
        System.out.println("Số lượt view hiện tại sau khi guest 1 thăm: " + guest1.getView());//view của đối tượng guest 1, init = 0
        RikkeiAcademy guest2 = new RikkeiAcademy();
        guest2.visited();//view = 2
        System.out.println("Số lượt view hiện tại sau khi guest 2 thăm: " + guest2.getView());//view của đối tượng guest 2, init = 0
        RikkeiAcademy guest3 = new RikkeiAcademy();
        guest3.visited();//view = 3
        System.out.println("Số lượt view hiện tại sau khi guest 3 thăm: " + RikkeiAcademy.view);//view của đối tượng guest 3, init = 0
    }
}
