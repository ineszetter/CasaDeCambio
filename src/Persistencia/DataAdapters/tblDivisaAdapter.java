/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.DataAdapters;

import Beans.Divisa;
import Persistencia.JDBCMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Proyectos
 */
public class tblDivisaAdapter {

    JDBCMySQL con = new JDBCMySQL();
    Connection c = con.conectar();

    /**
     * Select general para el catálogo de divisas
     *
     * @return List tipo Divisa
     */
    public List<Divisa> Select() {
        List<Divisa> lsDivisa = new ArrayList<Divisa>();

        try {
            PreparedStatement verificarStmt
                    = c.prepareStatement(" SELECT                  "
                            + "   ID                               "
                            + "   ,nombre                          "
                            + "   ,valor                           "
                            + " FROM catdivisa                     ");

            ResultSet rs = verificarStmt.executeQuery();

            while (rs.next()) {
                Divisa divisa = new Divisa(rs.getString("nombre"), rs.getDouble("valor"), rs.getInt("ID"));
                lsDivisa.add(divisa);
            }

            return lsDivisa;

        } catch (SQLException e) {
            Logger.getLogger(tblDivisaAdapter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }
        return null;
    }

    /**
     * Inserta un nuevo registro de divisa
     *
     * @param divisa
     */
    public void Insert(Divisa divisa) {
        try {

            PreparedStatement insert
                    = c.prepareStatement(" INSERT INTO catdivisa    "
                            + "   (nombre                           "
                            + "   ,valor)                           "
                            + "   VALUES (?,?) ");

            insert.setString(1, divisa.getNombre());
            insert.setDouble(2, divisa.getValor());

            insert.execute();

        } catch (SQLException e) {
            Logger.getLogger(tblDivisaAdapter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }

    }

    /**
     * Actualiza un registro de divisa
     *
     * @param divisa
     */
    public void Update(Divisa divisa) {
        try {

            PreparedStatement update
                    = c.prepareStatement(" UPDATE catdivisa    "
                            + "   SET nombre = ?               "
                            + "   ,valor = ?                   "
                            + "   WHERE ID = ?                 ");

            update.setString(1, divisa.getNombre());
            update.setDouble(2, divisa.getValor());
            update.setInt(3, divisa.getID());

            update.execute();

        } catch (SQLException e) {
            Logger.getLogger(tblDivisaAdapter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }
    }

    /**
     * Borra un registro de divisa
     *
     * @param divisa
     */
    public void Delete(Divisa divisa) {
        try {

            PreparedStatement update
                    = c.prepareStatement(" DELETE FROM catdivisa    "
                            + "   WHERE ID = ?                      ");

            update.setInt(1, divisa.getID());

            update.execute();

        } catch (SQLException e) {
            Logger.getLogger(tblDivisaAdapter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }
    }

}
