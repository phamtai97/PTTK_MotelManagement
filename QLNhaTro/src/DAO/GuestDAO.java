/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GuestDTO;
import DTO.UserDTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taipham
 */
public class GuestDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public GuestDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }

    // Kiem tra tai khoan
    public boolean checkAccount(UserDTO user) {
        String sql = "select * from User_KhachTro where TenDangNhap='" + user.getUsername() + "' and MatKhau='" + user.getPassword() + "' and IsAdmin=1";
        
        //String sql = String.format("select * from ", os)
        try {
            this._preparedStatement = this._dataProvider.getDataConnection().prepareStatement(sql);
            this._resultSet = this._preparedStatement.executeQuery();
            
            if (this._resultSet.next() == false) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //lay tat ca khach thue tro
    public ArrayList<GuestDTO> getAllGuest() {
        String mmsql = "select MaKhachTro, TenKhachTro, Phai, NgaySinh, QueQuan , CMND, DiaChiThuongTru, NgheNghiep, DienThoai, TinhTrang from KhachTro";
        ArrayList listGuest = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareStatement(mmsql);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                GuestDTO guest = new GuestDTO();
                guest.setGuestID(_resultSet.getString(1));
                guest.setGuestName(_resultSet.getString(2));
                guest.setSex(_resultSet.getString(3));
                guest.setDob(_resultSet.getDate(4));
                guest.setCountrySide(_resultSet.getString(5));
                guest.setNumberID(_resultSet.getString(6));
                guest.setPermanentAddress(_resultSet.getString(7));
                guest.setJob(_resultSet.getString(8));
                guest.setPhoneNumber(_resultSet.getString(9));
                guest.setStateGuest(_resultSet.getInt(10));
                listGuest.add(guest);
            }
            return listGuest;

        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //them khach thue tro
    public boolean insertGuest(GuestDTO guest) {
        String msql = "insert into KhachTro(MaKhachTro, TenKhachTro, Phai, NgaySinh, QueQuan , CMND, DiaChiThuongTru, NgheNghiep, DienThoai, TinhTrang)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareStatement(msql);

            _preparedStatement.setString(1, guest.getGuestID());
            _preparedStatement.setString(2, guest.getGuestName());
            _preparedStatement.setString(3, guest.getSex());
            _preparedStatement.setDate(4, new Date(guest.getDob().getTime()));
            _preparedStatement.setString(5, guest.getCountrySide());
            _preparedStatement.setString(6, guest.getNumberID());
            _preparedStatement.setString(7, guest.getPermanentAddress());
            _preparedStatement.setString(8, guest.getJob());
            _preparedStatement.setString(9, guest.getPhoneNumber());
            _preparedStatement.setInt(10, guest.getStateGuest());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //xoa khach tro
    public boolean deleteGuest(String guestName, int stateGuest) {
        String msql = "delete from KhachTro where MaKhachTro = ? and TinhTrang = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareStatement(msql);
            _preparedStatement.setString(1, guestName);
            _preparedStatement.setInt(2, stateGuest);
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //update khach tro
    public boolean updateGuest(GuestDTO guest) {
        String msql = "update KhachTro set TenKhachTro = ?, Phai = ?, NgaySinh = ?, QueQuan = ?, CMND = ?, DiaChiThuongTru = ?, NgheNghiep = ?, DienThoai = ?, TinhTrang = ? where MaKhachTro = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, guest.getGuestName());
            _preparedStatement.setString(2, guest.getSex());
            _preparedStatement.setDate(3, new Date(guest.getDob().getTime()));
            _preparedStatement.setString(4, guest.getCountrySide());
            _preparedStatement.setString(5, guest.getNumberID());
            _preparedStatement.setString(6, guest.getPermanentAddress());
            _preparedStatement.setString(7, guest.getJob());
            _preparedStatement.setString(8, guest.getPhoneNumber());
            _preparedStatement.setInt(9, guest.getStateGuest());
            _preparedStatement.setString(10, guest.getGuestID());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //tim kiem khach tro theo 
    public ArrayList<GuestDTO> findGuestBy(String type, String input) {
        String msql = "select * from KhachTro where " + type + " = ?";
        ArrayList listGuest = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, input);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                GuestDTO guest = new GuestDTO();
                guest.setGuestID(_resultSet.getString(1));
                guest.setGuestName(_resultSet.getString(2));
                guest.setSex(_resultSet.getString(3));
                guest.setDob(_resultSet.getDate(4));
                guest.setCountrySide(_resultSet.getString(5));
                guest.setNumberID(_resultSet.getString(6));
                guest.setPermanentAddress(_resultSet.getString(7));
                guest.setJob(_resultSet.getString(8));
                guest.setPhoneNumber(_resultSet.getString(9));
                guest.setStateGuest(_resultSet.getInt(10));
                listGuest.add(guest);
            }
            return listGuest;
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //tìm kiem khach tro theo tẻn
    public ArrayList<GuestDTO> findGuestBYName(String guestName) {
        String msql = "select* from KhachTro where TenKhachTro like N'%" + guestName + "%'";
        ArrayList<GuestDTO> listGuest = new ArrayList<>();
        PreparedStatement ps;
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                GuestDTO guest = new GuestDTO();
                guest.setGuestID(_resultSet.getString(1));
                guest.setGuestName(_resultSet.getString(2));
                guest.setSex(_resultSet.getString(3));
                guest.setDob(_resultSet.getDate(4));
                guest.setCountrySide(_resultSet.getString(5));
                guest.setNumberID(_resultSet.getString(6));
                guest.setPermanentAddress(_resultSet.getString(7));
                guest.setJob(_resultSet.getString(8));
                guest.setPhoneNumber(_resultSet.getString(9));
                guest.setStateGuest(_resultSet.getInt(10));
                listGuest.add(guest);
            }
            return listGuest;
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //update state guset
    public boolean updateStateGuest(String gusetID) {
        String msql = "update KhachTro set TinhTrang = ? where MaKhachTro = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setInt(1, 1);
            _preparedStatement.setString(2, gusetID);
            return _preparedStatement.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
