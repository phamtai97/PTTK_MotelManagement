/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.RegistrationRoomDTO;
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
public class  RegistrationRoomDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;
    
    public RegistrationRoomDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }
    
    //dang ki phog
    public boolean registrationRoom(RegistrationRoomDTO registrationRoomDTO){
        String msql = "insert into DangKiPhong(MaPhongTro, MaKhachTro, NgayDangKithue) values (?, ?, ?)";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, registrationRoomDTO.getRoomID());
            _preparedStatement.setString(2, registrationRoomDTO.getGuestID());
            _preparedStatement.setDate(3, new Date(registrationRoomDTO.getDateRegistration().getTime()));
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationRoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //lay danh sach dang ki phong
    public ArrayList<RegistrationRoomDTO> getAllListRegistration(){
    String msql = "select MaPhongTro, MaKhachTro, NgayDangKiThue from DangKiPhong";
        ArrayList<RegistrationRoomDTO> list = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _resultSet = _preparedStatement.executeQuery();
            while(_resultSet.next()){
                RegistrationRoomDTO _reRegistrationRoomDTO = new RegistrationRoomDTO();
                _reRegistrationRoomDTO.setRoomID(_resultSet.getString(1));
                _reRegistrationRoomDTO.setGuestID(_resultSet.getString(2));
                _reRegistrationRoomDTO.setDateRegistration(_resultSet.getDate(3));
                list.add(_reRegistrationRoomDTO);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationRoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   
}