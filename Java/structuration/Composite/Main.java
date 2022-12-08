import dossier.Dossier;
import fichier.PDF;
import fichier.TXT;
import repertoire.Repertoire;

import java.util.ArrayList;

// Participant: Client
public class Main {
    public static void main(String[] args) {

        System.out.println("============== Création de deux fichiers ==================");
        Repertoire fichierTxt = new TXT("gitAccount", "Txt");
        Repertoire fichierPdf = new PDF("Designs", "Pdf");

        System.out.println("============== Création d'un dossier  ====================");
        ArrayList<Repertoire> sousRep = new ArrayList<>();
        sousRep.add(fichierPdf);
        sousRep.add(fichierTxt);
        Dossier dossier1 = new Dossier("school", "dossier", fichierPdf, fichierTxt);

        System.out.println("============== Description du dossier  ==================");
        dossier1.decrire();

        System.out.println("============== Description de l'un des fichier ==================");
        fichierPdf.decrire();
    }
}