package entity;

public class Produit {
    private String ref;
    private String lib;
    private double quantite;
    private int prix;

    // Constructeur
    public Produit(String ref, String lib, double quantite, int prix) {
        this.ref = ref;
        this.lib = lib;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}