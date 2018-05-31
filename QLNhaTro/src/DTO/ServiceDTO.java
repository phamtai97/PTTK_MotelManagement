/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author taipham
 */
public class ServiceDTO {
    private String _serviceID;
    private String _serviceName;
    private int _servicePrice;

    public ServiceDTO(String _serviceID, String _serviceName, int _servicePrice) {
        this._serviceID = _serviceID;
        this._serviceName = _serviceName;
        this._servicePrice = _servicePrice;
    }

    public String getServiceID() {
        return _serviceID;
    }

    public void setServiceID(String _serviceID) {
        this._serviceID = _serviceID;
    }

    public String getServiceName() {
        return _serviceName;
    }

    public void setServiceName(String _serviceName) {
        this._serviceName = _serviceName;
    }

    public int getServicePrice() {
        return _servicePrice;
    }

    public void setServicePrice(int _servicePrice) {
        this._servicePrice = _servicePrice;
    }
    
    
}
