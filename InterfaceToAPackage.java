import InterfaceToAPackage.*;
// Main class
public class InterfaceToAPackage
{
    public static void main(String[] args)
    {
        Drawable circle = new Circle();      // Creating a Circle object
        Drawable rectangle = new Rectangle(); // Creating a Rectangle object
        circle.draw();      // Calls the draw method of Circle
        rectangle.draw();   // Calls the draw method of Rectangle
    }
}
