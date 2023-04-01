/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Front;

import DTO.TablesDto;
import Services.TablesService;
import Utils.GuiUtils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * @file Tables.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 21 mar. 2023
 */
public class Tables extends javax.swing.JFrame {
    
    private TablesService st = new TablesService();
    private List<TablesDto> tables = new ArrayList<>();
    
    public Tables() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        labelImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel6 = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        label8 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        label9 = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        label10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panel11 = new javax.swing.JPanel();
        label11 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        label12 = new javax.swing.JLabel();
        panel13 = new javax.swing.JPanel();
        label13 = new javax.swing.JLabel();
        panel14 = new javax.swing.JPanel();
        label14 = new javax.swing.JLabel();
        panel15 = new javax.swing.JPanel();
        label15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panel16 = new javax.swing.JPanel();
        label16 = new javax.swing.JLabel();
        panel17 = new javax.swing.JPanel();
        label17 = new javax.swing.JLabel();
        panel18 = new javax.swing.JPanel();
        label18 = new javax.swing.JLabel();
        panel19 = new javax.swing.JPanel();
        label19 = new javax.swing.JLabel();
        panel20 = new javax.swing.JPanel();
        label20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        panel21 = new javax.swing.JPanel();
        label21 = new javax.swing.JLabel();
        panel22 = new javax.swing.JPanel();
        label22 = new javax.swing.JLabel();
        panel23 = new javax.swing.JPanel();
        label23 = new javax.swing.JLabel();
        panel24 = new javax.swing.JPanel();
        label24 = new javax.swing.JLabel();
        panel25 = new javax.swing.JPanel();
        label25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        labelImagen.setBackground(new java.awt.Color(255, 255, 255));
        labelImagen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelImagen.setForeground(new java.awt.Color(255, 255, 255));
        labelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setPreferredSize(new java.awt.Dimension(200, 130));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setPreferredSize(new java.awt.Dimension(200, 130));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel2MousePressed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("2");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel3.setBackground(new java.awt.Color(51, 51, 51));
        panel3.setPreferredSize(new java.awt.Dimension(200, 130));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel3MousePressed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("3");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel4.setBackground(new java.awt.Color(51, 51, 51));
        panel4.setPreferredSize(new java.awt.Dimension(200, 130));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel4MousePressed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("4");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel5.setBackground(new java.awt.Color(51, 51, 51));
        panel5.setPreferredSize(new java.awt.Dimension(200, 130));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel5MousePressed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("5");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        panel6.setBackground(new java.awt.Color(51, 51, 51));
        panel6.setPreferredSize(new java.awt.Dimension(200, 130));
        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel6MousePressed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("6");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel7.setBackground(new java.awt.Color(51, 51, 51));
        panel7.setPreferredSize(new java.awt.Dimension(200, 130));
        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel7MousePressed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("7");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel8.setBackground(new java.awt.Color(51, 51, 51));
        panel8.setPreferredSize(new java.awt.Dimension(200, 130));
        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel8MousePressed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("8");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel9.setBackground(new java.awt.Color(51, 51, 51));
        panel9.setPreferredSize(new java.awt.Dimension(200, 130));
        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel9MousePressed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("9");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel10.setBackground(new java.awt.Color(51, 51, 51));
        panel10.setPreferredSize(new java.awt.Dimension(200, 130));
        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel10MousePressed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("10");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(panel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        panel11.setBackground(new java.awt.Color(51, 51, 51));
        panel11.setPreferredSize(new java.awt.Dimension(200, 130));
        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel11MousePressed(evt);
            }
        });

        label11.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("11");

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel12.setBackground(new java.awt.Color(51, 51, 51));
        panel12.setPreferredSize(new java.awt.Dimension(200, 130));
        panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel12MousePressed(evt);
            }
        });

        label12.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("12");
        label12.setToolTipText("");
        label12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel13.setBackground(new java.awt.Color(51, 51, 51));
        panel13.setPreferredSize(new java.awt.Dimension(200, 130));
        panel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel13MousePressed(evt);
            }
        });

        label13.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText("13");

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel14.setBackground(new java.awt.Color(51, 51, 51));
        panel14.setPreferredSize(new java.awt.Dimension(200, 130));
        panel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel14MousePressed(evt);
            }
        });

        label14.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("14");

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel15.setBackground(new java.awt.Color(51, 51, 51));
        panel15.setPreferredSize(new java.awt.Dimension(200, 130));
        panel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel15MousePressed(evt);
            }
        });

        label15.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText("15");
        label15.setToolTipText("");
        label15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        panel16.setBackground(new java.awt.Color(51, 51, 51));
        panel16.setPreferredSize(new java.awt.Dimension(200, 130));
        panel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel16MousePressed(evt);
            }
        });

        label16.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setText("16");

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel17.setBackground(new java.awt.Color(51, 51, 51));
        panel17.setPreferredSize(new java.awt.Dimension(200, 130));
        panel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel17MousePressed(evt);
            }
        });

        label17.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label17.setText("17");

        javax.swing.GroupLayout panel17Layout = new javax.swing.GroupLayout(panel17);
        panel17.setLayout(panel17Layout);
        panel17Layout.setHorizontalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel17Layout.setVerticalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel18.setBackground(new java.awt.Color(51, 51, 51));
        panel18.setPreferredSize(new java.awt.Dimension(200, 130));
        panel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel18MousePressed(evt);
            }
        });

        label18.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label18.setForeground(new java.awt.Color(255, 255, 255));
        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("18");

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel19.setBackground(new java.awt.Color(51, 51, 51));
        panel19.setPreferredSize(new java.awt.Dimension(200, 130));
        panel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel19MousePressed(evt);
            }
        });

        label19.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label19.setForeground(new java.awt.Color(255, 255, 255));
        label19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label19.setText("19");

        javax.swing.GroupLayout panel19Layout = new javax.swing.GroupLayout(panel19);
        panel19.setLayout(panel19Layout);
        panel19Layout.setHorizontalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label19, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel19Layout.setVerticalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label19, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel20.setBackground(new java.awt.Color(51, 51, 51));
        panel20.setPreferredSize(new java.awt.Dimension(200, 130));
        panel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel20MousePressed(evt);
            }
        });

        label20.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label20.setForeground(new java.awt.Color(255, 255, 255));
        label20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label20.setText("20");

        javax.swing.GroupLayout panel20Layout = new javax.swing.GroupLayout(panel20);
        panel20.setLayout(panel20Layout);
        panel20Layout.setHorizontalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label20, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel20Layout.setVerticalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label20, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        panel21.setBackground(new java.awt.Color(51, 51, 51));
        panel21.setPreferredSize(new java.awt.Dimension(200, 130));
        panel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel21MousePressed(evt);
            }
        });

        label21.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label21.setForeground(new java.awt.Color(255, 255, 255));
        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setText("21");

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label21, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label21, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel22.setBackground(new java.awt.Color(51, 51, 51));
        panel22.setPreferredSize(new java.awt.Dimension(200, 130));
        panel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel22MousePressed(evt);
            }
        });

        label22.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label22.setForeground(new java.awt.Color(255, 255, 255));
        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setText("22");

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label22, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel23.setBackground(new java.awt.Color(51, 51, 51));
        panel23.setPreferredSize(new java.awt.Dimension(200, 130));
        panel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel23MousePressed(evt);
            }
        });

        label23.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label23.setForeground(new java.awt.Color(255, 255, 255));
        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setText("23");

        javax.swing.GroupLayout panel23Layout = new javax.swing.GroupLayout(panel23);
        panel23.setLayout(panel23Layout);
        panel23Layout.setHorizontalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label23, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel23Layout.setVerticalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label23, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel24.setBackground(new java.awt.Color(51, 51, 51));
        panel24.setPreferredSize(new java.awt.Dimension(200, 130));
        panel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel24MousePressed(evt);
            }
        });

        label24.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label24.setForeground(new java.awt.Color(255, 255, 255));
        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setText("24");

        javax.swing.GroupLayout panel24Layout = new javax.swing.GroupLayout(panel24);
        panel24.setLayout(panel24Layout);
        panel24Layout.setHorizontalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label24, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel24Layout.setVerticalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label24, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel25.setBackground(new java.awt.Color(51, 51, 51));
        panel25.setPreferredSize(new java.awt.Dimension(200, 130));
        panel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel25MousePressed(evt);
            }
        });

        label25.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        label25.setForeground(new java.awt.Color(255, 255, 255));
        label25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label25.setText("25");

        javax.swing.GroupLayout panel25Layout = new javax.swing.GroupLayout(panel25);
        panel25.setLayout(panel25Layout);
        panel25Layout.setHorizontalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label25, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel25Layout.setVerticalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label25, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed

    }//GEN-LAST:event_jButton6KeyPressed

    private void panel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel25MousePressed
        ComandaCobro(25);
    }//GEN-LAST:event_panel25MousePressed

    private void panel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel24MousePressed
        ComandaCobro(24);
    }//GEN-LAST:event_panel24MousePressed

    private void panel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel23MousePressed
        ComandaCobro(23);
    }//GEN-LAST:event_panel23MousePressed

    private void panel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel22MousePressed
        ComandaCobro(22);
    }//GEN-LAST:event_panel22MousePressed

    private void panel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel21MousePressed
        ComandaCobro(21);
    }//GEN-LAST:event_panel21MousePressed

    private void panel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel20MousePressed
        ComandaCobro(20);
    }//GEN-LAST:event_panel20MousePressed

    private void panel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel19MousePressed
        ComandaCobro(19);
    }//GEN-LAST:event_panel19MousePressed

    private void panel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel18MousePressed
        ComandaCobro(18);
    }//GEN-LAST:event_panel18MousePressed

    private void panel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel17MousePressed
        ComandaCobro(17);
    }//GEN-LAST:event_panel17MousePressed

    private void panel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel16MousePressed
        ComandaCobro(16);
    }//GEN-LAST:event_panel16MousePressed

    private void panel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel15MousePressed
        ComandaCobro(15);
    }//GEN-LAST:event_panel15MousePressed

    private void label15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label15MousePressed
        ComandaCobro(15);
    }//GEN-LAST:event_label15MousePressed

    private void panel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel14MousePressed
        ComandaCobro(14);
    }//GEN-LAST:event_panel14MousePressed

    private void panel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel13MousePressed
        ComandaCobro(13);
    }//GEN-LAST:event_panel13MousePressed

    private void panel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MousePressed
        ComandaCobro(12);
    }//GEN-LAST:event_panel12MousePressed

    private void label12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label12MousePressed
        ComandaCobro(12);
    }//GEN-LAST:event_label12MousePressed

    private void panel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MousePressed
        ComandaCobro(11);
    }//GEN-LAST:event_panel11MousePressed

    private void panel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MousePressed
        ComandaCobro(10);
    }//GEN-LAST:event_panel10MousePressed

    private void panel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MousePressed
        ComandaCobro(9);
    }//GEN-LAST:event_panel9MousePressed

    private void panel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MousePressed
        ComandaCobro(8);
    }//GEN-LAST:event_panel8MousePressed

    private void panel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MousePressed
        ComandaCobro(7);
    }//GEN-LAST:event_panel7MousePressed

    private void panel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MousePressed
        ComandaCobro(6);
    }//GEN-LAST:event_panel6MousePressed

    private void panel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MousePressed
        ComandaCobro(5);
    }//GEN-LAST:event_panel5MousePressed

    private void panel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MousePressed
        ComandaCobro(4);
    }//GEN-LAST:event_panel4MousePressed

    private void panel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MousePressed
        ComandaCobro(3);
    }//GEN-LAST:event_panel3MousePressed

    private void panel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MousePressed
        ComandaCobro(2);
    }//GEN-LAST:event_panel2MousePressed

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
        ComandaCobro(1);
    }//GEN-LAST:event_panel1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label24;
    private javax.swing.JLabel label25;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private javax.swing.JPanel panel16;
    private javax.swing.JPanel panel17;
    private javax.swing.JPanel panel18;
    private javax.swing.JPanel panel19;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel20;
    private javax.swing.JPanel panel21;
    private javax.swing.JPanel panel22;
    private javax.swing.JPanel panel23;
    private javax.swing.JPanel panel24;
    private javax.swing.JPanel panel25;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    // End of variables declaration//GEN-END:variables
   
    public void InitData(){
        GuiUtils gu = new GuiUtils();
        labelImagen.setIcon(gu.ImageLabel("/Imagenes/logoriginal.png", labelImagen));
        setTables();
        getTables();
        gu.OpenJFrame(this);
    }

    private void ComandaCobro(int table) {
        System.out.println("Mesa = " + table);
        Command tc = new Command(this, true);
        
        if (!tables.get(table - 1).isActive()) {
            TableSelectUser tsu = new TableSelectUser(this, true);
            tsu.InitData(tables.get(table - 1).getTable());
            if (tsu.isState()) {
                setTables();
                getTables();
                tc.InitData(table);
            }
        } else {
            if (tables.get(table - 1).isClose()) {
                System.out.println("Cobro");
                Cobro c= new Cobro(this, true);
                c.InitData(tables.get(table -1).getId());
            } else {
                System.out.println("Mesa ocupada");
                tc.InitData(table);
                getTables();
            }
        }
    }
    
    private void getTables(){
        List<TablesDto> result = st.getTablesActive();
        if (result != null) {
            for (TablesDto data : result) {
                int pos = data.getTable() - 1;
                if (!data.isClose()) {
                    tables.get(pos).setId(data.getId());
                    tables.get(pos).setActive(true);
                    tables.get(pos).setUser(data.getUser());
                    tables.get(pos).getLabel().setForeground(Color.YELLOW);
                    tables.get(pos).setClose(false);
                }else{
                    tables.get(pos).setId(data.getId());
                    tables.get(pos).setActive(true);
                    tables.get(pos).setUser(data.getUser());
                    tables.get(pos).getLabel().setForeground(Color.red);
                    tables.get(pos).setClose(true);
                }
            }
        }else{
            System.out.println("InitData. Sin datos");
        }
    }
    
    private void setTables(){
        tables.add(new TablesDto(0, panel1, label1,1,false,true, null));
        tables.add(new TablesDto(0, panel2, label2,2,false,true, null));
        tables.add(new TablesDto(0, panel3, label3,3,false,true, null));
        tables.add(new TablesDto(0, panel4, label4,4,false,true, null));
        tables.add(new TablesDto(0, panel5, label5,5,false,true, null));
        tables.add(new TablesDto(0, panel6, label6,6,false,true, null));
        tables.add(new TablesDto(0, panel7, label7,7,false,true, null));
        tables.add(new TablesDto(0, panel8, label8,8,false,true, null));
        tables.add(new TablesDto(0, panel9, label9,9,false,true, null));
        tables.add(new TablesDto(0, panel10, label10,10,false,true, null));
        tables.add(new TablesDto(0, panel11, label11,11,false,true, null));
        tables.add(new TablesDto(0, panel12, label12,12,false,true, null));
        tables.add(new TablesDto(0, panel13, label13,13,false,true, null));
        tables.add(new TablesDto(0, panel14, label14,14,false,true, null));
        tables.add(new TablesDto(0, panel15, label15,15,false,true, null));
        tables.add(new TablesDto(0, panel16, label16,16,false,true, null));
        tables.add(new TablesDto(0, panel17, label17,17,false,true, null));
        tables.add(new TablesDto(0, panel18, label18,18,false,true, null));
        tables.add(new TablesDto(0, panel19, label19,19,false,true, null));
        tables.add(new TablesDto(0, panel20, label20,20,false,true, null));
        tables.add(new TablesDto(0, panel21, label21,21,false,true, null));
        tables.add(new TablesDto(0, panel22, label22,22,false,true, null));
        tables.add(new TablesDto(0, panel23, label23,23,false,true, null));
        tables.add(new TablesDto(0, panel24, label24,24,false,true, null));
        tables.add(new TablesDto(0, panel25, label25,25,false,true, null));
    }

}
