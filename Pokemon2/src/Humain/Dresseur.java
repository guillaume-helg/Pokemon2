package Humain;

import Objet.SacADos;
import Pokemon.Pokemon;

import java.util.Random;

public class Dresseur {

    public static int nbDresseurs = 0;
    public static int[] nbParEquipe;

    private String nom;
    private int argent;

    private SacADos sacADos;

    public Dresseur(String nom) {
        this.nom = nom;
        this.argent = 0;
        this.sacADos = new SacADos(this);
        nbDresseurs += 1;
    }

    private void choixEquipe() {

    }

    public String getNom() {
        return this.nom;
    }

    public int getNbPokemon() {
        return this.sacADos.getNbPokemon();
    }

    public void prendreArgent(Dresseur d) {
        this.argent += d.getArgent();
    }

    public void capturerPokemon() {
        this.sacADos.capturerPokemons();
    }

    public int getArgent() {
        return this.getArgent();
    }

    public boolean peutCombattre() {
        return this.sacADos.peutCombattre();
    }

    public void combattre(Dresseur d) {

    }

    public void pokeCenter() {
        this.pokeCenter();
    }

    @Override
    public String toString() {
        return "Humain.Dresseur{" +
                "nom='" + nom + '\'' +
                ", argent=" + argent +
                '}';
    }

    private String prefixe() {
        return "";
    }

    public void log(String msg) {

    }
}
