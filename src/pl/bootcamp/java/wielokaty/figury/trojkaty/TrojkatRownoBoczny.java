package pl.bootcamp.java.wielokaty.figury.trojkaty;

import pl.bootcamp.java.wielokaty.figury.Figura;

public class TrojkatRownoBoczny extends Figura {
    public int bokA;

    public TrojkatRownoBoczny(int bokA) {
        this.bokA = bokA;
    }

    public double liczObwod(){
        return 3*bokA;
    }

    public double liczPole(){
        return ((Math.pow((double)bokA,2.0)) * Math.sqrt(3.0))/4;
    }

    @Override
    public String printClassName() {
        return "Trojkat rownoboczny";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokA + " " + this.bokA;
    }
}
