package Salaire;

public abstract class Employe {
    protected String nom , fonction;
    protected int age;
    protected String anneeService;
    protected double salaire;
  public Employe ( String nom , String fonction , int age , String anneeService){
      this.nom = nom;
      this.fonction = fonction;
      this.age = age;
      this.anneeService = anneeService;
  }
  public abstract double Calculsalaire ();
    public abstract String getNom();
    public void afficheSalaire() {
        System.out.println(this.Calculsalaire());
    }
    public String toString() {
        return " L'Employé " + getNom() + " gagne " + salaire + " francs";
    }

}
