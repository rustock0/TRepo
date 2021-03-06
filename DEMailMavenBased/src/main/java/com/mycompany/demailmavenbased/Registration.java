package com.mycompany.demailmavenbased;

import java.sql.Date;
import com.mycompany.demailmavenbased.DAO.RegistrationDAO;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    
    public Registration() {
        initComponents();
    }
    
    private boolean clickBox = false;
    private final String[] arg = {};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSbmt = new javax.swing.JButton();
        buttonClr = new javax.swing.JButton();
        buttonCncl = new javax.swing.JButton();
        checkAgr = new javax.swing.JCheckBox();
        fieldFName = new javax.swing.JTextField();
        fieldLName = new javax.swing.JTextField();
        fieldUName = new javax.swing.JTextField();
        labelFName = new javax.swing.JLabel();
        labelLName = new javax.swing.JLabel();
        labelUName = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        labelRTPass = new javax.swing.JLabel();
        fieldPass = new javax.swing.JPasswordField();
        fieldRTPass = new javax.swing.JPasswordField();
        labelBDay = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        boxMonths = new javax.swing.JComboBox();
        fieldPhone = new javax.swing.JTextField();
        field7 = new javax.swing.JTextField();
        fieldEMail = new javax.swing.JTextField();
        boxDays = new javax.swing.JComboBox();
        boxYears = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registration");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        buttonSbmt.setText("Submit");
        buttonSbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSbmtActionPerformed(evt);
            }
        });

        buttonClr.setText("Clear");
        buttonClr.setPreferredSize(new java.awt.Dimension(55, 27));
        buttonClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClrActionPerformed(evt);
            }
        });

        buttonCncl.setText("Cancel");
        buttonCncl.setPreferredSize(new java.awt.Dimension(55, 27));
        buttonCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCnclActionPerformed(evt);
            }
        });

        checkAgr.setText("I accept the registration agreement");
        checkAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAgrActionPerformed(evt);
            }
        });

        labelFName.setText("First Name:");

        labelLName.setText("Last Name:");

        labelUName.setText("User:");

        labelPass.setText("Password:");

        labelRTPass.setText("Retype password:");

        labelBDay.setText("Birthday:");

        labelPhone.setText("Mobile phone:");

        boxMonths.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Noveber", "December" }));
        boxMonths.setToolTipText("");

        field7.setEditable(false);
        field7.setText("+7");
        field7.setEnabled(false);

        fieldEMail.setEditable(false);
        fieldEMail.setText("@demail.com");
        fieldEMail.setEnabled(false);

        boxDays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        boxYears.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLName)
                    .addComponent(labelUName)
                    .addComponent(labelPass)
                    .addComponent(labelFName)
                    .addComponent(labelRTPass)
                    .addComponent(labelBDay)
                    .addComponent(labelPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(fieldPhone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxMonths, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldRTPass)
                    .addComponent(fieldPass)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldUName)
                        .addGap(1, 1, 1)
                        .addComponent(fieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldLName)
                    .addComponent(fieldFName))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSbmt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonClr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buttonCncl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkAgr))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFName))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLName))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUName)
                    .addComponent(fieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPass)
                    .addComponent(fieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRTPass)
                    .addComponent(fieldRTPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBDay)
                    .addComponent(boxMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone)
                    .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkAgr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSbmt)
                    .addComponent(buttonClr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCncl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAgrActionPerformed
        clickBox = !clickBox;
    }//GEN-LAST:event_checkAgrActionPerformed

    private void buttonClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClrActionPerformed
        fieldFName.setText("");
        fieldLName.setText("");
        fieldUName.setText("");
        fieldPass.setText("");
        fieldRTPass.setText("");
        fieldPhone.setText("");
    }//GEN-LAST:event_buttonClrActionPerformed

    private void buttonCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCnclActionPerformed
        setVisible(false);
        App.main(arg);
    }//GEN-LAST:event_buttonCnclActionPerformed

    private void buttonSbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSbmtActionPerformed
        String firstname, lastname, user, password, rtpassword, phone;
        boolean nameCheck = false, userCheck = false, passCheck = false, rtpassCheck = false, 
                phoneCheck = false;
        Date birthday;
        
        firstname = fieldFName.getText();
        lastname = fieldLName.getText();
        user = fieldUName.getText();
        password = fieldPass.getText();
        rtpassword = fieldRTPass.getText();
        phone = "+7" + fieldPhone.getText();
        birthday = new Date(2013 - boxYears.getSelectedIndex() - 1900 , boxMonths.getSelectedIndex(), boxDays.getSelectedIndex()+1);
        String nameAlert = "";
        String userAlert = "";
        String passAlert = "";
        String rtpasswordAlert = "";
        String phoneAlert = "";
        String agreementAlert = "";
        nameCheck = Validator.nameChecking(firstname) && Validator.nameChecking(lastname);
        userCheck = Validator.userNameChecking(user);
        phoneCheck = Validator.phoneChecking(phone);
        if (password.length() > 6) {
            passCheck = true;
        }
        if (password.equals(rtpassword)) {
            rtpassCheck = true;
        }
        if ((nameCheck && userCheck && passCheck && rtpassCheck && phoneCheck && clickBox) == false) 
        {
            if (nameCheck == false) {
                nameAlert = "Firstname and lastname must contain only characters and can not be null.\n";
            }
            if (userCheck == false) {
                userAlert = "Username must be between 6 and 30 characters and contain only letters (a-z) and numbers.\n";
            }
            if (passCheck == false) {
                passAlert = "Password must be at least 6 characters.\n";
            }
            if (rtpassCheck == false) {
                rtpasswordAlert = "Passwords don't match.\n";
            }
            if (phoneCheck == false) {
                phoneAlert = "Phone number format is not recognized.\n";
            }
            if (clickBox == false) {
                agreementAlert = "You are not agree with the registration agreement.\n";
            }
            JOptionPane.showMessageDialog(rootPane, nameAlert + userAlert + passAlert
                    + rtpasswordAlert + phoneAlert + agreementAlert);
        } 
        else 
        {
            if(RegistrationDAO.submit(user, password, rtpassword, firstname, lastname, phone, birthday, clickBox, rootPane) == true)
            {
                setVisible(false);
                App.main(arg);
            }
        }
    }//GEN-LAST:event_buttonSbmtActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        App.main(arg);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxDays;
    private javax.swing.JComboBox boxMonths;
    private javax.swing.JComboBox boxYears;
    private javax.swing.JButton buttonClr;
    private javax.swing.JButton buttonCncl;
    private javax.swing.JButton buttonSbmt;
    private javax.swing.JCheckBox checkAgr;
    private javax.swing.JTextField field7;
    private javax.swing.JTextField fieldEMail;
    private javax.swing.JTextField fieldFName;
    private javax.swing.JTextField fieldLName;
    private javax.swing.JPasswordField fieldPass;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JPasswordField fieldRTPass;
    private javax.swing.JTextField fieldUName;
    private javax.swing.JLabel labelBDay;
    private javax.swing.JLabel labelFName;
    private javax.swing.JLabel labelLName;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelRTPass;
    private javax.swing.JLabel labelUName;
    // End of variables declaration//GEN-END:variables
}
