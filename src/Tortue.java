public class Tortue {           //Une tortue vaut 1 dans le jeu
    private String nom;
    private int x;
    private  int y;
    private String direction = "Sud";


    public Tortue(String nom, int x, int y) {
        this.nom = nom;
        this.x = x;
        this.y = y;


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}