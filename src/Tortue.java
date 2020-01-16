public class Tortue extends Tuile{  //Une tortue vaut 1 dans le jeu

    public String direction;

    public Tortue(String typeDeTuile, int x, int y, String direction) {
        super(typeDeTuile, x, y);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
