package test;


import entity.Chemise;
import entity.Montre;
import implement.ChemiseImpl;
import implement.MontreImpl;

public class Main {
    public static void main(String[] args) {

        ChemiseImpl chemise = new ChemiseImpl();

        MontreImpl montre = new MontreImpl();
        System.out.println(" Chemise : ");
        Chemise c = chemise.saisie();
        System.out.println(" l'affichage des informations de  chemise : ");
        chemise.afficher(c);

        System.out.println(" ");


        System.out.println(" Montre : ");
        Montre m = montre.saisie();
        System.out.println(" l'affichage des informations de la montre : ");
        montre.afficher(m);
    }
}