package jeuxdeDes;

import java.util.Random;

/**
 * Cette classe représente un De du gobelet
 * @Julien_Pestel
 * @11/07/2022
 */
public class De {
    /**
     * L'attribut valeur correspond à la valeur d'un lancer de dé.
     * @Julien_Pestel
     */

    //Attribut
    private int valeur;
    /**
     * Le constructeur non surchargé initialise valeur à 0.
     * @Julien_Pestel
     */

    //Constructeur

    public De() {
        this.valeur = 0;

    }

    //Méthodes

    /**
     * Permet d'obtenir la valeur du Dé
     * @return valeur
     */

    public int getValeur() {
        return this.valeur;
    }

    /**
     * Correspond à un lancer de dé. En changgeant ça valeur.
     * @return un nombre aléatoire entre 0 et 6.
     */
    public int lancer(){
        Random random  = new Random();
        this.valeur = random.nextInt(7);
        return this.valeur;
    }
}
