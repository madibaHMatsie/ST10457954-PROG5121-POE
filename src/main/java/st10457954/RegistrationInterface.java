package st10457954;

import javax.swing.JOptionPane;

/**
 *
 * @author Madiba
 */
public class RegistrationInterface extends javax.swing.JFrame {

    private User matsie;
    private Authentication verifyAgaintsStoredCredentials;
    /**
     * Creates new form RegistrationInterface
     */
    public RegistrationInterface(User user, Authentication authentication) 
    {
        this.matsie = user;
        this.verifyAgaintsStoredCredentials = authentication;
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

        headerPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        cellphoneLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        regUsernameAttempt = new javax.swing.JTextField();
        regCellphoneAttempt = new javax.swing.JTextField();
        regLastnameAttempt = new javax.swing.JTextField();
        regFirstnameAttempt = new javax.swing.JTextField();
        regPasswordAttempt = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        bodyPanel.setBackground(new java.awt.Color(187, 130, 232));

        firstnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstnameLabel.setText("Enter your First Name      >>>");

        lastnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastnameLabel.setText("Enter your Last Name      >>>");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setText("Create your Username    >>>");

        cellphoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cellphoneLabel.setText("Enter your Number         >>>");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Create your Password     >>>");

        regUsernameAttempt.setPreferredSize(new java.awt.Dimension(200, 22));

        regCellphoneAttempt.setPreferredSize(new java.awt.Dimension(200, 22));

        regLastnameAttempt.setPreferredSize(new java.awt.Dimension(200, 22));

        regFirstnameAttempt.setPreferredSize(new java.awt.Dimension(200, 22));

        regPasswordAttempt.setPreferredSize(new java.awt.Dimension(200, 22));

        submitButton.setBackground(new java.awt.Color(134, 199, 237));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitButton.setText("CONTINUE");
        submitButton.setPreferredSize(new java.awt.Dimension(200, 25));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("REGISTRATION");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellphoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regFirstnameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regCellphoneAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regLastnameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regUsernameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regPasswordAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(294, 294, 294))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(firstnameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastnameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cellphoneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(passwordLabel))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(regFirstnameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regLastnameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regCellphoneAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regUsernameAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regPasswordAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(logoLabel)
                .addGap(200, 200, 200))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
String username, password, cellphone, firstname, lastname;
        
        username = regUsernameAttempt.getText();
        password =  new String(regPasswordAttempt.getPassword());
        cellphone = regCellphoneAttempt.getText();
        firstname = regFirstnameAttempt.getText();
        lastname = regLastnameAttempt.getText();
        
        String results =
        matsie.registerUser(username, password, cellphone, firstname, lastname);
        
        if (results.contains("REGISTRATION SUCCESS"))
        {
            JOptionPane.showMessageDialog(this, results, "Registration Success", JOptionPane.INFORMATION_MESSAGE);
            LoginInterface loginInterfaceInstance = new LoginInterface(verifyAgaintsStoredCredentials);
            loginInterfaceInstance.setVisible(true);
            loginInterfaceInstance.setLocationRelativeTo(null);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, results, "Registration Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel cellphoneLabel;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField regCellphoneAttempt;
    private javax.swing.JTextField regFirstnameAttempt;
    private javax.swing.JTextField regLastnameAttempt;
    private javax.swing.JPasswordField regPasswordAttempt;
    private javax.swing.JTextField regUsernameAttempt;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
