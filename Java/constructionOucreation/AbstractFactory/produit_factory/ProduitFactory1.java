package produit_factory;

import produit.ProduitA;
import produit.ProduitB;
import produit.ProduitA1;
import produit.ProduitB1;

// Participant: Fabrique Concrete (1)
public class ProduitFactory1 extends IProduitFactory {

    public ProduitA createProduitA() {
        return new ProduitA1();
    }

    public ProduitB createProduitB() {
        return new ProduitB1();
    }
}