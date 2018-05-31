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
public class BillDTO {
    private String _billID;
    private String _roomID;
    private Date _datePublish;
    private int _totalBill;
    
    public BillDTO(String _billID, String _roomID, Date _datePublish, int _totalBill) {
        this._billID = _billID;
        this._roomID = _roomID;
        this._datePublish = _datePublish;
        this._totalBill = _totalBill;
    }

    public String getBillID() {
        return _billID;
    }

    public void setBillID(String _billID) {
        this._billID = _billID;
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public Date getDatePublish() {
        return _datePublish;
    }

    public void setDatePublish(Date _datePublish) {
        this._datePublish = _datePublish;
    }

    public int getTotalBill() {
        return _totalBill;
    }

    public void setTotalBill(int _totalBill) {
        this._totalBill = _totalBill;
    }
    
    
}
