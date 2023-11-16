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

    @Override
    public void subir(Pokemon p) {
        switch (p.getType()) {
            case EAU, PLANTE:
                this.setHp((int) (0.5*p.getAtk()));
                break;
            case FEU:
                this.setHp(2 * p.getAtk());
                break;
            default:
                System.out.println("Bizarre bizarre");
                break;
        }
    }
}
