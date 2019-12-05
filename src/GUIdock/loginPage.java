/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIdock;
import adminPage.*;
import dataController.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author alifn
 */
public class loginPage extends javax.swing.JFrame {
    /**
     * Creates new form loginPage
     */
   
    public loginPage(){
//        dataCenter a = new dataCenter();
//        a.readData();
        initComponents();
        setResizable(false);
        //setUndecorated(true);
        nimTF.setFocusable(true);
        tglTF.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        headerLoginPanel = new javax.swing.JLabel();
        pictLoginPanel = new javax.swing.JLabel();
        nimTF = new javax.swing.JTextField();
        tglTF = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        consolLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        capil2Button = new javax.swing.JButton();
        capil1Button = new javax.swing.JButton();
        nameCapil1 = new javax.swing.JLabel();
        nameCapil2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ketCapil1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ketCapil2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        parentPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(9, 87, 99));

        headerLoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerLoginPanel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        headerLoginPanel.setForeground(new java.awt.Color(255, 255, 255));
        headerLoginPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLoginPanel.setText("Pemilihan Umum");

        pictLoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        pictLoginPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/head.png"))); // NOI18N

        nimTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nimTF.setText("NIM");
        nimTF.setToolTipText("");
        nimTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nimTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nimTFFocusLost(evt);
            }
        });
        nimTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTFActionPerformed(evt);
            }
        });

        tglTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tglTF.setText("Tanggal Lahir (DDMMYYYY)");
        tglTF.setToolTipText("");
        tglTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tglTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tglTFFocusLost(evt);
            }
        });
        tglTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglTFActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        consolLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        consolLabel.setForeground(new java.awt.Color(255, 255, 0));
        consolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(pictLoginPanel))
                        .addGroup(loginPanelLayout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tglTF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pictLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(consolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        parentPanel.add(loginPanel, "card2");

        mainPanel.setBackground(new java.awt.Color(9, 87, 99));

        capil2Button.setHideActionText(true);
        capil2Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        capil2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capil2ButtonActionPerformed(evt);
            }
        });

        capil1Button.setHideActionText(true);
        capil1Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        capil1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capil1ButtonActionPerformed(evt);
            }
        });

        nameCapil1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nameCapil1.setForeground(new java.awt.Color(255, 255, 255));
        nameCapil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCapil1.setText("Ir. Budi Soetomo, S. Pd.");

        nameCapil2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nameCapil2.setForeground(new java.awt.Color(255, 255, 255));
        nameCapil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCapil2.setText("Dr. Agung Suparno, S.Sc.");

        ketCapil1.setBackground(new java.awt.Color(9, 87, 99));
        ketCapil1.setColumns(20);
        ketCapil1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ketCapil1.setForeground(new java.awt.Color(255, 255, 255));
        ketCapil1.setRows(5);
        ketCapil1.setText("Keterangan");
        jScrollPane1.setViewportView(ketCapil1);

        ketCapil2.setBackground(new java.awt.Color(9, 87, 99));
        ketCapil2.setColumns(20);
        ketCapil2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ketCapil2.setForeground(new java.awt.Color(255, 255, 255));
        ketCapil2.setRows(5);
        ketCapil2.setText("Keterangan");
        jScrollPane2.setViewportView(ketCapil2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemilihan Umum");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCapil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capil1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capil2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCapil2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(capil1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capil2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCapil1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCapil2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        parentPanel.add(mainPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capil2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capil2ButtonActionPerformed
        try {
            // TODO add your handling code here:
            finishPage P = new finishPage();
            P.setVisible(true);
            dataCenter a = new dataCenter();
            a.readData();
            a.chooseCapil(2);
            a.writeData();
            
            
            parentPanel.removeAll();
            
            parentPanel.add(loginPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_capil2ButtonActionPerformed

    private void capil1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capil1ButtonActionPerformed
        try {
            // TODO add your handling code here:
            finishPage P = new finishPage();
            P.setVisible(true);
            dataCenter a = new dataCenter();
            a.readData();
            a.chooseCapil(1);
            a.writeData();
            
            parentPanel.removeAll();
            
            parentPanel.add(loginPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_capil1ButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            // TODO add your handling code here:
            dataCenter a = new dataCenter();
            a.readData();
            boolean valid = false;
            
            if (nimTF.getText().equals("admin") && tglTF.getText().equals("admin")){
                new settingsPage().setVisible(true);
                consolLabel.setText("");
                tglTF.setText("Tanggal Lahir (DDMMYYYY)");
                nimTF.setText("NIM");
            }else{
                //if (hak suara belum dipake)
                if (a.canChoose(nimTF.getText(), tglTF.getText())){
                    a.haveChoose(nimTF.getText(), tglTF.getText());
                    if (a.getImgCapil1().charAt(1)=='i' && a.getImgCapil1().charAt(2)=='m' && a.getImgCapil1().charAt(3)=='g'){
                        capil1Button.setIcon(new javax.swing.ImageIcon(((new ImageIcon(getClass().getResource(a.getImgCapil1())).getImage()).getScaledInstance(150, 220, java.awt.Image.SCALE_SMOOTH))));
                        capil2Button.setIcon(new javax.swing.ImageIcon(((new ImageIcon(getClass().getResource(a.getImgCapil2())).getImage()).getScaledInstance(150, 220, java.awt.Image.SCALE_SMOOTH))));
                    }else {
                        capil1Button.setIcon(new javax.swing.ImageIcon(((new ImageIcon(a.getImgCapil1())).getImage()).getScaledInstance(150, 220, java.awt.Image.SCALE_SMOOTH)));
                        capil2Button.setIcon(new javax.swing.ImageIcon(((new ImageIcon(a.getImgCapil2())).getImage()).getScaledInstance(150, 220, java.awt.Image.SCALE_SMOOTH)));
                    }
                    nameCapil1.setText(a.getNamaCapil1());
                    nameCapil2.setText(a.getNamaCapil2());
                    ketCapil1.setText(a.getKetCapil1());
                    ketCapil2.setText(a.getKetCapil2());
                    parentPanel.removeAll();
                    parentPanel.repaint();
                    parentPanel.revalidate();

                    parentPanel.add(mainPanel);
                    parentPanel.repaint();
                    parentPanel.revalidate();
                    a.writeData();
                    
                    consolLabel.setText("");
                    tglTF.setText("Tanggal Lahir (DDMMYYYY)");
                    nimTF.setText("NIM");
                }else{
                    consolLabel.setVisible(true);
                    consolLabel.setText("NIM Tidak Terdaftar atau Sudah Memilih");
                    tglTF.setText("Tanggal Lahir (DDMMYYYY)");
                    nimTF.setText("NIM");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void tglTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglTFActionPerformed

    private void tglTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tglTFFocusLost
        // TODO add your handling code here:
        if (tglTF.getText().equals("")){
            tglTF.setText("Tanggal Lahir (DDMMYYYY)");
            consolLabel.setVisible(false);
        }
    }//GEN-LAST:event_tglTFFocusLost

    private void tglTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tglTFFocusGained
        // TODO add your handling code here:
        if (tglTF.getText().equals("Tanggal Lahir (DDMMYYYY)")){
            tglTF.setText("");
            consolLabel.setVisible(false);
        }
    }//GEN-LAST:event_tglTFFocusGained

    private void nimTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTFActionPerformed

    private void nimTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimTFFocusLost
        // TODO add your handling code here:
        if (nimTF.getText().equals("")){
            nimTF.setText("NIM");
            consolLabel.setVisible(false);
        }
    }//GEN-LAST:event_nimTFFocusLost

    private void nimTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimTFFocusGained
        // TODO add your handling code here:
        if (nimTF.getText().equals("NIM")) {
            nimTF.setText("");
            consolLabel.setVisible(false);
        }

    }//GEN-LAST:event_nimTFFocusGained

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        //panggil methode write data
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capil1Button;
    private javax.swing.JButton capil2Button;
    private javax.swing.JLabel consolLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel headerLoginPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ketCapil1;
    private javax.swing.JTextArea ketCapil2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameCapil1;
    private javax.swing.JLabel nameCapil2;
    private javax.swing.JTextField nimTF;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel pictLoginPanel;
    private javax.swing.JTextField tglTF;
    // End of variables declaration//GEN-END:variables
}
