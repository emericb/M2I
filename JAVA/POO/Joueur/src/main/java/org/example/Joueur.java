package org.example;

public class Joueur {

    private String nom = "";
    private int niveau = 0;
    private int experience = 0;
    private static int nombreTotalJoueurs = 0;

    // Constructeur vide
    public Joueur() {
        this("");
    }

    // Constructeur avec le nom
    public Joueur(String nom) {
        this(nom, 0, 0);
    }

    // Constructeur avec nom, niveau et experience
    public Joueur(String nom, int niveau, int experience) {
        this.nom = nom;
        this.niveau = niveau;
        this.experience = experience;
        nombreTotalJoueurs++;
    }

    public void validerQuete(int experience) {
        this.experience += experience;
        System.out.println("Quête validée pour " + experience + " points d'expérience !");
    }

    public void monterDeNiveau() {
        if (this.experience >= 100) {
            this.niveau++;
            this.experience = 0;
            System.out.println("Bravo " + this.nom + " tu es passé au niveau " + this.niveau + " !");
        } else {
            System.out.println("Désolé " + this.nom + " tu n'as pas assez d'expérience pour monter de niveau !");
        }
    }
}