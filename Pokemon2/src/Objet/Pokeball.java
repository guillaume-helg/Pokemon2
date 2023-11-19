package Objet;

import Humain.Dresseur;
import Pokemon.Pokemon;

import java.util.Random;

import Pokemon.*;

public class Pokeball {

    private Dresseur d;

    public Pokeball(Dresseur d) {
        this.d = d;
    }

    public void capturerPokemons() {
        d.capturerPokemon();
    }
}

