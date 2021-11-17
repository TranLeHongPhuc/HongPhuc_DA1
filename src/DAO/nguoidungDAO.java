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
import model.nguoidung;
/**
 *
 * @author Admin
 */
public class nguoidungDAO {
    Connection conn = null;
    PreparedStatement stm = null;
    PreparedStatement stm1 = null;
    public List<nguoidung> getAlldata() {
        List<nguoidung> listUser = new ArrayList<>();
        Statement stmm = null;
        ResultSet rs = null;
        try {
            String SQL = "select*from nguoidung;";
            conn = DAO.databaseconnection.getDBConnection();
            stmm = conn.createStatement();
            rs = stmm.executeQuery(SQL);
            while (rs.next()) {
                nguoidung sv = new nguoidung();
                sv.setMand(rs.getString(1));
                sv.setTennd(rs.getString(2));
                sv.setMatkhau(rs.getString(3));
                sv.setVaitro(rs.getString(4));
                
                listUser.add(sv);
            }

        } catch (Exception e) {
            System.out.println("Lỗi kết nối: " + e.toString());
        }
       return listUser;
    }
}
