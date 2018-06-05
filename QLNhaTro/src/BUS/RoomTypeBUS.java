/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.RoomTypeDAO;
import DTO.RoomTypeDTO;
import java.util.ArrayList;

/**
 *
 * @author taipham
 */
public class RoomTypeBUS {
    private RoomTypeDAO _roomypeDAO;
    
    public RoomTypeBUS(){
        _roomypeDAO = new RoomTypeDAO();
    }
    
    //lay danh sach laoi phong
    public ArrayList<RoomTypeDTO> getListRoomType(){
        return _roomypeDAO.getListRoomType();
    }
    
    //them loai phong
    public boolean insertRoomType(RoomTypeDTO roomTypeDTO){
        return _roomypeDAO.insertRoomType(roomTypeDTO);
    }
    
    //xoa loai phong
    public boolean deleteRoomType(String roomTypeID){
        return _roomypeDAO.deleteRoomType(roomTypeID);
    }
    
    //update loai phong
    public boolean updateRoomType(RoomTypeDTO roomType){
        return _roomypeDAO.updateRoomType(roomType);
    }
    
    
    
}
