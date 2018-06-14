/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ServiceDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phantrongthuyen
 */
public class ServiceDAO {
    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public ServiceDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }
    
    public ArrayList<ServiceDTO> LayThongTinDichVu() {
        
        ArrayList<ServiceDTO> listService = new ArrayList<ServiceDTO>();
        
        String sql = "select * from DichVu";
        try {
            this._preparedStatement = this._dataProvider.getDataConnection().prepareStatement(sql);
            this._resultSet = this._preparedStatement.executeQuery();
            
            while (this._resultSet.next()) {
                ServiceDTO item = new ServiceDTO();
                item.setServiceID(this._resultSet.getString(1));
                item.setServiceName(this._resultSet.getString(2));
                item.setServicePrice(this._resultSet.getInt(3));
                listService.add(item);
            }
            return listService;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
