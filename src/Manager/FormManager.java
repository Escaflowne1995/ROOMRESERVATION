/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Config.DbConnector;
import Interpack.ManagerPage;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author AJ
 */
public class FormManager extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public FormManager() {
        initComponents();
        DuplicateCheck();
        browse.setVisible(false);
    }
    
    
        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
        
        public void close(){
        this.dispose();
        ManagerDash dash = new ManagerDash();
        dash.setVisible(true);
        ManagerPage up = new ManagerPage();
        dash.maindesktop.add(up).setVisible(true);
    }
    
    public static String emails,usname;
    
    public boolean DuplicateCheck(){
        DbConnector dbc = new DbConnector();
        
        try{
            String query = "SELECT * FROM tbl_manager  WHERE m_username = '" + uname.getText() + "' AND m_email = '" + email.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                emails=resultSet.getString("m_email");
                System.out.println(""+emails);
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used","Enter Another Email", JOptionPane.WARNING_MESSAGE);
                    email.setText("");
                }
                usname=resultSet.getString("m_username");
                if(usname.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used","Enter Another Username", JOptionPane.WARNING_MESSAGE);
                    uname.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
        public boolean updateCheck(){
        DbConnector dbc = new DbConnector(); 
        try{
            String query = "SELECT * FROM tbl_manager WHERE (m_username = '"+uname.getText()+"'OR m_email ='"+email.getText()+"')AND m_id !='"+mid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                emails=resultSet.getString("m_email");
                System.out.println(""+emails);
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used","Enter Another Email", JOptionPane.WARNING_MESSAGE);
                    email.setText("");
                }
                usname=resultSet.getString("m_username");
                if(usname.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used","Enter Another Username", JOptionPane.WARNING_MESSAGE);
                    uname.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
        private void Clear(){
            fname.setText(null);
            lname.setText(null);
            email.setText(null);
            uname.setText(null);
            pass.setText(null);
            contact.setText(null);
            ages.setText(null);
            adds.setText(null);
            birth.setDate(null);
            
        }
        
        public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
        
        
        public String action;
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        acctype = new javax.swing.JComboBox<>();
        ages = new javax.swing.JTextField();
        add = new javax.swing.JPanel();
        m_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adds = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        clear = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        images = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        birth = new com.toedter.calendar.JDateChooser();
        browse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(new java.awt.Color(230, 229, 229));
        fname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 280, 30));

        lname.setBackground(new java.awt.Color(230, 229, 229));
        lname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        uname.setBackground(new java.awt.Color(230, 229, 229));
        uname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, 30));

        pass.setBackground(new java.awt.Color(230, 229, 229));
        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 30));

        email.setBackground(new java.awt.Color(230, 229, 229));
        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 280, 30));

        contact.setBackground(new java.awt.Color(230, 229, 229));
        contact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 280, 30));

        sex.setBackground(new java.awt.Color(184, 67, 67));
        sex.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sex.setForeground(new java.awt.Color(204, 0, 0));
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sex.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 280, 30));

        acctype.setBackground(new java.awt.Color(184, 67, 67));
        acctype.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        acctype.setForeground(new java.awt.Color(204, 0, 0));
        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Frontdesk" }));
        acctype.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(acctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 280, 30));

        ages.setBackground(new java.awt.Color(230, 229, 229));
        ages.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ages.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(ages, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 280, 30));

        add.setBackground(new java.awt.Color(102, 0, 0));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(null);

        m_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_label.setForeground(new java.awt.Color(255, 255, 255));
        m_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_label.setText("Label");
        add.add(m_label);
        m_label.setBounds(0, 10, 100, 20);

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 100, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LastName");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 140, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sex");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 20));

        cancel.setBackground(new java.awt.Color(102, 0, 0));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cancel");
        cancel.add(jLabel13);
        jLabel13.setBounds(0, 10, 90, 20);

        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 90, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Birth Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 20));

        adds.setBackground(new java.awt.Color(230, 229, 229));
        adds.setColumns(20);
        adds.setRows(5);
        adds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jScrollPane1.setViewportView(adds);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 280, 80));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Age");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Account Type");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, 20));

        status.setBackground(new java.awt.Color(184, 67, 67));
        status.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(204, 0, 0));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactivate", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 280, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Status");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 120, 20));

        mid.setBackground(new java.awt.Color(230, 229, 229));
        mid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mid.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        mid.setEnabled(false);
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });
        jPanel1.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, 30));

        clear.setBackground(new java.awt.Color(102, 0, 0));
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Clear");
        clear.add(jLabel20);
        jLabel20.setBounds(0, 10, 100, 20);

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 100, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 20));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANGER FORM");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 530, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        images.setBackground(new java.awt.Color(153, 0, 0));
        images.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        images.setForeground(new java.awt.Color(204, 0, 0));
        images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagesMouseClicked(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-add-100.png"))); // NOI18N

        javax.swing.GroupLayout imagesLayout = new javax.swing.GroupLayout(images);
        images.setLayout(imagesLayout);
        imagesLayout.setHorizontalGroup(
            imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        imagesLayout.setVerticalGroup(
            imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 280, 200));

        birth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 280, 30));

        browse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("BROWSE");
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       
        
        if (action.equals("Add")) {
    DbConnector dbc = new DbConnector();
    int result = 0;
    try {

        String sql = "INSERT INTO tbl_manager (m_firstname, m_lastname, m_email, m_username, m_password, m_contact, m_sex, m_age, m_address, m_birthdate, m_account, m_status, m_image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);


        java.util.Date utilDate = birth.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        pst.setString(1, fname.getText());
        pst.setString(2, lname.getText());
        pst.setString(3, email.getText());
        pst.setString(4, uname.getText());
        pst.setString(5, pass.getText());
        pst.setString(6, contact.getText());
        pst.setString(7, sex.getSelectedItem().toString());
        pst.setString(8, ages.getText());
        pst.setString(9, adds.getText());
        pst.setDate(10, sqlDate);
        pst.setString(11, acctype.getSelectedItem().toString());
        pst.setString(12, status.getSelectedItem().toString());
        pst.setString(13, destination);

        pst.execute();
        result = 1;

        // Handle file copy if needed
        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
    } catch (Exception e) {
        e.printStackTrace(); 
        System.out.println("Insert Image Error: " + e.getMessage());
    }

    if (result == 1) {
        JOptionPane.showMessageDialog(null, "Successfully Saved!");
        close();
    } else {
        System.out.println("Saving Data Failed!");
    }
} else if (action.equals("Update")) {
    DbConnector dbc = new DbConnector();
    try {
        String sql = "UPDATE tbl_manager SET m_firstname = ?, m_lastname = ?, m_email = ?, m_username = ?, m_password = ?, m_contact = ?, m_sex = ?, m_age = ?, m_address = ?, m_birthdate = ?, m_account = ?, m_status = ?, m_image = ? WHERE m_id = ?";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);


        java.util.Date utilDate = birth.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        pst.setString(1, fname.getText());
        pst.setString(2, lname.getText());
        pst.setString(3, email.getText());
        pst.setString(4, uname.getText());
        pst.setString(5, pass.getText());
        pst.setString(6, contact.getText());
        pst.setString(7, sex.getSelectedItem().toString());
        pst.setString(8, ages.getText());
        pst.setString(9, adds.getText());
        pst.setDate(10, sqlDate);
        pst.setString(11, acctype.getSelectedItem().toString());
        pst.setString(12, status.getSelectedItem().toString());
        pst.setString(13, destination);
        pst.setString(14, mid.getText());

        if (destination.isEmpty()) {
            System.out.println("Destination is Empty!");
            File existingFile = new File(oldpath);
            if (existingFile.exists()) {
                existingFile.delete();
            }
        } else {
            imageUpdater(oldpath, path);
            System.out.println("Destination is not Empty!");
        }

        pst.execute();
        close();

        JOptionPane.showMessageDialog(null, "Successfully Updated!");
    } catch (SQLException e) {
        e.printStackTrace();  
        System.out.println("Database Connection Error: " + e.getMessage());
    }
} else {
    JOptionPane.showMessageDialog(null, "No action selected!");
    close();
}

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(sidecolor);
    }//GEN-LAST:event_addMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        close();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(headcolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(sidecolor);
    }//GEN-LAST:event_cancelMouseExited

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        Clear();
    }//GEN-LAST:event_clearMouseClicked
    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseEntered


    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(sidecolor);
    }//GEN-LAST:event_clearMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void imagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagesMouseClicked
        JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            System.out.println(""+destination);
                            browse.setVisible(true);
                            browse.setText("REMOVE");
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_imagesMouseClicked

    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked
        browse.setVisible(false);
        image.setIcon(null);
        destination = "";
        path="";
    }//GEN-LAST:event_browseMouseClicked

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
            java.util.logging.Logger.getLogger(FormManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> acctype;
    public javax.swing.JPanel add;
    public javax.swing.JTextArea adds;
    public javax.swing.JTextField ages;
    public com.toedter.calendar.JDateChooser birth;
    public javax.swing.JLabel browse;
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel clear;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JLabel image;
    private javax.swing.JPanel images;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lname;
    public javax.swing.JLabel m_label;
    public javax.swing.JTextField mid;
    public javax.swing.JPasswordField pass;
    public javax.swing.JComboBox<String> sex;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
