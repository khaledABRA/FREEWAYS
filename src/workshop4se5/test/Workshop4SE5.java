/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import workshop4se5.entites.Article;
import workshop4se5.entites.Magasin;
import workshop4se5.entites.Panier;
import workshop4se5.services.ServiceArticle;
import workshop4se5.services.ServiceMagasin;
import workshop4se5.services.ServicePanier;
import workshop4se5.utils.Myconnexion;


public class Workshop4SE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  
       Magasin p = new Magasin("1921 ",16,"CA_Story12");
        ServiceMagasin sp = new ServiceMagasin();
        //sp.ajouter(p);
        
        try {
            //affichage:
            System.out.println(sp.afficher());
           // sp.modifier("Mag223", p);
           //sp.supprimer(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
           
        }*/
        
        ServiceArticle sa = new ServiceArticle();
            ServicePanier span=new ServicePanier();
        
            
            Article article = new Article("147ACB", "PULL", "L", 1, 12, 32);
            
            
            
            //sa.ajouter(article);
            //sa.modifier(22, new Article("123ABC", "T-SHIRT", "L", 1, 12, 32));
           //span.AjouterAuPanier(new Panier("123ABC", 2, 1234));
           //span.SupprimerArticleDuPanier("123ABC");
           System.out.println(span.consulterPanierParClient(1234));
           
           
           /* try {
                //affichage:
                System.out.println(sa.afficher()); 
                //System.out.println(sa.searchByReference("khaled1234"));
                //System.out.println(sa.searchById("khaled12345"));
                //sa.archiver(article);
                //sa.desarchiver(article);
                //sa.supprimer(article);
                
        } catch (SQLException e) {
                System.out.println(e.getMessage());
        }*/
            
            
            
            
            
            
        
       
        
       
        
       /* 
        try {
            //System.out.println(sp.afficher());
            //System.out.println(sa.afficher());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       */
    }
    
}
