/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ContractDTO;
import DTO.GuestDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taipham
 */
public class ContractDAO {

    private DataProvider _dataProvider;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public ContractDAO() {
        this._dataProvider = new DataProvider();
        this._preparedStatement = null;
        this._resultSet = null;
    }
}
