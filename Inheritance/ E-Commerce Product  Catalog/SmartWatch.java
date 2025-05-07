package p6;

public class SmartWatch implements Electronics, Clothing {
    private int warrantyPeriod;
    private String size;

    public SmartWatch(int warrantyPeriod, String size) {
        this.warrantyPeriod = warrantyPeriod;
        this.size = size;
    }

    @Override
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String getSize() {
        return size;
    }
}
