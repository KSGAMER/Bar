/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barproyect;

import Vista.Controlpanel;
import Vista.Ventana;
import Vista.Dashboard;
import javax.swing.UIManager;

/**
 *
 * @author KSGAMER
 */
public class BarProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception ee) {
            System.out.println(ee);
        }
        Dashboard v = new Dashboard();
        v.setVisible(true);
    }
    
}
