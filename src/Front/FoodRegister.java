/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package Front;

import static Constants.MessageConstants.MESSAGE_CORRECT;
import DTO.MenuDto;
import DTO.MessageDto;
import DTO.TypeFoodDto;
import Services.MenuService;
import Utils.Validations;
import java.util.List;
import static Constants.MessageConstants.MESSAGE_ERROR;

/**
 * @file FoodRegister.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 15 mar. 2023
 */
public class FoodRegister extends javax.swing.JDialog {
    
    private MenuService ms = new MenuService();
    private MessageUser mu = new MessageUser(this, true);
    private MenuDto menu = null;

    public FoodRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        checkMenu = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombretextDescripcionKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alimento.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cubiertos.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo");

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboTipo.setMaximumRowCount(20);
        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboTipotextDescripcionKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1textDescripcionKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2textDescripcionKeyPressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio");

        textPrecio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPreciotextDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrecioKeyTyped(evt);
            }
        });

        checkMenu.setBackground(new java.awt.Color(51, 51, 51));
        checkMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkMenu.setForeground(new java.awt.Color(255, 255, 255));
        checkMenu.setSelected(true);
        checkMenu.setText("Agregar al menú actual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(textPrecio)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(textNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(checkMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipo))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombretextDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombretextDescripcionKeyPressed
      
    }//GEN-LAST:event_textNombretextDescripcionKeyPressed

    private void comboTipotextDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipotextDescripcionKeyPressed

    }//GEN-LAST:event_comboTipotextDescripcionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ValidateForm()){
            if(menu == null){
                SaveItemMenu();
                CleanForm();
            }else{
                UpdateMenu();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1textDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1textDescripcionKeyPressed
 
    }//GEN-LAST:event_jButton1textDescripcionKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2textDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2textDescripcionKeyPressed
 
    }//GEN-LAST:event_jButton2textDescripcionKeyPressed

    private void textPreciotextDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPreciotextDescripcionKeyPressed

    }//GEN-LAST:event_textPreciotextDescripcionKeyPressed

    private void textPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrecioKeyTyped

    }//GEN-LAST:event_textPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkMenu;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables

    public void InitNewMenu() {
        this.dispose();
        this.setUndecorated(true);
        List<TypeFoodDto> type = ms.getTypeFood();
        comboTipo.addItem("Selecciona...");
        for (TypeFoodDto data : type) {
            comboTipo.addItem(data.getNombreTipo());
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public void InitUpdateMenu(MenuDto menu){
        this.menu = menu;
        this.dispose();
        this.setUndecorated(true);
        List<TypeFoodDto> type = ms.getTypeFood();
        comboTipo.addItem("Selecciona...");
        for (TypeFoodDto data : type) {
            comboTipo.addItem(data.getNombreTipo());
        }
        textNombre.setText(menu.getName());
        checkMenu.setSelected(menu.isInMenu());
        comboTipo.setSelectedIndex(menu.getType());
        textPrecio.setText(menu.getCost()+"");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
   
    private void SaveItemMenu(){
        menu = new MenuDto();
        menu.setName(textNombre.getText());
        menu.setType(comboTipo.getSelectedIndex());
        menu.setTypeName(comboTipo.getSelectedItem().toString());
        menu.setCost(Double.parseDouble(textPrecio.getText()));
        menu.setInMenu(checkMenu.isSelected());
        if(ms.InsertMenuItem(menu) == 0){
            MessageDto message = new MessageDto("Correcto", "El nuevo platillo se ha registrado correctamente", MESSAGE_CORRECT);
            mu.ShowMessage(message);
        }else{
            MessageDto message = new MessageDto("Error", "Ocurrio un error. No se ha guadado el platillo", MESSAGE_ERROR);
            mu.ShowMessage(message);
        }
        menu = null;
    }
    
    private void UpdateMenu(){
        menu.setName(textNombre.getText());
        menu.setInMenu(checkMenu.isSelected());
        menu.setType(comboTipo.getSelectedIndex());
        menu.setTypeName(comboTipo.getSelectedItem().toString());
        menu.setCost(Double.parseDouble(textPrecio.getText()));
        if(ms.UpdateMenuItem(menu)==0){
            MessageDto message = new MessageDto("Correcto", "El platillo se ha actualizado correctamente", MESSAGE_CORRECT);
            mu.ShowMessage(message);
            this.dispose();
        }else{
            MessageDto message = new MessageDto("Error", "Ocurrio un error. No se ha actualizado el platillo", MESSAGE_ERROR);
            mu.ShowMessage(message);
        }
    }
    
    private boolean ValidateForm() {
        Validations valid = new Validations();
        MessageDto md = null;
        if (valid.NumbersLettersAndSpace(textNombre.getText())) {
            if(comboTipo.getSelectedIndex() > 0){
                if(valid.PriceFormat(textPrecio.getText())){
                    return true;
                }else{
                    md = new MessageDto("Inválido", "Ingresa el precio correcto", MESSAGE_ERROR);
                    mu.ShowMessage(md);
                    return false;
                }
            }else{
                md = new MessageDto("Inválido", "Selecciona el tipo de platillo", MESSAGE_ERROR);
                mu.ShowMessage(md);
                return false;  
            }
        }else{
            md = new MessageDto("Inválido", "Debes ingresar el nombre del platillo", MESSAGE_ERROR);
            mu.ShowMessage(md);
            return false;
        }
    }
    
    private void CleanForm(){
        textNombre.setText(null);
        comboTipo.setSelectedIndex(0);
        textPrecio.setText(null);
        checkMenu.setSelected(true);
    }
}
