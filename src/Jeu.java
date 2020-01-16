import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Jeu {
    public int[][] plateau = new int[8][8];

    private Tortue tortue1;
    private Tortue tortue2;
    private Tortue tortue3;
    private Tortue tortue4;

    private Mur murPierre;
    private Rubis rubis1;
    private Rubis rubis2;
    private Rubis rubis3;

    private Scanner scanner = new Scanner(System.in);


    public Jeu() {

        boolean jeu = true;

        while (jeu) {

            System.out.println("Choisir le nombre joueur");
            int nb_joueurs = scanner.nextInt();

            if (nb_joueurs < 2 || nb_joueurs > 4) {
                System.out.println("Erreur ! Le nombre de joueur n'est pas bon !");
                jeu = false;

            }
            else {

                for (int colonne = 0; colonne < 8; colonne++) {
                    for (int ligne = 0; ligne < 8; ligne++) {
                        plateau[ligne][colonne] = 0;
                    }
                }

                if (nb_joueurs == 2) {
                    tortue1 = new Tortue("orange", 0, 1, "sud");
                    tortue2 = new Tortue("bleu", 0, 5, "sud");
                    murPierre = new Mur("Mur", 0, 7, "pierre");
                    rubis1 = new Rubis("rubis1", 7, 3);

                    plateau[tortue1.getY()][tortue1.getX()] = 1;
                    plateau[tortue2.getY()][tortue2.getX()] = 1;

                    for (int i = 0; i < 8; i++) {
                        plateau[murPierre.getY()][murPierre.getX() + i] = 3;
                    }

                    plateau[rubis1.getY()][rubis1.getX()] = 2;

                    afficherPlateau();
                    /*for (int colonne = 0; colonne < 8; colonne++) {
                        for (int ligne = 0; ligne < 8; ligne++) {
                            System.out.print(plateau[ligne][colonne] + "\t"); // On affiche le plateau
                            if (ligne == 7) {
                                System.out.println("\n");
                            }
                        }
                    }*/
                }
                else if (nb_joueurs == 3) {
                    tortue1 = new Tortue("orange", 0, 0, "sud");
                    tortue2 = new Tortue("bleu", 0, 3, "sud");
                    tortue3 = new Tortue("violet", 0, 6, "sud");
                    murPierre = new Mur("Mur", 0, 7, "pierre");
                    rubis1 = new Rubis("rubis1", 7, 0);
                    rubis2 = new Rubis("rubis2", 7, 3);
                    rubis3 = new Rubis("rubis1", 7, 6);

                    plateau[tortue1.getY()][tortue1.getX()] = 1;
                    plateau[tortue2.getY()][tortue2.getX()] = 1;
                    plateau[tortue3.getY()][tortue3.getX()] = 1;

                    for (int i = 0; i < 8; i++) {
                        plateau[murPierre.getY()][murPierre.getX() + i] = 3;
                    }

                    plateau[rubis1.getY()][rubis1.getX()] = 2;
                    plateau[rubis2.getY()][rubis2.getX()] = 2;
                    plateau[rubis3.getY()][rubis3.getX()] = 2;

                    afficherPlateau();
                    /*for (int colonne = 0; colonne < 8; colonne++) {
                        for (int ligne = 0; ligne < 8; ligne++) {
                            System.out.print(plateau[ligne][colonne] + "\t"); // On affiche le plateau
                            if (ligne == 7) {
                                System.out.println("\n");
                            }
                        }
                    }*/
                } else {
                    tortue1 = new Tortue("orange", 0, 0, "sud");
                    tortue2 = new Tortue("bleu", 0, 2, "sud");
                    tortue3 = new Tortue("violet", 0, 5, "sud");
                    tortue4 = new Tortue("jaune", 0, 7, "sud");
                    rubis1 = new Rubis("rubis1", 7, 1);
                    rubis2 = new Rubis("rubis2", 7, 6);

                    plateau[tortue1.getY()][tortue1.getX()] = 1;
                    plateau[tortue2.getY()][tortue2.getX()] = 1;
                    plateau[tortue3.getY()][tortue3.getX()] = 1;
                    plateau[tortue4.getY()][tortue4.getX()] = 1;

                    plateau[rubis1.getY()][rubis1.getX()] = 2;
                    plateau[rubis2.getY()][rubis2.getX()] = 2;

                    afficherPlateau();
                    /*for (int colonne = 0; colonne < 8; colonne++) {
                        for (int ligne = 0; ligne < 8; ligne++) {
                            System.out.print(plateau[ligne][colonne] + "\t"); // On affiche le plateau
                            if (ligne == 7) {
                                System.out.println("\n");
                            }
                        }
                    }*/
                }
                Joueur joueur = new Joueur();
            }
        }
    }

    public void afficherPlateau(){
        for (int colonne = 0; colonne < 8; colonne++) {
            for (int ligne = 0; ligne < 8; ligne++) {
                System.out.print(plateau[ligne][colonne] + "\t"); // On affiche le plateau
                if (ligne == 7) {
                    System.out.println("\n");
                }
            }
        }
    }
    public static void deplacement(int numeroTortue, int y){
        if (numeroTortue == 1){
            //tortue1.setY(y);
        }

    }
}
