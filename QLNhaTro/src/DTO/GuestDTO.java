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
public class GuestDTO {
    private String _guestID;
    private String _guestName;
    private String _sex;
    private Date _dob;
    private String _countrySide;
    private String _numberID;
    private String _permanentAddress;
    private String _job;
    private String _phoneNumber;
    private int _stateGuest;
    
    public GuestDTO(){
        
    }
    public GuestDTO(String _guestID, String _guestName, String _sex, Date _dob, String _countrySide, String _numberID, String _permanentAddress, String _job, String _phoneNumber, int _stateGuest) {
        this._guestID = _guestID;
        this._guestName = _guestName;
        this._sex = _sex;
        this._dob = _dob;
        this._countrySide = _countrySide;
        this._numberID = _numberID;
        this._permanentAddress = _permanentAddress;
        this._job = _job;
        this._phoneNumber = _phoneNumber;
        this._stateGuest = _stateGuest;
    }

    public String getGuestID() {
        return _guestID;
    }

    public void setGuestID(String _guestID) {
        this._guestID = _guestID;
    }

    public String getGuestName() {
        return _guestName;
    }

    public void setGuestName(String _guestName) {
        this._guestName = _guestName;
    }

    public String getSex() {
        return _sex;
    }

    public void setSex(String _sex) {
        this._sex = _sex;
    }

    public Date getDob() {
        return _dob;
    }

    public void setDob(Date _dob) {
        this._dob = _dob;
    }

    public String getCountrySide() {
        return _countrySide;
    }

    public void setCountrySide(String _countrySide) {
        this._countrySide = _countrySide;
    }

    public String getNumberID() {
        return _numberID;
    }

    public void setNumberID(String _numberID) {
        this._numberID = _numberID;
    }

    public String getPermanentAddress() {
        return _permanentAddress;
    }

    public void setPermanentAddress(String _permanentAddress) {
        this._permanentAddress = _permanentAddress;
    }

    public String getJob() {
        return _job;
    }

    public void setJob(String _job) {
        this._job = _job;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public int getStateGuest() {
        return _stateGuest;
    }

    public void setStateGuest(int _stateGues) {
        this._stateGuest = _stateGues;
    }    
}
