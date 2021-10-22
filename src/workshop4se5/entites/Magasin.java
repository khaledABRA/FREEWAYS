/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.entites;

/**
 *
 * @author moham
 */
public class Magasin {
    
    String ref_magasin;
    private int id_article;
    String nom_magasin;


    public Magasin() {
    }

    public Magasin(String ref_magasin, int id_article,String nom_magasin) {
        this.ref_magasin = ref_magasin;
        this.id_article=id_article;
        this.nom_magasin = nom_magasin;
        
        
    }

    

    
    
    
    
    
  

    @Override
    public String toString() {
        return "Magasin{" + "ref_magasin=" + getRef_magasin() + ", nom_magasin=" + getNom_magasin() + ", id_article = " +getId_article()+"}\n";
    }

    /**
     * @return the ref_magasin
     */
    public String getRef_magasin() {
        return ref_magasin;
    }

    /**
     * @param ref_magasin the ref_magasin to set
     */
    public void setRef_magasin(String ref_magasin) {
        this.ref_magasin = ref_magasin;
    }

    /**
     * @return the nom_magasin
     */
    public String getNom_magasin() {
        return nom_magasin;
    }

    /**
     * @param nom_magasin the nom_magasin to set
     */
    public void setNom_magasin(String nom_magasin) {
        this.nom_magasin = nom_magasin;
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

    

    

    

    

   

   
   

    
    
    
}
