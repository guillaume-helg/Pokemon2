package Pokemon;

import java.util.Random;

public class PouPoule extends PokemonEau {

    protected int bonusVie;
    private int bonusMax;
    private Random r;

    public PouPoule() {
        super("Pokemon.Pokemon.PouPoule");
        this.bonusMax = 0;
        this.bonusVie = 0;
        this.r = new Random();
    }

    protected PouPoule(String nom) {
        super(nom);
        this.bonusMax = 0;
        this.bonusVie = 0;
        this.r = new Random();
    }

    protected void perdreVie(int dommage) {
        this.setHp(dommage);
    }

    public String toString(String msg) {
        return super.toString() + " Bonus max : " + this.bonusMax + " Bonus vie : " + this.bonusVie;
    }
}
