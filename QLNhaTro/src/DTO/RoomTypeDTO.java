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
    private String _maxNumberGuest;
    private String _roomPrice;

    public RoomTypeDTO(String _roomTypeID, String _roomType, String _maxNumberGuest, String _roomPrice) {
        this._roomTypeID = _roomTypeID;
        this._roomType = _roomType;
        this._maxNumberGuest = _maxNumberGuest;
        this._roomPrice = _roomPrice;
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

    public String getMaxNumberGuest() {
        return _maxNumberGuest;
    }

    public void setMaxNumberGuest(String _maxNumberGuest) {
        this._maxNumberGuest = _maxNumberGuest;
    }

    public String getRoomPrice() {
        return _roomPrice;
    }

    public void setRoomPrice(String _roomPrice) {
        this._roomPrice = _roomPrice;
    }
    
    
}
