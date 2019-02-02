/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    //Metodos de Modulo de Categoria

    public DefaultTableModel TablaCategoria() {

        String titulos[] = {"Nombre"};
        String[] registros = new String[1];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        ResultSet Info = con.TablaUsu("SELECT name FROM categoria  where status = 1");
        try {
            while (Info.next()) {
                registros[0] = Info.getString(1);
                model.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    //Metodos de Modulo de Producto
    public String idPrC(String Nombre) {
        String id = null;
        ResultSet rs = con.consultar("id", "categoria", " name = '" + Nombre + "' and status = 1");
        try {
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public void ModificarCate(String Nombre, String idC){
        //UPDATE `categoria` SET `status` = '1' WHERE `categoria`.`id` = 3;
        con.ModificarCar("name ='"+Nombre+"' where id= '"+idC+"'",Nombre);
    }
    
    public void ModificarProduc(String nombre, String precio, String unidad, String imagen, String cate,String idP) {
        String id = idPrC(cate);
        con.ModificarPr("name = '" + nombre + "',price='" + precio + "', unity='" + unidad + "', image='" + imagen + "',idCategory='" + id + "' where id = '"+idP+"'");
    }

    public void EliminarCate(String idC){
        con.EliminarPro("Update categoria set status = 0 where id='"+idC+"'");
    }
    public void EliminarPro(String Nombre, String Unidad){
        con.EliminarPro("Update producto set status = 0 where name ='"+Nombre+"' and unity='"+Unidad+"'");
    }
    
    public void AgregarCate(String Cat){
        con.AgregarCate(Cat);
    }
    public void AgregarProduc(String nombre, String precio, String unidad, String imagen, String cate) {
        String id = idPrC(cate);
        con.AgregarPro(nombre, precio, unidad, imagen, id);
    }

    public ArrayList ComboxPro() {
        ArrayList array = new ArrayList();
        ResultSet Info = con.TablaUsu("SELECT name FROM categoria  where status = 1");
        try {
            while (Info.next()) {
                array.add(Info.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    public DefaultTableModel TablaProductos() {

        //SELECT name,lastname,username FROM usuario
        String titulos[] = {"Nombre", "Precio", "Categoria", "Unidad"};
        String[] registros = new String[4];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        ResultSet Info = con.TablaUsu("SELECT p.name,p.price,ca.name as Category, unity FROM producto as p inner join categoria as ca on p.idCategory = ca.id  where p.status = 1");
        try {
            while (Info.next()) {
                registros[0] = Info.getString(1);
                registros[1] = Info.getString(2);
                registros[2] = Info.getString(3);
                registros[3] = Info.getString(4);

                model.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    //Eliminar Usar
    public void EliminarUser(String id) {
        con.EliminarUser("UPDATE usuario SET status = '0' WHERE id = " + id);
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
    public String idP(String Nombre, String Unidad ) {
        String id = null;
        ResultSet rs = con.consultar("id", "producto", " name ='"+Nombre+"' and unity='"+Unidad+"'");
        try {
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
      public String idC(String Nombre) {
        String id = null;
        ResultSet rs = con.consultar("id", "categoria", " name ='"+Nombre+"'");
        try {
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

                

    public void ModificarUser(String id, String Usuario, String Nombre, String Apellido, String Pass) {
        //name` = 'Praxx' WHERE `usuario`.`id` = 7
        if(Pass != null){
            con.ModificarUser("username = '" + Usuario + "', name ='" + Nombre + "',lastname='" + Apellido + "',`password` = MD5('" + Pass + "') WHERE id =" + id);
        }else{
            con.ModificarUser("username = '" + Usuario + "', name ='" + Nombre + "',lastname='" + Apellido + "' WHERE id =" + id);
        }
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
