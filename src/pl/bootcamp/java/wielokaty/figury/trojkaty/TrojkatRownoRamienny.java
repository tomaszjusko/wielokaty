package pl.bootcamp.java.wielokaty.figury.trojkaty;

public class TrojkatRownoRamienny extends TrojkatRownoBoczny {
    int bokB;
    double polowaObwodu;

    public TrojkatRownoRamienny(int bokA, int bokB) {
        super(bokA);
        this.bokB = bokB;
        this.polowaObwodu = (2*this.bokA + this.bokB)/2.0;
    }

    @Override
    public double liczObwod() {
        return 2*bokA + bokB;
    }

    @Override
    public double liczPole() {
        return Math.sqrt(this.polowaObwodu * (2*(this.polowaObwodu-bokA)) * (this.polowaObwodu - bokB));
    }

    @Override
    public String printClassName() {
        return "Trojkat rownoramienny";
    }

    @Override
    public String podajBoki() {
        return this.bokA + " " + this.bokA + " " + this.bokB;
    }
}
