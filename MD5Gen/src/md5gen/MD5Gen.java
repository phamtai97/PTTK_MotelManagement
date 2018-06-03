/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md5gen;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author billg
 */
public class MD5Gen {

    /**
     * @param args the command line arguments
     */
    public static String md5Java(String message) {
         
         String digest = null;

        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
 
            //converting byte array to Hexadecimal String
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
 
            digest = sb.toString();
            
            return digest;
        } catch (NoSuchAlgorithmException ex) {
        } catch (UnsupportedEncodingException ex) {
        }
        return "";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(md5Java("billhcmus"));
    }
    
}
