package Objet;

import Humain.Dresseur;
import Pokemon.Pokemon;

import Pokemon.*;

import java.util.ArrayList;
import java.util.Random;

public class SacADos {

    private Dresseur d;
    private ArrayList<Pokemon> tab;

    public SacADos(Dresseur dresseur) {
        this.d = dresseur;
        this.tab = new ArrayList<>();
    }



    public int getNbPokemon() {
        return this.tab.size();
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
        boolean ko;
        for (Pokemon p : this.tab) {
            if (p.isKO()) {
                ko = true;
            }
        }
        return this.d.getArgent() != 0 && !ko;
    }

    public void combattre(Dresseur adversaire) {

    }

    public void pokeCenter() {
        for (Pokemon p: this.tab) {
            p.soigner();
        }
    }
}
