package produit_factory;

import produit.ProduitA;
import produit.ProduitA2;

public class ProduitFactory2 extends ProduitFactory {

    public ProduitA createProduit() {
        return new ProduitA2();
    }
}