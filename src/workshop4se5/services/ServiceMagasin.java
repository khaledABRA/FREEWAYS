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
import java.util.logging.Level;
import java.util.logging.Logger;
import workshop4se5.entites.Magasin;
import workshop4se5.utils.Myconnexion;

/**
 *
 * @author moham
 */
public class ServiceMagasin implements IService<Magasin>{
    Connection cnx;
    
    public ServiceMagasin (){
        cnx = Myconnexion.getInstance().getCnx();
    }
    
    @Override
    public void ajouter(Magasin t) {
      
        Statement st;
        try {
            st = cnx.createStatement();
String query = "INSERT INTO `magasin`(`ref_magasin`, `id_article`, `nom_magasin`) VALUES ('"+t.getRef_magasin()+"','"+t.getId_article()+"','"+t.getNom_magasin()+"')";       
       
      
        st.executeUpdate(query);
        System.out.println("Magasin ajoute avec succes");       
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    
    }

    @Override
    public List<Magasin> afficher() throws SQLException {
    Statement stm = cnx.createStatement();
    List<Magasin> lp = new ArrayList<>();
    
    String query = "SELECT * FROM magasin";
        ResultSet rs= stm.executeQuery(query);
        while (rs.next()){
            Magasin p = new Magasin();
            
        p.setRef_magasin(rs.getString("ref_magasin"));
        p.setId_article(rs.getInt("id_article"));
        p.setNom_magasin(rs.getString("nom_magasin"));
        
        
        lp.add(p);
        }
            return lp;
    }
    
    
    
  public Magasin SearchById(String ref) throws SQLException{
        Statement stm = cnx.createStatement();
        Magasin magasin =new Magasin();
        String query = "select * from magasin where ref_magasin="+ref;
        ResultSet rs= stm.executeQuery(query);
        while (rs.next()){
            magasin.setRef_magasin(rs.getString("ref_magasin"));
            magasin.setId_article(rs.getInt("id_article"));
            magasin.setNom_magasin(rs.getString("nom_magasin"));
            
            
            
        }
        return magasin;
    }

    
    public void modifier(String ref,Magasin magModifier) throws SQLException {
        
        
        Statement stmt = cnx.createStatement();
       		      String query = "UPDATE `magasin` SET `ref_magasin`='"+magModifier.getRef_magasin()+"',`id_article`='"+magModifier.getId_article()+"',`nom_magasin`='"+magModifier.getNom_magasin()+"' where ref_magasin='"+ref+"'";
         //String sql = "UPDATE `magasin` SET `ref_magasin`="+magModifier.getRef_magasin()+",`id_article`=´"+magModifier.getId_article()+",`nom_magasin`="+magModifier.getNom_magasin()+" WHERE `ref_magasin=`"+ref+"";
         stmt.executeUpdate(query);
         
         System.out.println("magasin modifier avec succes");
        
    }

    @Override
    public void supprimer(Magasin mag) throws SQLException {
        Statement st = cnx.createStatement();
        String query = "delete from magasin where ref_magasin="+mag.getRef_magasin();
        st.executeUpdate(query);
        System.out.println("magasin supprime avec succes");
    }

    @Override
    public void modifier(int id, Magasin t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}



