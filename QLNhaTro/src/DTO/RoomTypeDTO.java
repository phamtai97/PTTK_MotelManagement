/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author taipham
 */
public class RoomTypeDTO {
    private String _roomTypeID;
    private String _roomType;
    private int _maxNumberGuest;
    private int _roomPrice;

    public RoomTypeDTO(String _roomTypeID, String _roomType, int _maxNumberGuest, int _roomPrice) {
        this._roomTypeID = _roomTypeID;
        this._roomType = _roomType;
        this._maxNumberGuest = _maxNumberGuest;
        this._roomPrice = _roomPrice;
    }

    public RoomTypeDTO() {
       
    }

    public String getRoomTypeID() {
        return _roomTypeID;
    }

    public void setRoomTypeID(String _roomTypeID) {
        this._roomTypeID = _roomTypeID;
    }

    public String getRoomType() {
        return _roomType;
    }

    public void setRoomType(String _roomType) {
        this._roomType = _roomType;
    }

    public int getMaxNumberGuest() {
        return _maxNumberGuest;
    }

    public void setMaxNumberGuest(int _maxNumberGuest) {
        this._maxNumberGuest = _maxNumberGuest;
    }

    public int getRoomPrice() {
        return _roomPrice;
    }

    public void setRoomPrice(int _roomPrice) {
        this._roomPrice = _roomPrice;
    }
}
