package mediatheque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cette classe Mediatheque représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Mediatheque {

    private List<Oeuvre> oeuvres;

    public Mediatheque(List<Oeuvre> oeuvres) {
        this.oeuvres = oeuvres;
    }

    public List<Oeuvre> getOeuvres() {
        return oeuvres;
    }

    public void setOeuvres(List<Oeuvre> oeuvres) {
        this.oeuvres = oeuvres;
    }

    public void ajouterOeuvre(Oeuvre oeuvre) {
        oeuvres.add(oeuvre);
    }

    public void listerLesOeuvres() {
        List<Oeuvre> allOeuvre = new ArrayList<>();
        for (Oeuvre oeuvre : oeuvres) {
            allOeuvre.add(oeuvre);
        }
        System.out.println(allOeuvre);
    }

    public void rechercheOeuvre(String motCle) {
        System.out.println("Boujour");
    }

    public void nombreOeuvreParAnnee(int anneeDePublication) {
        int totalOeuvreParAnnee = 0;
        for (Oeuvre oeuvre : oeuvres) {
            if (anneeDePublication == oeuvre.getAnneePublication()) {
                totalOeuvreParAnnee++;
            }
        }
        System.out.println("le nombre oeuvre pour l'annee " + anneeDePublication + " est : " + totalOeuvreParAnnee);

    }

    @Override
    public String toString() {
        return "Mediatheque{" +
                "oeuvres=" + oeuvres +
                '}';
    }
}

