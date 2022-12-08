import directeur.Directeur;
import monteur.MonteurPizza;
import monteur.MonteurPizzaReine;
import produit.Pizza;

// Participant: Client
public class Main {
    public static void main(String[] args) {
        // Instanciation du Monteur 
        MonteurPizza monteurPizza = new MonteurPizzaReine();
        // Création de la nouvellePizza
        monteurPizza.creerNouvellPizza();
        // Instanciation du directeur qui prends le monteur en paramètre
        Directeur directeur = new Directeur(monteurPizza);
        // Contruction de la pizza
        Pizza pizza = directeur.construire();

        // Affichage des propriétés du type de pizza créé
        System.out.println(pizza.getNamePate());
        System.out.println(pizza.getNameSauce());
        System.out.println(pizza.getNameGarniture());
    }
}