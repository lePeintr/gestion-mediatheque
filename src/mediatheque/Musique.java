package mediatheque;

import enums.TypeSupport;

/**
 * Cette classe Musique représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Musique extends Oeuvre{
    private TypeSupport typeSupport;
    private int pistes;
    public Musique(String reference, String auteur, String titre, int anneePublication,TypeSupport typeSupport, int pistes) {
        super(reference, auteur, titre, anneePublication);
        this.typeSupport=typeSupport;
        this.pistes=pistes;
    }

    public TypeSupport getTypeSupport() {
        return typeSupport;
    }

    public void setTypeSupport(TypeSupport typeSupport) {
        this.typeSupport = typeSupport;
    }

    public int getPistes() {
        return pistes;
    }

    public void setPistes(int pistes) {
        this.pistes = pistes;
    }

    @Override
    public String toString() {
        return super.toString() +  "Musique{" +
                "typeSupport=" + typeSupport +
                ", pistes=" + pistes +
                '}';
    }

    @Override
    public String afficher() {
        return "Details de la musique";
    }
}
