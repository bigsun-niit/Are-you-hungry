/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery.register;

import fooddelivery.Use.Login;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class NewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form Food_Delivery
     */
    public NewCustomer() {
        initComponents();
        //setExtendedState(Food_Delivery.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jt4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jt2 = new javax.swing.JPasswordField();
        jt3 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("手机号码:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt4.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        getContentPane().add(jt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));

        jLabel3.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 40));

        jLabel4.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Repeat the password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 50));

        jLabel6.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 40));

        jt1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        getContentPane().add(jt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 30));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 50));

        jLabel9.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Phone:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("微软雅黑", 2, 110)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("F");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 70, 150));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 2, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("at?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 110, 80));

        jLabel11.setFont(new java.awt.Font("微软雅黑 Light", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(81, 64, 130));
        jLabel11.setText("User Registration");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(81, 64, 130));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 210, 30));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));
        getContentPane().add(jt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 231, 200, 30));
        getContentPane().add(jt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/登陆背景图.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            PreparedStatement pst2;//预先声明
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery", "root", "1234");//定义连接
            String sql2 = "insert into customer(Username,Password,Password_2,UserPhone_num) values(?,?,?,?)";//SQL命令
            pst2 = (PreparedStatement) con.prepareStatement(sql2);//创建声明连接
            pst2.setString(1, jt1.getText());//获得数值
            pst2.setString(2, jt2.getText());
            pst2.setString(3, jt3.getText());
            pst2.setString(4, jt4.getText());//获得数值
            if (jt1.getText().equals(null) || jt2.getText().equals(null) || jt3.getText().equals(null) || jt4.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "您还有信息未填写完整");
            } else if (jt2.getText().equals(jt3.getText())) {
                pst2.executeUpdate();//数据更新
                JOptionPane.showMessageDialog(null, "注册成功！");
                this.hide();
                Login login = new Login();
                login.pack();
                login.setLocationRelativeTo(null);

                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "您输入的两次密码不同，请检查并重新输入！");
            };
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "您还有信息未填写完整");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login();
        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jt1;
    private javax.swing.JPasswordField jt2;
    private javax.swing.JPasswordField jt3;
    private javax.swing.JTextField jt4;
    // End of variables declaration//GEN-END:variables
}
