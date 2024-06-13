package Baitap4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao side 1: ");
        triangle.setSide1(Double.parseDouble(sc.nextLine()));

        System.out.println("nhap vao side 2: ");
        triangle.setSide2(Double.parseDouble(sc.nextLine()));

        System.out.println("nhap vao side 3: ");
        triangle.setSide3(Double.parseDouble(sc.nextLine()));

        System.out.println("nhap vao color: ");
        triangle.setColor(sc.next());

        System.out.println(triangle);
    }
}
