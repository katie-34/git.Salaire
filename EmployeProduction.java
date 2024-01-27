package Salaire;

public class EmployeProduction extends Employe {
    public int nbrUnite;
    public EmployeProduction(String nom , String fonction , int age, String anneeService , int unit) {
        super(nom,fonction,age,anneeService);
        nbrUnite = unit;
    }
    public int getNbrUnite(){
        return nbrUnite;
    }
    @Override
    public String getNom() {
        return " Le producteur ".concat(nom).concat(fonction);
    }
    @Override
    public double Calculsalaire(){
        salaire = this.getNbrUnite() * 5;
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
