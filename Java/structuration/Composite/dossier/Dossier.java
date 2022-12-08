package dossier;

import repertoire.Repertoire;
import java.util.ArrayList;
import java.util.Collections;

// Participant: Composite
public class Dossier implements Repertoire {

    private ArrayList<Repertoire> sous_repertoire = new ArrayList<>();
    private String name;
    private String type;

    public Dossier(String name, String type, Repertoire... repertoire) {
        this.name = name;
        this.type = type;
        Collections.addAll(sous_repertoire, repertoire);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() { return type; }

    public ArrayList<Repertoire> getSousRepertoire() {
        return sous_repertoire;
    }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void setType(String type) { this.type = type; }

    public void setSousRepertoire(ArrayList<Repertoire> sous_repertoire) {
        this.sous_repertoire = sous_repertoire;
    }

    @Override
    public void decrire() {
        System.out.println("Dossier de nom: " + name + ", et de type: " + type);
        System.out.println("Ce dossier contient " + sous_repertoire.size() + " éléments");
        for (Repertoire repertoire : sous_repertoire) {
            System.out.println("Sous élément: " + sous_repertoire.indexOf(repertoire));
            System.out.println("- Nom: " + repertoire.getName());
            System.out.println("- Type: " + repertoire.getType());
        }
    }

    public void ajouter(Repertoire... rep) { Collections.addAll(sous_repertoire, rep); }

    public void supprimer(Repertoire rep) { sous_repertoire.remove(rep); }

    public Repertoire obtenir(int i) { return sous_repertoire.get(i); }
}
