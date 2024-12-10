import java.util.Scanner;
import entity.Etudiant;
import entity.Employe;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un étudiant
        System.out.println("Création d'un étudiant :");
        Etudiant etudiant = new Etudiant();
        etudiant.saisie();
        etudiant.affiche();

        System.out.println();

        // Création d'un employé
        System.out.println("Création d'un employé :");
        Employe employe = new Employe();
        employe.saisie();
        employe.affiche();

        scanner.close();
    }
}