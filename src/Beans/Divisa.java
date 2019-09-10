/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Proyectos
 */
public class Divisa {

    private final StringProperty nombre;
    private DoubleProperty valor;
    private IntegerProperty id;

    //Constructor con propiedades
    public Divisa(String nombre, double valor, int id) {
        this.nombre = new SimpleStringProperty(nombre);
        this.valor = new SimpleDoubleProperty(valor);
        this.id = new SimpleIntegerProperty(id);
    }

    public Divisa(String nombre, double valor) {
        this.nombre = new SimpleStringProperty(nombre);
        this.valor = new SimpleDoubleProperty(valor);
    }

    public void setNombre(String Nombre) {
        this.nombre.set(Nombre);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public double getValor() {
        return valor.get();
    }

    public void setValor(double Valor) {
        this.valor.set(Valor);
    }

    public DoubleProperty valorProperty() {
        return valor;
    }

    public int getID() {
        return id.get();
    }

    public void setID(int ID) {
        this.id.set(ID);
    }

    public IntegerProperty IDProperty() {
        return id;
    }

}
