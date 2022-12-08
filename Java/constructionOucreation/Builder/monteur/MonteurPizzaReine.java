package monteur;

// Participant: Monteur Concret
public class MonteurPizzaReine extends MonteurPizza{
    @Override
    public void preparerPate() {
        pizza.setNamePate("croissee");
    }

    @Override
    public void preparerEtAjouterSauce() {
        pizza.setNameSauce("douce");
    }

    @Override
    public void preparerEtAjouterGarniture() {
        pizza.setNameGarniture("jambon+champignon");
    }
}
