/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;
import java.sql.*;
import javax.swing.JOptionPane;
//import javax.swing.*;

/**
 *
 * @author piyus
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    int count=0;
    int ch=6;
    public admin() {
        initComponents();
           setLocationRelativeTo(null);
          /// jButton2.setVisible(false);
          // jButton3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jDialog1.setPreferredSize(new java.awt.Dimension(500, 500));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFormattedTextField1.setText("jFormattedTextField1");
        jFormattedTextField1.setMinimumSize(new java.awt.Dimension(50, 50));
        jDialog1.getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 50));

        jLabel8.setText("jLabel8");
        jDialog1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 15, 16));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmain/images/user.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        jPanel3.setBackground(new java.awt.Color(157, 43, 41));
        jPanel3.setForeground(new java.awt.Color(214, 80, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMIN LOGIN");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UNIQUE ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 60));

        jTextField1.setBackground(new java.awt.Color(157, 43, 41));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 410, 30));

        jSeparator1.setBackground(new java.awt.Color(25, 15, 16));
        jSeparator1.setForeground(new java.awt.Color(25, 15, 16));
        jSeparator1.setToolTipText("");
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 410, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 290, 60));

        jPasswordField1.setBackground(new java.awt.Color(157, 43, 41));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);
        jPasswordField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPasswordField1PropertyChange(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 410, 30));

        jSeparator2.setBackground(new java.awt.Color(25, 15, 16));
        jSeparator2.setForeground(new java.awt.Color(25, 15, 16));
        jSeparator2.setToolTipText("");
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 410, 20));

        jButton1.setBackground(new java.awt.Color(214, 80, 77));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 220, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 410, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PASSWORD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 550, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       count++;
       System.out.println(count);
        ch--;
        jLabel5.setText("Chances left:"+" "+Integer.toString(ch));
        if(count==6)
        {
            //jLabel5.setText("");
           jLabel5.setText("(Please wait for 20 sec..)");
           
            System.out.println("hello");
            
          //  jDialog1.setLocationRelativeTo(null);
         // jLabel5.setText("helo");
          
            try
            {
               // jLabel5.setText("(Please wait for 20 sec..)");
                jDialog1.setVisible(true);
                
                 JOptionPane.showMessageDialog(this,"Please wait for 20 sec..");
                    Thread.sleep(20000);
                    jDialog1.setVisible(false);
                    
                
                
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
            
            this.dispose();
          
            //System.out.println("okk");
          // this.dispose();
        }
        String id=jTextField1.getText();
        String passw=jPasswordField1.getText();
        String oid=" ",opass=" ";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("com.mysql.jdbc.Driver");
            Connection admc=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bank","root","1806");
            Statement stmt=admc.createStatement();
            String st="select * from admin where uid='"+id+"'";
            ResultSet rs=stmt.executeQuery(st);
            
            while(rs.next())
            {
                oid=rs.getString("uid");
                opass=rs.getString("password");
                
                
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        if(id.equals(oid))
        {
             //jLabel6.setText("Correct");
             if( passw.equals(opass))
             {
                  
                  jLabel2.setText(" ");
                  //JOptionPane.showMessageDialog(this,"login done");
                 //// loading ld=new loading();
                 // ld.setVisible(true);
                 // try
                 // {
                    //  Thread.sleep(3000);
                         adminhome admh=new adminhome();
                       admh.setVisible(true);
                     // ld.setVisible(false);
                   
                 
                      
                 // }
                 // catch(Exception e)
                 // {
                     // System.out.println(e);
                 // }
                  
             }
             else
        {
            jLabel2.setText("Invalid username or password");
        }
        }
        else
        {
            jLabel2.setText("Invalid username or password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
        // TODO add your handling code here:
    //    jButton3.setVisible(true);
    }//GEN-LAST:event_jTextField1PropertyChange

    private void jPasswordField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPasswordField1PropertyChange
        // TODO add your handling code here:
     //   jButton2.setVisible(true);
    }//GEN-LAST:event_jPasswordField1PropertyChange

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        // TODO add your handling code here:
      //    jButton2.setVisible(true);
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
       //  jButton3.setVisible(true);
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
