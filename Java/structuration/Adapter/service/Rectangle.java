package service;

// Participant: Adapte
public class Rectangle {

    private int size;

    public Rectangle(int size){
        this.size = size;
    }

    public int calculerPerimetre() {
        int perimetre = 2*(size+size);
        return perimetre;
    }

    public int calculerAire() {
        int aire = size*size;
        return aire;
    }
}
