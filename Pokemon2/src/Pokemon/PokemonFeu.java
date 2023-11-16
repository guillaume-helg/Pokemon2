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
            case TypePokemon.EAU, TypePokemon.PLANTE:
                this.setHp((int) (0.5*p.getAtk()));
                break;
            case TypePokemon.FEU:
                this.setHp(2 * p.getAtk());
                break;
            default:
                System.out.println("Bizarre bizarre");
                break;
        }
    }
}
