package Formularios;

import Controladores.ProductoJpaController;
import Entidades.Producto;
import java.awt.Image;
import java.awt.Toolkit;
import static java.util.Collections.list;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose David
 */
public class frmAnalogo extends javax.swing.JFrame {

    /**
     * Creates new form frmAnalogos
     */
    Producto producto = new Producto();
     ProductoJpaController productoC = new ProductoJpaController();
     List<Producto> lstProducto = productoC.findProductoEntities();
        public static int id = 0;
        public static int precio = 0;
        public static String nombre = "";
        public static String marca = "";
        public static String descripcion = "";
        
    public frmAnalogo() {
        initComponents();
        setTitle("Tienda Virtual_PA1");
        setLocationRelativeTo(null);
        Image icon= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/FossilSmartwatch.jpg"));
        this.setIconImage(icon);
        
        ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"));
        Icon fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(lblFondoA.getWidth(), lblFondoA.getHeight(), Image.SCALE_DEFAULT));
        lblFondoA.setIcon(fondo);
        this.repaint();
        
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/imagenes/AnalogoLigeHombre.jpg"));
        Icon reloj1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblProducto1.getWidth(), lblProducto1.getHeight(), Image.SCALE_DEFAULT));
        lblProducto1.setIcon(reloj1);
        this.repaint();
        
        ImageIcon imagen2= new ImageIcon(getClass().getResource("/imagenes/AnalogoCasioHombre.jpg"));
        Icon reloj2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblProducto2.getWidth(), lblProducto2.getHeight(), Image.SCALE_DEFAULT));
        lblProducto2.setIcon(reloj2);
        this.repaint();
        
        ImageIcon  imagen3 = new ImageIcon(getClass().getResource("/imagenes/analogoCasio.jpg"));
        Icon reloj3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblProducto3.getWidth(),lblProducto3.getHeight(), Image.SCALE_DEFAULT));
        lblProducto3.setIcon(reloj3);
        this.repaint();
        
        ImageIcon  imagen4 = new ImageIcon(getClass().getResource("/imagenes/analogobersigaeHombre.jpg"));
        Icon reloj4 = new ImageIcon(imagen4.getImage().getScaledInstance(lblProducto4.getWidth(),lblProducto4.getHeight(), Image.SCALE_DEFAULT));
        lblProducto4.setIcon(reloj4);
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        btnAnterior1 = new javax.swing.JButton();
        btnSiguiente1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProducto1 = new javax.swing.JLabel();
        lblProducto3 = new javax.swing.JLabel();
        lblProducto2 = new javax.swing.JLabel();
        lblProducto4 = new javax.swing.JLabel();
        lblFondoA = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Relojes Analogos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tienda virtual");

        txtNombreU.setBackground(new java.awt.Color(0, 102, 102));
        txtNombreU.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreU.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreU.setBorder(null);
        txtNombreU.setOpaque(false);
        txtNombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUtxtNombreUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnAnterior1.setBackground(new java.awt.Color(0, 51, 51));
        btnAnterior1.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior1.setText("Anterior");
        btnAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 50));

        btnSiguiente1.setBackground(new java.awt.Color(0, 51, 51));
        btnSiguiente1.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente1.setText("Siguiente");
        btnSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 110, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProducto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProducto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProducto1MouseClicked(evt);
            }
        });

        lblProducto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProducto2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProducto4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 390, 370));
        getContentPane().add(lblFondoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 570));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Productos :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUtxtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUtxtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUtxtNombreUsuarioActionPerformed

    private void btnAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior1ActionPerformed
        frmSmart ventanaS = new frmSmart();
        ventanaS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnterior1ActionPerformed

    private void btnSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente1ActionPerformed
        frmDigital ventanaD = new frmDigital();
        ventanaD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSiguiente1ActionPerformed

    private void lblProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProducto1MouseClicked
         
         id=1;   
         precio = lstProducto.get(id).getPrecio();
         nombre = lstProducto.get(id).getNombreProducto();
         marca = lstProducto.get(id).getNombreProducto();
         descripcion = lstProducto.get(id).getDescripcion();
        
            
      
        
        frmGestion gestion = new frmGestion();
        gestion.setVisible(true);
        this.dispose();
        
        
       
    }//GEN-LAST:event_lblProducto1MouseClicked

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
            java.util.logging.Logger.getLogger(frmAnalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelFondo1;
    private javax.swing.JPanel PanelFondo2;
    private javax.swing.JButton btnAnterior1;
    private javax.swing.JButton btnSiguiente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblFondoA;
    private javax.swing.JLabel lblProducto1;
    private javax.swing.JLabel lblProducto2;
    private javax.swing.JLabel lblProducto3;
    private javax.swing.JLabel lblProducto4;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario2;
    private javax.swing.JTextField txtUsuario3;
    // End of variables declaration//GEN-END:variables
}
