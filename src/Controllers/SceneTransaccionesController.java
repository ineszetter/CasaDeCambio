/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Proyectos
 */
public class SceneTransaccionesController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPrimeraCantidad;

    @FXML
    private ComboBox<?> cmbPrimeraDivisa;

    @FXML
    private TextField txtSegundaCantidad;

    @FXML
    private ComboBox<?> cmbSegundaDivisa;

    @FXML
    private ComboBox<?> cmbTipoOperacion;

    @FXML
    private Button btnRegistrarOperacion;

    @FXML
    void btnRegistrarOperacionActionPerformed(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtPrimeraCantidad != null : "fx:id=\"txtPrimeraCantidad\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";
        assert cmbPrimeraDivisa != null : "fx:id=\"cmbPrimeraDivisa\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";
        assert txtSegundaCantidad != null : "fx:id=\"txtSegundaCantidad\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";
        assert cmbSegundaDivisa != null : "fx:id=\"cmbSegundaDivisa\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";
        assert cmbTipoOperacion != null : "fx:id=\"cmbTipoOperacion\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";
        assert btnRegistrarOperacion != null : "fx:id=\"btnRegistrarOperacion\" was not injected: check your FXML file 'sceneTransacciones.fxml'.";

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
