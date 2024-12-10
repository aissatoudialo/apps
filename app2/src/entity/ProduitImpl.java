package entity;

import service.IProduit;
import java.util.Scanner;

public class ProduitImpl implements IProduit {

    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la référence du produit : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé du produit : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la quantité du produit : ");
        double quantite = scanner.nextDouble();

        System.out.print("Entrez le prix du produit : ");
        int prix = scanner.nextInt();

        return new Produit(ref,lib,quantite,prix);
    }

    public void afficher(Produit pro) {
        System.out.println("Référence : " + pro.getRef() +
                ", Libellé : " + pro.getLib() +
                ", Quantité : " + pro.getQuantite() +
                ", Prix : " + pro.getPrix());
    }
}
