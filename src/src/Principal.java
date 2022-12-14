/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Principal extends javax.swing.JFrame {

    FrameRegistrarCliente rc = new FrameRegistrarCliente();
    FrameRegistrarProducto rp = new FrameRegistrarProducto();
    FrameRegistrarMateriaPrima rmp = new FrameRegistrarMateriaPrima();
    FrameConsultarCliente consultar = new FrameConsultarCliente();
    FrameRegistrarVenta regVenta = new FrameRegistrarVenta();
    ConsultarVenta consultarVenta = new ConsultarVenta();
    FrameGenerarFacturar gf = new FrameGenerarFacturar();
    FrameConsultarProducto consultarProducto = new FrameConsultarProducto();
    FrameConsultarMatPrima consultarMatPrima = new FrameConsultarMatPrima();
    FrameConsultarFactura consultarFactura = new FrameConsultarFactura();
    FrameAnularFactura anularFactura = new FrameAnularFactura();

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ventanaPrincipal.add(rc);
        ventanaPrincipal.add(rp);
        ventanaPrincipal.add(rmp);
        ventanaPrincipal.add(consultar);
        ventanaPrincipal.add(regVenta);
        ventanaPrincipal.add(consultarVenta);
        ventanaPrincipal.add(gf);
        ventanaPrincipal.add(consultarFactura);
        ventanaPrincipal.add(consultarMatPrima);
        ventanaPrincipal.add(consultarProducto);
        ventanaPrincipal.add(anularFactura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnClientes = new javax.swing.JMenu();
        jMenuItemRegistrarCliente = new javax.swing.JMenuItem();
        btnConsultarClientes = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenu();
        menuItemRegistrarProducto = new javax.swing.JMenuItem();
        BtnConsultarProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemRegistrarMatPrima = new javax.swing.JMenuItem();
        BtnConsultarMatPrima = new javax.swing.JMenuItem();
        btnConsultarVenta = new javax.swing.JMenu();
        btnRegistrarVenta = new javax.swing.JMenuItem();
        btnConsVenta = new javax.swing.JMenuItem();
        btnGananciaDiaria = new javax.swing.JMenuItem();
        btnGenerarFactura = new javax.swing.JMenuItem();
        btnConsultarFactura = new javax.swing.JMenuItem();
        btnAnularFactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu (1).png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jMenuItemRegistrarCliente.setText("Modificar");
        jMenuItemRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarClienteActionPerformed(evt);
            }
        });
        btnClientes.add(jMenuItemRegistrarCliente);

        btnConsultarClientes.setText("Consultar");
        btnConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClientesActionPerformed(evt);
            }
        });
        btnClientes.add(btnConsultarClientes);

        jMenuBar1.add(btnClientes);

        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fast-food.png"))); // NOI18N
        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });

        menuItemRegistrarProducto.setText("Modificar");
        menuItemRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarProductoActionPerformed(evt);
            }
        });
        Productos.add(menuItemRegistrarProducto);

        BtnConsultarProductos.setText("Consultar");
        BtnConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarProductosActionPerformed(evt);
            }
        });
        Productos.add(BtnConsultarProductos);

        jMenuBar1.add(Productos);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-basket.png"))); // NOI18N
        jMenu2.setText("Materia Prima");

        jMenuItemRegistrarMatPrima.setText("Modificar");
        jMenuItemRegistrarMatPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarMatPrimaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRegistrarMatPrima);

        BtnConsultarMatPrima.setText("Consultar");
        BtnConsultarMatPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarMatPrimaActionPerformed(evt);
            }
        });
        jMenu2.add(BtnConsultarMatPrima);

        jMenuBar1.add(jMenu2);

        btnConsultarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        btnConsultarVenta.setText("Facturacion Y Ventas");
        btnConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVentaActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnRegistrarVenta);

        btnConsVenta.setText("Consultar Venta");
        btnConsVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsVentaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnConsVenta);

        btnGananciaDiaria.setText("Ganancia Diaria");
        btnGananciaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciaDiariaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnGananciaDiaria);

        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnGenerarFactura);

        btnConsultarFactura.setText("Consultar Factura");
        btnConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFacturaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnConsultarFactura);

        btnAnularFactura.setText("Anular Factura");
        btnAnularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularFacturaActionPerformed(evt);
            }
        });
        btnConsultarVenta.add(btnAnularFactura);

        jMenuBar1.add(btnConsultarVenta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarClienteActionPerformed

        CentrarVentana(rc);
    }//GEN-LAST:event_jMenuItemRegistrarClienteActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosActionPerformed

    private void menuItemRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarProductoActionPerformed

        CentrarVentana(rp);

    }//GEN-LAST:event_menuItemRegistrarProductoActionPerformed

    private void jMenuItemRegistrarMatPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarMatPrimaActionPerformed

        CentrarVentana(rmp);
    }//GEN-LAST:event_jMenuItemRegistrarMatPrimaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        CentrarVentana(rc);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnGananciaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciaDiariaActionPerformed
        cerrarVentanas();
        JOptionPane.showMessageDialog(null, "La ganancia diaria es de :  $$$$$ ");
    }//GEN-LAST:event_btnGananciaDiariaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        CentrarVentana(regVenta);
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnConsVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsVentaActionPerformed
        CentrarVentana(consultarVenta);
    }//GEN-LAST:event_btnConsVentaActionPerformed

    private void btnConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarVentaActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        CentrarVentana(gf);
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void btnConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClientesActionPerformed
         CentrarVentana(consultar);
    }//GEN-LAST:event_btnConsultarClientesActionPerformed

    private void BtnConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarProductosActionPerformed
        CentrarVentana(consultarProducto);
    }//GEN-LAST:event_BtnConsultarProductosActionPerformed

    private void BtnConsultarMatPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarMatPrimaActionPerformed
        CentrarVentana(consultarMatPrima);
    }//GEN-LAST:event_BtnConsultarMatPrimaActionPerformed

    private void btnConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFacturaActionPerformed
        CentrarVentana(consultarFactura);
    }//GEN-LAST:event_btnConsultarFacturaActionPerformed

    private void btnAnularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularFacturaActionPerformed
        CentrarVentana(anularFactura);
    }//GEN-LAST:event_btnAnularFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
    void CentrarVentana(JInternalFrame frame) {
        cerrarVentanas();
        Dimension dimension = ventanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width - Dframe.height) / 2, (dimension.height - Dframe.width) / 2);
        frame.show();
        

    }

   void cerrarVentanas() {////
        
        rmp.setVisible(false);
        rc.setVisible(false);
        rp.setVisible(false);
        consultar.setVisible(false);
        consultarVenta.setVisible(false);
        regVenta.setVisible(false);
        gf.setVisible(false);
        consultarFactura.setVisible(false);
        consultarMatPrima.setVisible(false);
        consultarProducto.setVisible(false);
        anularFactura.setVisible(false);
       
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnConsultarMatPrima;
    private javax.swing.JMenuItem BtnConsultarProductos;
    private javax.swing.JMenu Productos;
    private javax.swing.JMenuItem btnAnularFactura;
    private javax.swing.JMenu btnClientes;
    private javax.swing.JMenuItem btnConsVenta;
    private javax.swing.JMenuItem btnConsultarClientes;
    private javax.swing.JMenuItem btnConsultarFactura;
    private javax.swing.JMenu btnConsultarVenta;
    private javax.swing.JMenuItem btnGananciaDiaria;
    private javax.swing.JMenuItem btnGenerarFactura;
    private javax.swing.JMenuItem btnRegistrarVenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemRegistrarCliente;
    private javax.swing.JMenuItem jMenuItemRegistrarMatPrima;
    private javax.swing.JMenuItem menuItemRegistrarProducto;
    private javax.swing.JDesktopPane ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
