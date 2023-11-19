package Humain;

import Objet.SacADos;
import Pokemon.Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Dresseur {

    public static int nbDresseurs = 0;
    public static int[] nbParEquipe = new int[3];

    private Equipe equipe;
    private String nom;
    private int argent;

    private SacADos sacADos;

    public Dresseur(String nom) {
        this.nom = nom;
        this.argent = 0;
        this.sacADos = new SacADos(this);
        nbDresseurs += 1;
        this.choixEquipe();
    }

    private void choixEquipe() {
        System.out.println("Choisis ton équipe ! : 1 pour Sagesse, 2 pour intuition, 3 pour bravoure");
        Scanner scanner = new Scanner(System.in);
        int entree = scanner.nextInt();
        scanner.nextLine();
        switch (entree) {
            case 1 :
                this.equipe = Equipe.SAGESSE;
                nbParEquipe[0] += 1;
                break;
            case 2 :
                this.equipe = Equipe.INTUITION;
                nbParEquipe[1] += 1;
                break;
            case 3 :
                this.equipe = Equipe.BRAVOURE;
                nbParEquipe[2] += 1;
                break;
        }
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbPokemon() {
        return this.sacADos.getNbPokemon();
    }

    public void prendreArgent(Dresseur d) {
        this.argent += 10;
        d.argent -= 10;
    }

    public void capturerPokemon() {
        this.sacADos.capturerPokemons();
    }

    public int getArgent() {
        return this.argent;
    }

    public boolean peutCombattre() {
        return this.sacADos.peutCombattre();
    }

    public Pokemon prochainPokemon() {
        return this.sacADos.getNextPokemon();
    }

    public void combattre(Dresseur d) {
        this.sacADos.combattre(d);
    }

    public void pokeCenter() {
        this.sacADos.pokeCenter();
    }

    @Override
    public String toString() {
        return "Humain.Dresseur{" +
                "nom='" + nom + '\'' +
                ", argent=" + argent;
    }

    private String prefixe() {
        return "[ " + this.getNom() + " ]";
    }

    public void log(String msg) {
        System.out.println("[" + this.getNom() + "]");
    }
}
