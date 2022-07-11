package jeuxdeDes;

import java.util.List;
import java.util.Scanner;

/**
 * Cette classe représente une partie de dés.
 */
public class Partie extends Joueur {
    //Attributs
    /**
     * Ce tableau contient la liste des joueurs de la partie.
     */
    String[] joueurs;
    /**
     * Cette attribut correspond au nombre de tours de la partie.
     */
    private int nb_tours;

    /**
     * Cette attribut correspond au gobelet utilisé pour la partie
     */
    private Gobelet gobelet;

    /**
     * Ce constructeur est le constructeur vide de la classe partie.
     */

    //Constructeurs
    public Partie(){}

    /**
     * Ce contstructeur est le constructeur surchargé de la classe partie.
     * Il permet d'initialiser le nombre de tour et le nombre de dès pour cette partie.
     * @param nb_tours nombre de tour de la partie
     * @param nb_des nombre de dés par gobelet
     */
    public Partie(int nb_tours, int nb_des){

    }

    //Methodes

    /**
     * Cette méthode permet d'initialiser le tableau contenant la liste des joueurs.
     * @param nom_joueur
     */
    public void initialiser(String... nom_joueur){

        this.joueurs = nom_joueur;
    }

    /**
     * Cette méthode au lancer du gobelet autant de fois qu'il y a de nombre de tour et ceux pour chaque joueur
     * @param gobelet correspond au gobelet de la partie.
     */
    public void lancer(Gobelet gobelet){
        for (String joueur : this.joueurs) {
            for (int i = 1; i>=nb_tours; i = i + 1){
                super.jouer(gobelet);
            }
            super.afficher_score();

        }


    }


}
