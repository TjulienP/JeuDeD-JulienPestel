package jeuxdeDes;

/**
 * Cette classe représente 1 participant
 * @Julien_Pestel
 * @11/07/2022
 */
public class Joueur extends Gobelet {
    //Attributs
    /**
     * Cet attribut correspond au nom du joueur en question.
     */
    private String nom;
    /**
     * Cet attribut correspond au score du joueur.
     */
    private int score;

    //Constructeurs

    /**
     * Ce constructeur est le constructeur vide de la classe.
     */
    public Joueur(){}

    /**
     * Ce constructeur est le constructeur surchargé de la classe joueur.
     * Il permet de donner une valeur à joueur et initialise scoe à 0.
     * @param nom Le nom du joueur
     */
    public Joueur(String nom){
        this.nom = nom;
        score = 0;
    }

    //Methodes

    /**
     * Cette méthode permet d'obtenir le nom du joueur.
     * @return le nom du joueur
     */

    public String getNom() {
        return this.nom;
    }
    /**
     * Cette méthode permet d'obtenir le score du joueur.
     * @return le score du joueur
     */

    public int getScore() {
        return this.score;
    }

    /**
     * Cette méthode correspond au lancement du gobelet par le joueur.
     * @param gobelet
     */
    public void jouer(Gobelet gobelet){
        super.lancer();
        this.score = super.getValeurGob();
    }

    /**
     *Cette méthode permet d'afficher le score du joueur correspondant à la valeur d'un lancer de gobelet
     */
    public void afficher_score(){
        super.afficher_score();
        System.out.println("Le score du joueur "+ this.nom + " est de " + super.getValeurGob());

    }
}
