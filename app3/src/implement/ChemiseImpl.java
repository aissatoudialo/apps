package implement;

import entity.Article;
import entity.Chemise;
import service.IChemise;

import java.util.Scanner;

public class ChemiseImpl implements IChemise {

    public Chemise saisie() {
        ArticleImpl AI= new ArticleImpl();
        Article A = AI.saisie();

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir  la Couture :");
        String couture = scanner.nextLine();

        return new Chemise(A.getId(), A.getLib(), couture);
    }

    @Override
    public void afficher(Chemise c) {
        System.out.println("ID : " + c.getId());
        System.out.println("Libellé : " + c.getLib());
        System.out.println("Couture : " + c.getCouture());
    }
}
