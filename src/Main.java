import enums.TypeFormat;
import enums.TypeSupport;
import mediatheque.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Cette classe Main représente la gestion de la mediatheque
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------GESTION mediatheque------------------");

            Livre livre = new Livre("livre1", "auteur1", "titre1", 2024, 4, "editeur1", 100);
            Video video = new Video("video1", "auteur2", "titre2", 2024, TypeFormat.DIVX, 20);
            Musique musique = new Musique("musique1", "auteur3", "musique1", 2022, TypeSupport.DVD, 15);

            System.out.println(livre.afficher());
            System.out.println(video.afficher());
            System.out.println(musique.afficher());

            List<Oeuvre> oeuvres = new ArrayList<>();

            Mediatheque mediatheque = new Mediatheque(oeuvres);


            mediatheque.ajouterOeuvre(livre);
            mediatheque.ajouterOeuvre(video);
            mediatheque.ajouterOeuvre(musique);

            System.out.println("-----------------Liste des oeuvres de la mediatheque");
            mediatheque.listerLesOeuvres();
            mediatheque.nombreOeuvreParAnnee(2022);

            System.out.println("------------------------MENU------------------------");
            Mediatheque m = new Mediatheque(oeuvres);
            System.out.println("1. Afficher les oeuvres de la mediatheque");
            System.out.println("2. Ajouter une oeuvre dans la mediatheque");
            System.out.println("3. Rechercher une oeuvre dans la mediatheque avec un mot cle");
            System.out.println("4. Afficher le nombre total des oeuvres de la mediatheque en fonction d'une annee de publication");
            System.out.println("Choisissez une opération au menu en entrant son numero correspondant: ");
            int choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("1. Afficher les oeuvres de la mediatheque");
                    mediatheque.listerLesOeuvres();
                    break;
                case 2:
                    System.out.println("2. Ajouter une oeuvre dans la mediatheque");

                    System.out.println("1. Livre");
                    System.out.println("2. Video");
                    System.out.println("3. Musique");
                    System.out.println("Choisir le type d'oeuvre à ajouter avec le numero correspondant");
                    int choixOeuvre = sc.nextInt();
                    switch (choixOeuvre) {
                        //Video video=new Video("video1","auteur2","titre2",2024, TypeFormat.DIVX,20);
                        //Musique musique=new Musique("musique1","auteur3","musique1",2022, TypeSupport.DVD,15);
                        case 1:
                            System.out.println("Saisir les informations suivantes pour ajouter un livre");

                            System.out.println("reference");
                            String reference = sc.next();
                            System.out.println("auteur");
                            String auteur = sc.next();
                            System.out.println("titre");
                            String titre = sc.next();
                            System.out.println("annee de publication");
                            int annee = sc.nextInt();
                            System.out.println("isbn");
                            int isbn = sc.nextInt();
                            System.out.println("editeur");
                            String editeur = sc.next();
                            System.out.println("nombre de pages");
                            int page = sc.nextInt();
                            Livre l = new Livre(reference, auteur, titre, annee, isbn, editeur, page);
                            m.ajouterOeuvre(l);
                            System.out.println("Livre ajouté avec success!!!");
                            System.out.println("Mise à jour de la liste des oeuvres de la mediatheques");
                            m.listerLesOeuvres();
                            break;
                        case 2:
                            System.out.println("2. Video");
                            System.out.println("reference");
                            String referenceVideo = sc.next();
                            System.out.println("auteur");
                            String auteurVideo = sc.next();
                            System.out.println("titre");
                            String titreVideo = sc.next();
                            System.out.println("annee de publication");
                            int anneeVideo = sc.nextInt();
                            System.out.println("TypeFormat");
                            TypeFormat typeFormat = null;
                            System.out.println("1.MPEG");
                            System.out.println("2.MP4");
                            System.out.println("3.DIVX");
                            System.out.println("Choisir le type de format de la video");
                            int format = sc.nextInt();
                            switch (format) {
                                case 1:
                                    typeFormat = TypeFormat.MPEG;
                                    break;
                                case 2:
                                    typeFormat = TypeFormat.MP4;
                                    break;
                                case 3:
                                    typeFormat = TypeFormat.DIVX;
                                    break;
                                default:
                                    System.out.println("Choix invalide");
                            }
                            //faire un switch case pour choisir le type de format

                            System.out.println("Duree de la video  en minute");
                            int minutesVideo = sc.nextInt();
                            Video v = new Video(referenceVideo, auteurVideo, titreVideo, anneeVideo, typeFormat, minutesVideo);
                            mediatheque.ajouterOeuvre(v);
                            System.out.println("Video ajoutée avec success!!!");
                            System.out.println("Mise à jour de la liste des oeuvres de la mediatheques");
                            m.listerLesOeuvres();
                            break;
                        case 3:
                            System.out.println("3. Musique");
                            System.out.println("reference");
                            String referenceMusique = sc.next();
                            System.out.println("auteur");
                            String auteurMusique = sc.next();
                            System.out.println("titre");
                            String titreMusique = sc.next();
                            System.out.println("annee de publication");
                            int anneeMusique = sc.nextInt();
                            System.out.println("TypeSupport");
                            TypeSupport typeSupport = null;
                            System.out.println("1.CD");
                            System.out.println("2.DVD");
                            System.out.println("3.MP3");
                            System.out.println("4.VINYLE");
                            System.out.println("Choisir le type de support de la musique");
                            int support = sc.nextInt();
                            switch (support) {
                                case 1:
                                    typeSupport = TypeSupport.CD;
                                    break;
                                case 2:
                                    typeSupport = TypeSupport.DVD;
                                    break;
                                case 3:
                                    typeSupport = TypeSupport.MP3;
                                    break;
                                case 4:
                                    typeSupport = TypeSupport.VINYLE;
                                    break;
                                default:
                                    System.out.println("Choix invalid");
                                    break;
                            }
                            System.out.println("nombres de piste");
                            int piste = sc.nextInt();
                            Musique mu = new Musique(referenceMusique, auteurMusique, titreMusique, anneeMusique, typeSupport, piste);
                            mediatheque.ajouterOeuvre(mu);
                            System.out.println("Musique ajoutée avec success!!!");
                            System.out.println("Mise à jour de la liste des oeuvres de la mediatheques");
                            m.listerLesOeuvres();
                            break;
                    }
                case 3:
                    System.out.println("3. Rechercher une oeuvre dans la mediatheque avec un mot cle");
                    System.out.println("Choisir un mot cle de recherhe par nom");
                    String motCle = sc.next();
                    mediatheque.rechercheOeuvre(motCle);
                    break;
                case 4:
                    System.out.println("4. Afficher le nombre total des oeuvres de la mediatheque en fonction d'une annee de publication");
                    System.out.println("Entrer une annee de publication");
                    int anneePublication = sc.nextInt();
                    mediatheque.nombreOeuvreParAnnee(anneePublication);
                    break;
                default:
                    System.out.println("vous avez fait un choix invalide");

            }

            System.out.println("Redemarrage du programme...");
        }

    }
}
