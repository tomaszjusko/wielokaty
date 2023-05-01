package pl.bootcamp.java.wielokaty.figury.pieciokaty;

public class Pieciokat extends PieciokatForemny{
    int bokB;
    int bokC;
    int bokD;
    int bokE;

    public Pieciokat(int bokA, int bokB, int bokC, int bokD, int bokE) {
        super(bokA);
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
        this.bokE = bokE;
    }

    @Override
    public double liczObwod() {
        return this.bokA + this.bokB + this.bokC + this.bokD + this.bokE;
    }

    @Override
    public double liczPole() {
        return 0;
    }

    @Override
    public String printClassName() {
        return "Pieciokat";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokB + " " + this.bokC + " " + this.bokD + " " + this.bokE;
    }
}
