/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DeviceDTO;
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
public class DeviceDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public DeviceDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }

    //lay danh sach cac thiet bi
    public ArrayList<DeviceDTO> getAllDevice() {
        String msql = "select MaThietBi, ThietBi.MaPhongTro, TenThietBi, TinhTrang from PhongTro, ThietBi where PhongTro.MaPhongTro = ThietBi.MaPhongTro";
        ArrayList<DeviceDTO> listDevice = new ArrayList<>();
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _resultSet = _preparedStatement.executeQuery();
            while (_resultSet.next()) {
                DeviceDTO device = new DeviceDTO();
                device.setDeviceID(_resultSet.getString(1));
                device.setRoomID(_resultSet.getString(2));
                device.setDeviceName(_resultSet.getString(3));
                device.setStateDevice(_resultSet.getInt(4));
                listDevice.add(device);
            }
            return listDevice;
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //them thiet bi
    public boolean insertDevice(DeviceDTO device) {
        String msql = "insert into ThietBi(MaThietBi, MaPhongTro, TenThietBi, TinhTrang) values(?, ?, ?, ?)";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);

            _preparedStatement.setString(1, device.getDeviceID());
            _preparedStatement.setString(2, device.getRoomID());
            _preparedStatement.setString(3, device.getDeviceName());
            _preparedStatement.setInt(4, device.getStateDevice());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //xoa thiet bi
    public boolean deleteDevice(String deviceID) {
        String msql = "delete from ThietBi where MaThietBi = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, deviceID);
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //update thiet bi
    public boolean updateDevice(DeviceDTO device) {
        String msql = "update ThietBi set MaPhongTro = ?, TenThietBi = ?, TinhTrang = ? where MaThietBi = ?";
        try {
            _preparedStatement = _dataProvider.getDataConnection().prepareCall(msql);
            _preparedStatement.setString(1, device.getRoomID());
            _preparedStatement.setString(2, device.getDeviceName());
            _preparedStatement.setInt(3, device.getStateDevice());
            _preparedStatement.setString(4, device.getDeviceID());
            return _preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
