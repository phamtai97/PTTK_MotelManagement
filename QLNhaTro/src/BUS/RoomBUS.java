/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.RoomDAO;
import DTO.RoomDTO;
import java.util.ArrayList;

/**
 *
 * @author taipham
 */
public class RoomBUS {

    private RoomDAO _roomDAO;

    public RoomBUS() {
        this._roomDAO = new RoomDAO();
    }

    //lay danh sach phong tro
    public ArrayList<RoomDTO> getAllRoom() {
        return _roomDAO.getAllRoom();
    }

    //them danh phong tro
    public boolean insertRoom(RoomDTO room) {
        return this._roomDAO.insertRoom(room);
    }

    //xoa phong tro
    public boolean deleteRoom(String roomID) {
        return this._roomDAO.deleteRoom(roomID);
    }

    //update phong tro
    public boolean updateRoom(RoomDTO room) {
        return this._roomDAO.updateRoom(room);
    }

    //tim kiem phong laoi phong
    public ArrayList<RoomDTO> findRoomByTypeRoom(String typeRoom) {
        return _roomDAO.findRoomByTypeRoom(typeRoom);
    }

    //tim kiem phong
    public ArrayList<RoomDTO> findRoomBy(String type, String input) {
        return _roomDAO.findRoomBy(type, input);
    }

    //tim kiem phong theo gia
    public ArrayList<RoomDTO> findRoomByRoomPrice(String roomPrice) {
        return _roomDAO.findRoomByRoomPrice(roomPrice);
    }
    
    //update so luong nguoi o
    public boolean updateQuanityGuest(String roomID, int state, int quanity){
        return this._roomDAO.updateQuanityGuest(roomID, state, quanity);
    }
}
