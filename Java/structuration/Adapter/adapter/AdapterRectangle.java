package adapter;

import interface_carree.InterfaceCarree;
import service.Rectangle;

// Participant: Adaptateur
public class AdapterRectangle implements InterfaceCarree {

    private int size;

    private Rectangle rectangle = null;

    public AdapterRectangle(int size){
        rectangle = new Rectangle(size);
    }

    @Override
    public int calculerPerimetre() {
        return rectangle.calculerPerimetre();
    }

    @Override
    public int calculerAire() {
        return rectangle.calculerAire();
    }
}
