public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200, "Diesel", "SN1433423");
        Car car = new Car("Tajota", "Korona", engine);
        System.out.println(car);
        car.getEngine().setPower(250);
        System.out.println("Update car: " + car);
    }
}