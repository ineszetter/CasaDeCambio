/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Proyectos
 */
public class Divisa {

    private final StringProperty nombre;
//    private DoubleProperty valor;

    //Constructor con propiedades
    public Divisa(String nombre) {
        this.nombre = new SimpleStringProperty(nombre);
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

//    public void setValor(double Valor) {
//        valor = Valor;
//    }
//
//    public double getValor() {
//        return valor;
//    }
}
