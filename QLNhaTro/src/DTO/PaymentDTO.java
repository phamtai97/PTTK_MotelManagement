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
public class PaymentDTO {
    private String _paymentBillID;
    private Date _datePayment;
    private String _contentPayment;
    private int _moneyPayment;
    private String _note;
    
    public PaymentDTO() {
        this._paymentBillID = "";
        this._datePayment = new Date();
        this._contentPayment = "No content";
        this._moneyPayment = 0;
        this._note = "No note";
    }
    public PaymentDTO(String _paymentBillID, Date _datePayment, String _contentPayment, int _moneyPayment, String _note) {
        this._paymentBillID = _paymentBillID;
        this._datePayment = _datePayment;
        this._contentPayment = _contentPayment;
        this._moneyPayment = _moneyPayment;
        this._note = _note;
    }

    public String getPaymentBillID() {
        return _paymentBillID;
    }

    public void setPaymentBillID(String _paymentBillID) {
        this._paymentBillID = _paymentBillID;
    }

    public Date getDatePayment() {
        return _datePayment;
    }

    public void setDatePayment(Date _datePayment) {
        this._datePayment = _datePayment;
    }

    public String getContentPayment() {
        return _contentPayment;
    }

    public void setContentPayment(String _contentPayment) {
        this._contentPayment = _contentPayment;
    }

    public int getMoneyPayment() {
        return _moneyPayment;
    }

    public void setMoneyPayment(int _moneyPayment) {
        this._moneyPayment = _moneyPayment;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String _note) {
        this._note = _note;
    }
    
    
}
