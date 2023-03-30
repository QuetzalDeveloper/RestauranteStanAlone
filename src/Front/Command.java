/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package Front;

import DTO.CommandInitDto;
import DTO.MenuContainersDto;
import DTO.MenuDto;
import DTO.MenuSaleDto;
import DTO.TypeFoodDto;
import Services.CommandService;
import Services.MenuService;
import Utils.GuiUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static Constants.MessageConstants.MESSAGE_WARNING;
import static Constants.MessageConstants.MESSAGE_CONFIRM;
import DTO.MessageDto;
import DTO.VentaDto;
import Utils.DatesFormat;

/**
 * @file TableCommand.java
 * @author Diego Hernandez Cote
 * @owner QuetzalApps
 * @date 24 mar. 2023
 */
public class Command extends javax.swing.JDialog {
    
    private CommandService cs = new CommandService();
    private CommandInitDto commandData;
    private List<MenuContainersDto> containers = new ArrayList<>();
    private List<MenuDto> menu = new ArrayList<>();
    private List<MenuSaleDto> product = new ArrayList<>();
    private MessageUser mu = new MessageUser(this, true);

    public Command(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        labelClave = new javax.swing.JLabel();
        labelMesa = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        labelNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboTipo = new javax.swing.JComboBox<>();
        p1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        l4 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        l5 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        l6 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        l7 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        l8 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        l9 = new javax.swing.JLabel();
        p11 = new javax.swing.JPanel();
        l11 = new javax.swing.JLabel();
        p13 = new javax.swing.JPanel();
        l13 = new javax.swing.JLabel();
        p15 = new javax.swing.JPanel();
        l15 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        l10 = new javax.swing.JLabel();
        p12 = new javax.swing.JPanel();
        l12 = new javax.swing.JLabel();
        p14 = new javax.swing.JPanel();
        l14 = new javax.swing.JLabel();
        p16 = new javax.swing.JPanel();
        l16 = new javax.swing.JLabel();
        p17 = new javax.swing.JPanel();
        l17 = new javax.swing.JLabel();
        p19 = new javax.swing.JPanel();
        l19 = new javax.swing.JLabel();
        p21 = new javax.swing.JPanel();
        l21 = new javax.swing.JLabel();
        p18 = new javax.swing.JPanel();
        l18 = new javax.swing.JLabel();
        p20 = new javax.swing.JPanel();
        l20 = new javax.swing.JLabel();
        p22 = new javax.swing.JPanel();
        l22 = new javax.swing.JLabel();
        p23 = new javax.swing.JPanel();
        l23 = new javax.swing.JLabel();
        p24 = new javax.swing.JPanel();
        l24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tablaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(250);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        labelClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelClave.setForeground(new java.awt.Color(255, 255, 255));
        labelClave.setText("Nombre");

        labelMesa.setBackground(new java.awt.Color(0, 0, 0));
        labelMesa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelMesa.setForeground(new java.awt.Color(204, 153, 0));
        labelMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMesa.setText("0");

        jToggleButton1.setBackground(new java.awt.Color(153, 0, 204));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        jToggleButton1.setText("Quitar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jToggleButton1comboTipoKeyTyped(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelClave, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboTipo.setMaximumRowCount(20);
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        comboTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboTipoKeyTyped(evt);
            }
        });

        p1.setBackground(new java.awt.Color(51, 51, 51));
        p1.setPreferredSize(new java.awt.Dimension(130, 130));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p1MousePressed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p2.setBackground(new java.awt.Color(51, 51, 51));
        p2.setPreferredSize(new java.awt.Dimension(130, 130));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p4.setBackground(new java.awt.Color(51, 51, 51));
        p4.setPreferredSize(new java.awt.Dimension(130, 130));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p4MousePressed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p5.setBackground(new java.awt.Color(51, 51, 51));
        p5.setPreferredSize(new java.awt.Dimension(130, 130));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p5MousePressed(evt);
            }
        });

        l5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p3.setBackground(new java.awt.Color(51, 51, 51));
        p3.setPreferredSize(new java.awt.Dimension(130, 130));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p3MousePressed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p6.setBackground(new java.awt.Color(51, 51, 51));
        p6.setPreferredSize(new java.awt.Dimension(130, 130));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p6MousePressed(evt);
            }
        });

        l6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p7.setBackground(new java.awt.Color(51, 51, 51));
        p7.setPreferredSize(new java.awt.Dimension(130, 130));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p7MousePressed(evt);
            }
        });

        l7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p8.setBackground(new java.awt.Color(51, 51, 51));
        p8.setPreferredSize(new java.awt.Dimension(130, 130));
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p8MousePressed(evt);
            }
        });

        l8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p9.setBackground(new java.awt.Color(51, 51, 51));
        p9.setPreferredSize(new java.awt.Dimension(130, 130));
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p9MousePressed(evt);
            }
        });

        l9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l9, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p11.setBackground(new java.awt.Color(51, 51, 51));
        p11.setPreferredSize(new java.awt.Dimension(130, 130));
        p11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p11MousePressed(evt);
            }
        });

        l11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p13.setBackground(new java.awt.Color(51, 51, 51));
        p13.setPreferredSize(new java.awt.Dimension(130, 130));
        p13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p13MousePressed(evt);
            }
        });

        l13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l13.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p15.setBackground(new java.awt.Color(51, 51, 51));
        p15.setPreferredSize(new java.awt.Dimension(130, 130));
        p15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p15MousePressed(evt);
            }
        });

        l15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l15.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p15Layout = new javax.swing.GroupLayout(p15);
        p15.setLayout(p15Layout);
        p15Layout.setHorizontalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p15Layout.setVerticalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p10.setBackground(new java.awt.Color(51, 51, 51));
        p10.setPreferredSize(new java.awt.Dimension(130, 130));
        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p10MousePressed(evt);
            }
        });

        l10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l10, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p12.setBackground(new java.awt.Color(51, 51, 51));
        p12.setPreferredSize(new java.awt.Dimension(130, 130));
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p12MousePressed(evt);
            }
        });

        l12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p14.setBackground(new java.awt.Color(51, 51, 51));
        p14.setPreferredSize(new java.awt.Dimension(130, 130));
        p14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p14MousePressed(evt);
            }
        });

        l14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l14.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p14Layout = new javax.swing.GroupLayout(p14);
        p14.setLayout(p14Layout);
        p14Layout.setHorizontalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p14Layout.setVerticalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l14, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p16.setBackground(new java.awt.Color(51, 51, 51));
        p16.setPreferredSize(new java.awt.Dimension(130, 130));
        p16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p16MousePressed(evt);
            }
        });

        l16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l16.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p16Layout = new javax.swing.GroupLayout(p16);
        p16.setLayout(p16Layout);
        p16Layout.setHorizontalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p16Layout.setVerticalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l16, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p17.setBackground(new java.awt.Color(51, 51, 51));
        p17.setPreferredSize(new java.awt.Dimension(130, 130));
        p17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p17MousePressed(evt);
            }
        });

        l17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l17.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p17Layout = new javax.swing.GroupLayout(p17);
        p17.setLayout(p17Layout);
        p17Layout.setHorizontalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l17, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p17Layout.setVerticalGroup(
            p17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p19.setBackground(new java.awt.Color(51, 51, 51));
        p19.setPreferredSize(new java.awt.Dimension(130, 130));
        p19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p19MousePressed(evt);
            }
        });

        l19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l19.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p19Layout = new javax.swing.GroupLayout(p19);
        p19.setLayout(p19Layout);
        p19Layout.setHorizontalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p19Layout.setVerticalGroup(
            p19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l19, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p21.setBackground(new java.awt.Color(51, 51, 51));
        p21.setPreferredSize(new java.awt.Dimension(130, 130));
        p21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p21MousePressed(evt);
            }
        });

        l21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l21.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p21Layout = new javax.swing.GroupLayout(p21);
        p21.setLayout(p21Layout);
        p21Layout.setHorizontalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p21Layout.setVerticalGroup(
            p21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l21, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p18.setBackground(new java.awt.Color(51, 51, 51));
        p18.setPreferredSize(new java.awt.Dimension(130, 130));
        p18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p18MousePressed(evt);
            }
        });

        l18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l18.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p18Layout = new javax.swing.GroupLayout(p18);
        p18.setLayout(p18Layout);
        p18Layout.setHorizontalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l18, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p18Layout.setVerticalGroup(
            p18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l18, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p20.setBackground(new java.awt.Color(51, 51, 51));
        p20.setPreferredSize(new java.awt.Dimension(130, 130));
        p20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p20MousePressed(evt);
            }
        });

        l20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l20.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p20Layout = new javax.swing.GroupLayout(p20);
        p20.setLayout(p20Layout);
        p20Layout.setHorizontalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p20Layout.setVerticalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l20, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p22.setBackground(new java.awt.Color(51, 51, 51));
        p22.setPreferredSize(new java.awt.Dimension(130, 130));
        p22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p22MousePressed(evt);
            }
        });

        l22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l22.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p22Layout = new javax.swing.GroupLayout(p22);
        p22.setLayout(p22Layout);
        p22Layout.setHorizontalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p22Layout.setVerticalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l22, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p23.setBackground(new java.awt.Color(51, 51, 51));
        p23.setPreferredSize(new java.awt.Dimension(130, 130));
        p23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p23MousePressed(evt);
            }
        });

        l23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l23.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p23Layout = new javax.swing.GroupLayout(p23);
        p23.setLayout(p23Layout);
        p23Layout.setHorizontalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l23, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        p23Layout.setVerticalGroup(
            p23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l23, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        p24.setBackground(new java.awt.Color(51, 51, 51));
        p24.setPreferredSize(new java.awt.Dimension(130, 130));
        p24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p24MousePressed(evt);
            }
        });

        l24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l24.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p24Layout = new javax.swing.GroupLayout(p24);
        p24.setLayout(p24Layout);
        p24Layout.setHorizontalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p24Layout.setVerticalGroup(
            p24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l24, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(p15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p16, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p14, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(p12, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(p21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(p22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(p23, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p24, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(p7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3comboTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton3comboTipoKeyTyped(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarmesa.png"))); // NOI18N
        jButton4.setText("Cerrar mesa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4comboTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton4comboTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMousePressed

    }//GEN-LAST:event_tablaProductosMousePressed

    private void tablaProductoscomboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProductoscomboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProductoscomboTipoKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        QuitarPlatillo();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToggleButton1comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1comboTipoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SaveData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3comboTipoKeyPressed

    }//GEN-LAST:event_jButton3comboTipoKeyPressed

    private void jButton3comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3comboTipoKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CerrarMesa();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4comboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4comboTipoKeyPressed
        
    }//GEN-LAST:event_jButton4comboTipoKeyPressed

    private void jButton4comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4comboTipoKeyTyped

    private void comboTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoKeyTyped

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        MostrarPlatillos();
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        AgregarPlatillo(2);
    }//GEN-LAST:event_p2MousePressed

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
        AgregarPlatillo(1);
    }//GEN-LAST:event_p1MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        AgregarPlatillo(4);
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
        AgregarPlatillo(5);
    }//GEN-LAST:event_p5MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        AgregarPlatillo(3);
    }//GEN-LAST:event_p3MousePressed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
        AgregarPlatillo(6);
    }//GEN-LAST:event_p6MousePressed

    private void p7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MousePressed
        AgregarPlatillo(7);
    }//GEN-LAST:event_p7MousePressed

    private void p8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MousePressed
        AgregarPlatillo(8);
    }//GEN-LAST:event_p8MousePressed

    private void p9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MousePressed
        AgregarPlatillo(9);
    }//GEN-LAST:event_p9MousePressed

    private void p11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MousePressed
        AgregarPlatillo(11);
    }//GEN-LAST:event_p11MousePressed

    private void p13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MousePressed
        AgregarPlatillo(13);
    }//GEN-LAST:event_p13MousePressed

    private void p15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MousePressed
        AgregarPlatillo(15);
    }//GEN-LAST:event_p15MousePressed

    private void p10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MousePressed
        AgregarPlatillo(10);
    }//GEN-LAST:event_p10MousePressed

    private void p12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MousePressed
        AgregarPlatillo(12);
    }//GEN-LAST:event_p12MousePressed

    private void p14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MousePressed
        AgregarPlatillo(14);
    }//GEN-LAST:event_p14MousePressed

    private void p16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MousePressed
        AgregarPlatillo(16);
    }//GEN-LAST:event_p16MousePressed

    private void p17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17MousePressed
        AgregarPlatillo(17);
    }//GEN-LAST:event_p17MousePressed

    private void p19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19MousePressed
        AgregarPlatillo(19);
    }//GEN-LAST:event_p19MousePressed

    private void p21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21MousePressed
        AgregarPlatillo(21);
    }//GEN-LAST:event_p21MousePressed

    private void p18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18MousePressed
        AgregarPlatillo(18);
    }//GEN-LAST:event_p18MousePressed

    private void p20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20MousePressed
        AgregarPlatillo(20);
    }//GEN-LAST:event_p20MousePressed

    private void p22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22MousePressed
        AgregarPlatillo(22);
    }//GEN-LAST:event_p22MousePressed

    private void p23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23MousePressed
        AgregarPlatillo(23);
    }//GEN-LAST:event_p23MousePressed

    private void p24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p24MousePressed
        AgregarPlatillo(24);
    }//GEN-LAST:event_p24MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelMesa;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p15;
    private javax.swing.JPanel p16;
    private javax.swing.JPanel p17;
    private javax.swing.JPanel p18;
    private javax.swing.JPanel p19;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p20;
    private javax.swing.JPanel p21;
    private javax.swing.JPanel p22;
    private javax.swing.JPanel p23;
    private javax.swing.JPanel p24;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    private void CerrarMesa(){
        MessageDto md = new MessageDto("Confirmar", "¿Estás segur@ de cerarr la mesa?, ya no podrás agregar mas platillos a la cuenta.", MESSAGE_CONFIRM);
        GuiUtils gu = new GuiUtils();
        mu.ShowMessage(md);
        if(mu.getSelection()){
            DatesFormat df = new DatesFormat();
            VentaDto sale = new VentaDto();
            CommandDiscount cd = new CommandDiscount(this, true);
            sale.setId(commandData.getIdSale());
            sale.setTable(commandData.getTable());
            sale.setIdUser(commandData.getIdUser());
            sale.setEndDate(df.getTodayDateTime());
            sale.setSubTotal(cs.getSubTotal(product));
            cd.Init();
            sale.setDiscount(cd.getDiscount());
            sale.setTotal(sale.getSubTotal() - sale.getDiscount());
            sale.setClose(true);
            cs.CloseSale(sale);
            //gu.PrintTicketSale(commandData, product, sale);
            this.dispose();
        }else{
            md.setTitle("Cancelado");
            md.setMessage("La operación ha sido candelada");
            md.setType(MESSAGE_WARNING);
        }        
    }
    
    private void QuitarPlatillo(){
        int index = tablaProductos.getSelectedRow();
        if(index >= 0){
            //substract
            if(product.get(index).getQuantity() > 1){
                MenuSaleDto data = new MenuSaleDto();            
                data.setId(product.get(index).getId());
                data.setQuantity(product.get(index).getQuantity() - 1);
                data.setPrice(product.get(index).getPrice());
                data.setTotal(product.get(index).getTotal() - data.getPrice());
                if(cs.UpdateMenuSale(data)){
                    System.out.println("Lista actualizada");
                    DataTable();
                }else{
                    System.out.println("Ha ocurrido un error");
                }
            }else{  //Delete
                if(cs.DeleteMenuSale(product.get(index).getId())){
                    System.out.println("Producto eliminado");
                    DataTable();
                }else{
                    System.out.println("Ha ocirrido un problema");
                }
            }
            DataTable();
        }else{
            MessageDto message = new MessageDto("Selecciona", "Selecciona el platillo que deseas quitar desde la tabla de arriba", MESSAGE_WARNING);
            mu.ShowMessage(message);
        }
    }
    
    private void AgregarPlatillo(int position){
        int index = position -1;
        if(index < menu.size()){
            int exist = cs.SearchProduct(product, menu.get(index).getId());
            MenuSaleDto data = new MenuSaleDto();
            //Exist
            if( exist >= 0){
                data.setId(product.get(exist).getId());
                data.setQuantity(product.get(exist).getQuantity() + 1);
                data.setPrice(product.get(exist).getPrice());
                data.setTotal(product.get(exist).getTotal() + data.getPrice());
                if(cs.UpdateMenuSale(data)){
                    System.out.println("Lista actualizada");
                    DataTable();
                }else{
                    System.out.println("Ha ocurrido un error");
                }
            }else{  //Not exist
                data.setIdSale(commandData.getIdSale());
                data.setIdMenu(menu.get(index).getId());
                data.setPrice(menu.get(index).getCost());
                data.setTotal(menu.get(index).getCost());
                if(cs.InsertMenuSale(data)){
                    System.out.println("Producto agregado");
                    DataTable();
                }else{
                    System.out.println("Ha ocirrido un error");
                }
            }
        }else{
            System.out.println("Seleccion fuera de rango");
        }
    }
    
    private void MostrarPlatillos(){
        int option = comboTipo.getSelectedIndex();
        if(option > 0){
            menu = cs.getMenuTypeItem(option);
            int pos  = 0;
            for(MenuDto data : menu) {
                if(pos < 24){
                    containers.get(pos).getLabel().setText(data.getName());
                    pos++;
                }else{
                    return;
                }
            }
        }
    }
    
    public void InitData(int table){
        GuiUtils gu = new GuiUtils();
        MenuService ms = new MenuService();
        commandData = cs.getCommandInit(table);
        labelMesa.setText(String.valueOf(commandData.getTable()));
        labelClave.setText(commandData.getIdUser());
        labelNombre.setText(commandData.getUserName());
        List<TypeFoodDto> type = ms.getTypeFood();
        comboTipo.addItem("Selecciona...");
        for(TypeFoodDto data : type){
            comboTipo.addItem(data.getNombreTipo());
        }
        setMenuContainers();
        DataTable();
        gu.OpenJDialog(this);
    }
       
    private void DataTable(){
        GuiUtils gu = new GuiUtils();
        DefaultTableModel dtm = gu.ClearTable(tablaProductos);
        tablaProductos.setModel(dtm);
        product = cs.getMenuSale(commandData.getIdSale());
        for(MenuSaleDto data : product){
            dtm.addRow(new Object[]{
                data.getMenuName(),
                data.getQuantity()
            });
        }
    }
    
    private void SaveData(){
        this.dispose();
    }
        
    private void setMenuContainers(){
        containers.add(new MenuContainersDto(p1, l1));
        containers.add(new MenuContainersDto(p2, l2));
        containers.add(new MenuContainersDto(p3, l3));
        containers.add(new MenuContainersDto(p4, l4));
        containers.add(new MenuContainersDto(p5, l5));
        containers.add(new MenuContainersDto(p6, l6));
        containers.add(new MenuContainersDto(p7, l7));
        containers.add(new MenuContainersDto(p8, l8));
        containers.add(new MenuContainersDto(p9, l9));
        containers.add(new MenuContainersDto(p10, l10));
        containers.add(new MenuContainersDto(p11, l11));
        containers.add(new MenuContainersDto(p12, l12));
        containers.add(new MenuContainersDto(p13, l13));
        containers.add(new MenuContainersDto(p14, l14));
        containers.add(new MenuContainersDto(p15, l15));
        containers.add(new MenuContainersDto(p16, l16));
        containers.add(new MenuContainersDto(p17, l17));
        containers.add(new MenuContainersDto(p18, l18));
        containers.add(new MenuContainersDto(p19, l19));
        containers.add(new MenuContainersDto(p20, l20));
        containers.add(new MenuContainersDto(p21, l21));
        containers.add(new MenuContainersDto(p22, l22));
        containers.add(new MenuContainersDto(p23, l23));
        containers.add(new MenuContainersDto(p24, l24));
    }

}
