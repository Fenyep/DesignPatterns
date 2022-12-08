package produit_factory;

import produit.ProduitA;

// Participant: Fabrique Abstraite
public abstract class ProduitFactory {

    protected abstract ProduitA createProduit();

    public ProduitA getProduit() {
        return createProduit();
    }
}
