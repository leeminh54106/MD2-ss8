package luyentap2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Motorcycle{"+"brand ='"+ super.getBrand() + '\''+", color ='"+ super.getColor() + '\''+'}';
    }
}
