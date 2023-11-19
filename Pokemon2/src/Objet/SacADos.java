package Objet;

import Humain.Dresseur;
import Pokemon.Pokemon;

import Pokemon.*;

import java.util.ArrayList;
import java.util.Random;

public class SacADos {

    private Dresseur d;
    private ArrayList<Pokemon> tab;

    private Pokeball pokeball;

    public SacADos(Dresseur dresseur) {
        this.d = dresseur;
        this.tab = new ArrayList<>();
        this.pokeball = new Pokeball(this.d);
    }

    public int getNbPokemon() {
        return this.tab.size();
    }

    public Pokemon getNextPokemon() {
        int i = 0;
        while (i < this.tab.size() && this.tab.get(i).isKO()) {
            i++;
        }
        return this.tab.get(i);
    }

    public void capturerPokemons() {
        java.util.Random r = new Random();
        Pokemon p = null;
        int nb = r.nextInt(0, 4);
        for (int i = 0; i < nb; i++) {
            int type = r.nextInt(1, 4);
            switch (type) {
                case 1:
                    p = new PokemonEau(this.d.getNom() + "Pokemon" + i);
                    break;
                case 2:
                    p = new PokemonFeu(this.d.getNom() + "Pokemon" + i);
                    break;
                case 3:
                    p = new PokemonPlante(this.d.getNom() + "Pokemon" + i);
                    break;
            }
            this.tab.add(p);
        }
    }

    public boolean peutCombattre() {
        boolean ko = false;
        for (Pokemon p : this.tab) {
            if (p.isKO()) {
                ko = true;
            }
        }
        return this.d.getArgent() != 0 && !ko;
    }

    public void combattre(Dresseur adversaire) {
        int tour = 0;
        boolean finCombat = false;
        Pokemon p1, p2;

        while (!finCombat) {
            p1 = d.prochainPokemon();
            p2 = adversaire.prochainPokemon();

            p1.attaquer(p2);

            if (p2.isKO()) {
                finCombat = true;
            } else {
                p1 = d.prochainPokemon();
                p2 = adversaire.prochainPokemon();

                p1.attaquer(p2);

                if (p2.isKO()) {
                    finCombat = true;
                }
            }
            tour++;
        }

        if (finCombat) {
            d.prendreArgent(d);
        }
    }

    public void pokeCenter() {
        for (Pokemon p: this.tab) {
            p.soigner();
        }
    }
}
