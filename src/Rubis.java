public class Rubis {              //Un rubis vaut 2 dans le jeu
    private int x;
    private int y;
    private String nom;

    public Rubis(String nom, int x, int y){
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