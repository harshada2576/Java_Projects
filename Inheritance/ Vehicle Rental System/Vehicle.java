package p1; 
 
public class Vehicle { 
    protected String vehicleId; 
    protected String brand; 
    protected double rentalPricePerDay; 
 
    public Vehicle(String vehicleId, String brand, 
double rentalPricePerDay) { 
        this.vehicleId = vehicleId; 
        this.brand = brand; 
        this.rentalPricePerDay = rentalPricePerDay; 
    } 
 
    public double calculateRentalCost(int days) { 
        return rentalPricePerDay * days; 
    } 
 
    public void displayDetails() { 
        System.out.println("Vehicle ID: " + vehicleId + 
", Brand: " + brand + ", Rental Price Per Day: " + 
rentalPricePerDay); 
    } 
}
