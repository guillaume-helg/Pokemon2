package Pokemon;

import java.util.Random;

public abstract class Pokemon {

    private static Random random = new Random();
    private String nom;
    private int niveau;
    protected int hp;
    private int atk;
    private TypePokemon type;

    public Pokemon(String nom, TypePokemon type) {
        this.nom = nom;
        this.niveau = random.nextInt(1, 80);
        this.hp = this.niveau * 2;
        this.atk = (this.niveau/2) + 1;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public TypePokemon getType() {
        return this.type;
    }

    public boolean isKO() {
        return this.hp == 0;
    }

    public void soigner() {
        this.hp = this.niveau * 2;
    }

    public abstract void attaquer(Pokemon p);
    public abstract void subir(Pokemon p);

    public String toString() {
        return "Nom : " + this.nom + " Niveau : " + this.niveau + " Attaque : " + this.atk + " HP : " + this.hp + " Type : " + this.type;
    }

    public void log(String msg) {
        System.out.println("[" + this.nom + "]" + " : " + msg);
    }

    private String prefixe() {
        return "[" + this.nom + "]";
    }
}
