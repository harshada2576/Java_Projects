package p13;

public class Bike implements FuelEfficiency, SafetyFeatures {
    private String model;

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public double getMileage() {
        return 40.0;
    }

    @Override
    public String getSafetyRating() {
        return "3 Stars";
    }

    public void displayDetails() {
        System.out.println("Bike Model: " + model);
        System.out.println("Mileage: " + getMileage() + " km/l");
        System.out.println("Safety Rating: " + getSafetyRating());
    }
}
