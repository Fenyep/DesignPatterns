package produit_factory;

import produit.ProduitA;
import produit.ProduitB;
import produit.ProduitA2;
import produit.ProduitB2;

public class ProduitFactory2 extends IProduitFactory {

    public ProduitA createProduitA() {
        return new ProduitA2();
    }

    public ProduitB createProduitB() {
        return new ProduitB2();
    }
}