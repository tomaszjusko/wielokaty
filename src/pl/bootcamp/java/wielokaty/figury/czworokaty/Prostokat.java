package pl.bootcamp.java.wielokaty.figury.czworokaty;

public class Prostokat extends Kwadrat {

    int bokB;

    public Prostokat(int bokA, int bokB) {
        super(bokA);
        this.bokB = bokB;
    }

    @Override
    public double liczObwod() {
        return 2*bokA + 2*bokB;
    }

    @Override
    public double liczPole() {
        return bokB * bokA;
    }

    @Override
    public String printClassName() {
        return "Prostokat";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokB + " " + this.bokA + " " + this.bokB;
    }
}
