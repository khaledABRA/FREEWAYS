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

/**
 * FXML Controller class
 *
 * @author khaled
 */
public class MagasinController implements Initializable {

    @FXML
    private Button btn_afficher_mag;
    @FXML
    private Button btn_ajouter_mag;
    @FXML
    private Button btn_modifier_mag;
    @FXML
    private Button btn_supp_mag;
    @FXML
    private Button btn_quit_Menu;
    @FXML
    private Button btn_rech_mag;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void afficherMagasin(ActionEvent event) {
    }

    @FXML
    private void AjouterMagasin(ActionEvent event) {
    }

    @FXML
    private void modifierMagasin(ActionEvent event) {
    }

    @FXML
    private void supprimerMag(ActionEvent event) {
    }

    @FXML
    private void rechercheMag(ActionEvent event) {
    }

    @FXML
    private void quitter(ActionEvent event) {
        System.exit(0);
    }
    
}
