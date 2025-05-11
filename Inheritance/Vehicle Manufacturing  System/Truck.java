package p13;

public class Truck implements FuelEfficiency, SafetyFeatures {
    private String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public double getMileage() {
        return 8.0;
    }

    @Override
    public String getSafetyRating() {
        return "4 Stars";
    }

    public void displayDetails() {
        System.out.println("Truck Model: " + model);
        System.out.println("Mileage: " + getMileage() + " km/l");
        System.out.println("Safety Rating: " + getSafetyRating());
    }
}
