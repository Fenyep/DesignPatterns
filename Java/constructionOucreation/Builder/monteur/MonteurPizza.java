package monteur;

import produit.Pizza;

// Participant: Monteur Abstrait
abstract public class MonteurPizza {

    protected Pizza pizza;
    abstract public void preparerPate();
    abstract public void preparerEtAjouterSauce();
    abstract public void preparerEtAjouterGarniture();

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellPizza() {
        pizza = new Pizza();
    }
}
