package monteur;

// Participant: Monteur Concret
public class MonteurPizzaPiquante extends MonteurPizza{
    @Override
    public void preparerPate() {
        pizza.setNamePate("feuilletee");
    }

    @Override
    public void preparerEtAjouterSauce() {
        pizza.setNameSauce("piquante");
    }

    @Override
    public void preparerEtAjouterGarniture() {
        pizza.setNameGarniture("pepperoni+salami");
    }
}
