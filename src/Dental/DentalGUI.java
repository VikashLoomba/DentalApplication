
package Dental;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *************************************************************
 *Comments by prof.
 *
 *************************************************************
 * File name:   DentalGUI.java
 * @author:     Niko Culevski
 * Created on:  April 29, 2005, 9:14 AM
 * @version:    1.1
 * Platform:    PC, Windows XP, Netbeans 6.8, jdk 1.6_14
 * @see javax.swing.JFrame
 * @see java.text.NumberFormat
 * @see java.io
 *************************************************************
 * <b>
 * This program calculates the bill for a patient at
 * dentist's office. Services provided are given with
 * check boxes with appropriate fees. Other check box
 * allows user to specify other fees. Billing for all
 * patients is saved to an external file Billing.txt.
 * Patients are read from an external file Patients.txt
 * </b>
 *************************************************************
 * Input:   Patient's names from Patients.txt
 * Output:  Bill for individual patient.
 *************************************************************
 * Comments by student
 *
 *************************************************************
 */
public class DentalGUI extends javax.swing.JFrame 
{
        // Class instance variables
        StringBuffer display = new StringBuffer();
        // Number formatter
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
    /**
     * Default constructor--creates new form DentalGUI
     */
    public DentalGUI() 
    {
        initComponents();
        //Set icon for the form
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Dental/tooth.jpg"));
        
        //Set the Calculate button as default
        this.getRootPane().setDefaultButton(calculateJButton);
        //Set center the form
        this.setLocationRelativeTo(null);
        //Call a method to read customers from an external file and
        //to populate the patients combobox, but first empty it
        patientJComboBox.removeAllItems();
        readPatientsFile();       
        
    }
    
