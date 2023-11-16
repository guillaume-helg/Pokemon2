package Pokemon;

public class PokemonEau extends Pokemon {
    public PokemonEau(String nom) {
        super(nom, TypePokemon.EAU);
    }

    @Override
    public void attaquer(Pokemon p) {
        p.subir(this);
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
