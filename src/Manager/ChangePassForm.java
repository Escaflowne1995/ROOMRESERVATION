/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Config.DbConnector;
import Config.PasswordHasher;
import Config.Session;
import Interpack.ManagerDashPage;
import MyApp.LoginForm;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AJ
 */
public class ChangePassForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassForm
     */
    public ChangePassForm() {
        initComponents();
    }
    
        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
        
        public void close(){
        this.dispose();
        ManagerDash dash = new ManagerDash();
        dash.setVisible(true);
        ManagerDashPage up = new ManagerDashPage();
        dash.maindesktop.add(up).setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        con_pass = new javax.swing.JPasswordField();
        cur_pass = new javax.swing.JPasswordField();
        new_pass = new javax.swing.JPasswordField();
        ckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CHANGE PASSWORD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 230, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 170, 20);

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 170, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 190, 190, 20);

        save.setBackground(new java.awt.Color(102, 0, 0));
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Save");
        save.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        jPanel1.add(save);
        save.setBounds(230, 290, 100, 40);

        back.setBackground(new java.awt.Color(102, 0, 0));
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Back");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        jPanel1.add(back);
        back.setBounds(60, 290, 100, 40);

        con_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        con_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(con_pass);
        con_pass.setBounds(20, 210, 350, 40);

        cur_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cur_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cur_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cur_passActionPerformed(evt);
            }
        });
        jPanel1.add(cur_pass);
        cur_pass.setBounds(20, 60, 350, 40);

        new_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        new_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(new_pass);
        new_pass.setBounds(20, 150, 350, 40);

        ckbox.setBackground(new java.awt.Color(204, 0, 0));
        ckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbox.setForeground(new java.awt.Color(255, 255, 255));
        ckbox.setText(" View Password");
        ckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxActionPerformed(evt);
            }
        });
        jPanel1.add(ckbox);
        ckbox.setBounds(200, 250, 170, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        try{
            DbConnector dbc = new DbConnector();
            Session sn = Session.getInstance();

            String query = "SELECT * FROM tbl_manager WHERE m_id ='"+sn.getUid()+"'";
            ResultSet rs = dbc.getData(query);
            if(rs.next()){
                String curpass = rs.getString("m_password");
                String curhash = PasswordHasher.hashPassword(cur_pass.getText());

                if(curpass.equals(curhash)){
                    String password = new String(new_pass.getPassword());
                    String confirmPassword = new String(con_pass.getPassword());
                    String cpass = PasswordHasher.hashPassword(new_pass.getText());
                    if (password.equals(confirmPassword)) {
                        dbc.updateData("UPDATE tbl_manager SET m_password = '"+cpass+"'");
                        JOptionPane.showMessageDialog(null,"Change Password Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
                        LoginForm lf = new LoginForm();
                        lf.setVisible(true);
                        this.dispose();
                    }else {
                        JOptionPane.showMessageDialog(this, "Passwords is not Match", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Current Password is Incorrect", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(sidecolor);
    }//GEN-LAST:event_saveMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        close();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(headcolor);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(sidecolor);
    }//GEN-LAST:event_backMouseExited

    private void cur_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cur_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cur_passActionPerformed

    private void ckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxActionPerformed
        if(ckbox.isSelected()){
            new_pass.setEchoChar((char)0);
            con_pass.setEchoChar((char)0);
        }else{
            new_pass.setEchoChar('*');
            con_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ChangePassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JCheckBox ckbox;
    private javax.swing.JPasswordField con_pass;
    private javax.swing.JPasswordField cur_pass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPanel save;
    // End of variables declaration//GEN-END:variables
}
