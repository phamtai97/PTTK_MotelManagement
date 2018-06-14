/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phantrongthuyen
 */
public class BillInfoDTO {
    String MaPhongTro;
    int GiaPhong;
    String MaLoaiPhong;
    String MaDichVu;
    String TenDichVu;
    int ChiSoCu;
    
    public BillInfoDTO() {
        this.MaPhongTro = "";
        this.GiaPhong = 2000000;
        this.MaLoaiPhong = "";
        this.MaDichVu = "";
        this.TenDichVu = "";
        this.ChiSoCu = 1;
    }
    public String getMaPhongTro() {
        return MaPhongTro;
    }

    public int getGiaPhong() {
        return GiaPhong;
    }

    public String getMaLoaiPhong() {
        return MaLoaiPhong;
    }

    public String getMaDichVu() {
        return MaDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public int getChiSoCu() {
        return ChiSoCu;
    }

    public void setMaPhongTro(String MaPhongTro) {
        this.MaPhongTro = MaPhongTro;
    }

    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public void setMaLoaiPhong(String MaLoaiPhong) {
        this.MaLoaiPhong = MaLoaiPhong;
    }

    public void setMaDichVu(String MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public void setChiSoCu(int ChiSoCu) {
        this.ChiSoCu = ChiSoCu;
    }
    
    
}
