/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;

/**
 * FXML Controller class
 *
 * @author Proyectos
 */
public class SceneContenedorController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneAdministrar;

    @FXML
    void initialize() {
        assert paneAdministrar != null : "fx:id=\"paneAdministrar\" was not injected: check your FXML file 'sceneContenedor.fxml'.";

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        abrirSceneDivisas();
    }

    private void abrirSceneDivisas() {
        try {
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            Pane paneA = FXMLLoader.load(getClass().getResource("/Resources/Views/sceneDivisas.fxml"));
            paneA.setMinSize(screenBounds.getWidth() - 5, screenBounds.getHeight() - 50);
            paneAdministrar.getChildren().add(paneA);
        } catch (IOException ex) {

        }
    }

}
