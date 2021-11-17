package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.benhnhan;
import model.phieukham;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class benhnhanDAO {

    Connection conn = null;
  //  PreparedStatement stm = null;
    
    public List<benhnhan> getAlldatabenhnhan() {
        List<benhnhan> listUser = new ArrayList<>();
        Statement stmm = null;
        ResultSet rs = null;
        try {
            String SQL = "select*from benhnhan";
            conn = databaseconnection.getDBConnection();
            stmm = conn.createStatement();
            rs = stmm.executeQuery(SQL);
            while (rs.next()) {
                benhnhan sv = new benhnhan();
                sv.setMabn(rs.getString(1));
                sv.setTennb(rs.getString(2));
                sv.setDiachi(rs.getString(3));
                sv.setGioitinh(rs.getBoolean(4));
                sv.setNgaysinh(String.valueOf(rs.getDate(5)));
                
                listUser.add(sv);
            }
            
        } catch (Exception e) {
            System.out.println("Lỗi kết nối: " + e.toString());
        }
        return listUser;
    }

    public List<phieukham> getAlldatabenhnhanvachiphi(String tenbs) {
        List<phieukham> listUser = new ArrayList<>();
        Statement stmm = null;
        ResultSet rs = null;
        try {
            String SQL = "select bn.mabn,tenbn,pk.chiphi from benhnhan bn inner join phieukham pk on pk.mabn=bn.mabn\n"
                    + "inner join  bacsy bs on bs.mabacsy=pk.mabacsy where tenbacsy ='"+tenbs+"'";
            conn = DAO.databaseconnection.getDBConnection();
            stmm = conn.createStatement();
            rs = stmm.executeQuery(SQL);
            while (rs.next()) {
                phieukham pk = new phieukham();
                pk.setMabenhnhan(rs.getString(1));
                pk.setChiphi(rs.getFloat(3));
                pk.setTenbenhnhan(rs.getString(2));
                
                listUser.add(pk);
            }
            
        } catch (Exception e) {
            System.out.println("Lỗi kết nối: " + e.toString());
        }
        return listUser;
    }
}
