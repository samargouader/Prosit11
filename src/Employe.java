import java.util.*;

class Employe implements Comparable<Employe> {
    private String id;
    private String nom;

    public Employe(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe{" + "id='" + id + '\'' + ", nom='" + nom + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return Objects.equals(id, employe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employe o) {
        return this.id.compareTo(o.id);
    }
}
