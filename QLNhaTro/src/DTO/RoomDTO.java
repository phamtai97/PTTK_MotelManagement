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
public class RoomDTO {
    private String _roomID;
    private int _roomState;
    private int _quanityOfGuest;
    private String _roomTypeID;

    public RoomDTO(String _roomID, int _roomState, int _quanityOfGuest, String _roomTypeID) {
        this._roomID = _roomID;
        this._roomState = _roomState;
        this._quanityOfGuest = _quanityOfGuest;
        this._roomTypeID = _roomTypeID;
    }

    public RoomDTO() {
        
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public int getRoomState() {
        return _roomState;
    }

    public void setRoomState(int _roomState) {
        this._roomState = _roomState;
    }

    public int getQuanityOfGuest() {
        return _quanityOfGuest;
    }

    public void setQuanityOfGuest(int _quanityOfGuest) {
        this._quanityOfGuest = _quanityOfGuest;
    }

    public String getRoomTypeID() {
        return _roomTypeID;
    }

    public void setRoomTypeID(String _roomType) {
        this._roomTypeID = _roomType;
    }
    
    
}
