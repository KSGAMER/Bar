package Vista;
import Controlador.Controlador;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author muert
 */
public class AddUser extends javax.swing.JInternalFrame {
  
    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
        SinBarra();
        Limpiar();
        
    }
    Controlador contro = new Controlador();
     void SinBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI) 
      this.getUI()).setNorthPane(null);
         
    }
     void Limpiar(){
         txtNombre.setText("");
         txtApellidos.setText("");
         txtUsuario.setText("");
         JPContra.setText("");
         CbPerfil.setSelectedIndex(1);
         JDFecha.setDate(new Date(1997,11,23));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JDFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        JPContra = new javax.swing.JPasswordField();
        BtnGuardar = new javax.swing.JLabel();
        BtnCancelar1 = new javax.swing.JLabel();
        CbPerfil = new javax.swing.JComboBox<>();
        BntLista = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        JPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registro Personal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuario: ");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Perfil: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña: ");

        JPContra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        BtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setText("Guardar");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.setOpaque(true);
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });

        BtnCancelar1.setBackground(new java.awt.Color(255, 0, 0));
        BtnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCancelar1.setText("Cancelar");
        BtnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar1.setOpaque(true);
        BtnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelar1MouseClicked(evt);
            }
        });

        CbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrados", "Normal", "X" }));

        BntLista.setBackground(new java.awt.Color(51, 204, 0));
        BntLista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BntLista.setForeground(new java.awt.Color(255, 255, 255));
        BntLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BntLista.setText("Lista de Usuarios");
        BntLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BntLista.setOpaque(true);
        BntLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BntListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPrincipalLayout = new javax.swing.GroupLayout(JPrincipal);
        JPrincipal.setLayout(JPrincipalLayout);
        JPrincipalLayout.setHorizontalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPrincipalLayout.createSequentialGroup()
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(JPrincipalLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JDFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(JPContra)
                            .addComponent(CbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPrincipalLayout.createSequentialGroup()
                .addGap(0, 183, Short.MAX_VALUE)
                .addComponent(BntLista, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        JPrincipalLayout.setVerticalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(JPContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(CbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPrincipalLayout.createSequentialGroup()
                                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4))
                            .addComponent(JDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BntLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        SimpleDateFormat fec = new SimpleDateFormat("YYYY-MM-dd");
        String Fecha2 = fec.format(JDFecha.getDate());
        contro.AgregarUser(txtNombre.getText(), txtApellidos.getText(), txtUsuario.getText(),JPContra.getText(),Fecha2,CbPerfil.getSelectedItem().toString());
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelar1MouseClicked
       Limpiar();
    }//GEN-LAST:event_BtnCancelar1MouseClicked

    private void BntListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BntListaMouseClicked
        ListUser lisU = new ListUser();
        Dashboard.EscritorioInterno.add(lisU);
        lisU.setVisible(true);
        dispose();
    }//GEN-LAST:event_BntListaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BntLista;
    private javax.swing.JLabel BtnCancelar1;
    private javax.swing.JLabel BtnGuardar;
    private javax.swing.JComboBox<String> CbPerfil;
    private com.toedter.calendar.JDateChooser JDFecha;
    private javax.swing.JPasswordField JPContra;
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
