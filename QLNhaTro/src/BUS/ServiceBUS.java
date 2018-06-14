/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DataProvider;
import DAO.ServiceDAO;
import DTO.ServiceDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phantrongthuyen
 */
public class ServiceBUS {
    ServiceDAO serviceDAO;
    public ServiceBUS() {
        serviceDAO = new ServiceDAO();
    }
    
    public ArrayList<ServiceDTO> LayThongTinDichVu() {
        return this.serviceDAO.LayThongTinDichVu();
    }
}
