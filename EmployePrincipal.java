package Salaire;
import java.util.LinkedList;
public class EmployePrincipal {
    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new EmployeManutention("Jeanne", " Stocketout", 32,"1998",45));
        p.ajouterEmploye(new EmployeProduction("Jean", " Flippe", 28,"2000",1000));
        p.ajouterEmploye(new EmployeaRisqueProduction("Yves", " Bosseur", 28,"1998",1000));
        p.ajouterEmploye(new EmployeaRisqueManutention("Al", " Abordage",30,"2001",45));
        p.ajouterEmploye(new EmployeVente("Pierre"," Business",45, "1995",30000));
        p.ajouterEmploye(new EmployeRepresentation("Leon"," Vendtout" , 25,"2001",20000));
        LinkedList<Employe> liste = p.getListeemploye();
       for (Employe e : liste) {
            System.out.println(e);
        }
       System.out.println("Le nombre l'employés est " + p.NombrEmploye());
       p.afficheSalaire();
       System.out.println("La somme des salaires = " + p.Somme());
       System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");

    }
}
