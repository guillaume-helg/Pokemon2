package Humain;

public enum Equipe {
    SAGESSE("Sagesse"),
    BRAVOURE("Bravoure"),
    INTUITION("Intuition");

    private String name;

    private Equipe(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

}
