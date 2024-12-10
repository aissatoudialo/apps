package implement;

import entity.Article;
import service.IArticle;

import java.util.Scanner;

public class ArticleImpl  implements IArticle {

    public Article saisie() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir L'ID :");
        int Id=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Saisir  le Libelle :");
        String lib=scanner.nextLine();
        return new Article(Id,lib);
    }
    public void afficher(Article a) {
        System.out.println("ID : " + a.getId());
        System.out.println("Libelle : " + a.getLib());
    }
}
