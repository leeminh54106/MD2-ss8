package luyentap6;

public class Car {
    private String name;
    private String engine;
    public static  int numberOfCars;

    public Car(String engine, String name) {
        this.engine = engine;
        this.name = name;
        numberOfCars++;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
