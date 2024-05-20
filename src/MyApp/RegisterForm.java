/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import Config.DbConnector;
import Config.PasswordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
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
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        DuplicateCheck();
    }
    
    
        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
    
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
        Register = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
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
        add = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        birth = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        images = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        browse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(new java.awt.Color(230, 229, 229));
        fname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 30));

        lname.setBackground(new java.awt.Color(230, 229, 229));
        lname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 280, 30));

        uname.setBackground(new java.awt.Color(230, 229, 229));
        uname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 30));

        pass.setBackground(new java.awt.Color(230, 229, 229));
        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 30));

        email.setBackground(new java.awt.Color(230, 229, 229));
        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, 30));

        contact.setBackground(new java.awt.Color(230, 229, 229));
        contact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 30));

        sex.setBackground(new java.awt.Color(184, 67, 67));
        sex.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sex.setForeground(new java.awt.Color(204, 0, 0));
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sex.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 280, 30));

        acctype.setBackground(new java.awt.Color(184, 67, 67));
        acctype.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        acctype.setForeground(new java.awt.Color(204, 0, 0));
        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Frontdesk" }));
        acctype.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(acctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 280, 30));

        ages.setBackground(new java.awt.Color(230, 229, 229));
        ages.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ages.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(ages, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 280, 30));

        Register.setBackground(new java.awt.Color(102, 0, 0));
        Register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterMouseExited(evt);
            }
        });
        Register.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Register");
        Register.add(jLabel7);
        jLabel7.setBounds(0, 10, 100, 10);

        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LastName");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sex");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 90, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 120, 20));

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
        jLabel13.setBounds(0, 10, 100, 10);

        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 100, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Birth Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 20));

        add.setBackground(new java.awt.Color(230, 229, 229));
        add.setColumns(20);
        add.setRows(5);
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(add);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 280, 100));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Age");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 120, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Account Type");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 20));

        birth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 30));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTER FORM");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 550, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 20, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

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
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        imagesLayout.setVerticalGroup(
            imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagesLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 280, 190));

        browse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("BROWSE");
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||email.getText().isEmpty()
            ||uname.getText().isEmpty()||pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above","Warning", JOptionPane.WARNING_MESSAGE);
            pass.setText("");
        }else if(DuplicateCheck()){
            System.out.println("Duplicate Exist!");
        }else{
            DbConnector dbc = new DbConnector();

            try{
                String ps = PasswordHasher.hashPassword(pass.getText());
                int result = dbc.insertData("INSERT INTO tbl_manager (m_firstname, m_lastname, m_email, m_username, m_password, m_contact, m_sex, m_age, m_address,m_birthdate, m_account, m_status,m_image) "
                    + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+email.getText()+"', '"+uname.getText()+"','"+ps+"', '"+contact.getText()+"','"+sex.getSelectedItem()+"', '"+ages.getText()+"', '"+add.getText()+"', '"+birth.getDate()+"','"+acctype.getSelectedItem()+"', 'Pending','"+destination+"')");
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Registration Success","Succes", JOptionPane.INFORMATION_MESSAGE);
                LoginForm ad = new LoginForm();
                ad.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch (NoSuchAlgorithmException ex) {
            System.out.println(""+ex);
        }
        }
    }//GEN-LAST:event_RegisterMouseClicked

    private void RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseEntered
        Register.setBackground(headcolor);
    }//GEN-LAST:event_RegisterMouseEntered

    private void RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseExited
        Register.setBackground(sidecolor);
    }//GEN-LAST:event_RegisterMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(headcolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(sidecolor);
    }//GEN-LAST:event_cancelMouseExited

    private void imagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagesMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/imagestest/" + selectedFile.getName();
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Register;
    private javax.swing.JComboBox<String> acctype;
    private javax.swing.JTextArea add;
    public javax.swing.JTextField ages;
    public com.toedter.calendar.JDateChooser birth;
    public javax.swing.JLabel browse;
    private javax.swing.JPanel cancel;
    public javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    public javax.swing.JLabel image;
    private javax.swing.JPanel images;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    public javax.swing.JPasswordField pass;
    public javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
