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
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj
 */
public class Update extends javax.swing.JFrame {
private Connection con;
    ResultSet rs;
    Statement s;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
        String user = "root";
    String password = "12345";
   String url = "jdbc:mysql://localhost/mydb?user="+user+"&password="+password;
    
         
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url);
            
        } catch (ClassNotFoundException | SQLException ex){
            //Logger.getLogger(CMTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextArea1 = new javax.swing.JTextArea();
        editbutton1 = new javax.swing.JButton();
        deletebutton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editbutton2 = new javax.swing.JButton();
        editbutton3 = new javax.swing.JButton();
        editbutton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criminal Record Management System");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 110, 78, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NIC");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 150, 78, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 190, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contact");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 230, 78, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 270, 78, 27);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 110, 171, 30);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 150, 171, 30);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 190, 171, 30);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 230, 171, 30);

        jtextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jtextArea1.setColumns(20);
        jtextArea1.setRows(5);
        jScrollPane1.setViewportView(jtextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 280, 171, 90);

        editbutton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbutton1.setText("Update");
        editbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton1);
        editbutton1.setBounds(380, 280, 100, 20);

        deletebutton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton1.setText("Delete");
        deletebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(deletebutton1);
        deletebutton1.setBounds(230, 420, 90, 30);

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setText("Back");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(360, 420, 80, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/satyameva_jayte.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 30, 100, 140);

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("         Welcome to Criminal Record Management Syastem");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 560, 30);

        editbutton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbutton2.setText("Update");
        editbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton2);
        editbutton2.setBounds(380, 200, 100, 20);

        editbutton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbutton3.setText("Update");
        editbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton3);
        editbutton3.setBounds(380, 240, 100, 20);

        editbutton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbutton4.setText("Update All");
        editbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton4);
        editbutton4.setBounds(100, 420, 110, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/ComputerDesktopWallpapersCollection708_108.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 560, 560);

        setSize(new java.awt.Dimension(576, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void editbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbutton1ActionPerformed
 // TODO add your handling code here:
        try
        {
            String x = jTextField1.getText();
            String x1 = jTextField2.getText();
            String x2 = jTextField3.getText();
            String x3 = jTextField4.getText();
           String x4 = jtextArea1.getText();
           String query;
           // query = "UPDATE petitioner SET father_name='"+x2+"' where name='"+x+"' AND nic='"+x1+"';";
           
             query = "UPDATE petitioner SET address='"+x4+"' where name='"+x+"' AND nic='"+x1+"';";
             s=con.createStatement();
             s.execute(query);
          // String query="UPDATE petitioner SET father_name='"+x2+"',contact="+x3+", address='"+x4+"' where name='"+x+"' AND nic='"+x1+"';";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
           // s=con.createStatement();
           // s.execute(query);
            // query = "UPDATE petitioner SET contact='"+x3+"' where name='"+x+"' AND nic='"+x1+"';";
            // s=con.createStatement();
             //s.execute(query);
            
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Updated!!", "Message", mc);
        }
           catch(Exception e)
           {
               e.printStackTrace();
           }
    }//GEN-LAST:event_editbutton1ActionPerformed

    private void deletebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton1ActionPerformed
        // TODO add your handling code here:
         try
        {
            String x = jTextField1.getText();
            String x1 = jTextField2.getText();
            //String x2 = jTextField3.getText();
           // String x3 = jTextField4.getText();
          // String x4 = jtextArea1.getText();
           String query="delete from petitioner where name='"+x+"' AND nic='"+x1+"';";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Record Deleted!!", "Message", mc);
        }
           catch(Exception e)
           {
               e.printStackTrace();
               
           }
    }//GEN-LAST:event_deletebutton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        Petitioner p=new Petitioner();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextActionPerformed

    private void editbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbutton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            String x = jTextField1.getText();
            String x1 = jTextField2.getText();
            String x2 = jTextField3.getText();
            String x3 = jTextField4.getText();
           String x4 = jtextArea1.getText();
           String query;
            query = "UPDATE petitioner SET father_name='"+x2+"' where name='"+x+"' AND nic='"+x1+"';";
           
            
          // String query="UPDATE petitioner SET father_name='"+x2+"',contact="+x3+", address='"+x4+"' where name='"+x+"' AND nic='"+x1+"';";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
             
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Updated!!", "Message", mc);
        }
           catch(Exception e)
           {
               e.printStackTrace();
           }
    }//GEN-LAST:event_editbutton2ActionPerformed

    private void editbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbutton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            String x = jTextField1.getText();
            String x1 = jTextField2.getText();
            String x2 = jTextField3.getText();
            String x3 = jTextField4.getText();
           String x4 = jtextArea1.getText();
           String query;
           query = "UPDATE petitioner SET contact='"+x3+"' where name='"+x+"' AND nic='"+x1+"';";
           
            
          // String query="UPDATE petitioner SET father_name='"+x2+"',contact="+x3+", address='"+x4+"' where name='"+x+"' AND nic='"+x1+"';";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Updated!!", "Message", mc);
        }
           catch(Exception e)
           {
               e.printStackTrace();
           }
    }//GEN-LAST:event_editbutton3ActionPerformed

    private void editbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbutton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            String x = jTextField1.getText();
            String x1 = jTextField2.getText();
            String x2 = jTextField3.getText();
            String x3 = jTextField4.getText();
           String x4 = jtextArea1.getText();
           
            
          String query="UPDATE petitioner SET father_name='"+x2+"',contact="+x3+", address='"+x4+"' where name='"+x+"' AND nic='"+x1+"';";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Updated!!", "Message", mc);
        }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        
    }//GEN-LAST:event_editbutton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebutton1;
    private javax.swing.JButton editbutton1;
    private javax.swing.JButton editbutton2;
    private javax.swing.JButton editbutton3;
    private javax.swing.JButton editbutton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextArea jtextArea1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}