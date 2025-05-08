package p7;

public class DVD extends Library {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
    }
}
