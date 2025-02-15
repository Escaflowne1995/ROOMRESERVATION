/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpack;

import Config.Session;
import Frondesk.AccDetails;
import Frondesk.ChangePass;
import MyApp.LoginForm;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author AJ
 */
public class FrontSettingsPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManagerPage
     */
    public FrontSettingsPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        Session sn = Session.getInstance();  
        if(sn.getUid()==0){
            JOptionPane.showMessageDialog(null,"No Account, Login Frist","Warning", JOptionPane.WARNING_MESSAGE);
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
           manager.setText(""+sn.getFname()+sn.getLname());
           email.setText(""+sn.getEmail());
           contact.setText(""+sn.getCon());
           address.setText(""+sn.getLocation());
        } 
        
    }
    

        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cpass = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();

        setBackground(new java.awt.Color(150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DASHBOARD");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 0, 170, 40);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        details.setBackground(new java.awt.Color(102, 0, 0));
        details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detailsMouseExited(evt);
            }
        });
        details.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DETAILS");
        details.add(jLabel9);
        jLabel9.setBounds(10, 80, 90, 20);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-details-64.png"))); // NOI18N
        details.add(jLabel10);
        jLabel10.setBounds(10, 0, 90, 80);

        jPanel1.add(details);
        details.setBounds(190, 60, 110, 110);

        logout.setBackground(new java.awt.Color(102, 0, 0));
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOGOUT");
        logout.add(jLabel8);
        jLabel8.setBounds(10, 80, 90, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-logout-64.png"))); // NOI18N
        logout.add(jLabel11);
        jLabel11.setBounds(10, 0, 90, 80);

        jPanel1.add(logout);
        logout.setBounds(450, 60, 110, 110);

        cpass.setBackground(new java.awt.Color(102, 0, 0));
        cpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpassMouseExited(evt);
            }
        });
        cpass.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PASSWORD");
        cpass.add(jLabel12);
        jLabel12.setBounds(10, 90, 90, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-change-password-58.png"))); // NOI18N
        cpass.add(jLabel13);
        jLabel13.setBounds(10, 0, 90, 80);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CHANGE");
        cpass.add(jLabel14);
        jLabel14.setBounds(10, 80, 90, 14);

        jPanel1.add(cpass);
        cpass.setBounds(320, 60, 110, 110);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 800, 210));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-user-100.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 170));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 60, 170, 170);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ROOMS VILLE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(300, 0, 200, 40);

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(email);
        email.setBounds(340, 110, 280, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL                 :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 110, 130, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ACCOUNT NAME :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(210, 80, 130, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTACT #         :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 140, 130, 30);

        contact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(contact);
        contact.setBounds(340, 140, 280, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADDRESS            :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(210, 170, 130, 30);

        address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(address);
        address.setBounds(340, 170, 280, 30);

        manager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manager.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(manager);
        manager.setBounds(340, 80, 280, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Select an Option...",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        LoginForm ads = new LoginForm();
        ads.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(headcolor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(sidecolor);
    }//GEN-LAST:event_logoutMouseExited

    private void cpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
        ChangePass cp = new ChangePass();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpassMouseClicked

    private void cpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseEntered
        cpass.setBackground(headcolor);
    }//GEN-LAST:event_cpassMouseEntered

    private void cpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseExited
        cpass.setBackground(sidecolor);
    }//GEN-LAST:event_cpassMouseExited

    private void detailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseExited
        details.setBackground(sidecolor);
    }//GEN-LAST:event_detailsMouseExited

    private void detailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseEntered
        details.setBackground(headcolor);
    }//GEN-LAST:event_detailsMouseEntered

    private void detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
        AccDetails ad = new AccDetails();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel contact;
    private javax.swing.JPanel cpass;
    private javax.swing.JPanel details;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel manager;
    // End of variables declaration//GEN-END:variables
}
