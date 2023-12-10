/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;


import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import java.util.Iterator;
import model.Account;


/**
 *
 * @author Robot
 */
public class ThongKeForm extends javax.swing.JInternalFrame {

    private DefaultTableModel tblModel;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY HH:mm");

    public DecimalFormat getFormatter() {
        return formatter;
    }

    public SimpleDateFormat getFormatDate() {
        return formatDate;
    }

    public ThongKeForm() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
       
     
       
        //
        initTable();
        loadDataToTable();
        txtQuantityProduct.setText(Integer.toString(Run.ProductData.size()));
        txtQuantityUser.setText(Integer.toString(Run.AccountData.size()));
    }

    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã phiếu nhập", "Người tạo", "Thời gian tạo", "Tổng tiền"};
        tblModel.setColumnIdentifiers(headerTbl);
      
    }

    private void loadDataToTable() {
        
    }

  



   

  

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtQuantityProduct = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtQuantityNcc = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtQuantityUser = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        btnDetail2 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jComboBoxLuaChon3 = new javax.swing.JComboBox<>();
        jTextFieldSearch3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPhieuNhap2 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jDateChooserFrom2 = new com.toedter.calendar.JDateChooser();
        jDateChooserTo2 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        giaTu2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        giaDen2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        soLuong1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tongTien1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1180, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 204, 0));

        txtQuantityProduct.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtQuantityProduct.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantityProduct.setText("100");

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sản phẩm trong kho");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-monitor-80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(73, 73, 73))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(10, 10, 10))
        );

        jPanel10.setBackground(new java.awt.Color(255, 102, 0));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-supplier-80.png"))); // NOI18N

        txtQuantityNcc.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtQuantityNcc.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantityNcc.setText("100");

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Doanh số");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantityNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtQuantityNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(10, 10, 10))
        );

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-account-80.png"))); // NOI18N

        txtQuantityUser.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtQuantityUser.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantityUser.setText("100");

        jLabel17.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tài khoản người dùng");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantityUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(73, 73, 73))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtQuantityUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 130));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jToolBar3.setRollover(true);

        btnDetail2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_40px.png"))); // NOI18N
        btnDetail2.setText("Xem chi tiết");
        btnDetail2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetail2.setFocusable(false);
        btnDetail2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetail2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDetail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail2btnDetailActionPerformed(evt);
            }
        });
        jToolBar3.add(btnDetail2);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxLuaChon3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Phiếu Nhập", "Phiếu Xuất" }));
        jComboBoxLuaChon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLuaChon3jComboBoxLuaChonActionPerformed(evt);
            }
        });
        jComboBoxLuaChon3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxLuaChon3jComboBoxLuaChonPropertyChange(evt);
            }
        });
        jPanel22.add(jComboBoxLuaChon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 40));

        jTextFieldSearch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearch3jTextFieldSearchKeyReleased(evt);
            }
        });
        jPanel22.add(jTextFieldSearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 310, 40));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_reset_25px_1.png"))); // NOI18N
        jButton9.setText("Làm mới");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton7ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 140, 40));

        tblPhieuNhap2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblPhieuNhap2);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc theo ngày"));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooserFrom2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFrom2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserFrom2jDateChooserFromPropertyChange(evt);
            }
        });
        jDateChooserFrom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooserFrom2jDateChooserFromKeyReleased(evt);
            }
        });
        jPanel23.add(jDateChooserFrom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, -1));

        jDateChooserTo2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserTo2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserTo2jDateChooserToPropertyChange(evt);
            }
        });
        jDateChooserTo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooserTo2jDateChooserToKeyReleased(evt);
            }
        });
        jPanel23.add(jDateChooserTo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 170, -1));

        jLabel19.setText("Đến");
        jPanel23.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 40, 20));

        jLabel20.setText("Từ");
        jPanel23.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, 20));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc theo giá"));

        jLabel21.setText("Từ");

        giaTu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaTu2giaTuActionPerformed(evt);
            }
        });
        giaTu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giaTu2giaTuKeyReleased(evt);
            }
        });

        jLabel22.setText("Đến");

        giaDen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaDen2giaDenActionPerformed(evt);
            }
        });
        giaDen2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giaDen2giaDenKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giaTu2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel22)
                .addGap(28, 28, 28)
                .addComponent(giaDen2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(giaTu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(giaDen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel23.setText("TỔNG TIỀN");

        soLuong1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        soLuong1.setText("0");

        jLabel24.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel24.setText("TỔNG PHIẾU ");

        tongTien1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        tongTien1.setForeground(new java.awt.Color(255, 0, 51));
        tongTien1.setText("0");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Phiếu xuất");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1180, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetail2btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail2btnDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetail2btnDetailActionPerformed

    private void jComboBoxLuaChon3jComboBoxLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLuaChon3jComboBoxLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLuaChon3jComboBoxLuaChonActionPerformed

    private void jComboBoxLuaChon3jComboBoxLuaChonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxLuaChon3jComboBoxLuaChonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLuaChon3jComboBoxLuaChonPropertyChange

    private void jTextFieldSearch3jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearch3jTextFieldSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearch3jTextFieldSearchKeyReleased

    private void jButton9jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9jButton7ActionPerformed

    private void jDateChooserFrom2jDateChooserFromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserFrom2jDateChooserFromPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFrom2jDateChooserFromPropertyChange

    private void jDateChooserFrom2jDateChooserFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFrom2jDateChooserFromKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFrom2jDateChooserFromKeyReleased

    private void jDateChooserTo2jDateChooserToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserTo2jDateChooserToPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserTo2jDateChooserToPropertyChange

    private void jDateChooserTo2jDateChooserToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserTo2jDateChooserToKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserTo2jDateChooserToKeyReleased

    private void giaTu2giaTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaTu2giaTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaTu2giaTuActionPerformed

    private void giaTu2giaTuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giaTu2giaTuKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_giaTu2giaTuKeyReleased

    private void giaDen2giaDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaDen2giaDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaDen2giaDenActionPerformed

    private void giaDen2giaDenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giaDen2giaDenKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_giaDen2giaDenKeyReleased


  

    public boolean checkDate(Date dateTest, Date star, Date end) {
        return dateTest.getTime() >= star.getTime() && dateTest.getTime() <= end.getTime();
    }

  

  
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnDetail2;
    private javax.swing.JTextField giaDen;
    private javax.swing.JTextField giaDen2;
    private javax.swing.JTextField giaTu;
    private javax.swing.JTextField giaTu2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxLuaChon;
    private javax.swing.JComboBox<String> jComboBoxLuaChon3;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserFrom2;
    private com.toedter.calendar.JDateChooser jDateChooserTo;
    private com.toedter.calendar.JDateChooser jDateChooserTo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSearch3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel soLuong1;
    private javax.swing.JTable tblPhieuNhap;
    private javax.swing.JTable tblPhieuNhap2;
    private javax.swing.JLabel tongTien1;
    private javax.swing.JLabel txtQuantityNcc;
    private javax.swing.JLabel txtQuantityProduct;
    private javax.swing.JLabel txtQuantityUser;
    // End of variables declaration//GEN-END:variables

  

     

       
}