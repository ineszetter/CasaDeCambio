/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Beans.Divisa;
import DataAdapters.tblDivisa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SceneDivisasController implements Initializable {

    tblDivisa tbldivisa = new tblDivisa();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Divisa> tvDivisas;

    @FXML
    private TableColumn<Divisa, String> colNombre;

//    @FXML
//    private TableColumn<Divisa, Double> colValor;
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtValor;

    @FXML
    void initialize() {
        assert tvDivisas != null : "fx:id=\"tvDivisas\" was not injected: check your FXML file 'sceneDivisas.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'sceneDivisas.fxml'.";
        assert txtValor != null : "fx:id=\"txtValor\" was not injected: check your FXML file 'sceneDivisas.fxml'.";
        assert colNombre != null : "fx:id=\"colNombre\" was not injected: check your FXML file 'sceneDivisas.fxml'.";

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        cargarTablaDivisas();
    }

    private void cargarTablaDivisas() {
        tvDivisas.getItems().clear();
        tvDivisas.getColumns().clear();
        ObservableList<Divisa> data = FXCollections.observableArrayList(tbldivisa.Select());
        tvDivisas.getColumns().addAll(colNombre);
        tvDivisas.setItems(data);

    }

}
