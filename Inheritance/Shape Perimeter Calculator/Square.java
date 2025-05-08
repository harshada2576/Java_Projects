package p9;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
