import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employe,Departement> affectation = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectation.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        Set<Map.Entry<Employe,Departement>> entrySet = affectation.entrySet();
        System.out.println("liste :"+entrySet);
    }
    public void supprimerEmploye (Employe e){
        affectation.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        affectation.remove(e);
    }
    public void afficherEmployes(){
        Set<Employe> KeySet = affectation.keySet();
        System.out.println("liste des employés:"+KeySet);
    }
    public void afficherDepartements(){
        System.out.println("liste des départements:"+affectation.values());
    }
    public boolean rechercherEmploye (Employe e){
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe, Departement> treeMap = new TreeMap<>();
        for(Map.Entry<Employe, Departement> entry : affectation.entrySet()){
            treeMap.put(entry.getKey(), entry.getValue());
        }
        return treeMap;
    }

}

