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
    private String _roomState;
    private int _quanityOfGuest;
    private RoomTypeDTO _roomType;

    public RoomDTO(String _roomID, String _roomState, int _quanityOfGuest, RoomTypeDTO _roomType) {
        this._roomID = _roomID;
        this._roomState = _roomState;
        this._quanityOfGuest = _quanityOfGuest;
        this._roomType = _roomType;
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public String getRoomState() {
        return _roomState;
    }

    public void setRoomState(String _roomState) {
        this._roomState = _roomState;
    }

    public int getQuanityOfGuest() {
        return _quanityOfGuest;
    }

    public void setQuanityOfGuest(int _quanityOfGuest) {
        this._quanityOfGuest = _quanityOfGuest;
    }

    public RoomTypeDTO getRoomType() {
        return _roomType;
    }

    public void setRoomType(RoomTypeDTO _roomType) {
        this._roomType = _roomType;
    }
    
    
}
