package pl.bootcamp.java.wielokaty.figury.czworokaty;

import pl.bootcamp.java.wielokaty.figury.Figura;

public class Kwadrat extends Figura{
    public int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

    public double liczObwod(){
        return bokA * 4;
    }

    public double liczPole(){
        return (int)Math.pow((double)bokA,2.0);
    }

    @Override
    public String printClassName() {
        return "Kwadrat";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokA + " " + this.bokA + " " + this.bokA;
    }
}
