package fichier;

import repertoire.Repertoire;

// Participant: Abstract Leaf
abstract class Fichier implements Repertoire {

    private String name;
    private String type;

    protected Fichier(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }

    // Setters
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void decrire() {
        System.out.println("Fichier de nom: " + name + ", et de type: " + type);
    }

}
