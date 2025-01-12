/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.Encomienda;
import javax.swing.JFrame;
import Controlador.chofer;
import Controlador.flotilla;
import Controlador.precio;
import Controlador.viaje;
import java.util.ArrayList;



/**
 *
 * @author 
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
     public ArrayList<chofer> listaChofer = new ArrayList();
     public ArrayList<flotilla> listaFlotilla = new ArrayList();
     public ArrayList<viaje> listaViaje = new ArrayList();
     public ArrayList<precio> listaPrecio = new ArrayList();
     public ArrayList<Encomienda> listaEncomienda = new ArrayList();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }
    
    private JFrame getFrame() {
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Choferes = new javax.swing.JButton();
        FlotillaBtn = new javax.swing.JButton();
        ViajeBtn = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        BtnEnvioEncomienda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BtnTicket = new javax.swing.JButton();
        EncominedaClient = new javax.swing.JButton();
        buscarEncomienda = new javax.swing.JButton();
        EncoViaje = new javax.swing.JButton();
        BtnAsientos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Tico Viajes");
        setMaximumSize(new java.awt.Dimension(677, 600));
        setMinimumSize(new java.awt.Dimension(677, 600));
        setPreferredSize(new java.awt.Dimension(677, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Menu Principal Tico Viajes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, 30));

        Choferes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chofer.jpg"))); // NOI18N
        Choferes.setText("Choferes");
        Choferes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choferes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        Choferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoferesActionPerformed(evt);
            }
        });
        getContentPane().add(Choferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 130));

        FlotillaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buss.jpg"))); // NOI18N
        FlotillaBtn.setText("Buses");
        FlotillaBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        FlotillaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlotillaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(FlotillaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 130));

        ViajeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/viajess.jpg"))); // NOI18N
        ViajeBtn.setText("Viajes");
        ViajeBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viajes", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N
        ViajeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViajeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViajeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 140, 130));

        btnPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pre.jpg"))); // NOI18N
        btnPrecio.setText("Precio");
        btnPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 120, 130));

        BtnEnvioEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/en.png"))); // NOI18N
        BtnEnvioEncomienda.setText("Envio Encomienda");
        BtnEnvioEncomienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Envío Encomienda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        BtnEnvioEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnvioEncomiendaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEnvioEncomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retiros.jpg"))); // NOI18N
        jButton1.setText("Retiro Encomienda");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retiros Encomiendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 51, 0))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 100));

        BtnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tick.jpg"))); // NOI18N
        BtnTicket.setText("Venta de Ticket");
        BtnTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra de Ticket", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N
        BtnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTicketActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 170, 170));

        EncominedaClient.setBackground(new java.awt.Color(0, 204, 255));
        EncominedaClient.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        EncominedaClient.setForeground(new java.awt.Color(255, 255, 255));
        EncominedaClient.setText("Encomiendas Cliente");
        EncominedaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncominedaClientActionPerformed(evt);
            }
        });
        getContentPane().add(EncominedaClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 190, -1));

        buscarEncomienda.setBackground(new java.awt.Color(0, 0, 153));
        buscarEncomienda.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        buscarEncomienda.setForeground(new java.awt.Color(255, 255, 255));
        buscarEncomienda.setText("Buscar Encomienda Código");
        buscarEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEncomiendaActionPerformed(evt);
            }
        });
        getContentPane().add(buscarEncomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 190, -1));

        EncoViaje.setBackground(new java.awt.Color(102, 0, 153));
        EncoViaje.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        EncoViaje.setForeground(new java.awt.Color(255, 255, 255));
        EncoViaje.setText("Encomienda Mismo Viaje");
        EncoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncoViajeActionPerformed(evt);
            }
        });
        getContentPane().add(EncoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 190, -1));

        BtnAsientos.setBackground(new java.awt.Color(102, 0, 102));
        BtnAsientos.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BtnAsientos.setForeground(new java.awt.Color(255, 255, 255));
        BtnAsientos.setText("Codigo Viaje Asientos");
        BtnAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAsientosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Viajes.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 1010, 520));

        jMenu1.setText("Terminos y Condiciones");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoferesActionPerformed
         Choferes cho = new Choferes(){
           @Override 
           public void dispose() {
                listaChofer = nuevo();
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         cho.cargarDatos(listaChofer);
         cho.setLocationRelativeTo(null);
         cho.setVisible(true);
         this.dispose();
      
        
    }//GEN-LAST:event_ChoferesActionPerformed

    private void FlotillaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlotillaBtnActionPerformed
        Flotillas flo = new Flotillas(){
           @Override 
           public void dispose() {
                listaFlotilla = nuevo();
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         flo.cargarDatos(listaFlotilla);
         flo.setLocationRelativeTo(null);
         flo.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_FlotillaBtnActionPerformed

    private void ViajeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViajeBtnActionPerformed
        Viajes via = new Viajes(){
           @Override 
           public void dispose() {
                listaViaje = nuevo();
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         via.cargarDatos(listaViaje);
         via.setLocationRelativeTo(null);
         via.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_ViajeBtnActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        Precios pre = new Precios(){
           @Override 
           public void dispose() {
                listaPrecio = nuevo();
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         pre.cargarDatos(listaPrecio);
         pre.setLocationRelativeTo(null);
         pre.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnPrecioActionPerformed

    private void BtnEnvioEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnvioEncomiendaActionPerformed
         Encomiendas enco = new Encomiendas(){
           @Override 
           public void dispose() {
                listaEncomienda = nuevo();
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         enco.cargarDatos(listaEncomienda);
         enco.setLocationRelativeTo(null);
         enco.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BtnEnvioEncomiendaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
       dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           RetiroEncomienda retiro = new RetiroEncomienda(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
         
         retiro.setLocationRelativeTo(null);
         retiro.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        //ver terminos y Condiciones
        Terminos terminos = new Terminos(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        terminos.setLocationRelativeTo(null);
        terminos.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
         //ver terminos y Condiciones
        Terminos terminos = new Terminos(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        terminos.setLocationRelativeTo(null);
        terminos.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void BtnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTicketActionPerformed
        //ingreso a venta de ticket
        Ticket tiquete = new Ticket(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        tiquete.setLocationRelativeTo(null);
        tiquete.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BtnTicketActionPerformed

    private void EncoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncoViajeActionPerformed
        //ingreso a Busqueda
        Busquedas busq = new Busquedas(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        busq.setLocationRelativeTo(null);
        busq.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_EncoViajeActionPerformed

    private void EncominedaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncominedaClientActionPerformed
        //ingreso a EncomiendaCliente
        EncomiendasCliente encos = new EncomiendasCliente(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        encos.setLocationRelativeTo(null);
        encos.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_EncominedaClientActionPerformed

    private void buscarEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEncomiendaActionPerformed
        //ingreso a EncomiendaCliente
        EncomiendasCliente encos = new EncomiendasCliente(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        encos.setLocationRelativeTo(null);
        encos.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_buscarEncomiendaActionPerformed

    private void BtnAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAsientosActionPerformed
        // Ingreso a BusquedaAsiento
        BusquedaAsiento asi = new BusquedaAsiento(){
           @Override 
           public void dispose() {
                
                getFrame().setVisible(true);
                super.dispose();
            }
           
        };
        asi.setLocationRelativeTo(null);
        asi.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_BtnAsientosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAsientos;
    private javax.swing.JButton BtnEnvioEncomienda;
    private javax.swing.JButton BtnTicket;
    private javax.swing.JButton Choferes;
    private javax.swing.JButton EncoViaje;
    private javax.swing.JButton EncominedaClient;
    private javax.swing.JButton FlotillaBtn;
    private javax.swing.JMenu Salir;
    private javax.swing.JButton ViajeBtn;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton buscarEncomienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
