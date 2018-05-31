/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author taipham
 */
public class LoadTableGUI {
    
    public void loadJtable(ResultSet rs, JTable Tablename)
    {
        try 
            {            
                DefaultTableModel tableModel = new DefaultTableModel();//Tạo một model table là DefaultTableModel
                ResultSet result = rs;// Tạo biến resultSet 
                ResultSetMetaData metadata = result.getMetaData();
                int columnCount = metadata.getColumnCount();//Tạo biến int để đếm số cột
                ArrayList<String> arrayColumns = new ArrayList<String>();//Tạo mảng để chứ tên cột
                for (int i = 1; i <= columnCount; i++) {
                    arrayColumns.add(metadata.getColumnName(i));//Add lần lượt tên cột vào Jtable
                }
                
                //Set title cho mỗi cột
                tableModel.setColumnIdentifiers(arrayColumns.toArray());//Tạo một mảng kiểu object để lưu trữ từng dòng dữ liệu
                
                ArrayList<Object> arrayRow = new ArrayList<Object>();
                
                while(result.next()){ //Duyệt từng dòng trong ResultSet                
                    for (int i = 1; i <= columnCount; i++) {
                        arrayRow.add((result.getObject(i)));//Add dữ liệu vào mảng ArrayList<Object>
                    }
                    tableModel.addRow(arrayRow.toArray());//Add 1 dòng dữ liệu vào DefaultTableModel
                    arrayRow.clear();//Clear mảng ArrayList<Object>
                }
                //SetModel cho table
                Tablename.setModel(tableModel);
                result.close();//Đóng ResultSet
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex.getErrorCode());
        }
    }
    
}
