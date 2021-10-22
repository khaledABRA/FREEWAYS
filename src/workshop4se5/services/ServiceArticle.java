/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.services;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import workshop4se5.entites.Article;
import workshop4se5.entites.Magasin;
import workshop4se5.utils.Myconnexion;

/**
 *
 * @author khaled
 */
public class ServiceArticle implements IService<Article>{
        Connection cnx;
    
    public ServiceArticle (){
        cnx = Myconnexion.getInstance().getCnx();
    
        }
     @Override
        public void ajouter(Article a) {
      
        Statement st;
        try {
            st = cnx.createStatement();
    String query = "INSERT INTO `article`(`ref_article`, `nom_article`, `taille`, `disponibilite`, `stock`,`prix`) VALUES ('"+a.getRef_article()+"','"+a.getNom_article()+"','"+a.getTaille()+"',"+a.getDisponibilite()+",'"+a.getStock()+"','"+a.getPrix()+"')";       
       
      
        st.executeUpdate(query);
        System.out.println("Article ajoute avec succes"); 
        
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        }
        
        
         
       @Override
    public List<Article> afficher() throws SQLException {
    Statement stm = cnx.createStatement();
    List<Article> la = new ArrayList<>();
    
    String query = "SELECT * FROM article";
        ResultSet rs= stm.executeQuery(query);
        while (rs.next()){
            Article a = new Article();
            a.setId_article(rs.getInt("id_article"));
            a.setRef_article(rs.getString("ref_article"));
            a.setNom_article(rs.getString("nom_article"));
            a.setTaille(rs.getString("taille"));
            a.setDisponibilite(rs.getInt("disponibilite"));
            a.setStock(rs.getInt("stock"));
            a.setPrix(rs.getFloat("prix"));
            
            
        la.add(a);
        }
            return la;
            
            
    }
    
    
    @Override
    public void modifier(int id_article, Article articleModifier)  {
        
        try {
            Statement stm = cnx.createStatement();
        Article article=SearchById(id_article);
        
       
        String query = "UPDATE `article` SET `ref_article`='"+articleModifier.getRef_article()+"',`nom_article`='"+articleModifier.getNom_article()+"',`taille`='"+articleModifier.getTaille()+"',`disponibilite`='"+articleModifier.getDisponibilite()+"',`stock`='"+articleModifier.getStock()+"',`prix`='"+articleModifier.getPrix()+"' where id_article="+article.getId_article();
       
        stm.executeUpdate(query);
            
        System.out.println("Article modifie avec succes"); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
      public Article searchByReference(String ref_article) throws SQLException{
         Statement stm = cnx.createStatement();
        Article article =new Article();
        String query = "SELECT * FROM article WHERE `ref_article`='"+ref_article+"'";
         
        ResultSet rs= stm.executeQuery(query);
          
        while (rs.next()){
            
            article.setId_article(rs.getInt("id_article"));
            article.setRef_article(rs.getString("ref_article"));
            article.setNom_article(rs.getString("nom_article"));
            article.setTaille(rs.getString("taille"));
            article.setDisponibilite(rs.getInt("disponibilite"));
            article.setStock(rs.getInt("stock"));
            article.setPrix(rs.getFloat("prix"));
            
            
        }
        return article;
    }
      
      public Article SearchById(int id_article) throws SQLException{
        Statement stm = cnx.createStatement();
        Article article =new Article();
        String query = "SELECT * FROM article WHERE id_article = "+id_article;
        ResultSet rs= stm.executeQuery(query);
          
        while (rs.next()){
            
            article.setId_article(rs.getInt("id_article"));
            article.setRef_article(rs.getString("ref_article"));
            article.setNom_article(rs.getString("nom_article"));
            article.setTaille(rs.getString("taille"));
            article.setDisponibilite(rs.getInt("disponibilite"));
            article.setStock(rs.getInt("stock"));
            article.setPrix(rs.getFloat("prix"));
            
        }
        return article;
    }
      
      

    

    

    @Override
    public void supprimer(Article t) throws SQLException {
        Statement st=cnx.createStatement();
        String sql = "DELETE FROM `article` WHERE `id_article`="+t.getId_article();
        st.executeUpdate(sql);
        System.out.println("Article Supprime avec succes");
    }

    public void archiver(Article t)throws SQLException {
        Statement st=cnx.createStatement();
        String query = "INSERT INTO `archive`(`id_article`,`ref_article`, `nom_article`, `taille`, `disponibilite`, `stock`,`prix`) VALUES ('"+t.getId_article()+"','"+t.getRef_article()+"','"+t.getNom_article()+"','"+t.getTaille()+"',"+t.getDisponibilite()+",'"+t.getStock()+"','"+t.getPrix()+"')";
        st.executeUpdate(query);
        
        String query2 ="DELETE FROM `article` WHERE `id_article`="+t.getId_article();
        st.executeUpdate(query2);
       
    }  
    
    public void desarchiver(Article t)throws SQLException{
        Statement st=cnx.createStatement();
        String query = "INSERT INTO `article`(`id_article`,`ref_article`, `nom_article`, `taille`, `disponibilite`, `stock`, `prix`) VALUES ('"+t.getId_article()+"','"+t.getRef_article()+"','"+t.getNom_article()+"','"+t.getTaille()+"',"+t.getDisponibilite()+",'"+t.getStock()+"','"+t.getPrix()+"')";
        st.executeUpdate(query);
        
        String query2 ="DELETE FROM `archive` WHERE `id_article`="+t.getId_article();
        st.executeUpdate(query2);
    }
        
    
    }
