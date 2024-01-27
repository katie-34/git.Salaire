package Salaire;

public class EmployeVente extends Employe {
    public double chiffAffaire;
    public EmployeVente(String nom , String fonction , int age , String anneeService , double ch){
        super(nom,fonction,age,anneeService);
        chiffAffaire = ch;
    }

    public double getChiffAffaire() {
        return chiffAffaire;
    }
    @Override
    public String getNom() {
        return " Le vendeur ".concat(nom).concat(fonction);
    }
    @Override
    public double Calculsalaire(){
        salaire = (20 * this.getChiffAffaire() / 100) + 400 ;
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
