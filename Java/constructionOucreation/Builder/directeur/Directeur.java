package directeur;

import monteur.MonteurPizza;
import produit.Pizza;

import java.util.ArrayList;
import java.util.List;

// Participant: Directeur
public class Directeur {
    List<MonteurPizza> monteurPizzas = new ArrayList<>();

    public Directeur(MonteurPizza monteurPizza) {
        this.monteurPizzas.add(monteurPizza);
    }

    public Pizza construire() {
        Pizza pizza = null;
        for (MonteurPizza monteurPizza: monteurPizzas
             ) {
            monteurPizza.preparerPate();
            monteurPizza.preparerEtAjouterSauce();
            monteurPizza.preparerEtAjouterGarniture();
            pizza = monteurPizza.getPizza();
        }
        return pizza;
    }
}
