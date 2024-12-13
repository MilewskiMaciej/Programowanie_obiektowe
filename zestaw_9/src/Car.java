import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;

    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: make - " + getMake() + ", model - " + getModel() + ", engine - " + engine;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, engine);
    }
}
