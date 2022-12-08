import adapter.AdapterRectangle;
import interface_carree.InterfaceCarree;

// Participant: Client
public class Main {
    public static void main(String[] args) {
        // Instanciation du rectangle à partir de l'interface carrée
        InterfaceCarree rectangle = new AdapterRectangle(20);
        // Affichage des propriétés du rectangle
        System.out.println("Ths perimeter is: " + rectangle.calculerPerimetre());
        System.out.println("Ths area is: " + rectangle.calculerAire());
    }
}