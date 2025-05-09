package p10;

public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warrantyPeriod + " years");
    }
}
