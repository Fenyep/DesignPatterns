package shapes;

import colors.Color;

// Participant: Demander
public abstract class Shape {
    protected String shapeName;
    protected Color shapeColor;
    // Color Bridge

    public Shape(String shapeName, Color color) {
        this.shapeName = shapeName;
        this.shapeColor = color;
    }

    // Getters
    public String getShapeName() {
        return shapeName;
    }

    // Methods
    public void getShapeDescription() {
        System.out.println("This is a: " + shapeName + " shape, of color: " + shapeColor.getColorName());
    }
}