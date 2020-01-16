public class Mur extends Tuile {        //Un mur de peiire vaut 3 et un mur de glace vaut 4

    public String typeDeMur;


    public Mur(String typeDeTuile, int x, int y, String typeDeMur) {
        super(typeDeTuile, x, y);
        this.typeDeMur = typeDeMur;
    }


    public String getTypeDeMur() {
        return typeDeMur;
    }


    public void setTypeDeMur(String typeDeMur) {
        this.typeDeMur = typeDeMur;
    }

}
