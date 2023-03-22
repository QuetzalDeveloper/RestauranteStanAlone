/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Front;

import static Constants.MessageConstants.MESSAGE_WARNING;
import DTO.MenuDto;
import DTO.MenuRequestDto;
import DTO.MessageDto;
import DTO.TypeFoodDto;
import Services.MenuService;
import Utils.GuiUtils;
import Utils.Validations;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * @file Food.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 15 mar. 2023
 */
public class Food extends javax.swing.JFrame {
    
    private MenuService ms = new MenuService();
    private MessageUser mu = new MessageUser(this, true);
    private List<MenuDto> result;

    public Food() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlatillos = new javax.swing.JTable();
        checkInactivos = new javax.swing.JPanel();
        buttonRegresar = new javax.swing.JButton();
        buttonNuevo = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        buttonBuscar.setBackground(new java.awt.Color(255, 204, 0));
        buttonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave");

        textClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textClaveFocusGained(evt);
            }
        });
        textClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textClavecomboTipoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNombreFocusGained(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombrecomboTipoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo");

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboTipo.setMaximumRowCount(20);
        comboTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboTipoFocusGained(evt);
            }
        });
        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboTipoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        tablaPlatillos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Tipo", "Precio", "Menu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPlatillos.setRowHeight(35);
        tablaPlatillos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaPlatilloscomboTipoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlatillos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkInactivos.setBackground(new java.awt.Color(0, 0, 0));

        buttonRegresar.setBackground(new java.awt.Color(255, 153, 153));
        buttonRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        buttonRegresar.setText("Regresar");
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        buttonRegresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonRegresarcomboTipoKeyPressed(evt);
            }
        });

        buttonNuevo.setBackground(new java.awt.Color(51, 204, 255));
        buttonNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alimento.png"))); // NOI18N
        buttonNuevo.setText("Nuevo");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });

        buttonEditar.setBackground(new java.awt.Color(204, 102, 255));
        buttonEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(0, 0, 0));
        check.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Inactivos");

        javax.swing.GroupLayout checkInactivosLayout = new javax.swing.GroupLayout(checkInactivos);
        checkInactivos.setLayout(checkInactivosLayout);
        checkInactivosLayout.setHorizontalGroup(
            checkInactivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkInactivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkInactivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkInactivosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(checkInactivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(checkInactivosLayout.createSequentialGroup()
                        .addComponent(buttonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        checkInactivosLayout.setVerticalGroup(
            checkInactivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkInactivosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(437, 437, 437)
                .addComponent(buttonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        Consulta(); 
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void textClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textClaveFocusGained

    }//GEN-LAST:event_textClaveFocusGained

    private void textClavecomboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClavecomboTipoKeyPressed

    }//GEN-LAST:event_textClavecomboTipoKeyPressed

    private void textNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNombreFocusGained

    }//GEN-LAST:event_textNombreFocusGained

    private void textNombrecomboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombrecomboTipoKeyPressed

    }//GEN-LAST:event_textNombrecomboTipoKeyPressed

    private void comboTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboTipoFocusGained

    }//GEN-LAST:event_comboTipoFocusGained

    private void comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyPressed

    }//GEN-LAST:event_comboTipoKeyPressed

    private void tablaPlatilloscomboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPlatilloscomboTipoKeyPressed

    }//GEN-LAST:event_tablaPlatilloscomboTipoKeyPressed

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonRegresarActionPerformed

    private void buttonRegresarcomboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonRegresarcomboTipoKeyPressed

    }//GEN-LAST:event_buttonRegresarcomboTipoKeyPressed

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        FoodRegister fr = new FoodRegister(this, true);
        fr.InitNewMenu();
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        int row = tablaPlatillos.getSelectedRow();
        if(row > 0){
            FoodRegister fr = new FoodRegister(this, true);
            fr.InitUpdateMenu(result.get(row));
        }else{
            MessageDto md = new MessageDto("Cancelado", "Operación cancelada", MESSAGE_WARNING);
            mu.ShowMessage(md);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JCheckBox check;
    private javax.swing.JPanel checkInactivos;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPlatillos;
    private javax.swing.JTextField textClave;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

    private void Consulta(){
        GuiUtils gu = new GuiUtils();
        Validations valid = new Validations();
        MenuRequestDto request = new MenuRequestDto();
        
        if(valid.OnlyNumbers(textClave.getText().toString())){
            request.setMenuId(Integer.parseInt(textClave.getText()));
        }else{
            request.setMenuId(-1);
        }
        
        if(valid.NumbersLettersAndSpace(textNombre.getText())){
            request.setMenuNombre(textNombre.getText());
        }
        
        if(comboTipo.getSelectedIndex() > 0){
            request.setMenuTipo(comboTipo.getSelectedIndex());
        }else{
            request.setMenuTipo(-1);
        }
        
        if(check.isSelected()){
            request.setActive(true);
        }else{
            request.setActive(false);
        }
        
        result = ms.getMenu(request);
        DefaultTableModel dtm = gu.ClearTable(tablaPlatillos);
        tablaPlatillos.setModel(dtm);
        if(result != null){
            for(MenuDto data : result){
                dtm.addRow(new Object[] { data.getId(), data.getName(), data.getTypeName(), data.getCost(), data.isInMenu()});
            }
        }else{
            MessageDto md = new MessageDto("Sin datos", "No hay platillos registrados", MESSAGE_WARNING);
            mu.ShowMessage(md);
        }
        
        textClave.setText(null);
        textNombre.setText(null);
        comboTipo.setSelectedIndex(0);
    }
    
    public void InitData() {
        this.dispose();
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        List<TypeFoodDto> type = ms.getTypeFood();
        comboTipo.addItem("Selecciona...");
        for (TypeFoodDto data : type) {
            comboTipo.addItem(data.getNombreTipo());
        }
        this.setVisible(true);
    }

}
