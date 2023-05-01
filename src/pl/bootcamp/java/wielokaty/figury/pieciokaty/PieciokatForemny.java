package pl.bootcamp.java.wielokaty.figury.pieciokaty;

import pl.bootcamp.java.wielokaty.figury.Figura;

public class PieciokatForemny extends Figura {
    int bokA;

    public PieciokatForemny(int bokA) {
        this.bokA = bokA;
    }

    public double liczObwod(){
        return bokA*5;
    }
    public double liczPole(){
        return Math.pow((double) bokA,2.0)/4 * Math.sqrt(25 + 10 * Math.sqrt(5.0));
    }

    @Override
    public String printClassName() {
        return "Pieciakat foremny";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA;
    }
}
