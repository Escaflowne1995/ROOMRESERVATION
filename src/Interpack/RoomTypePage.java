/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpack;

import Frondesk.DeluxeRoom;
import Frondesk.FamilyRoom;
import Frondesk.StandardRoom;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author AJ
 */
public class RoomTypePage extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManagerPage
     */
    public RoomTypePage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
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

        jPanel1 = new javax.swing.JPanel();
        family = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        deluxe = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        standard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 0));
        setIconifiable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        family.setBackground(new java.awt.Color(153, 0, 0));
        family.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        family.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                familyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                familyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                familyMouseExited(evt);
            }
        });
        family.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Family  Room");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        family.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        family.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 200));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3,000.00");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        family.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("6");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        family.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 40));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Price");
        family.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Capacity ");
        family.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 20));

        jPanel1.add(family, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 240, 340));

        deluxe.setBackground(new java.awt.Color(153, 0, 0));
        deluxe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deluxe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deluxeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deluxeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deluxeMouseExited(evt);
            }
        });
        deluxe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Deluxe  Room");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deluxe.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("7,000.00");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deluxe.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("4");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deluxe.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 40));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Price");
        deluxe.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 20));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Capacity ");
        deluxe.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/WIHD_Deluxe-02.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deluxe.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 200));

        jPanel1.add(deluxe, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 240, 340));

        standard.setBackground(new java.awt.Color(153, 0, 0));
        standard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        standard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                standardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                standardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                standardMouseExited(evt);
            }
        });
        standard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        standard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/3.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        standard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 200));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Standard Room");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        standard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1,500.00");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        standard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Capacity ");
        standard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Price");
        standard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 20));

        jPanel1.add(standard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/as.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standardMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
        StandardRoom sr = new StandardRoom();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_standardMouseClicked

    private void standardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standardMouseEntered
        standard.setBackground(headcolor);
    }//GEN-LAST:event_standardMouseEntered

    private void standardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standardMouseExited
        standard.setBackground(sidecolor);
    }//GEN-LAST:event_standardMouseExited

    private void familyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_familyMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
        FamilyRoom sr = new FamilyRoom();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_familyMouseClicked

    private void familyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_familyMouseEntered
        family.setBackground(headcolor);
    }//GEN-LAST:event_familyMouseEntered

    private void familyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_familyMouseExited
        family.setBackground(sidecolor);
    }//GEN-LAST:event_familyMouseExited

    private void deluxeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deluxeMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
        DeluxeRoom dr = new DeluxeRoom();
        dr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deluxeMouseClicked

    private void deluxeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deluxeMouseEntered
        deluxe.setBackground(headcolor);
    }//GEN-LAST:event_deluxeMouseEntered

    private void deluxeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deluxeMouseExited
        deluxe.setBackground(sidecolor);
    }//GEN-LAST:event_deluxeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel deluxe;
    private javax.swing.JPanel family;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel standard;
    // End of variables declaration//GEN-END:variables
}
