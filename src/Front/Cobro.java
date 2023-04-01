/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package Front;

import DTO.MenuSaleDto;
import DTO.MessageDto;
import DTO.UserDto;
import DTO.VentaDto;
import Services.CommandService;
import Services.SaleService;
import Utils.GuiUtils;
import Utils.Validations;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static Constants.MessageConstants.MESSAGE_ERROR;

/**
 * @file Cobro.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 31 mar. 2023
 */
public class Cobro extends javax.swing.JDialog {

    GuiUtils gu = new GuiUtils();
    Validations v = new Validations();
    MessageUser mu = new MessageUser(this, true);
    SaleService ss = new SaleService();
    VentaDto sale = new VentaDto();
    List<MenuSaleDto> product = null;
    
    public Cobro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonTicket = new javax.swing.JButton();
        botonCobrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        labelClave = new javax.swing.JLabel();
        textDescuento = new javax.swing.JTextField();
        labelSubTotal = new javax.swing.JLabel();
        labelClave3 = new javax.swing.JLabel();
        labelClave4 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelMesero = new javax.swing.JLabel();
        labelNombreMesero = new javax.swing.JLabel();
        labelMesa = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelClave7 = new javax.swing.JLabel();
        textEfectivo = new javax.swing.JTextField();
        labelClave8 = new javax.swing.JLabel();
        textTarjeta = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        labelFolio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 755));
        setMinimumSize(new java.awt.Dimension(1366, 755));
        setPreferredSize(new java.awt.Dimension(1366, 755));
        setSize(new java.awt.Dimension(1366, 755));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        botonRegresar.setBackground(new java.awt.Color(255, 153, 0));
        botonRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        botonRegresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonRegresarKeyPressed(evt);
            }
        });

        botonTicket.setBackground(new java.awt.Color(51, 102, 0));
        botonTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        botonTicket.setText("Ticket");
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });
        botonTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonTicketKeyPressed(evt);
            }
        });

        botonCobrar.setBackground(new java.awt.Color(153, 0, 153));
        botonCobrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        botonCobrar.setText("Cobrar");
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });
        botonCobrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(523, 523, 523)
                .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tablaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setRowHeight(35);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProductosMousePressed(evt);
            }
        });
        tablaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaProductoscomboTipoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        labelClave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelClave.setForeground(new java.awt.Color(255, 255, 255));
        labelClave.setText("Descuento   $");

        textDescuento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textDescuento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textDescuentoFocusLost(evt);
            }
        });

        labelSubTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSubTotal.setForeground(new java.awt.Color(0, 102, 0));
        labelSubTotal.setText("$ 999999.00");

        labelClave3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelClave3.setForeground(new java.awt.Color(255, 255, 255));
        labelClave3.setText("Subtotal");

        labelClave4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelClave4.setForeground(new java.awt.Color(255, 255, 255));
        labelClave4.setText("Total");

        labelTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(153, 0, 0));
        labelTotal.setText("$ 999999.99");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textDescuento))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelClave3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(labelClave4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(labelClave4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelClave3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        labelMesero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMesero.setForeground(new java.awt.Color(255, 255, 255));
        labelMesero.setText("Nombre");

        labelNombreMesero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombreMesero.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreMesero.setText("Nombre");

        labelMesa.setBackground(new java.awt.Color(0, 0, 0));
        labelMesa.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelMesa.setForeground(new java.awt.Color(204, 153, 0));
        labelMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMesa.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMesa)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labelMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        labelClave7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelClave7.setForeground(new java.awt.Color(255, 255, 255));
        labelClave7.setText("Efectivo:");

        textEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textEfectivo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textEfectivo.setText("0.00");

        labelClave8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelClave8.setForeground(new java.awt.Color(255, 255, 255));
        labelClave8.setText("Tarjeta:");

        textTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textTarjeta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textTarjeta.setText("0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelClave7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEfectivo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelClave8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTarjeta)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClave7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClave8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        labelFolio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelFolio.setForeground(new java.awt.Color(255, 255, 255));
        labelFolio.setText("Folio");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonRegresarKeyPressed

    }//GEN-LAST:event_botonRegresarKeyPressed

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        ImprimirTicket();
    }//GEN-LAST:event_botonTicketActionPerformed

    private void botonTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonTicketKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTicketKeyPressed

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        Cobrar();
    }//GEN-LAST:event_botonCobrarActionPerformed

    private void botonCobrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCobrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCobrarKeyPressed

    private void tablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMousePressed

    }//GEN-LAST:event_tablaProductosMousePressed

    private void tablaProductoscomboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProductoscomboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProductoscomboTipoKeyTyped

    private void textDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescuentoFocusLost
        RecalcularDescuento();
    }//GEN-LAST:event_textDescuentoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonTicket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelClave3;
    private javax.swing.JLabel labelClave4;
    private javax.swing.JLabel labelClave7;
    private javax.swing.JLabel labelClave8;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelMesa;
    private javax.swing.JLabel labelMesero;
    private javax.swing.JLabel labelNombreMesero;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textDescuento;
    private javax.swing.JTextField textEfectivo;
    private javax.swing.JTextField textTarjeta;
    // End of variables declaration//GEN-END:variables

    private void Cobrar(){
        
        if(textEfectivo.getText().isBlank()){
            textEfectivo.setText("0.00");
        }
        
        if(textTarjeta.getText().isBlank()){
            textTarjeta.setText("0.00");
        }
        
        if(v.PriceFormat(textEfectivo.getText())){
            if(v.PriceFormat(textTarjeta.getText())){
                
            }else{
                mu.ShowMessage(new MessageDto("Error", "El fomato de la cantidad de la tarjeta no es correcto", MESSAGE_ERROR));
            }
        }else{
            mu.ShowMessage(new MessageDto("Error", "El fomato del efectivo no es correcto", MESSAGE_ERROR));
        }
    }
    
    private void RecalcularDescuento(){
        if(v.PriceFormat(textDescuento.getText())){
            sale.setDiscount(Double.parseDouble(textDescuento.getText()));
            sale.setTotal(sale.getSubTotal());
            sale.setTotal(sale.getTotal() - sale.getDiscount());
            ss.UpdateDiscountSale(sale);
            sale = ss.getSalePrePayment(sale.getId());
            LlenarCostos();
        }else{
            mu.ShowMessage(new MessageDto("Error", "El fomato del descuento no es correcto", MESSAGE_ERROR));
            textDescuento.setText(gu.PriceToString(sale.getDiscount()));
        }
        
    }
    
    private void ImprimirTicket(){
        gu.PrintTicketSale(product, sale);
    }
    
    public void InitData(int sale) {
        this.sale = ss.getSalePrePayment(sale);
        LlenarEncabezado();
        LlenarTabla();
        LlenarCostos();
        gu.OpenJDialog(this);
    }
    
    private void LlenarCostos(){
        textDescuento.setText(gu.PriceToString(sale.getDiscount()));
        labelSubTotal.setText("$ " + gu.PriceToString(sale.getSubTotal()));
        labelTotal.setText("$ " + gu.PriceToString(sale.getTotal()));
    }
    
    private void LlenarEncabezado(){
        UserDto ud = ss.getUserTable(sale.getIdUser());
        labelMesa.setText(String.valueOf(sale.getTable()));
        labelFolio.setText(String.valueOf(sale.getId()));
        labelMesero.setText(sale.getIdUser());
        labelNombreMesero.setText(ud.getName());
    }
    
    private void LlenarTabla(){
        CommandService cs = new CommandService();
        DefaultTableModel dtm = gu.ClearTable(tablaProductos);
        tablaProductos.setModel(dtm);
        product = cs.getMenuSale(sale.getId());
        for(MenuSaleDto data : product){
            dtm.addRow(new Object[]{
                data.getMenuName(),
                "$ " + gu.PriceToString(data.getPrice()),
                data.getQuantity(),
                "$ " + gu.PriceToString(data.getTotal())
            });
        }
    }

}
