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
    
    
}
