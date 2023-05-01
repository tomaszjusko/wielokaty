package pl.bootcamp.java.wielokaty.figury.szesciokaty;

import pl.bootcamp.java.wielokaty.figury.Figura;

public class SzesciokatForemny extends Figura {
    int bokA;

    public SzesciokatForemny(int bokA) {
        this.bokA = bokA;
    }

    public double liczObwod() {
        return 6*bokA;
    }

    public double liczPole(){
        return 3*Math.sqrt(3.0)/2.0*Math.pow((double) bokA,2.0);
    }

    @Override
    public String printClassName() {
        return "Szesciokat foremny";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA;
    }
}
