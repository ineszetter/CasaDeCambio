/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.DataAdapters;

import Beans.TipoTransaccion;
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
public class tbltipotransaccionAdapter {

    JDBCMySQL con = new JDBCMySQL();
    Connection c = con.conectar();

    /**
     * Select general para el catálogo de divisas
     *
     * @return List tipo Divisa
     */
    public List<TipoTransaccion> Select() {
        List<TipoTransaccion> lsTransaccion = new ArrayList<TipoTransaccion>();

        try {
            PreparedStatement verificarStmt
                    = c.prepareStatement(" SELECT                  "
                            + "   nombre                           "
                            + "   ,id                              "
                            + " FROM tbltipotransaccion            ");

            ResultSet rs = verificarStmt.executeQuery();

            while (rs.next()) {
                TipoTransaccion transaccion = new TipoTransaccion(rs.getString("nombre"), rs.getInt("id"));
                lsTransaccion.add(transaccion);
            }

            return lsTransaccion;

        } catch (SQLException e) {
            Logger.getLogger(tbltipotransaccionAdapter.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }
        return null;
    }

}
