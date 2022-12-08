package colors;

// Participant: Service
public abstract class Color {
    protected String name;

    public Color(String colorName) {
        this.name = colorName;
    }

    // Getters
    public String getColorName() {
        return name;
    }
}