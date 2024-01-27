package Salaire;

public class EmployeRepresentation extends Employe {
    public double chiffAffaire ;
    public EmployeRepresentation(String nom , String fonction , int age ,String anneeService , double ch){
        super(nom,fonction,age,anneeService);
        chiffAffaire = ch;
    }
    public double getChiffAffaire() {
        return chiffAffaire;
    }
    public String getNom() {
        return "Le representant ".concat(nom).concat(fonction);
    }
    @Override
    public double Calculsalaire(){
        salaire = (20 * this.getChiffAffaire() / 100) + 800;
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
