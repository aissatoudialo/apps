package entity;
import java.util.Scanner;

public class Employe extends Personne{
    private String fonction;
    private int salaire;

    public Employe() {

    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void saisie() {
        super.saisie(); // Appel à la méthode saisie() de Personne
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la fonction : ");
        this.fonction = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        this.salaire = scanner.nextInt();
    }

    public void affiche() {
        System.out.println("Nom : " + getNom());
        System.out.println("Prénom : " + getPrenom());
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire);
    }
}
