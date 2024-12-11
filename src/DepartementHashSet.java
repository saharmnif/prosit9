import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<Departement> {

    HashSet<Departement> départements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement département) {
        départements.add(département);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return départements.contains(nom);
    }

    @Override
    public boolean rechercherDepartement(Departement département) {
        return départements.contains(département);
    }

    @Override
    public void supprimerDepartement(Departement département) {
        départements.remove(département);
    }

    @Override
    public void displayDepartement() {
        System.out.println("Hashset : " + départements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> DepartementById = new TreeSet<>();
        for (Departement dep : départements){
            DepartementById.add(dep);
        }
        return DepartementById;
    }

}