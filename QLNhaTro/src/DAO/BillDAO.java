/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.BillInfoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phantrongthuyen
 */
public class BillDAO {
    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public BillDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }
    
    public ArrayList<BillInfoDTO> LayThongTinThanhToanDichVu(String MaPhongTro) {
        ArrayList<BillInfoDTO> listBillInfo = new ArrayList();
        String sql = "select PhongTro.MaPhongTro, LoaiPhong.GiaPhong, "
                + "LoaiPhong.MaLoaiPhong, SuDungDichVu.MaDichVu, "
                + "DichVu.TenDichVu, SuDungDichVu.ChiSoCu\n" +
                "from PhongTro, LoaiPhong, SuDungDichVu, DichVu\n" +
                "where PhongTro.MaLoaiPhong=LoaiPhong.MaLoaiPhong "
                + "and PhongTro.MaPhongTro=SuDungDichVu.MaPhongTro " +
                "and SuDungDichVu.MaDichVu=DichVu.MaDichVu "
                + "and PhongTro.MaPhongTro='" + MaPhongTro+"'";
         try {
            this._preparedStatement = this._dataProvider.getDataConnection().prepareStatement(sql);
            this._resultSet = this._preparedStatement.executeQuery();
            
            while (this._resultSet.next()) {
                BillInfoDTO billInfo = new BillInfoDTO();
                billInfo.setMaPhongTro(this._resultSet.getString(1));
                billInfo.setGiaPhong(this._resultSet.getInt(2));
                billInfo.setMaLoaiPhong(this._resultSet.getString(3));
                billInfo.setMaDichVu(this._resultSet.getString(4));
                billInfo.setTenDichVu(this._resultSet.getString(5));
                billInfo.setChiSoCu(this._resultSet.getInt(6));
                listBillInfo.add(billInfo);
            }
            return listBillInfo;
         } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return null;
    }
}
