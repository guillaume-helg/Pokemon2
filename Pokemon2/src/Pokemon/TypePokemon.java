package Pokemon;

import javax.lang.model.element.TypeElement;

public enum TypePokemon {
    FEU("Je suis type feu"),
    EAU("Je suis type eau"),
    PLANTE("Je suis type plante");

    private String name;

    private TypePokemon (String msg) {
        this.name = msg;
    }

    public String toString() {
        return this.name;
    }
}
