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
public class DeviceDTO {
    private String _deviceID;
    private String _roomID;
    private String _deviceName;
    private int _stateDevice;

    public DeviceDTO(String _deviceID, String _roomID, String _deviceName, int _stateDevice) {
        this._deviceID = _deviceID;
        this._roomID = _roomID;
        this._deviceName = _deviceName;
        this._stateDevice = _stateDevice;
    }

    public DeviceDTO() {
        
    }

    public String getDeviceID() {
        return _deviceID;
    }

    public void setDeviceID(String _deviceID) {
        this._deviceID = _deviceID;
    }

    public String getRoomID() {
        return _roomID;
    }

    public void setRoomID(String _roomID) {
        this._roomID = _roomID;
    }

    public String getDeviceName() {
        return _deviceName;
    }

    public void setDeviceName(String _deviceName) {
        this._deviceName = _deviceName;
    }

    public int getStateDevice() {
        return _stateDevice;
    }

    public void setStateDevice(int _stateDevice) {
        this._stateDevice = _stateDevice;
    }
}
