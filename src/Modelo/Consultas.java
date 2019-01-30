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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KSGAMER y Pedro González
 */
public class Consultas {

    BD cc = new BD();
    Connection cn = cc.GetConnection();
    String cons;
    DefaultTableModel model;
    int id;
    Statement st;

    //
    //Tabla de Usuarios
    public ResultSet TablaUsu(String sql) {
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Consulta
    public ResultSet consultar(String Campos, String tabla, String p1) {
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select " + Campos + " from " + tabla + " where " + p1);
       
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error Consulta BD");
            System.out.println("Rompio aki");
            return null;
        }
    }
    //modificar Usuario
    public void ModificarUser(String Rsql){
        //UPDATE `usuario` SET `name` = 'Praxx' WHERE `usuario`.`id` = 7;
        try{
            st =  cn.createStatement();
            st.executeUpdate("UPDATE usuario SET "+Rsql);
        }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Eliminar Usuario
    public void EliminarUser(String sql){
         try{
            st =  cn.createStatement();
            st.executeUpdate(sql);
        }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //agregar usuario nuevo 
    public void AgregarUsuario(String nombre, String Apellido, String Usuario, String Contrase, String Fecha, String Estado) {
        try {
            st = cn.createStatement();
            //INSERT INTO `usuario` (`id`, `name`, `lastname`, `username`, `password`, `profile`, `date`, `status`) VALUES (NULL, 'Pedro', 'Gonzalez', 'Praxx', MD5('123456'), '1', '2019-01-24', '1');
            st.executeUpdate("INSERT INTO usuario(name,lastname,username,password,profile,date,status)"
                    + " VALUES ('" + nombre + "','" + Apellido + "','" + Usuario + "', MD5('" + Contrase + "'),'" + Estado + "','" + Fecha + "', '1')");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    //Metodos de Producto
    //modificar
    public void ModificarPr(String Rsql){
        //UPDATE `usuario` SET `name` = 'Praxx' WHERE `usuario`.`id` = 7;
        try{
            st =  cn.createStatement();
            st.executeUpdate("UPDATE producto SET "+Rsql);
        }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Eliminar
    public void EliminarPro(String sql){
         try{
            st =  cn.createStatement();
            st.executeUpdate(sql);
        }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //agregar
    public void AgregarPro(String nombre, String precio, String unidad,String imagen,String cate) {
        try {
            st = cn.createStatement();
            //INSERT INTO `producto` (`id`, `name`, `price`, `unity`, `image`, `idCategory`, `status`) VALUES (NULL, 'Victoria', '34', '12', 'No hay', '2', '1');
            st.executeUpdate("INSERT INTO producto(name,price,unity,image,idCategory,status)"
                    + " VALUES ('" + nombre + "','" + precio + "','" + unidad + "','" + imagen + "','"+cate+"','1')");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
