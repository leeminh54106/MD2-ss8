package luyentap2;

public class Main {
    public static void main(String[] args) {
        Car car1= new Car("Toyota","black");
        Car car2= new Car("Ford","white");
        System.out.println("Car1's brand is" + car1.getBrand());
        car1.setColor("yellow");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Motorcycle motorcycle1= new Motorcycle("Honda","red");
        Motorcycle motorcycle2= new Motorcycle("suzuki","orange");
        System.out.println(motorcycle1.toString());
        System.out.println(motorcycle2.toString());
    }
}
