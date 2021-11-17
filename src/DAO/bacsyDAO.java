/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bacsy;
import model.benhnhan;

/**
 *
 * @author Admin
 */
public class bacsyDAO {
    Connection conn = null;
    PreparedStatement stm = null;
      
    public List<bacsy>  getAlldatabacsy() {
      List<bacsy> listUser = new ArrayList<>();
        Statement stmm = null;
        ResultSet rs = null;
        try {
            String SQL = "select*from bacsy";
            conn = DAO.databaseconnection.getDBConnection();
            stmm = conn.createStatement();
            rs = stmm.executeQuery(SQL);
            while (rs.next()) {
                bacsy bs= new bacsy();
                bs.setTenbacsy(rs.getString(2));
                listUser.add(bs);
            }

        } catch (Exception e) {
            System.out.println("Lỗi kết nối o day: " + e.toString());
        }
       return listUser;
    }
}
