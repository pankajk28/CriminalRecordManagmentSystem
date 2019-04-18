/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CRMSproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Pankaj
 */
public class Petitioner_Retrive extends javax.swing.JFrame {
    private Object con;

    /**
     * Creates new form Petitioner_Retrive
     */
    public Petitioner_Retrive() {
        initComponents();
    }
    public Petitioner_Retrive(String name) {
        initComponents();
       this.setVisible(true);
        String user = "root";
    String password = "12345";
   String url = "jdbc:mysql://localhost/mydb?user="+user+"&password="+password;
    Connection con;
    Statement s;
         try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url);
            {
            s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM petitioner where name='"+name+"'";
            s.execute(query);
            ResultSet rs = s.getResultSet();
            ArrayList<HashMap<String,String>> record  = new ArrayList<HashMap<String,String>>();
            HashMap<String, String> map;
            while(rs.next()){
                map = new HashMap<String, String>();
                 map.put("NAME",rs.getString("name"));
                 map.put("NIC",rs.getString("NIC"));
                 map.put("FATHER_NAME",rs.getString("FATHER_NAME"));
                 map.put("CONTACT",rs.getString("CONTACT"));
                 map.put("ADDRESS",rs.getString("ADDRESS"));
                 record.add(map);
            }
               
            for(int i=0; i<record.size(); i++){
                jTable2.setValueAt(record.get(i).get("NAME"), i, 0);
                jTable2.setValueAt(record.get(i).get("NIC"), i, 1);
                jTable2.setValueAt(record.get(i).get("FATHER_NAME"), i, 2);
                jTable2.setValueAt(record.get(i).get("CONTACT"), i, 3);
                jTable2.setValueAt(record.get(i).get("ADDRESS"), i, 4);
            }
            System.out.println(""+record.toString());
        }
         }catch (ClassNotFoundException | SQLException ex){
            //Logger.getLogger(CMTable.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criminal Record Management System");
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "NIC", "Father_name", "Contact", "Address"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 90, 820, 190);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Retrive");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 320, 100, 30);

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setText("Back To Petitioner");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(400, 320, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Petitioner Record");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 20, 120, 30);

        setSize(new java.awt.Dimension(834, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          String user = "root";
    String password = "12345";
   String url = "jdbc:mysql://localhost/mydb?user="+user+"&password="+password;
    Connection con;
    Statement s;
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url);
            s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM PETITIONER";
            s.execute(query);
            ResultSet rs = s.getResultSet();
            ArrayList<HashMap<String,String>> record  = new ArrayList<HashMap<String,String>>();
            HashMap<String, String> map;
            while(rs.next()){
                map = new HashMap<String, String>();
                 map.put("NAME",rs.getString("name"));
                 map.put("NIC",rs.getString("NIC"));
                 map.put("FATHER_NAME",rs.getString("FATHER_NAME"));
                 map.put("CONTACT",rs.getString("CONTACT"));
                 map.put("ADDRESS",rs.getString("ADDRESS"));
                 record.add(map);
            }
               
            for(int i=0; i<record.size(); i++){
                jTable2.setValueAt(record.get(i).get("NAME"), i, 0);
                jTable2.setValueAt(record.get(i).get("NIC"), i, 1);
                jTable2.setValueAt(record.get(i).get("FATHER_NAME"), i, 2);
                jTable2.setValueAt(record.get(i).get("CONTACT"), i, 3);
                jTable2.setValueAt(record.get(i).get("ADDRESS"), i, 4);
            }
            System.out.println(""+record.toString());
        } catch (ClassNotFoundException | SQLException ex){
            //Logger.getLogger(CMTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        Petitioner p=new Petitioner();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Petitioner_Retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petitioner_Retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petitioner_Retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petitioner_Retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petitioner_Retrive().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
