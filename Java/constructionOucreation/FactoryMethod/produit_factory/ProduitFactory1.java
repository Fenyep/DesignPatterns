package produit_factory;

import produit.ProduitA;
import produit.ProduitA1;

public class ProduitFactory1 extends ProduitFactory {

    public ProduitA createProduit() {
        return new ProduitA1();
    }
}