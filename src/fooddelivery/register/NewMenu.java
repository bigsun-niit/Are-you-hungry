/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery.register;

import fooddelivery.register.NewMerchant;
import fooddelivery.Use.Login;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.sql.DriverManager;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class NewMenu extends javax.swing.JFrame {
private static NewMenu nw;
    public static NewMenu getnw(){
        if (nw == null){
            nw = new NewMenu();
        }
        return nw;
    }
    /**
     * Creates new form NewMenu1
     */
    public NewMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jp1 = new javax.swing.JTextField();
        jm1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jm0 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Welcome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, 50));

        jLabel5.setFont(new java.awt.Font("微软雅黑", 2, 110)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("F");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 70, 160));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 2, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("at?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 110, 80));

        jLabel11.setFont(new java.awt.Font("微软雅黑 Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(81, 64, 130));
        jLabel11.setText("Please make sure you enter the same merchant name twice");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 50));

        jLabel13.setFont(new java.awt.Font("微软雅黑 Light", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(81, 64, 130));
        jLabel13.setText("Business registration");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(81, 64, 130));
        jLabel12.setText("You need to complete the basic information filling, menu creation to complete business registration ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Price:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 80, 40));

        jLabel9.setFont(new java.awt.Font("微软雅黑 Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Dish:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 40));

        jp1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        getContentPane().add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 110, -1));

        jm1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm1ActionPerformed(evt);
            }
        });
        getContentPane().add(jm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 130, -1));

        jButton3.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(81, 64, 130));
        jButton3.setText("I'm gonna go ahead and add the dish");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 270, -1));

        jm0.setFont(new java.awt.Font("微软雅黑 Light", 0, 24)); // NOI18N
        jm0.setForeground(new java.awt.Color(81, 64, 130));
        jm0.setText("   Please enter the merchant name again");
        jm0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm0ActionPerformed(evt);
            }
        });
        getContentPane().add(jm0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 460, 40));

        jButton4.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(81, 64, 130));
        jButton4.setText("Add the end");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 210, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/登陆背景图.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            PreparedStatement pst2;//预先声明
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery", "root", "1234");//定义连接
            String sql2 = "insert into menu(MerchantName,Food,price) values(?,?,?);";//SQL命令
            pst2 = (PreparedStatement) con.prepareStatement(sql2);
            pst2.setString(1, jm0.getText());//创建声明连接
            pst2.setString(2, jm1.getText());//获得数值
            pst2.setString(3, jp1.getText());
            pst2.executeUpdate();//数据更新

            JOptionPane.showMessageDialog(null, "注册成功！");
            this.hide();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "注册失败");
        }

        NewMenu newmenu = new NewMenu();
        newmenu.pack();
        newmenu.setLocationRelativeTo(null);
        newmenu.setVisible(true);
        newmenu.show();
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jm0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm0ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            PreparedStatement pst2;//预先声明
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery", "root", "1234");//定义连接
            String sql2 = "insert into menu(MerchantName,Food,price) values(?,?,?);";//SQL命令
            pst2 = (PreparedStatement) con.prepareStatement(sql2);
            pst2.setString(1, jm0.getText());//创建声明连接
            pst2.setString(2, jm1.getText());//获得数值
            pst2.setString(3, jp1.getText());
            pst2.executeUpdate();//数据更新

            JOptionPane.showMessageDialog(null, "注册成功！");
            this.hide();
            Login login = new Login();
            login.pack();
            login.setLocationRelativeTo(null);

            login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "注册失败");
        }
        Login login = new Login();
        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.hide();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NewMerchant newmerchant=NewMerchant.getInstance();
        newmerchant.pack();
        newmerchant.setLocationRelativeTo(null);
        newmerchant.show();
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
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jm0;
    private javax.swing.JTextField jm1;
    private javax.swing.JTextField jp1;
    // End of variables declaration//GEN-END:variables
}