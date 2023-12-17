package view_VTNgoc;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import VTNgoc.Account;

/**
 *
 * @author Vu Tuan Ngoc
 */
public class Signup extends javax.swing.JFrame {

    public Signup() {
         this.setLocationRelativeTo(null);
        initComponents();
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
        setTitle("Đăng ký");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        JPaneLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        juserName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        loginUser1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 39, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đăng ký");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 300, 80));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled-1.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 580));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên đăng nhập");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 150, 40));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 260, -1));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 260, -1));

        phoneUser.setBackground(new java.awt.Color(13, 39, 51));
        phoneUser.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        phoneUser.setForeground(new java.awt.Color(255, 255, 255));
        phoneUser.setBorder(null);
        phoneUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phoneUserMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                phoneUserMousePressed(evt);
            }
        });
        phoneUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneUserActionPerformed(evt);
            }
        });
        phoneUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneUserKeyPressed(evt);
            }
        });
        jPanel1.add(phoneUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 30));

        passwordUser.setBackground(new java.awt.Color(13, 39, 51));
        passwordUser.setForeground(new java.awt.Color(255, 255, 255));
        passwordUser.setBorder(null);
        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });
        jPanel1.add(passwordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 260, 30));

        JPaneLogin.setBackground(new java.awt.Color(204, 204, 255));
        JPaneLogin.setToolTipText("");
        JPaneLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPaneLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPaneLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPaneLoginMouseReleased(evt);
            }
        });
        JPaneLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPaneLoginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng ký");

        javax.swing.GroupLayout JPaneLoginLayout = new javax.swing.GroupLayout(JPaneLogin);
        JPaneLogin.setLayout(JPaneLoginLayout);
        JPaneLoginLayout.setHorizontalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLoginLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        JPaneLoginLayout.setVerticalGroup(
            JPaneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(JPaneLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 270, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mật khẩu");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 130, 40));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Họ và tên");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 110, 40));

        juserName.setBackground(new java.awt.Color(13, 39, 51));
        juserName.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        juserName.setForeground(new java.awt.Color(255, 255, 255));
        juserName.setBorder(null);
        juserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                juserNameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                juserNameMousePressed(evt);
            }
        });
        juserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserNameActionPerformed(evt);
            }
        });
        juserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                juserNameKeyPressed(evt);
            }
        });
        jPanel1.add(juserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 260, 30));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 138, 250, -1));

        jButton1.setBackground(new java.awt.Color(13, 39, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Số điện thoại");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 40));

        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 260, -1));

        loginUser1.setBackground(new java.awt.Color(13, 39, 51));
        loginUser1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        loginUser1.setForeground(new java.awt.Color(255, 255, 255));
        loginUser1.setBorder(null);
        loginUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginUser1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUser1MousePressed(evt);
            }
        });
        loginUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUser1ActionPerformed(evt);
            }
        });
        loginUser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUser1KeyPressed(evt);
            }
        });
        jPanel1.add(loginUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneUserMouseEntered

    private void phoneUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneUserMousePressed

    private void phoneUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneUserActionPerformed

    private void phoneUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            Signup();
        }
    }//GEN-LAST:event_phoneUserKeyPressed

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            Signup();
        }
    }//GEN-LAST:event_passwordUserKeyPressed

    private void JPaneLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseClicked
        Signup();
    }//GEN-LAST:event_JPaneLoginMouseClicked

    private void JPaneLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseEntered

    }//GEN-LAST:event_JPaneLoginMouseEntered

    private void JPaneLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseExited

    }//GEN-LAST:event_JPaneLoginMouseExited

    private void JPaneLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMousePressed

    }//GEN-LAST:event_JPaneLoginMousePressed

    private void JPaneLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPaneLoginMouseReleased

    }//GEN-LAST:event_JPaneLoginMouseReleased

    private void JPaneLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPaneLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPaneLoginKeyPressed

    private void juserNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juserNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameMouseEntered

    private void juserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juserNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameMousePressed

    private void juserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameActionPerformed

    private void juserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juserNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Login a = new Login();
            a.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUser1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1MouseEntered

    private void loginUser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUser1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1MousePressed

    private void loginUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1ActionPerformed

    private void loginUser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUser1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUser1KeyPressed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    public static boolean isOnlyDigits(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    public void Signup() {
        String userName = juserName.getText();
        String user = loginUser1.getText();
        String password = passwordUser.getText();
        String phone = phoneUser.getText();
        int loctrung = 0;
        List<Account> AccountData = Run.AccountTree.getInOrderList();
        for (Account acc : AccountData) {
            if (acc.getUser().equals(user)) {
                loctrung = 1;
                break;
            }
        }

        if (userName.equals("") || user.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else if (loctrung == 1) {
            JOptionPane.showMessageDialog(this, "tên tài khoản đã tồn tại", "", JOptionPane.WARNING_MESSAGE);
        } else if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Độ dài mật khẩu phải lớn hơn hoặc bằng 6 ký tự !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else if (!isOnlyDigits(phone)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng số điện thoại", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Account acc = new Account(userName, user, password, "customer", phone);
                Run.AccountTree.add(acc.getUser(), acc);
                JOptionPane.showMessageDialog(this, "Đăng ký thành công");
                Run.WriteDataAccount();
            } catch (Exception e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPaneLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField juserName;
    private javax.swing.JTextField loginUser1;
    private javax.swing.JPasswordField passwordUser;
    private javax.swing.JTextField phoneUser;
    // End of variables declaration//GEN-END:variables
}
