package org.example;

public class Main {
    public static void main(String[] args) {
        // Création de joueurs avec différents constructeurs
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur("Alice");
        Joueur joueur3 = new Joueur("Bob", 5, 50);

        // Utilisation des méthodes de la classe Joueur
        joueur1.validerQuete(30);
        joueur1.monterDeNiveau();

        joueur2.validerQuete(120);
        joueur2.monterDeNiveau();

        joueur3.validerQuete(60);
        joueur3.monterDeNiveau();
    }
}