package Salaire;

public class EmployeaRisqueProduction extends EmployeProduction implements PrimeRisque {
    public EmployeaRisqueProduction(String nom , String fonction , int age , String anneeService , int unit) {
        super(nom,fonction,age,anneeService,unit);
    }

    @Override
    public String getNom() {
        return " Le producteur a risque ".concat(nom.concat(fonction));
    }
    public int getNbrUnit(){
         return nbrUnite;
    }

    @Override
    public double Calculsalaire() {
        salaire = this.getNbrUnite() * 5 + Prime;
        return salaire;
    }

    @Override
    public void afficheSalaire() {
        super.afficheSalaire();
    }
    public String toString() {
        return getNom() + " gagne " + Calculsalaire() + " francs";
    }
}
