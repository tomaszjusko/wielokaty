package pl.bootcamp.java.wielokaty.figury.trojkaty;

public class Trojkat extends TrojkatRownoRamienny {

    int bokC;

    public Trojkat(int bokA, int bokB, int bokC) {
        super(bokA, bokB);
        this.bokC = bokC;
        super.polowaObwodu = (this.bokA + this.bokB + this.bokC)/2.0;
    }

    @Override
    public double liczObwod() {
        return (this.bokA + this.bokB + this.bokC);
    }

    @Override
    public double liczPole() {
        return Math.sqrt(this.polowaObwodu * (this.polowaObwodu-bokA)
                * (this.polowaObwodu - bokB) * (this.polowaObwodu - bokC));
    }

    @Override
    public String printClassName() {
        return "Trojkat roznoboczny";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokB + " " + this.bokC;
    }
}
