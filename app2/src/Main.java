import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        ProduitImpl pimpl = new ProduitImpl();

        Produit pro = pimpl.saisie();

        pimpl.afficher(pro);
    }
}