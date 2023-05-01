package pl.bootcamp.java.wielokaty.figury.szesciokaty;

public class Szesciokat extends SzesciokatForemny{
    int bokB;
    int bokC;
    int bokD;
    int bokE;
    int bokF;

    public Szesciokat(int bokA, int bokB, int bokC, int bokD, int bokE, int bokF) {
        super(bokA);
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
        this.bokE = bokE;
        this.bokF = bokF;
    }

    @Override
    public double liczObwod() {
        return this.bokA + this.bokB + this.bokC + this.bokD + this.bokE + this.bokF;
    }

    @Override
    public double liczPole() {
        return 0;
    }

    @Override
    public String printClassName() {
        return "Szesciokat";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokB + " " + this.bokC + " " + this.bokD + " " + this.bokE + " " + this.bokF;
    }
}
