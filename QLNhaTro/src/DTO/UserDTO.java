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
public class UserDTO {
    private String _userID;
    private String _username;
    private String _password;
    private int _isAdmin;

    public UserDTO(String _userID, String _username, String _password, int _isAdmin){
        this._userID = _userID;
        this._username = _username;
        this._password = _password;
        this._isAdmin = _isAdmin;
    }

    public String getUserID() {
        return _userID;
    }

    public void setUserID(String _userID) {
        this._userID = _userID;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public int getIsAdmin() {
        return _isAdmin;
    }

    public void setIsAdmin(int _isAdmin) {
        this._isAdmin = _isAdmin;
    }    
}
