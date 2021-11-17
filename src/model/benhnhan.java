/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class benhnhan {

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * @return the gioitinh
     */
    public boolean isGioitinh() {
        return gioitinh;
    }

    /**
     * @param gioitinh the gioitinh to set
     */
    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    /**
     * @return the ngaysinh
     */
    public String getNgaysinh() {
        return ngaysinh;
    }

    /**
     * @param ngaysinh the ngaysinh to set
     */
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    /**
     * @return the mabn
     */
    public String getMabn() {
        return mabn;
    }

    /**
     * @param mabn the mabn to set
     */
    public void setMabn(String mabn) {
        this.mabn = mabn;
    }

    /**
     * @return the tennb
     */
    public String getTennb() {
        return tennb;
    }

    /**
     * @param tennb the tennb to set
     */
    public void setTennb(String tennb) {
        this.tennb = tennb;
    }
    private String mabn;
    private String tennb;
    private String diachi;
    private boolean gioitinh;
    private String ngaysinh;
    public String getgioitinh(){
        if(isGioitinh()==true){
            return "Nam";
        }
        else 
            return "Nữ";
    }
}
