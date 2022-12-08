import produit_factory.IProduitFactory;
import produit_factory.ProduitFactory1;
import produit_factory.ProduitFactory2;
import produit.ProduitA;
import produit.ProduitB;

public class Main {
    public static void main(String[] args) {
        // Initilisation fabrique 1
        IProduitFactory fabriqueConcrete1 = new ProduitFactory1();
        
        // Initialisation fabrique 2
        IProduitFactory fabriqueConcrete2 = new ProduitFactory2();

        // Creation produitA1
        ProduitA produitA1 = fabriqueConcrete1.createProduitA();
        produitA1.methodeA();

        // Creation produitA2
        ProduitA produitA2 = fabriqueConcrete2.createProduitA();
        produitA2.methodeA();

        // Creation produitB1
        ProduitB produitB1 = fabriqueConcrete1.createProduitB();
        produitB1.methodeB();

        // Creation produitB2
        ProduitB produitB2 = fabriqueConcrete2.createProduitB();
        produitB2.methodeB();
    }
}