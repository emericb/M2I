public class Salarie {
    private final String nom;
    private int salaire;

    private static int totalEmployes = 0;
    private static int salaireTotal = 0;

    public Salarie(String matricule, String service, String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
        totalEmployes++;
        salaireTotal += salaire;
    }

    public void afficherSalaire() {
        System.out.println("Le salaire de " + this.nom + " est de " + this.salaire + " euros.");
    }

    public void getTotalEmployes() {
        System.out.println("Le montant total des salaires des " + totalEmployes + "employés est de " + this.salaire + ".");
    }

    public static int getSalaireTotal() {
        return salaireTotal;
    }

    public static void resetTotalEmployes() {
        totalEmployes = 0;
        System.out.println("Le nombre total d'employés a été réinitialisé.");
    }
}