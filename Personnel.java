package Salaire;
import java.util.*;
public class Personnel {
    double salaireMoyen;
    LinkedList<Employe> listeemploye = new LinkedList<>();
     public LinkedList<Employe> getListeemploye(){
        return listeemploye;
    }
    public void ajouterEmploye(Employe e) {
        listeemploye.add(e);
    }
    public void Calculsalaire() {
        for ( Employe e : listeemploye) {
            e.Calculsalaire();
        }
    }

   public void afficheSalaire(){
       for (Employe e : listeemploye){
          e.afficheSalaire();
       }
   }
   public int NombrEmploye(){
         return listeemploye.size();
   } // Retourne le nombre d'employé de la liste
   public double Somme() {  //Calcule la somme totale des salaires des employés de la liste
        double somme = 0;
        for (Employe e : listeemploye){
            somme = somme + e.Calculsalaire();
        }
        return somme;
    }
   public double salaireMoyen() {    // Retourne le salaire moyen de l'ensemble des employés de l'entreprise
       salaireMoyen = Somme()/ NombrEmploye();
       return salaireMoyen;
   }
}
