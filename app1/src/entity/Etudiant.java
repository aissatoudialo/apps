package entity;

import java.util.Scanner;

public class Etudiant extends  Personne{
    private String matricule;
    private double moyenne;
    public static int nbEtudiant = 0;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom,  double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = generateMat();
        nbEtudiant++;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private  String generateMat(){
        String nom = getNom();
        String prenom = getPrenom();
        String mat = "Mat-" + nom.charAt(0) + prenom.charAt(0) + nbEtudiant;
        return mat.toUpperCase();
    }

    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" saisir la moyenne  (0 a 20) :");
        this.moyenne = scanner.nextDouble();

        this.matricule = generateMat();
    }
    public void affiche() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + getNom());
        System.out.println("Prénom : " + getPrenom());
        System.out.println("Moyenne : " + moyenne);


    }
}
