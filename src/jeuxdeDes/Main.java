package jeuxdeDes;

public class Main {
    public static void main(String[] args) {
        Gobelet gobelet = new Gobelet(1,2);
        Partie partie1 = new Partie(1, 2);

        Joueur joueur1 = new Joueur("Gerard");
        Joueur joueur2 = new Joueur("Lucien");
        Joueur joueur3 = new Joueur("Raymond");

        partie1.initialiser("Gerard", "Lucien","Raymond");


        partie1.lancer(gobelet);

    }
}
