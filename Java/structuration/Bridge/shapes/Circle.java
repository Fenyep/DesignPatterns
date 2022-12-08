package shapes;

import colors.Color;

public class Circle extends Shape {
        
    private static final String circleShapeName = "Circle";

    public Circle(Color color) {
        super(circleShapeName, color);
    }
}