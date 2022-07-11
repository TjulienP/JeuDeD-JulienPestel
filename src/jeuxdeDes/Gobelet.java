package jeuxdeDes;
/**
 * Cette classe représente le gobelet utilisé lors d'une partie.
 *
 */

import java.util.List;
import java.util.Random;

public class Gobelet extends De {
    //Attributs

    /**
     * Correspond à la valeur d'un lancer du gobelet
     */
    private int valeurGob;
    /**
     * Ce tableau représente les dés contenus dans le gobelet.
     */
    public int [] Des;


    //Constructeurs

    /**
     * Ce constructeur est le constructeur vide de Gobelet
     */
    public Gobelet() {

    }

    /**
     * Ce constructeur surchargé initialise la valeur du gobelet à 0 puis genère
     * le nombre de dès necessaire à la partie et les ajoutes dans la liste Des.
     *
     * @param nb_des Correspond au nombre de dès voulue dans le gobelet.
     */
    public Gobelet(int... nb_des) {
        this.valeurGob = 0;
        this.Des = nb_des;
    }

    //Methodes

    /**
     * Cette méthode permet d'obtenir la valeur d'un lancer du gobelet à un temps t.
     * @return la valeur du lancé du gobelet
     */
    public int getValeurGob() {
        return this.valeurGob;
    }

    /**
     * Cette méthode correspond à un lancer du gobelet constitué du lancer de chaque dé de manière indépendante.
     * @return la valeur d'un gobelet
     */
    public int lancer() {
        for (int De : Des) {
            this.Des[De] = super.lancer();
            this.valeurGob += this.Des[De];

        }
        return this.valeurGob;
    }

    /**
     * Cette méthode permet d'afficher la valeur du dernier lancé de gobelet.
     */
    public void afficher_score (){
        System.out.println("Le score du dernier lancé est de : " + valeurGob);
    }
}


