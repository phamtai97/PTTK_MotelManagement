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
public class UseServiceDTO {
    private String _serviceID;
    private String _roomID;
    private Date _startDateUse;
    private Date _endDateUse;
    private int _oldValue;
    private int _newValue;

    public UseServiceDTO() {
        this._serviceID = "";
        this._roomID = "";
        this._startDateUse = new Date();
        this._endDateUse = new Date();
        this._oldValue = 0;
        this._newValue = 0;
    }
    public UseServiceDTO(String _serviceID, String _roomID, Date _startDateUse, Date _endDateUse, int _oldValue, int _newValue) {
        this._serviceID = _serviceID;
        this._roomID = _roomID;
        this._startDateUse = _startDateUse;
        this._endDateUse = _endDateUse;
        this._oldValue = _oldValue;
        this._newValue = _newValue;
    }

    public String getServiceID() {
        return _serviceID;
    }

    public void setNewValue(int _newValue) {
        this._newValue = _newValue;
    }

    public int getNewValue() {
        return _newValue;
    }

    public void setServiceID(String _serviceID) {
        this._serviceID = _serviceID;
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public Date getStartDateUse() {
        return _startDateUse;
    }

    public void setStartDateUse(Date _startDateUse) {
        this._startDateUse = _startDateUse;
    }

    public Date getEndDateUse() {
        return _endDateUse;
    }

    public void setEndDateUse(Date _endDateUse) {
        this._endDateUse = _endDateUse;
    }

    public int getOldValue() {
        return _oldValue;
    }

    public void setOldValue(int _oldValue) {
        this._oldValue = _oldValue;
    }
    
    
}
