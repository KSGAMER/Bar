/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KSGAMER
 */
public class Consultas {
    BD cc = new BD();
    Connection cn = cc.GetConnection();
    String cons;
    DefaultTableModel model;
    int id;
    Statement st;
    
    //agregar usuario nuevo 
    public void AgregarUsuario(String nombre,String Apellido, String Usuario, String Contrase, String Fecha,String Estado){
        try {
            st = cn.createStatement();
            //INSERT INTO `usuario` (`id`, `name`, `lastname`, `username`, `password`, `profile`, `date`, `status`) VALUES (NULL, 'Pedro', 'Gonzalez', 'Praxx', MD5('123456'), '1', '2019-01-24', '1');
            st.executeUpdate("INSERT INTO usuario(name,lastname,username,password,profile,date,status)"
                    + " VALUES ('"+nombre+"','"+Apellido+"','"+Usuario+"', MD5('"+Contrase+"'),'"+Estado+"','"+Fecha+"', '1')");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
