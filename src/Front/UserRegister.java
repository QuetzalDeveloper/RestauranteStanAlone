/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package Front;

import Utils.Validations;
import DTO.MessageDto;
import static Constants.MessageConstants.MESSAGE_CORRECT;
import static Constants.MessageConstants.MESSAGE_ERROR;
import static Constants.MessageConstants.MESSAGE_CONFIRM;
import DTO.UserDto;
import Services.UserService;
import Utils.GuiUtils;

/**
 * @file UserRegister.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 15 mar. 2023
 */
public class UserRegister extends javax.swing.JDialog {
    
    private UserService us = new UserService();
    private MessageUser mu = new MessageUser(this, true);
    private UserDto user;

    public UserRegister(java.awt.Frame parent, boolean modal) {
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
        jLabel8 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        buttonRegresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textContra = new javax.swing.JTextField();
        buttonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombrecomboPuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono");

        textTelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTelefonocomboPuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });

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
                buttonRegresarcomboPuestoKeyPressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña");

        textContra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContracomboPuestoKeyPressed(evt);
            }
        });

        buttonGuardar.setBackground(new java.awt.Color(255, 204, 0));
        buttonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        buttonGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonGuardarcomboPuestoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textContra))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(412, 479, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textNombre)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textTelefono))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNombre))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTelefono))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textContra))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombrecomboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombrecomboPuestoKeyPressed

    }//GEN-LAST:event_textNombrecomboPuestoKeyPressed

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped

    }//GEN-LAST:event_textNombreKeyTyped

    private void textTelefonocomboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonocomboPuestoKeyPressed

    }//GEN-LAST:event_textTelefonocomboPuestoKeyPressed

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped

    }//GEN-LAST:event_textTelefonoKeyTyped

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonRegresarActionPerformed

    private void buttonRegresarcomboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonRegresarcomboPuestoKeyPressed

    }//GEN-LAST:event_buttonRegresarcomboPuestoKeyPressed

    private void textContracomboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContracomboPuestoKeyPressed

    }//GEN-LAST:event_textContracomboPuestoKeyPressed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        if(ValidateForm()){
            if(user == null){
                SaveNewUser();
                CleanForm();
                user = null;
            }else{
                UpdateUser();
            }
        }
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonGuardarcomboPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonGuardarcomboPuestoKeyPressed

    }//GEN-LAST:event_buttonGuardarcomboPuestoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textContra;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables

    public void InitNewUser() {
        this.dispose();
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public void InitUpdateUser(UserDto user){
        this.user = user;
        textNombre.setText(user.getName());
        textTelefono.setText(user.getPhone());
        textContra.setText(user.getPassword());
        this.dispose();
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void UpdateUser(){
        user.setName(textNombre.getText().toUpperCase().trim());
        user.setPhone(textTelefono.getText().trim());
        user.setPassword(textContra.getText().trim());
        user.setActive(true);
        if(us.UpdateUser(user) == 0){
            MessageDto message = new MessageDto("Correcto", "El nuevo usuario se ha actualizado correctamente", MESSAGE_CORRECT);
            mu.ShowMessage(message);
            this.dispose();
        }else{
            MessageDto message = new MessageDto("Error", "Ocurrio un error. No se ha actualizado el usuario", MESSAGE_ERROR);
            mu.ShowMessage(message);
        }
    }
    
    private void SaveNewUser(){
        GuiUtils gu = new GuiUtils();
        user = new UserDto();
        user.setName(textNombre.getText().toUpperCase().trim());
        user.setPhone(textTelefono.getText().trim());
        user.setPassword(textContra.getText().trim());
        user.setAccount(gu.GenerateBaseAccount(textNombre.getText().toUpperCase().trim()));
        user.setActive(true);
        if(us.InsertUser(user) == 0){
            MessageDto message = new MessageDto("Correcto", "El nuevo usuario se ha registrado correctamente", MESSAGE_CORRECT);
            mu.ShowMessage(message);
        }else{
            MessageDto message = new MessageDto("Error", "Ocurrio un error. No se ha guadado el usuario", MESSAGE_ERROR);
            mu.ShowMessage(message);
        }
    }
    
    private boolean ValidateForm(){
        Validations valid = new Validations();
        if(valid.LettersAndSpace(textNombre.getText().toString())){
            if(valid.PhoneNumber(textTelefono.getText().toString())){
                if(valid.ValidPassword(textContra.getText())){
                    return true;
                }else{
                    MessageDto message = new MessageDto("Inválido", "La contraseña no es válida", MESSAGE_ERROR);
                    mu.ShowMessage(message);
                    return false;
                }
            }else{
                MessageDto message = new MessageDto("Inválido", "El teléfono no es válido. Debe contener solo 10 dígitos", MESSAGE_ERROR);
                mu.ShowMessage(message);
                return false;
            }
        }else{
            MessageDto message = new MessageDto("Inválido", "El nombre no es válido", MESSAGE_ERROR);
            mu.ShowMessage(message);
            return false;
        }
    }
    
    private void CleanForm(){
        textNombre.setText(null);
        textTelefono.setText(null);
        textContra.setText(null);
    }

}
