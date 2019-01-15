/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ImagenFondo;

/**
 *
 * @author muert
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        Iniciar();
    }

    void Iniciar() {
        EscritorioInterno.setBorder(new ImagenFondo("../Imagen/bar2.jpg"));
        Deslizable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPrincipal = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        BntMenu1 = new javax.swing.JLabel();
        MenuDesple = new javax.swing.JPanel();
        FotoInicial = new com.bolivia.label.CLabel();
        LBUser = new javax.swing.JLabel();
        LbUsuario = new javax.swing.JLabel();
        LBproduc = new javax.swing.JLabel();
        LbProductos = new javax.swing.JLabel();
        LBDama = new javax.swing.JLabel();
        LbDama = new javax.swing.JLabel();
        LBVentas = new javax.swing.JLabel();
        LbVentas = new javax.swing.JLabel();
        LBCaja = new javax.swing.JLabel();
        LbCaja = new javax.swing.JLabel();
        EscritorioInterno = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Header.setBackground(new java.awt.Color(23, 66, 107));

        BntMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/menuB.png"))); // NOI18N
        BntMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BntMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BntMenu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BntMenu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BntMenu1)
                .addContainerGap())
        );

        MenuDesple.setBackground(new java.awt.Color(6, 33, 60));

        FotoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/userN.png"))); // NOI18N
        FotoInicial.setText("");

        LBUser.setForeground(new java.awt.Color(255, 255, 255));
        LBUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/users.png"))); // NOI18N
        LBUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBUserMouseClicked(evt);
            }
        });

        LbUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LbUsuario.setText("Usuario");
        LbUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LBproduc.setForeground(new java.awt.Color(255, 255, 255));
        LBproduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/archive.png"))); // NOI18N
        LBproduc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBproduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBproducMouseClicked(evt);
            }
        });

        LbProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbProductos.setForeground(new java.awt.Color(255, 255, 255));
        LbProductos.setText("Productos");
        LbProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LBDama.setForeground(new java.awt.Color(255, 255, 255));
        LBDama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/gift.png"))); // NOI18N
        LBDama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbDama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbDama.setForeground(new java.awt.Color(255, 255, 255));
        LbDama.setText("Dama/Cerv");
        LbDama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LBVentas.setForeground(new java.awt.Color(255, 255, 255));
        LBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/shopping-cart.png"))); // NOI18N
        LBVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbVentas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbVentas.setForeground(new java.awt.Color(255, 255, 255));
        LbVentas.setText("Ventas");
        LbVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LBCaja.setForeground(new java.awt.Color(255, 255, 255));
        LBCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/bill.png"))); // NOI18N
        LBCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbCaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbCaja.setForeground(new java.awt.Color(255, 255, 255));
        LbCaja.setText("Caja A/C");
        LbCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuDespleLayout = new javax.swing.GroupLayout(MenuDesple);
        MenuDesple.setLayout(MenuDespleLayout);
        MenuDespleLayout.setHorizontalGroup(
            MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDespleLayout.createSequentialGroup()
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(FotoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBUser)
                        .addGap(0, 0, 0)
                        .addComponent(LbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBproduc)
                        .addGap(0, 0, 0)
                        .addComponent(LbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBDama)
                        .addGap(0, 0, 0)
                        .addComponent(LbDama, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBVentas)
                        .addGap(0, 0, 0)
                        .addComponent(LbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBCaja)
                        .addGap(0, 0, 0)
                        .addComponent(LbCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        MenuDespleLayout.setVerticalGroup(
            MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDespleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(FotoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDespleLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LBUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDespleLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(LbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBproduc)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDespleLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBDama)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDespleLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LbDama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBVentas)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDespleLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(MenuDespleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBCaja)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDespleLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LbCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EscritorioInternoLayout = new javax.swing.GroupLayout(EscritorioInterno);
        EscritorioInterno.setLayout(EscritorioInternoLayout);
        EscritorioInternoLayout.setHorizontalGroup(
            EscritorioInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        EscritorioInternoLayout.setVerticalGroup(
            EscritorioInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPrincipalLayout = new javax.swing.GroupLayout(JPrincipal);
        JPrincipal.setLayout(JPrincipalLayout);
        JPrincipalLayout.setHorizontalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPrincipalLayout.createSequentialGroup()
                .addComponent(MenuDesple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EscritorioInterno))
        );
        JPrincipalLayout.setVerticalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPrincipalLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuDesple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EscritorioInterno)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String Des = "La";
    int w = 230;

    void Cambio(boolean Bo) {
        FotoInicial.setVisible(Bo);
        LbUsuario.setVisible(Bo);
        LbProductos.setVisible(Bo);
        LbDama.setVisible(Bo);
        LbCaja.setVisible(Bo);
        LbVentas.setVisible(Bo);
    }

    void Deslizable() {
        if (Des.equals("La")) {
//            double width = MenuDesple.getWidth() * 0.80;
//            System.out.println(width);
            MenuDesple.setSize(w, MenuDesple.getHeight());
            EscritorioInterno.setSize(EscritorioInterno.getWidth() + w, EscritorioInterno.getHeight());
            EscritorioInterno.setLocation(EscritorioInterno.getX() - w, EscritorioInterno.getY());
            Des = "Oc";
            Cambio(false);
        } else if (Des.equals("Oc")) {

            MenuDesple.setSize(w + w, MenuDesple.getHeight());
            EscritorioInterno.setSize(EscritorioInterno.getWidth() - w, EscritorioInterno.getHeight());
            EscritorioInterno.setLocation(EscritorioInterno.getX() + w, EscritorioInterno.getY());
            Des = "La";
            Cambio(true);
        }
    }
    private void BntMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BntMenu1MouseClicked
        Deslizable();
    }//GEN-LAST:event_BntMenu1MouseClicked

    private void LBUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBUserMouseClicked
        if(Des.equals("La")){
            Deslizable();
        }
        AddUser adU = new AddUser();
        EscritorioInterno.add(adU);
        adU.setVisible(true);
    }//GEN-LAST:event_LBUserMouseClicked

    private void LBproducMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBproducMouseClicked
        if(Des.equals("La")){
            Deslizable();
        }
        Category Ca = new Category();
        EscritorioInterno.add(Ca);
        Ca.setVisible(true);
    }//GEN-LAST:event_LBproducMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BntMenu1;
    private javax.swing.JDesktopPane EscritorioInterno;
    private com.bolivia.label.CLabel FotoInicial;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JLabel LBCaja;
    private javax.swing.JLabel LBDama;
    private javax.swing.JLabel LBUser;
    private javax.swing.JLabel LBVentas;
    private javax.swing.JLabel LBproduc;
    private javax.swing.JLabel LbCaja;
    private javax.swing.JLabel LbDama;
    private javax.swing.JLabel LbProductos;
    private javax.swing.JLabel LbUsuario;
    private javax.swing.JLabel LbVentas;
    private javax.swing.JPanel MenuDesple;
    // End of variables declaration//GEN-END:variables
}