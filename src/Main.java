public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();

        Employe e1 = new Employe("1", "Ahmed");
        Employe e2 = new Employe("2", "Ali");
        Employe e3 = new Employe("3", "Aziz");

        // Création des départements
        Departement d1 = new Departement("IT");
        Departement d2 = new Departement("HR");

        // Ajout d'employés aux départements
        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);
        affectation.ajouterEmployeDepartement(e3, d1);

        // Affichage initial
        System.out.println("Liste initiale des affectations :");
        affectation.afficherEmployesEtDepartements();

        // Ajouter le même employé à un autre département
        affectation.ajouterEmployeDepartement(e1, d2);
        System.out.println("\nAprès avoir réaffecté Ahmed :");
        affectation.afficherEmployesEtDepartements();

        // Supprimer un employé
        affectation.supprimerEmploye(e3);
        System.out.println("\nAprès avoir supprimé Aziz :");
        affectation.afficherEmployesEtDepartements();

        // Afficher employés et départements
        System.out.println("\nListe des employés :");
        affectation.afficherEmployes();

        System.out.println("\nListe des départements :");
        affectation.afficherDepartements();

        // Recherche
        System.out.println("\nAlice est dans la collection ? " + affectation.rechercherEmploye(e1));
        System.out.println("Le département IT existe ? " + affectation.rechercherDepartement(d1));

        // Trier et afficher
        System.out.println("\nAffectations triées :");
        affectation.trierMap().forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));
    }
}
