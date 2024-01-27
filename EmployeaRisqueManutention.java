package Salaire;

public class EmployeaRisqueManutention extends EmployeManutention implements PrimeRisque {
    public EmployeaRisqueManutention(String nom , String fonction , int age , String anneeService , int nt){
        super(nom,fonction,age,anneeService,nt);
    }

    @Override
    public String getNom() {
        return " Le manutentioneur a risque ".concat(nom.concat(fonction));
    }

    @Override
    public int getNbheurtravail() {
        return nbheurtravail;
    }

    public double CalculSalaireRisque() {
        salaire = this.getNbheurtravail() * 65 + Prime;
        return salaire;
    }

    @Override
    public void afficheSalaire() {
        super.afficheSalaire();
    }
    public String toString() {
        return getNom() + " gagne " + Calculsalaire() + " francs" ;
    }
}
