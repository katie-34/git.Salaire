package Salaire;

public class EmployeManutention extends Employe {
    public int nbheurtravail;
    public EmployeManutention(String nom , String fonction , int age , String anneeService , int nt) {
    super(nom,fonction,age,anneeService);
    nbheurtravail = nt;
}
 public int getNbheurtravail(){
    return nbheurtravail;
}
 @Override
public String getNom(){
     return " Le manutentioneur ".concat(nom).concat(fonction);
 }
 @Override
    public double Calculsalaire(){
        salaire = this.getNbheurtravail() * 65;
        return salaire;
 }
 @Override
    public void afficheSalaire(){
        super.afficheSalaire();
 }
 public String toString() {
        return getNom() + " gagne " + Calculsalaire() + " francs";
 }
}
