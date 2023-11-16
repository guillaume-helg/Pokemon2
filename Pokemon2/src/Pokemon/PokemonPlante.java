package Pokemon;

public class PokemonPlante extends Pokemon {
    public PokemonPlante(String nom) {
        super(nom, TypePokemon.PLANTE);
    }

    @Override
    public void attaquer(Pokemon p) {
        this.subir(p);
        this.log(p.toString());
    }

    public void subir(Pokemon p) {
        switch (p.getType()) {
            case EAU, PLANTE:
                this.hp -= ((int) (0.5 * p.getAtk()));
                break;
            case FEU:
                this.hp -= (2 * p.getAtk());
                break;
            default:
                this.hp -= (p.getAtk());
                break;
        }
    }
}
