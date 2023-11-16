package Pokemon;

public class PokemonFeu extends Pokemon {
    public PokemonFeu(String nom) {
        super(nom, TypePokemon.FEU);
    }

    public void attaquer(Pokemon p) {
        this.subir(p);
        this.log(p.toString());
    }

    @Override
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
