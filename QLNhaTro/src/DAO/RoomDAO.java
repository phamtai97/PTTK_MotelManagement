/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.RoomDTO;
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
public class RoomDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public RoomDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }

    //lay danh sach phong tro
    public ArrayList<RoomDTO> getAllRoom() {
        String msql = "select MaPhongTro, TinhTrangPhong, SoNguoi, PhongTro.MaLoaiPhong from PhongTro, LoaiPhong where PhongTro.MaLoaiPhong = LoaiPhong.MaLoaiPhong";
        ArrayList<RoomDTO> listRoom = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                RoomDTO room = new RoomDTO();
                room.setRoomID(_resultSet.getString(1));
                room.setRoomState(_resultSet.getInt(2));
                room.setQuanityOfGuest(_resultSet.getInt(3));
                room.setRoomTypeID(_resultSet.getString(4));
                listRoom.add(room);
            }
            return listRoom;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //them phong tro
    public boolean insertRoom(RoomDTO room) {
        String mysql = "insert into PhongTro(MaPhongTro, TinhTrangPhong, SoNguoi, MaLoaiPhong) values (?, ?, ?, ?)";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(mysql);
            _preparedStatement.setString(1, room.getRoomID());
            _preparedStatement.setInt(2, room.getRoomState());
            _preparedStatement.setInt(3, room.getQuanityOfGuest());
            _preparedStatement.setString(4, room.getRoomTypeID());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //xoa phobg tro
    //chua lam
    public boolean deleteRoom(String roomID) {
        return false;
    }

    //chinh sua phopng tro
    public boolean updateRoom(RoomDTO room) {
        String msql = "update PhongTro set TinhTrangPhong = ?, SoNguoi = ?, MaLoaiPhong = ? where MaPhongTro = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setInt(1, room.getRoomState());
            _preparedStatement.setInt(2, room.getQuanityOfGuest());
            _preparedStatement.setString(3, room.getRoomTypeID());
            _preparedStatement.setString(4, room.getRoomID());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //tim kiem phong
    public ArrayList<RoomDTO> findRoomBy(String type, String input) {
        String msql = "select * from PhongTro where " + type + " = ?";
        ArrayList<RoomDTO> listRoom = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, input);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                RoomDTO room = new RoomDTO();
                room.setRoomID(_resultSet.getString(1));
                room.setRoomState(_resultSet.getInt(2));
                room.setQuanityOfGuest(_resultSet.getInt(3));
                room.setRoomTypeID(_resultSet.getString(4));
                listRoom.add(room);
            }
            return listRoom;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //tim kiem pjong theo loại phòng 
    public ArrayList<RoomDTO> findRoomByTypeRoom(String typeRoom) {
        String msql = "select MaPhongTro, TinhTrangPhong, SoNguoi, PhongTro.MaLoaiPhong from PhongTro, LoaiPhong where PhongTro.MaLoaiPhong = LoaiPhong.MaLoaiPhong and LoaiPhong.LoaiPhong = ?";
        ArrayList<RoomDTO> listRoom = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, typeRoom);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                RoomDTO room = new RoomDTO();
                room.setRoomID(_resultSet.getString(1));
                room.setRoomState(_resultSet.getInt(2));
                room.setQuanityOfGuest(_resultSet.getInt(3));
                room.setRoomTypeID(_resultSet.getString(4));
                listRoom.add(room);
            }
            return listRoom;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //tim kiem pjong theo loại phòng 
    public ArrayList<RoomDTO> findRoomByRoomPrice(String roomPrice) {
        String msql = "select MaPhongTro, TinhTrangPhong, SoNguoi, PhongTro.MaLoaiPhong from PhongTro, LoaiPhong where PhongTro.MaLoaiPhong = LoaiPhong.MaLoaiPhong and LoaiPhong.GiaPhong = ?";
        ArrayList<RoomDTO> listRoom = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, roomPrice);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                RoomDTO room = new RoomDTO();
                room.setRoomID(_resultSet.getString(1));
                room.setRoomState(_resultSet.getInt(2));
                room.setQuanityOfGuest(_resultSet.getInt(3));
                room.setRoomTypeID(_resultSet.getString(4));
                listRoom.add(room);
            }
            return listRoom;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //update so luong phong tro
    public boolean updateQuanityGuest(String roomID, int state, int quanity) {
        String msql = "update PhongTro set TinhTrangPhong = ?, SoNguoi = ? where MaPhongTro = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setInt(1, state);
            _preparedStatement.setInt(2, quanity);
            _preparedStatement.setString(3, roomID);
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
