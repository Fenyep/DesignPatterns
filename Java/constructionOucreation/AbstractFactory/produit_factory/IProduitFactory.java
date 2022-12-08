package produit_factory;

import produit.ProduitA;
import produit.ProduitB;

public abstract class IProduitFactory {

    public abstract ProduitA createProduitA();
    public abstract ProduitB createProduitB();

    public ProduitA getProduitA() {
        return createProduitA();
    }

    public ProduitB getProduitB() {
        return createProduitB();
    }
}
