/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAdapters;

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
public class tblDivisa {

    JDBCMySQL con = new JDBCMySQL();
    Connection c = con.conectar();
    List<Divisa> rsDivisa = new ArrayList<Divisa>();

    int i = 0;

    public List<Divisa> Select() {

        try {
            PreparedStatement verificarStmt
                    = c.prepareStatement(" SELECT                  "
                            + "   nombre                          "
                            //                            + "   valor                            "
                            + " FROM catdivisa                     ");

            ResultSet rs = verificarStmt.executeQuery();
            while (rs.next()) {
//                Divisa divisa = new Divisa(rs.getString("nombre"), rs.getDouble("valor"));
                Divisa divisa = new Divisa(rs.getString("nombre"));
                rsDivisa.add(divisa);
            }

            return rsDivisa;

        } catch (SQLException e) {
            Logger.getLogger(tblDivisa.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            con.desconectar();
        }
        return null;
    }

}
