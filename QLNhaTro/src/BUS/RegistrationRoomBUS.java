/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.RegistrationRoomDAO;
import DTO.RegistrationRoomDTO;
import java.util.ArrayList;

/**
 *
 * @author taipham
 */
public class RegistrationRoomBUS {

    private RegistrationRoomDAO _registrationDAO;

    public RegistrationRoomBUS() {
        this._registrationDAO = new RegistrationRoomDAO();
    }

    public boolean registrationRoom(RegistrationRoomDTO registrationRoomDTO) {
        return this._registrationDAO.registrationRoom(registrationRoomDTO);
    }
    
    public ArrayList<RegistrationRoomDTO> getAllListRegistration(){
        return this._registrationDAO.getAllListRegistration();
    }
}
