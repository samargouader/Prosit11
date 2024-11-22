import java.util.*;


class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2 : Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    // Instruction 3 : Afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));
    }

    // Instruction 4 : Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Instruction 5 : Supprimer une association spécifique Employe-Département
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // Instruction 6 : Afficher la liste des employés
    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }

    // Instruction 7 : Afficher la liste des départements
    public void afficherDepartements() {
        affectations.values().stream().distinct().forEach(System.out::println);
    }

    // Instruction 8 : Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : Trier les affectations
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
