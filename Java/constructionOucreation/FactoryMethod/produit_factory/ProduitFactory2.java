package produit_factory;

import produit.ProduitA;
import produit.ProduitA2;

// Participant: Fabrique Concrete (2)
public class ProduitFactory2 extends ProduitFactory {

    public ProduitA createProduit() {
        return new ProduitA2();
    }
}