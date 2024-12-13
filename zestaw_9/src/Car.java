public record Car(String brand, String model, double fuelComsumptionPer100km) {
    public void fuelCost(double fuelPrice, double distance) {
        System.out.println(fuelPrice * distance + " zł");
    }
}
