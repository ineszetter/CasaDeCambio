/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Proyectos
 */
public class TipoTransaccion {

    private final StringProperty nombre;
    private IntegerProperty id;

    //Constructor con propiedades
    public TipoTransaccion(String nombre, int id) {
        this.nombre = new SimpleStringProperty(nombre);
        this.id = new SimpleIntegerProperty(id);
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

    public double getID() {
        return id.get();
    }

    public void setID(int ID) {
        this.id.set(ID);
    }

    public IntegerProperty idProperty() {
        return id;
    }
}
