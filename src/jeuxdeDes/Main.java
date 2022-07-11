package jeuxdeDes;

public class Main {
    public static void main(String[] args) {

        //Instanciation du gobelet servant dans la partie
        Gobelet gobelet = new Gobelet(1,2);

        //Instanciation de la partie
        Partie partie1 = new Partie(1, 2);

        //Création des différents joueurs

        Joueur joueur1 = new Joueur("Gerard");
        Joueur joueur2 = new Joueur("Lucien");
        Joueur joueur3 = new Joueur("Raymond");

        //Initialisation de la partie

        partie1.initialiser("Gerard", "Lucien","Raymond");

        /*Lancement de la partie avec le gobelet instancié plus haut.
        La méthode lancer doit appeler la méthode jouer présente dans joueur qui elle-même appel la méthode lancer présente dans gobelet.
        Cette dernière utilise a son tour la méthode lancer de Dé
         */


        partie1.lancer(gobelet);



    }
}
