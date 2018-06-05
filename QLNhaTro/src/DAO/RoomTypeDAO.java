/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.RoomTypeDTO;
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
public class RoomTypeDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public RoomTypeDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }

    //lay danh sach loai phong
    public ArrayList<RoomTypeDTO> getListRoomType() {
        String msql = "select MaLoaiPhong, LoaiPhong, SoLuongToiDa, GiaPhong from LoaiPhong";
        ArrayList listTypeRoom = new ArrayList();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                RoomTypeDTO roomTypeDTO = new RoomTypeDTO();
                roomTypeDTO.setRoomTypeID(_resultSet.getString(1));
                roomTypeDTO.setRoomType(_resultSet.getString(2));
                roomTypeDTO.setMaxNumberGuest(_resultSet.getInt(3));
                roomTypeDTO.setRoomPrice(_resultSet.getInt(4));
                listTypeRoom.add(roomTypeDTO);
            }
            return listTypeRoom;
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //them loai phong
    public boolean insertRoomType(RoomTypeDTO roomTypeDTO) {
        String msql = "insert into LoaiPhong(MaLoaiPhong, LoaiPhong, SoLuongToiDa, GiaPhong) values (?, ?, ?, ?) ";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, roomTypeDTO.getRoomTypeID());
            _preparedStatement.setString(2, roomTypeDTO.getRoomType());
            _preparedStatement.setInt(3, roomTypeDTO.getMaxNumberGuest());
            _preparedStatement.setInt(4, roomTypeDTO.getRoomPrice());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //xoa loai phong
    public boolean deleteRoomType(String roomTypeID) {
        String msql = "delete from LoaiPhong where MaLoaiPhong = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, roomTypeID);
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //update loai phong
    public boolean updateRoomType(RoomTypeDTO roomType) {
        String msql = "update LoaiPhong set LoaiPhong = ?, SoLuongToiDa = ?, GiaPhong = ? where MaLoaiPhong = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, roomType.getRoomType());
            _preparedStatement.setInt(2, roomType.getMaxNumberGuest());
            _preparedStatement.setInt(3, roomType.getRoomPrice());
            _preparedStatement.setString(4, roomType.getRoomTypeID());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RoomTypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
