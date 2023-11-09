public class PokemonPlante extends Pokemon  {
    public PokemonPlante(String nom) {
        super(nom, "Plante");
    }

    @Override
    public void attaquer(Pokemon p) {
        this.subir(p);
        this.log(p.toString());
    }

    @Override
    public void subir(Pokemon p) {

    }
}
