package org.example;

public class Chaise {
    private int nombreDePieds;
    private String materiau;
    private String couleur;

    public Chaise() {
        this.nombreDePieds = 4;
        this.materiau = "Bois";
        this.couleur = "Naturel";
    }

    public Chaise(int nombreDePieds, String materiau, String couleur) {
        this.nombreDePieds = nombreDePieds;
        this.materiau = materiau;
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Je suis une chaise, " +
                "avec " + nombreDePieds + " pieds " +
                "en " + materiau +
                " et de couleur " + couleur + '\'';
    }

    public static void main(String[] args) {
        Chaise chaise1 = new Chaise();
        Chaise chaise2 = new Chaise(3, "Métal", "gris");

        System.out.println(chaise1);
        System.out.println(chaise2);
    }
}