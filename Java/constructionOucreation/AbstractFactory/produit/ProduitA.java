package produit;

// Participant: Produit (A)
public abstract class ProduitA {
    private String name;
    private double value;

    protected ProduitA() {
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

    public abstract void methodeA();
}