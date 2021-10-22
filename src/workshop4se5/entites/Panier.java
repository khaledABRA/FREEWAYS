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
public class Panier {

    private int id_panier;
    private String ref_article;
    private int qte_article;
    private int cin_client;

   

    public Panier() {
    }

    public Panier(String ref_article, int qte_article, int cin_client) {
        this.ref_article = ref_article;
        this.qte_article = qte_article;
        this.cin_client = cin_client;
    }

    public Panier(int id_panier, String ref_article, int qte_article, int cin_client) {
        this.id_panier = id_panier;
        this.ref_article = ref_article;
        this.qte_article = qte_article;
        this.cin_client = cin_client;
    }

    /**
     * @return the id_panier
     */
    public int getId_panier() {
        return id_panier;
    }

    /**
     * @param id_panier the id_panier to set
     */
    public void setId_panier(int id_panier) {
        this.id_panier = id_panier;
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
     * @return the qte_article
     */
    public int getQte_article() {
        return qte_article;
    }

    /**
     * @param qte_article the qte_article to set
     */
    public void setQte_article(int qte_article) {
        this.qte_article = qte_article;
    }

    /**
     * @return the cin_client
     */
    public int getCin_client() {
        return cin_client;
    }

    /**
     * @param cin_client the cin_client to set
     */
    public void setCin_client(int cin_client) {
        this.cin_client = cin_client;
    }

     @Override
    public String toString() {
        return "Panier{" + "id_panier=" + id_panier + ", ref_article=" + ref_article + ", qte_article=" + qte_article + ", cin_client=" + cin_client + '}';
    }
}
