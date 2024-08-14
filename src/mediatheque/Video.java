package mediatheque;

import enums.TypeFormat;

/**
 * Cette classe Video représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Video extends Oeuvre {
    private TypeFormat typeFormat;
    private int dureeVideo;

    public Video(String reference, String auteur, String titre, int anneePublication, TypeFormat typeFormat, int dureeVideo) {
        super(reference, auteur, titre, anneePublication);
        this.typeFormat = typeFormat;
        this.dureeVideo = dureeVideo;
    }

    public TypeFormat getTypeFormat() {
        return typeFormat;
    }

    public void setTypeFormat(TypeFormat typeFormat) {
        this.typeFormat = typeFormat;
    }

    public int getDureeVideo() {
        return dureeVideo;
    }

    public void setDureeVideo(int dureeVideo) {
        this.dureeVideo = dureeVideo;
    }

    @Override
    public String toString() {
        return super.toString() + "Video{" +
                "typeFormat=" + typeFormat +
                ", dureeVideo=" + dureeVideo +
                '}';
    }

    public String afficher() {
        return "Details de la video";
    }
}
