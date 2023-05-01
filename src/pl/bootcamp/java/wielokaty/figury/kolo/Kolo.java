package pl.bootcamp.java.wielokaty.figury.kolo;

import pl.bootcamp.java.wielokaty.figury.Figura;

public class Kolo extends Figura {
    public int promienA;

    public Kolo(int promienA) {
        this.promienA = promienA;
    }

    @Override
    public double liczObwod() {
        return 2*Math.PI*this.promienA;
    }

    @Override
    public double liczPole() {
        return Math.PI*Math.sqrt(promienA);
    }

    @Override
    public String printClassName() {
        return "Kolo";
    }

    @Override
    public String podajBoki() {
        return this.promienA + "";
    }
}
