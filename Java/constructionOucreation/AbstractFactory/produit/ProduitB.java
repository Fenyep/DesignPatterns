package produit;

public abstract class ProduitB {
    private String name;
    private double value;

    protected ProduitB() {
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract void methodeB();
}