/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KSGAMER
 */
public class Controlador {

    public Controlador() {
    }

    Consultas con = new Consultas();

    //Eliminar Usar
    public void EliminarUser(String id){
        con.EliminarUser("UPDATE usuario SET status = '0' WHERE id = "+id);
    }
    public DefaultTableModel TablaUsuario() {

        //SELECT name,lastname,username FROM usuario
        String titulos[] = {"Nombre", "Apellido", "Usuario"};
        String[] registros = new String[3];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        ResultSet Info = con.TablaUsu("SELECT name,lastname,username FROM usuario where status = 1");
        try {
            while (Info.next()) {
                registros[0] = Info.getString(1);
                registros[1] = Info.getString(2);
                registros[2] = Info.getString(3);
               
                model.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public String id(String Usuario, String Nombre) {
        String id = null;
        ResultSet rs = con.consultar("id", "usuario", " name = '" + Nombre + "' and username = '" + Usuario + "'");
        try {
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public void ModificarUser(String id, String Usuario,String Nombre, String Apellido,String Pass) {
        //name` = 'Praxx' WHERE `usuario`.`id` = 7
        con.ModificarUser("username = '"+Usuario+"', name ='"+Nombre+"',lastname='"+Apellido+"',`password` = MD5('"+Pass+"')WHERE id ="+id);
    }

    public void AgregarUser(String nombre, String Apellido, String Usuario, String Contrase, String Fecha, String Estado) {
        String Perfil = Perfil(Estado, 1);

        con.AgregarUsuario(nombre, Apellido, Usuario, Contrase, Fecha, Perfil);
    }

    public String Perfil(String Estado, int re) {
        String Perfil = "";
        if (re == 1) {
            switch (Estado) {
                case "Administrador":
                    Perfil = "A";
                    break;
                case "Normal":
                    Perfil = "N";
                    break;
                default:
                    Perfil = "E";
                    break;

            }
        } else {
            switch (Estado) {
                case "A":
                    Perfil = "Administrador";
                    break;
                case "N":
                    Perfil = "Normal";
                    break;
                default:
                    Perfil = "X";
                    break;

            }
        }
        return Perfil;
    }
}
