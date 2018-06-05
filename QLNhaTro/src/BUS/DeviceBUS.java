/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DeviceDAO;
import DTO.DeviceDTO;
import java.util.ArrayList;

/**
 *
 * @author taipham
 */
public class DeviceBUS {
    private DeviceDAO _deviceDAO;
    
    public DeviceBUS(){
        this._deviceDAO = new DeviceDAO();
    }
    
    //lay anh sach thiet bi
    public ArrayList<DeviceDTO> getAllDevice(){
        return _deviceDAO.getAllDevice();
    }
    
    //them thiet bi
    public boolean insertDevice(DeviceDTO device){
        return _deviceDAO.insertDevice(device);
    }
    
    //xoa thiet bi
    public boolean deleteDevice(String deviceID){
        return _deviceDAO.deleteDevice(deviceID);
    }
    
    //update thiet bi
    public boolean updateDevice(DeviceDTO device){
        return _deviceDAO.updateDevice(device);
    }
}
