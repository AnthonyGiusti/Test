import java.util.*;

public class Joueur {
    public Scanner scanner = new Scanner(System.in);

    public ArrayDeque<String> pioche = new ArrayDeque<String>();
    public ArrayList<String> cartes = new ArrayList<String>();
    public ArrayList<String> main = new ArrayList<String>();
    public ArrayList<String> programme = new ArrayList<String>();


    public Joueur(){

        for (int i = 0; i < 18; i++){       //for(int i=1; i<=18; i++){         //On est corda que c'est pareil ?
            cartes.add("Bleue");                 //cartes;add("bleu");
        }                                   //}
        for (int i = 0; i < 8; i++){
            cartes.add("Jaune");
        }
        for (int i = 0; i < 8; i++){
            cartes.add("Violette");
        }
        for (int i = 0; i < 3; i++){
            cartes.add("Laser");
        }
        Collections.shuffle(cartes);
        pioche = new ArrayDeque<>(cartes);
        // System.out.println("Combien de cartes voulez-vous ? (Maximum 5 cartes)"); //Il ne faut pas laisser le choix à l'utilisateur, sa main == 5 cartes
        //int nb_cartes = scanner.nextInt();

        System.out.println("Que voulez-vous faire ?\n 1.Compléter le programme\n 2.Construire un mur\n 3.Exéctuer le programme");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                compléterProgramme();
                break;
            case 2:
                exécuterProgramme();
                break;
            case 3:
                construireMur();
                break;
        }
    }

    public void compléterProgramme(){

        for (int i = main.size(); i < 5; i++){
            String cartePiochée = pioche.poll();
            main.add(cartePiochée);
        }
        System.out.println("Cartes dans votre main: \n" + main);
        System.out.println("Choississez vos cartes à mettre dans votre programme:");

        while (programme.size() < 6){

            String carteChoisi = scanner.nextLine();
            programme.add(carteChoisi);
            main.remove(carteChoisi);
            System.out.println("Votre main: " + main);
        }
        System.out.println("Votre programmme est: " + programme);

        for (int i = 0; i < programme.size(); i++){
            programme.get(i);

            if (programme.get(i) == "Bleue"){
                //Modifier coordonnées x ou y en fenction direction: +1
            }
            else if (programme.get(i) == "Jaune"){
                //Modifier direction: 90° vers la gauche
            }
            else if (programme.get(i) == "Violette"){
                //Modifier direction: 90° vers la droite
            }
            else if (programme.get(i) == "Laser"){
                //Détruit mur s'il y en a un ou renvoi la tortue touchée à sa place initiale
            }
        }
    }

    public void exécuterProgramme(){
        Jeu.deplacement(1,5);
    }

    public void construireMur(){

    }

}
