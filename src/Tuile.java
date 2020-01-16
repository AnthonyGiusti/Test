public class Tuile {

    public String typeDeTuile;
    public int x;
    public int y;

    public Tuile(String typeDeTuile, int x, int y){
        this.typeDeTuile = typeDeTuile;
        this.x = x;
        this.y = y;
    }

    public String getTypeDeTuile() {
        return typeDeTuile;
    }

    public void setTypeDeTuile(String typeDeTuile) {
        this.typeDeTuile = typeDeTuile;
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
