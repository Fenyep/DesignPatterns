import produit_factory.ProduitFactory;
import produit_factory.ProduitFactory1;
import produit_factory.ProduitFactory2;
import produit.ProduitA;

public class Main {
    public static void main(String[] args) {

        // Initalisation factory 1
        ProduitFactory produitFactory1 = new ProduitFactory1();

        // Initalisation factory 2
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produit = null;

        // ProduitA1 créé par la méthode
        produit = produitFactory1.getProduit();
        
        // ProduitA2 créé par la méthode
        produit = produitFactory2.getProduit();
    }
}