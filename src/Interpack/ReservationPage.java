/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpack;

import Config.DbConnector;
import Frondesk.FrontDash;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author AJ
 */
public class ReservationPage extends javax.swing.JInternalFrame {
        
    double roomPrice;
    double numofDays;
    
    
    public ReservationPage() {
        initComponents();
        RESERVATION();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
               

    }
    

        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
        
        
        public void print(){
        try {
         empreport.print();
         JOptionPane.showMessageDialog(this,"PRINT SUCCESSFULL");
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "print failed"+e);
     }
 }
    
        public void RESERVATION(){

 empreport.setText("****************************************************************************************\n");
 empreport.setText(empreport.getText()+"-------------------------------------- RESERVATION ------------------------------------------\n");
 empreport.setText(empreport.getText()+"****************************************************************************************\n");
 
 java.util.Date date = new java.util.Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);
 

    empreport.setText(empreport.getText()+"\nDATE: "+formattedDate+"\n");
 empreport.setText(empreport.getText()+"\nFull Name: "+fullname.getText()+"\n");
 empreport.setText(empreport.getText()+"\nEmail : "+ mails.getText()+"\n");
 empreport.setText(empreport.getText()+"\nContact :"+ cnumber.getText()+"\n");
 empreport.setText(empreport.getText()+"\nNo of guest :"+ guestno.getText()+"\n");
 empreport.setText(empreport.getText()+"\nAddress :"+ addss.getText()+"\n");
 
 empreport.setText(empreport.getText()+"\nCheck-in :"+  checkin.getDate()+"\n");
 empreport.setText(empreport.getText()+"\nCheck-out : "+  checkout.getDate()+"\n");
 
 empreport.setText(empreport.getText()+"\nRoom No. :"+  rnum.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nRoom Type : "+  rtype.getSelectedItem()+"\n");
  empreport.setText(empreport.getText()+"\nStatus :"+  status.getSelectedItem()+"\n");
   empreport.setText(empreport.getText()+"\nMode of Payment : "+  modepay.getSelectedItem()+"\n");
 empreport.setText(empreport.getText()+"\nCapacity : "+  capacity.getText()+"\n");
 empreport.setText(empreport.getText()+"\nRoom Price : "+  rprice.getText()+"\n");
 empreport.setText(empreport.getText()+"\nNo. of days : "+  ndays.getText()+"\n");
  empreport.setText(empreport.getText()+"\n****************************************************************************************\n");
 empreport.setText(empreport.getText()+"\nTotal Amount : "+  tamount.getText()+"\n");
 empreport.setText(empreport.getText()+"\nAmount Payment : "+  pamount.getText()+"\n");


 }

        public void close(){
        this.dispose();
        FrontDash dash = new FrontDash();
        dash.setVisible(true);
        ReservationPage up = new ReservationPage();
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

        reservation = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rnum = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        rtype = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        rprice = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        modepay = new javax.swing.JComboBox<>();
        tamount = new javax.swing.JTextField();
        pamount = new javax.swing.JTextField();
        back = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mails = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cnumber = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        guestno = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addss = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        checkin = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        checkout = new com.toedter.calendar.JDateChooser();
        ndays = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        empreport = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setIconifiable(true);

        reservation.setBackground(new java.awt.Color(153, 0, 0));
        reservation.setName(""); // NOI18N
        reservation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("RESERVATION");
        jLabel11.setName(""); // NOI18N
        reservation.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Room No.");
        jLabel14.setName(""); // NOI18N
        reservation.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 140, 30));

        rnum.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "105", " ", "201", "202", "203", "204", "205", "206", " ", "301", "302", "303", "304", "305", "306" }));
        rnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(rnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 90, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Room Type");
        jLabel15.setName(""); // NOI18N
        reservation.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, 30));

        rtype.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Family", "Delux" }));
        rtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtypeActionPerformed(evt);
            }
        });
        reservation.add(rtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 90, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Room Price");
        jLabel13.setName(""); // NOI18N
        reservation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 120, 30));

        rprice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(rprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 90, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Capacity");
        jLabel18.setName(""); // NOI18N
        reservation.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 120, 30));

        capacity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        capacity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 90, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Status");
        jLabel17.setName(""); // NOI18N
        reservation.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 140, 30));

        status.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserved", "Available", "Canceled" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 90, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Amount Paid");
        jLabel25.setName(""); // NOI18N
        reservation.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 130, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Total Amount");
        jLabel23.setName(""); // NOI18N
        reservation.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Mode of Payment");
        jLabel24.setName(""); // NOI18N
        reservation.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, 30));

        modepay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        modepay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Bank", "Gcash", "Paymaya" }));
        modepay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(modepay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 90, 30));

        tamount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tamount.setEnabled(false);
        reservation.add(tamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 90, 30));

        pamount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(pamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 90, 30));

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Calculate");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        reservation.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, -1));

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Save");
        save.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        reservation.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 100, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GUEST INFORMATION");
        jLabel12.setName(""); // NOI18N
        reservation.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Full Name");
        jLabel21.setName(""); // NOI18N
        reservation.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 30));

        fullname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Email");
        jLabel20.setName(""); // NOI18N
        reservation.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 30));

        mails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(mails, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Contact #");
        jLabel28.setName(""); // NOI18N
        reservation.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, 30));

        cnumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(cnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("No. of Guest");
        jLabel27.setName(""); // NOI18N
        reservation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 200, 140, 30));

        guestno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        guestno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(guestno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Address");
        jLabel26.setName(""); // NOI18N
        reservation.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 130, 30));

        addss.setColumns(20);
        addss.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addss.setRows(5);
        jScrollPane2.setViewportView(addss);

        reservation.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 40));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Check-in Date");
        jLabel29.setName(""); // NOI18N
        reservation.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 30));

        checkin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 190, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Check-out Date");
        jLabel30.setName(""); // NOI18N
        reservation.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, 30));

        checkout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 190, 30));

        ndays.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ndays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reservation.add(ndays, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, 30));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("No. of Days");
        jLabel31.setName(""); // NOI18N
        reservation.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 150, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ROOM INFORMATION");
        jLabel16.setName(""); // NOI18N
        reservation.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 240, 30));

        empreport.setColumns(20);
        empreport.setRows(5);
        empreport.setText("************************************************************************\n-------------------EMPLOYEE REPORT------------------------------------\n*********************************************************************\n\nDATE :\n\t\t \n\nFull Name :\n\n\nEmail :\n\n\nContact :\n\n\nNo. of Guest :\n\n\nAddress :\n\n\n\nCheck-in :\n\n\n\nCheck-out :\n\n\n\nRoom no. :\n\n\nRoom Type :\n\n\nStatus :\n\n\nMode of Payment :\n\n\nCapacity :\n\n\nRoom Price :\n\nNo. of days :\n\n\n*********************************************************************\n\nTotal Amount:\n\n\nAmount Paid : ");
        jScrollPane3.setViewportView(empreport);

        reservation.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 410, 230));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        reservation.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 170, 30));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GENERATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        reservation.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
             DbConnector dbc = new DbConnector();
        try {
            // Insert into first table
            String sql1 = "INSERT INTO tbl_guest (g_fullname, g_email, g_contact, g_address, g_guestnumber, check_in, check_out) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst1 = dbc.connect.prepareStatement(sql1)) {
                
                java.util.Date utilDate = checkin.getDate();
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                
                java.util.Date utilDates = checkout.getDate();
                java.sql.Date sqlDates = new java.sql.Date(utilDates.getTime());
                
                
                pst1.setString(1, fullname.getText());
                pst1.setString(2, mails.getText());
                pst1.setString(3, cnumber.getText());
                pst1.setString(4, addss.getText());
                pst1.setString(5, guestno.getText());
                pst1.setDate(6, sqlDate);
                pst1.setDate(7, sqlDates);
                pst1.executeUpdate();
            }

            // Insert into second table
            String sql2 = "INSERT INTO tbl_room (room_number, rm_type, rm_price, rm_capacity, rm_status, payment, mode) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst2 = dbc.connect.prepareStatement(sql2)) {
                pst2.setString(1, rnum.getSelectedItem().toString());
                pst2.setString(2, rtype.getSelectedItem().toString());
                pst2.setString(3, rprice.getText());
                pst2.setString(4, capacity.getText());
                pst2.setString(5, status.getSelectedItem().toString());
                pst2.setString(6, pamount.getText());
                pst2.setString(7, modepay.getSelectedItem().toString());
                pst2.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Successfully Save!");
               
            
            
            System.out.println("Data inserted successfully into all tables.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(sidecolor);
    }//GEN-LAST:event_saveMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        double roomPrice = Double.parseDouble(rprice.getText()); 
        int numOfDays = Integer.parseInt(ndays.getText()); 

        double totalAmount = roomPrice * numOfDays;


        tamount.setText("" + totalAmount);

    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(headcolor);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(sidecolor);
    }//GEN-LAST:event_backMouseExited

    private void rtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RESERVATION();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        print();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea addss;
    private javax.swing.JPanel back;
    public javax.swing.JTextField capacity;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    public javax.swing.JTextField cnumber;
    public javax.swing.JTextArea empreport;
    public javax.swing.JTextField fullname;
    public javax.swing.JTextField guestno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField mails;
    public javax.swing.JComboBox<String> modepay;
    public javax.swing.JTextField ndays;
    public javax.swing.JTextField pamount;
    public javax.swing.JPanel reservation;
    private javax.swing.JComboBox<String> rnum;
    public javax.swing.JTextField rprice;
    private javax.swing.JComboBox<String> rtype;
    private javax.swing.JPanel save;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField tamount;
    // End of variables declaration//GEN-END:variables
}
