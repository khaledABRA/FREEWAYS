/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.services;

import static java.awt.Event.INSERT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import workshop4se5.entites.Article;
import workshop4se5.entites.Panier;
import workshop4se5.utils.Myconnexion;

/**
 *
 * @author khaled
 */
public class ServicePanier {

    Connection cn;
    Statement st;

    public ServicePanier() {

        cn = Myconnexion.getInstance().getCnx();

    }

    public void AjouterAuPanier(Panier panier) {
        try {
            st = cn.createStatement();
            String Query = " INSERT INTO `panier`( `ref_article`, `qte_article`, `cin_client`) VALUES ('" + panier.getRef_article() + "','" + panier.getQte_article() + "','" + panier.getCin_client() + "')";
            st.executeUpdate(Query);
            System.out.println("element ajoute au panier");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void SupprimerArticleDuPanier(String ref_article) {
        try {
            st = cn.createStatement();
            String Query = "DELETE  FROM `panier` WHERE `ref_article` = '" + ref_article + "'";
            st.executeUpdate(Query);

            System.out.println("article retirer de la panier");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<String> consulterPanierParClient(int cin_client) {
        ServiceArticle sa = new ServiceArticle();
        Article article = new Article();
       List<String> monPanier= new ArrayList<String>();
        try {
             st=cn.createStatement();
             
             String Query="SELECT * FROM `panier` WHERE `cin_client`="+cin_client;
             
             ResultSet rs =st.executeQuery(Query);
             
             while(rs.next()){
                 Panier panier = new Panier();
                 panier.setId_panier(rs.getInt("id_panier"));
                 panier.setRef_article(rs.getString("ref_article"));
                 article=sa.searchByReference(panier.getRef_article());
                 panier.setQte_article(rs.getInt("qte_article"));
                 panier.setCin_client(rs.getInt("cin_client"));
                 monPanier.add("Ref_article : "+panier.getRef_article()+" , Qte : "+panier.getQte_article() +" , Prix : "+ article.getPrix()*panier.getQte_article());
             }
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      
       
       
        
        return monPanier;
    }

}
