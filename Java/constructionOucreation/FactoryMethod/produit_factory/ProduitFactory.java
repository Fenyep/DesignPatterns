package produit_factory;

import produit.ProduitA;

public abstract class ProduitFactory {

    protected abstract ProduitA createProduit();

    public ProduitA getProduit() {
        return createProduit();
    }
}
