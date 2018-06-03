/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.GuestDAO;
import DTO.GuestDTO;
import DTO.UserDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taipham
 */
public class GuestBUS {
    private GuestDAO _guestDAO;
    
    public GuestBUS(){
        this._guestDAO = new GuestDAO();
    }
    
    // check account
    public boolean checkAccount(UserDTO user) {
        return this._guestDAO.CheckAcount(user);
    }
    
    //lay ds khach tro
    public ArrayList<GuestDTO> getAllGuest(){
        return _guestDAO.getAllGuest();
    }
    
    //them khach tro
    public boolean insertGuest(GuestDTO guest){
        return this._guestDAO.insertGuest(guest);
    }
    
    //xoa khach tro
    public boolean deleteGuest(String guestName, int stateGuest){
        return this._guestDAO.deleteGuest(guestName, stateGuest);
    }
    
    //update khach tro
    public boolean updateGuest(GuestDTO guest){
        return this._guestDAO.updateGuest(guest);
    }
    
    //tim kiem khach tro
    public ArrayList<GuestDTO> findGuestBy(String type, String input){
        return this._guestDAO.findGuestBy(type, input);
    }
    
    //tim kiem khach tro theo ten
    public ArrayList<GuestDTO> findGuestByName(String guestName){
        return this._guestDAO.findGuestBYName(guestName);
    }
}
