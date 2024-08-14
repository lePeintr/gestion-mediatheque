package mediatheque;

/**
 * Cette classe Livre représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Livre extends Oeuvre{
    private int isbn,nombreDePage;
    private String editeur;
    public Livre(String reference, String auteur, String titre, int anneePublication,int isbn,String editeur,int nombreDePage) {
        super(reference, auteur, titre, anneePublication);
        this.isbn=isbn;
        this.editeur=editeur;
        this.nombreDePage=nombreDePage;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(int nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public String toString() {
        return super.toString() +  "Livre{" +
                "isbn=" + isbn +
                ", nombreDePage=" + nombreDePage +
                ", editeur='" + editeur + '\'' +
                '}';
    }

    public String afficher(){
        return "Details du livre";
    }
}
