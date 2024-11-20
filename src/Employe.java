import java.util.Objects;

public class Employe {
    public int id;
    public String nom;
    public String prenom;
    public String nomdep;
    public int grade;

public Employe(){

}

    public Employe(String nomdep, int id, String nom, String prenom, int grade) {
        this.nomdep = nomdep;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomdep() {
        return nomdep;
    }

    public int getGrade() {
        return grade;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && grade == employe.grade && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom) && Objects.equals(nomdep, employe.nomdep);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomdep='" + nomdep + '\'' +
                ", grade=" + grade +
                '}';
    }
}
