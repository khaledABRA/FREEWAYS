/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.entites;

/**
 *
 * @author khaled
 */
public class Article {
    
    private String ref_article ,nom_article,taille;
    private int disponibilite;
    private int id_article,stock;
    private float prix;
    
    public Article(){}
    public Article(String ref_article,String nom_article,String taille,int disponibilite,int stock ,float prix){
    
        this.ref_article=ref_article;
        this.nom_article=nom_article;
        this.taille=taille;
        this.disponibilite=disponibilite;
        this.stock=stock;
        this.prix=prix;
    }
    
        public Article(int id_article,String ref_article,String nom_article,String taille,int disponibilite,int stock, float prix){
        this.id_article=id_article;
        this.ref_article=ref_article;
        this.nom_article=nom_article;
        this.taille=taille;
        this.disponibilite=disponibilite;
        this.stock=stock;
        this.prix=prix;
    }

    
    
    @Override
    public String toString() {
        return "ArticleMag{" + "id_article = "+this.getId_article()+", ref_article=" + getRef_article() + ", nom_article=" + getNom_article() + ", taille=" + getTaille() + ", disponibilite=" + getDisponibilite()+  ", stock=" + getStock()+ ", prix="+ getPrix()+ "}\n";
    }
    /**
     * @return the ref_article
     */
    public String getRef_article() {
        return ref_article;
    }

    /**
     * @param ref_article the ref_article to set
     */
    public void setRef_article(String ref_article) {
        this.ref_article = ref_article;
    }

    /**
     * @return the nom_article
     */
    public String getNom_article() {
        return nom_article;
    }

    /**
     * @param nom_article the nom_article to set
     */
    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    /**
     * @return the taille
     */
    public String getTaille() {
        return taille;
    }

    /**
     * @param taille the taille to set
     */
    public void setTaille(String taille) {
        this.taille = taille;
    }

    /**
     * @return the disponibilite
     */
    public int getDisponibilite() {
        return disponibilite;
    }

    /**
     * @param disponibilite the disponibilite to set
     */
    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the id_article
     */
    public int getId_article() {
        return id_article;
    }

    /**
     * @param id_article the id_article to set
     */
    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    /**
     * @return the prix
     */
    public float getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }
    
     
    
}
