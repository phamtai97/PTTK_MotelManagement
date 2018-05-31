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
public class ContractDTO {
    private String _contrractID;
    private Date  _startDateRent;
    private String _guestID;
    private String _roomID;
    private Date _endDateRent;
    private int _deposits;//tiền đặt cọc
    private String _stateContract;

    public ContractDTO(String _contrractID, Date _startDateRent, String _guestID, String _roomID, Date _endDateRent, int _deposits, String _stateContract) {
        this._contrractID = _contrractID;
        this._startDateRent = _startDateRent;
        this._guestID = _guestID;
        this._roomID = _roomID;
        this._endDateRent = _endDateRent;
        this._deposits = _deposits;
        this._stateContract = _stateContract;
    }

    public String getContrractID() {
        return _contrractID;
    }

    public void setContrractID(String _contrractID) {
        this._contrractID = _contrractID;
    }

    public Date getStartDateRent() {
        return _startDateRent;
    }

    public void setStartDateRent(Date _startDateRent) {
        this._startDateRent = _startDateRent;
    }

    public String getGuestID() {
        return _guestID;
    }

    public void setGuestID(String _guestID) {
        this._guestID = _guestID;
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public Date getEndDateRent() {
        return _endDateRent;
    }

    public void setEndDateRent(Date _endDateRent) {
        this._endDateRent = _endDateRent;
    }

    public int getDeposits() {
        return _deposits;
    }

    public void setDeposits(int _deposits) {
        this._deposits = _deposits;
    }

    public String getStateContract() {
        return _stateContract;
    }

    public void setStateContract(String _stateContract) {
        this._stateContract = _stateContract;
    }
    
    
    
    
}
