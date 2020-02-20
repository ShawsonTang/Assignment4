/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import Business.Customer.CustomerDirectory;

import Business.Airliner.AirlinerDirectory;
import Business.Customer.CustomerDirectory;
import Business.TravelAgency;
import Business.TravelOffice;
import UserInterface.ManageAirliner.ManageAirlinerJPanel;

import UserInterface.ManageCustomer.ManageCustomerJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class MainJFrame extends javax.swing.JFrame {
   private CustomerDirectory customerDirectory;

   private AirlinerDirectory airlinerDirectory;
   
   private TravelAgency travelAgency;
    
   private TravelOffice travelOffice;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.travelAgency = travelAgency.getInstance();
        //this.customerDirectory = new CustomerDirectory();

       // this.airlinerDirectory = new AirlinerDirectory();
       this.customerDirectory = travelAgency.getTravelOffice().getCustomerDirectory();
       this.airlinerDirectory = travelAgency.getAirlinerDirectory();
       this.travelOffice = travelAgency.getTravelOffice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageAirliner = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(160, 110));
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 383));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageAirliner.setText("Manage Airliner");
        btnManageAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinerActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        btnManageCustomer.setText("Manage Customer");
        btnManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinerActionPerformed
        // TODO add your handling code here:

        ManageAirlinerJPanel airlinerPanel = new ManageAirlinerJPanel(rightPanel, travelAgency);
        rightPanel.add("ManageAirlinerJPanel",airlinerPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }//GEN-LAST:event_btnManageAirlinerActionPerformed

    private void btnManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomerActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel panel = new ManageCustomerJPanel(rightPanel,travelOffice);
        rightPanel.add("ManageCustomerJPanel",panel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);  
        
    }//GEN-LAST:event_btnManageCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirliner;
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}