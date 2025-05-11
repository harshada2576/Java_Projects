package p13;

public class Car implements FuelEfficiency, SafetyFeatures {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public double getMileage() {
        return 15.0;
    }

    @Override
    public String getSafetyRating() {
        return "5 Stars";
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Mileage: " + getMileage() + " km/l");
        System.out.println("Safety Rating: " + getSafetyRating());
    }
}
