/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barproyect;

import Vista.Ventana;
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
//            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception ee) {
            System.out.println(ee);
        }
        Ventana v = new Ventana();
        v.setVisible(true);
    }
    
}
