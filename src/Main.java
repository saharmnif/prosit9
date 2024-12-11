public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList() {
            @Override
            public void trierEmployeParNomDépartementEtGrade() {

            }
        };

        // Création des employés
        Employe e1 = new Employe("Ali",1,  "Ahmed", "IT", 5);
        Employe e2 = new Employe( "Sami",2, "Mohamed", "RH", 4);
        Employe e3 = new Employe("Nada",3,  "Amina", "Finance", 3);

        // Ajout des employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Affichage
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("\nRecherche d'un employé nommé 'Sami' : " + societe.rechercherEmploye("Sami"));

        // Suppression d'un employé
        System.out.println("Suppression de Sami.");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        // Tri par ID
        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        DepartementHashSet departementHashSet = new DepartementHashSet();
        Departement dep1 = new Departement(1,"info",12);
        Departement dep2 = new Departement(2,"RH",20);
        Departement dep3 = new Departement(1,"bi",32);
        Departement dep4 = new Departement(3,"Meca",2);

    

}
}

