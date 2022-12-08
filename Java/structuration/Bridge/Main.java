import colors.Color;
import colors.RedColor;
import colors.BlueColor;

import shapes.Shape;
import shapes.Square;
import shapes.Circle;

// Participant: Client
public class Main {
    public static void main(String[] args) {

        // Creation of a new RedColor instance
        Color redColor = new RedColor();

        // Creation of a new BlueColor instance
        Color blueColor = new BlueColor();

        // Creation of a red Square
        Shape square = new Square(redColor);

        // Creation of a blue Circle
        Shape circle = new Circle(blueColor);

        // Display of the shapes caracteristics
        square.getShapeDescription();
        circle.getShapeDescription();
    }
}