package implement;

import entity.Article;
import entity.Montre;
import service.IMontre;

import java.util.Scanner;

public class MontreImpl implements IMontre {
    public Montre saisie() {
        ArticleImpl AI=new ArticleImpl();
        Article A=AI.saisie();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir la nature :");
        String nature=scanner.nextLine();
        return new Montre(A.getId(),A.getLib(),nature);
    }

    @Override
    public void afficher(Montre m) {
        System.out.println("ID : " + m.getId());
        System.out.println("Libellé : " + m.getLib());
        System.out.println("Nature : " + m.getNature());
    }
}
