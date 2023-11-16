package Humain;

import Objet.SacADos;

import java.util.Random;

public class Dresseur {

    public static int nbDresseurs = 0;
    public static int[] nbParEquipe;

    private String nom;
    private int argent;

    private SacADos sacADos;

    public Dresseur(String nom) {
        this.nom = nom;
        this.argent = argent;
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

    }

    public void capturerPokemon() {
        java.util.Random r = new Random();
        this.sacADos.capturerPokemons(r.nextInt(0, 10));
    }

    public boolean peutCombattre() {
        for
        return ;
    }

    public void combattre(Dresseur d) {

    }

    public void pokeCenter() {

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
