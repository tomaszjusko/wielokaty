package pl.bootcamp.java.wielokaty.figury.czworokaty;

public class Czworokat extends Prostokat {

    int bokC;
    int bokD;

    public Czworokat(int bokA, int bokB, int bokC, int bokD) {
        super(bokA, bokB);
        this.bokC = bokC;
        this.bokD = bokD;
    }

    @Override
    public double liczObwod() {
        return bokA + bokB + bokC + bokD;
    }

    @Override
    public double liczPole() {
        return 0;
    }

    @Override
    public String printClassName() {
        return "Czworokat";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokB + " " + this.bokC + " " + this.bokD;
    }
}
