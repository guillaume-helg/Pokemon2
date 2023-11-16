package Pokemon;

import java.util.Random;

public class Pokemon0 {

    private static java.util.Random random = new Random();
    private String nom;
    private int niveau;
    private int hp;
    private int atk;

    public Pokemon0(String nom) {
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

    public boolean isKO() {
        return this.hp == 0;
    }

    public void soigner() {
        this.hp = this.niveau * 2;
    }

    public void attaquer(Pokemon0 p) {
        p.hp -= this.getAtk();
    }

    public String toString() {
        return "Nom : " + this.nom + " Niveau : " + this.niveau + " Attaque : " + this.atk + " HP : " + this.hp;
    }

    public void log(String msg) {
        System.out.println("[" + this.nom + "]" + " : " + msg);
    }
}
