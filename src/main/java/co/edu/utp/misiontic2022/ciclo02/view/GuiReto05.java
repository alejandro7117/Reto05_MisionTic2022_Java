/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.ciclo02.view;

import co.edu.utp.misiontic2022.ciclo02.controller.ReportesController;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO
 */
public class GuiReto05 extends javax.swing.JFrame {
    
    private ReportesController controller;
    private TableModelBanco tableModelBanco;
    private TableModelCosto tableModelCosto;
    private TableModelTop tableModelTop;
    
    /**
     * Creates new form GuiReto05
     */
    public GuiReto05() {
        controller = new ReportesController();
       
        initComponents();
        cargarInfoInicial();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        botonConsultar = new javax.swing.JButton();
        comboBoxBancos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Bancos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        consultarPagos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Pagos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        actualizar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Top10 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salirMenuItem = new javax.swing.JMenuItem();
        atajoConsultar = new javax.swing.JMenuItem();
        atajoActualizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bancosMenuItem = new javax.swing.JMenuItem();
        pagosMenuItem = new javax.swing.JMenuItem();
        top10Menuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE PROYECTOS POR BANCO");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setDividerLocation(60);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        comboBoxBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBancosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecciona tu banco");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(comboBoxBancos, 0, 343, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonConsultar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonConsultar)
                    .addComponent(comboBoxBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        tabla_Bancos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_Bancos);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel5);

        jPanel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        tbdPanel.addTab("Bancos", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL PAGADO POR PROYECTO");
        jPanel2.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setDividerLocation(65);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Costo Limite Inferior");

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });

        consultarPagos.setText("Consultar");
        consultarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(campoValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(consultarPagos)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(campoValor)
                        .addContainerGap())))
        );

        jSplitPane2.setTopComponent(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        tabla_Pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla_Pagos);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel7);

        jPanel2.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        tbdPanel.addTab("Pagos", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOP 10: LIDERES QUE MENOS GASTAN EN UN PROYECTO");
        jPanel3.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane3.setTopComponent(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        tabla_Top10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla_Top10);

        jPanel9.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(jPanel9);

        jPanel3.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        tbdPanel.addTab("Top10", jPanel3);

        getContentPane().add(tbdPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        salirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(salirMenuItem);

        atajoConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        atajoConsultar.setText("Consultar-Costo");
        atajoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atajoConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(atajoConsultar);

        atajoActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        atajoActualizar.setText("Actualizar-Top10");
        atajoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atajoActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(atajoActualizar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventanas");

        bancosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bancosMenuItem.setText("Bancos");
        bancosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancosMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(bancosMenuItem);

        pagosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pagosMenuItem.setText("Pagos");
        pagosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(pagosMenuItem);

        top10Menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        top10Menuitem.setText("Top10");
        top10Menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top10MenuitemActionPerformed(evt);
            }
        });
        jMenu2.add(top10Menuitem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "??Estas seguro de salir?",
                "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "??Estas seguro de salir?",
                "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void bancosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancosMenuItemActionPerformed
        tbdPanel.setSelectedIndex(0);
    }//GEN-LAST:event_bancosMenuItemActionPerformed

    private void pagosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosMenuItemActionPerformed
        tbdPanel.setSelectedIndex(1);
        campoValor.requestFocus();
    }//GEN-LAST:event_pagosMenuItemActionPerformed

    private void top10MenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top10MenuitemActionPerformed
        tbdPanel.setSelectedIndex(2);
    }//GEN-LAST:event_top10MenuitemActionPerformed

    private void comboBoxBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBancosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboBoxBancosActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        try {
            // TODO add your handling code here:
            //cargarInfoInicial();
            var lista = controller.listadoProyectoBanco(comboBoxBancos.getSelectedItem().toString().trim());
            tableModelBanco = new TableModelBanco(lista);
            tabla_Bancos.setModel(tableModelBanco);
            
        } catch (SQLException ex) {
            Logger.getLogger(GuiReto05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void atajoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atajoConsultarActionPerformed
      // TODO add your handling code here:
        try {
        double limiteInferior;
        limiteInferior = Double.parseDouble(campoValor.getText());
        
        var lista = controller.listarPagos(limiteInferior);
        tableModelCosto = new TableModelCosto(lista);
        tabla_Pagos.setModel(tableModelCosto);
        } catch (SQLException ex) {
            Logger.getLogger(GuiReto05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atajoConsultarActionPerformed

    private void consultarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPagosActionPerformed
        // TODO add your handling code here:
        try {
        double limiteInferior;
        limiteInferior = Double.parseDouble(campoValor.getText());
        
        var lista = controller.listarPagos(limiteInferior);
        tableModelCosto = new TableModelCosto(lista);
        tabla_Pagos.setModel(tableModelCosto);
        } catch (SQLException ex) {
            Logger.getLogger(GuiReto05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarPagosActionPerformed

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        try {
        var lista = controller.listarComprasLider();
        tableModelTop = new TableModelTop(lista);
            tabla_Top10.setModel(tableModelTop);
        } catch (SQLException ex) {
            Logger.getLogger(GuiReto05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void atajoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atajoActualizarActionPerformed
        // TODO add your handling code here:
        try {
        var lista = controller.listarComprasLider();
        tableModelTop = new TableModelTop(lista);
            tabla_Top10.setModel(tableModelTop);
        } catch (SQLException ex) {
            Logger.getLogger(GuiReto05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atajoActualizarActionPerformed
    
    private void cargarInfoInicial() {
       //comboBoxBancos.addItem("");
        try {
            // Cargar tabla de  proyecto
            tableModelBanco = new TableModelBanco();
            tabla_Bancos.setModel(tableModelBanco);

            // Listado de bancos
            comboBoxBancos.removeAllItems();
            var bancos = controller.listarNombresBancos();
            bancos.forEach(banco -> {
                comboBoxBancos.addItem(banco.getNombreBanco());
            });
            comboBoxBancos.setSelectedIndex(-1);
            
            // cargar tabla de pagos
            tableModelCosto = new TableModelCosto();
            tabla_Pagos.setModel(tableModelCosto);
            
            //cargar tabla de top10
            tableModelTop = new TableModelTop();
            tabla_Top10.setModel(tableModelTop);
            
           
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(GuiReto05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiReto05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiReto05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiReto05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            FlatDarkLaf.install ();
            new GuiReto05().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JMenuItem atajoActualizar;
    private javax.swing.JMenuItem atajoConsultar;
    private javax.swing.JMenuItem bancosMenuItem;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> comboBoxBancos;
    private javax.swing.JButton consultarPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JMenuItem pagosMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JTable tabla_Bancos;
    private javax.swing.JTable tabla_Pagos;
    private javax.swing.JTable tabla_Top10;
    private javax.swing.JTabbedPane tbdPanel;
    private javax.swing.JMenuItem top10Menuitem;
    // End of variables declaration//GEN-END:variables
}
