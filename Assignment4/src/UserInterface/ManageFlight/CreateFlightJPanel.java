/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlight;
import Business.Schedule.Flight;
import Business.Schedule.FlightSchedule;
import Business.TravelAgency;
import UserInterface.ManageFlight.ManageFlightJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author apple
 */
public class CreateFlightJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;
    private FlightSchedule flightSchedule;  
    private ManageFlightJPanel manageFlightJPanel;
    private TravelAgency travelAgency;
    /**
     * Creates new form CreateFlightJPanel
     */
    public CreateFlightJPanel(JPanel rightPanel,FlightSchedule flightSch,TravelAgency travelAgency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.flightSchedule=flightSch;
        this.travelAgency = travelAgency;
        showCombo();
                
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
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAirplane = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        cmboxTime = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtArrival = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(60, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Create Flight");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel2.setText("FlightNum");
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        txtFlightNum.setMinimumSize(new java.awt.Dimension(100, 20));
        txtFlightNum.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(txtFlightNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 23));

        jLabel3.setText("Airplane");
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel4.setText("From");
        jLabel4.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel5.setText("To");
        jLabel5.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel6.setText("Arrival Time");
        jLabel6.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, -1));

        txtAirplane.setMinimumSize(new java.awt.Dimension(100, 20));
        txtAirplane.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(txtAirplane, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 23));

        txtFrom.setMinimumSize(new java.awt.Dimension(100, 20));
        txtFrom.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(txtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 23));

        txtTo.setMinimumSize(new java.awt.Dimension(100, 20));
        txtTo.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 23));

        cmboxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxTimeActionPerformed(evt);
            }
        });
        jPanel1.add(cmboxTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 90, 20));

        jLabel7.setText("Time Slot");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txtArrival.setText("dd-MMM-yyyy HH:mm:ss");
        jPanel1.add(txtArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, 30));

        jLabel8.setText("Departure Time");
        jLabel8.setMinimumSize(new java.awt.Dimension(60, 25));
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 25));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, -1));

        txtDeparture.setText("dd-MMM-yyyy HH:mm:ss");
        jPanel1.add(txtDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 100, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 476, 289));

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();

        //       Component[] comps =this.rightPanel.getComponents();
        //       for(Component comp:comps){
            //           if(comp instanceof ManageFlightJPanel){
                //             ManageFlightJPanel manageFlightJPanel =(ManageFlightJPanel) comp;
                //             manageFlightJPanel.populateTable();
                //       }
            //       }

        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void showCombo(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmboxTime.getModel();
        model.removeAllElements();
        model.addElement("Morning");
        model.addElement("Day");
        model.addElement("Evening");
    }
    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            // TODO add your handling code here:
            List<Flight> flights = new ArrayList<>();
            String FlightNum = txtFlightNum.getText();
            String Airplane = txtAirplane.getText();
            String From = txtFrom.getText();
            String To = txtTo.getText();
            Date dateDeparture = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").parse(txtDeparture.getText());
            Date dateArrival = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").parse(txtArrival.getText());
            if (dateArrival.compareTo(dateDeparture) != 1) {
                JOptionPane.showMessageDialog(null,"Arrival time cannot be earlier than departure time!");
                txtArrival.setText("");
                return;
            }
            for (Flight f : flightSchedule.getFlightList()) {
                if (f.getFlightNum().equalsIgnoreCase(FlightNum)) {
                    flights.add(f);
                }
            }
            for (Flight f : flights) {
                if (f.getArrivalTime().compareTo(dateDeparture) != -1) {
                    JOptionPane.showMessageDialog(null,"This flight is currently not available!");
                    return;
                }
            }
            String time = (String)cmboxTime.getSelectedItem();
            
            
            if(FlightNum == null || FlightNum.equals("")||Airplane == null || Airplane.equals("")||From == null || From.equals("")||To == null || To.equals("")){
                JOptionPane.showMessageDialog(null, "Any column can't be empty");
                return;
            }
            
            if(flightSchedule.getFlightList().isEmpty()){
                travelAgency.getMasterFlightSchedule().getFlightScheduleList().add(flightSchedule);
            }
            Flight flight = flightSchedule.addFlight();
            if (!txtFrom.getText().equalsIgnoreCase(txtTo.getText())) {
                flight.setFlightNum(FlightNum);
                flight.setAirplane(Airplane);
                flight.setFrom(From);
                flight.setTo(To);
                flight.setDepartureTime(dateDeparture);
                flight.setArrivalTime(dateArrival);
                flight.setAirliner(flightSchedule.getAirliner());
                //travelAgency.getMasterFlightSchedule().getFlightScheduleList().add(flightSchedule);
                //travelAgency.getTravelOffice().getMasterFlightSchedule().getFlightScheduleList().add(flightSchedule);
            }
            else {
                JOptionPane.showMessageDialog(null,"Arrival location and departure location can’t be the same!");
                txtFrom.setText("");
                txtTo.setText("");
                return;
            }
            JOptionPane.showMessageDialog(null,"Flight successful created!");
            
            txtFlightNum.setText("");
            txtAirplane.setText("");
            txtFrom.setText("");
            txtTo.setText("");
            txtDeparture.setText("");
            txtArrival.setText("");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Date Format is Incorrect!");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmboxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxTimeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cmboxTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmboxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAirplane;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtFlightNum;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}