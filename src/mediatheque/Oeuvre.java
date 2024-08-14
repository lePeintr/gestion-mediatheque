package mediatheque;

/**
 * Cette classe Oeuvre représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Oeuvre {
    private String reference,auteur,titre;
    private int anneePublication;

    public Oeuvre(String reference, String auteur, String titre, int anneePublication) {
        this.reference = reference;
        this.auteur = auteur;
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "reference='" + reference + '\'' +
                ", auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }

    public String afficher(){
        return "Details oeuvre";
    }
}
