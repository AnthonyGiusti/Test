import java.util.*;

public class Joueur {
    private Scanner scanner = new Scanner(System.in);

    public ArrayDeque<String> pioche = new ArrayDeque<String>();
    public ArrayList<String> cartes = new ArrayList<String>();
    public ArrayList<String> main = new ArrayList<String>();


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

        for (int i = 0; i < 5; i++){
            String cartePiochée = pioche.poll();
            main.add(cartePiochée);
        }
        System.out.println("Cartes dans votre main : \n" + main);
    }
}