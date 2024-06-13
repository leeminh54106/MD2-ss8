package luyentap5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tên :" +StaticMethod.name);
        System.out.println("Tuổi :" +StaticMethod.age);

        StaticMethod.showInfo();
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Tên : " +staticMethod.name);
        System.out.println("Tuổi : " +staticMethod.age);

        staticMethod.showInfo();
    }
}
