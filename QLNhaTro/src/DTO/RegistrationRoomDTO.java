/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author taipham
 */
public class RegistrationRoomDTO {
    private String _roomID;
    private String _guestID;
    private Date _dateRegistration;

    public RegistrationRoomDTO() {
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public String getGuestID() {
        return _guestID;
    }

    public void setGuestID(String _guestID) {
        this._guestID = _guestID;
    }

    public Date getDateRegistration() {
        return _dateRegistration;
    }

    public void setDateRegistration(Date _dateRegistration) {
        this._dateRegistration = _dateRegistration;
    }
    
    
   
}
