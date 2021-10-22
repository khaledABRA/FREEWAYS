/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4se5.GUI.magasin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author khaled
 */
public class AfficherMagController implements Initializable {

    @FXML
    private Button btn_afficher;
    @FXML
    private Text txt_liste_mag;
    @FXML
    private Button quitter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void afficher_magasin(ActionEvent event) {
    }

    @FXML
    private void quitter(ActionEvent event) {
    }
    
    
}