    /**Need Javadocs for this method
     * 
     */
    private void readPatientsFile()
    {
        String fileName = "src/Dental/Patients.txt",
               patientName;
        try
        {
            FileReader fReader = new FileReader(fileName);
            BufferedReader inputFile = new BufferedReader(fReader);
            
            //Read first line and process
            patientName = inputFile.readLine();
            
            //Add patient names inside the combobox
            while(patientName != null)
            {
                patientJComboBox.addItem(patientName);
                patientName = inputFile.readLine();                
            }
            inputFile.close();
        }
        catch(FileNotFoundException exp)
        {
            exp.printStackTrace();
        }
        catch(IOException exp)
        {
            exp.printStackTrace();
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

        patientJPanel = new javax.swing.JPanel();
        patientJLabel = new javax.swing.JLabel();
        patientJComboBox = new javax.swing.JComboBox();
        servicesJPanel = new javax.swing.JPanel();
        cleaningJCheckBox = new javax.swing.JCheckBox();
        cleaningJLabel = new javax.swing.JLabel();
        cavityJCheckBox = new javax.swing.JCheckBox();
        cavityJLabel = new javax.swing.JLabel();
        xrayJCheckBox = new javax.swing.JCheckBox();
        xrayJLabel = new javax.swing.JLabel();
        fluorideJCheckBox = new javax.swing.JCheckBox();
        fluorideJLabel = new javax.swing.JLabel();
        rootJCheckBox = new javax.swing.JCheckBox();
        rootJLabel = new javax.swing.JLabel();
        otherJCheckBox = new javax.swing.JCheckBox();
        otherJTextField = new javax.swing.JTextField();
        totalJLabel = new javax.swing.JLabel();
        totalJTextField = new javax.swing.JTextField();
        displayJPanel = new javax.swing.JPanel();
        displayJScrollPane = new javax.swing.JScrollPane();
        outJTextArea = new javax.swing.JTextArea();
        controlJPanel = new javax.swing.JPanel();
        calculateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        dentaljMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        fileJSeparator = new javax.swing.JPopupMenu.Separator();
        printJMenuItem = new javax.swing.JMenuItem();
        quitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dental Application");
        setPreferredSize(new java.awt.Dimension(450, 342));
        setResizable(false);

        patientJPanel.setToolTipText("");

        patientJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        patientJLabel.setText("Patient Name:");
        patientJPanel.add(patientJLabel);

        patientJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Captain Spiff", "Nate The Great", "Kahte Patel", "Alexander the Great" }));
        patientJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientJComboBoxActionPerformed(evt);
            }
        });
        patientJPanel.add(patientJComboBox);

        getContentPane().add(patientJPanel, java.awt.BorderLayout.PAGE_START);

        servicesJPanel.setLayout(new java.awt.GridLayout(7, 2, 3, 3));

        cleaningJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cleaningJCheckBox.setSelected(true);
        cleaningJCheckBox.setText("Cleaning");
        servicesJPanel.add(cleaningJCheckBox);

        cleaningJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cleaningJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cleaningJLabel.setText("$35");
        servicesJPanel.add(cleaningJLabel);

        cavityJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cavityJCheckBox.setText("Cavity");
        cavityJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cavityJCheckBoxActionPerformed(evt);
            }
        });
        servicesJPanel.add(cavityJCheckBox);

        cavityJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cavityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cavityJLabel.setText("$150");
        servicesJPanel.add(cavityJLabel);

        xrayJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xrayJCheckBox.setText("X-Ray");
        servicesJPanel.add(xrayJCheckBox);

        xrayJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xrayJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xrayJLabel.setText("$85");
        servicesJPanel.add(xrayJLabel);

        fluorideJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fluorideJCheckBox.setText("Fluoride");
        servicesJPanel.add(fluorideJCheckBox);

        fluorideJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fluorideJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fluorideJLabel.setText("$50");
        servicesJPanel.add(fluorideJLabel);

        rootJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rootJCheckBox.setText("Root Canal");
        servicesJPanel.add(rootJCheckBox);

        rootJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rootJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rootJLabel.setText("$225");
        servicesJPanel.add(rootJLabel);

        otherJCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otherJCheckBox.setText("Other");
        otherJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherJCheckBoxActionPerformed(evt);
            }
        });
        servicesJPanel.add(otherJCheckBox);

        otherJTextField.setEditable(false);
        otherJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otherJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        servicesJPanel.add(otherJTextField);

        totalJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalJLabel.setText("Total ");
        servicesJPanel.add(totalJLabel);

        totalJTextField.setEditable(false);
        totalJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalJTextFieldActionPerformed(evt);
            }
        });
        servicesJPanel.add(totalJTextField);

        getContentPane().add(servicesJPanel, java.awt.BorderLayout.WEST);

        outJTextArea.setEditable(false);
        outJTextArea.setColumns(20);
        outJTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        outJTextArea.setRows(5);
        displayJScrollPane.setViewportView(outJTextArea);

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(displayJPanel, java.awt.BorderLayout.CENTER);

        controlJPanel.setLayout(new java.awt.GridLayout(2, 2));

        calculateJButton.setBackground(new java.awt.Color(255, 255, 204));
        calculateJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculateJButton.setMnemonic('C');
        calculateJButton.setText("Calculate");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(calculateJButton);

        saveJButton.setBackground(new java.awt.Color(255, 255, 204));
        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveJButton.setMnemonic('S');
        saveJButton.setText("Save");
        controlJPanel.add(saveJButton);

        clearJButton.setBackground(new java.awt.Color(255, 255, 204));
        clearJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearJButton.setMnemonic('r');
        clearJButton.setText("Clear");
        controlJPanel.add(clearJButton);

        quitJButton.setBackground(new java.awt.Color(255, 255, 204));
        quitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        controlJPanel.add(quitJButton);

        getContentPane().add(controlJPanel, java.awt.BorderLayout.SOUTH);

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");

        clearJMenuItem.setMnemonic('r');
        clearJMenuItem.setText("Clear");
        fileJMenu.add(clearJMenuItem);
        fileJMenu.add(fileJSeparator);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setEnabled(false);
        fileJMenu.add(printJMenuItem);

        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        fileJMenu.add(quitJMenuItem);

        dentaljMenuBar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");

        aboutJMenuItem1.setMnemonic('A');
        aboutJMenuItem1.setText("About");
        helpJMenu.add(aboutJMenuItem1);

        dentaljMenuBar.add(helpJMenu);

        setJMenuBar(dentaljMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
       // Calculate the bill for specified patient
       final double MAX_OTHER = 10000.0;    // maximum fee for other
       double total = 0.0;                  // sum of all services provided
       // specify display format
     
       String patient = patientJComboBox.getSelectedItem().toString();
       
       // display error message if no name entered or no box selected
      if ( ( patient.equals( "" ) ) || 
           ( !cleaningJCheckBox.isSelected() && 
           !cavityJCheckBox.isSelected() &&
           !xrayJCheckBox.isSelected() && 
           !fluorideJCheckBox.isSelected() &&
           !rootJCheckBox.isSelected() &&
           !otherJCheckBox.isSelected() ) 
         )
      {
         // display error message
         JOptionPane.showMessageDialog( null,
            "Please enter a name and check at least one item.",
            "Missing Information", JOptionPane.WARNING_MESSAGE );
      }
      else
      {
          double otherAmount = otherJCheckBox.isSelected() ?
                  Double.parseDouble(otherJTextField.getText()) : 0.0;
          DentalBill myBill = new DentalBill(patient,cleaningJCheckBox.isSelected(), 
              cavityJCheckBox.isSelected(), xrayJCheckBox.isSelected(), 
              fluorideJCheckBox.isSelected(), rootJCheckBox.isSelected(),
              otherJCheckBox.isSelected(), otherAmount);
              
          total = myBill.calculateBill();  
          totalJTextField.setText(valueOf(total));
          
          displayBill(patient, total, myBill);
      }
      
    }//GEN-LAST:event_calculateJButtonActionPerformed
        // JAVADOCS NEEDED
            //DISPLAYS BILL
        public void displayBill(String name, double sum, DentalBill bill)
        {
            display.append(padSpaces("Patient", name + '\n'));
            display.append('\n');
            if(cleaningJCheckBox.isSelected())
            {
                display.append(padSpaces("Cleaning", dollars.format(DentalBill.CLEANING) + '\n'));
            }
            
            if(cavityJCheckBox.isSelected())
            {
                display.append(padSpaces("Cavity", dollars.format(DentalBill.CAVITY) + '\n'));
            }
            if(xrayJCheckBox.isSelected())
            {
                display.append(padSpaces("X-Ray", dollars.format(DentalBill.XRAY) + '\n'));
            }
            if(fluorideJCheckBox.isSelected())
            {
                display.append(padSpaces("Fluoride", dollars.format(DentalBill.FLOURITE) + '\n'));
            }
            if(rootJCheckBox.isSelected())
            {
                display.append(padSpaces("Root Canal", dollars.format(DentalBill.ROOT) + '\n'));
            }
            if (otherJCheckBox.isSelected())
            {
                display.append(padSpaces("Other", dollars.format(bill.getAmount()) + '\n'));
            }
            display.append("------------------------------------------------------------\n");
            display.append(padSpaces("Total", dollars.format(sum) + '\n'));
            
            outJTextArea.setText(display.toString());
        }
        
        
        private StringBuffer padSpaces(String first, String second)
        {
            final int MAX = 35;
            StringBuffer line = new StringBuffer(first);
            //find number of spaces needed to pad the line
            int numSpaces = MAX - first.length() - second.length();
            
            for(int i = 0; i < numSpaces; i++)
            {
                line.append(" ");                 //append the needed spaces
            }
            
            line.append(second);
            return line;
        }
    private void totalJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalJTextFieldActionPerformed

    private void patientJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientJComboBoxActionPerformed

    private void otherJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherJCheckBoxActionPerformed

    }//GEN-LAST:event_otherJCheckBoxActionPerformed

    private void cavityJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cavityJCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cavityJCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(DentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DentalGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem1;
    private javax.swing.JButton calculateJButton;
    private javax.swing.JCheckBox cavityJCheckBox;
    private javax.swing.JLabel cavityJLabel;
    private javax.swing.JCheckBox cleaningJCheckBox;
    private javax.swing.JLabel cleaningJLabel;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JMenuBar dentaljMenuBar;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JScrollPane displayJScrollPane;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator fileJSeparator;
    private javax.swing.JCheckBox fluorideJCheckBox;
    private javax.swing.JLabel fluorideJLabel;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JCheckBox otherJCheckBox;
    private javax.swing.JTextField otherJTextField;
    private javax.swing.JTextArea outJTextArea;
    private javax.swing.JComboBox patientJComboBox;
    private javax.swing.JLabel patientJLabel;
    private javax.swing.JPanel patientJPanel;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JCheckBox rootJCheckBox;
    private javax.swing.JLabel rootJLabel;
    private javax.swing.JButton saveJButton;
    private javax.swing.JPanel servicesJPanel;
    private javax.swing.JLabel totalJLabel;
    private javax.swing.JTextField totalJTextField;
    private javax.swing.JCheckBox xrayJCheckBox;
    private javax.swing.JLabel xrayJLabel;
    // End of variables declaration//GEN-END:variables
}