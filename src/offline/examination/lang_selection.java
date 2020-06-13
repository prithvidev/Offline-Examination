/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline.examination;

import java.awt.Frame;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class lang_selection extends javax.swing.JFrame {

    static int timerun = 0;
    
    public lang_selection() {
        initComponents();
        
        new Thread(){
            public void run(){
                while(timerun == 0){
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AMPM = cal.get(Calendar.AM_PM);
                    String dn = "";
                    if(AMPM == 1){dn ="PM";}
                    else{dn = "AM";}
                    String time = hour+":"+min+":"+sec+" "+dn;
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int mon = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    String date = day+" / "+mon+" / "+year;
                    
                    t.setText(time);
                    dt.setText(date);
                }
            }
        
        }.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        t = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        CANCEL = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 250));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 78, 17));

        dt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 78, 17));

        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/exit.png"))); // NOI18N
        CANCEL.setContentAreaFilled(false);
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel1.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 0, 27, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/minimize.png"))); // NOI18N
        minimize.setContentAreaFilled(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 27, -1));

        r1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r1.setText("JAVA");
        r1.setContentAreaFilled(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, 89, 45));

        r2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r2.setText("C++");
        r2.setContentAreaFilled(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 159, 60, 45));

        r3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r3.setText("Python");
        r3.setContentAreaFilled(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 209, -1, 45));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OFFLINE EXAMINATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, 269, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/java.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/c++.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/python.png"))); // NOI18N
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/14.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String s,s1,s3;
    
    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "ARE YOU SURE, YOU WANT TO EXIT?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
            dispose();
        }
        
    }//GEN-LAST:event_CANCELActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setExtendedState(lang_selection.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        if (r1.isSelected())
        {
            s=r1.getText();
            r2.setSelected(false);
            r3.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        if (r2.isSelected())
        {
            s1=r2.getText();
            r1.setSelected(false);
            r3.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        if (r3.isSelected())
        {
            s3=r3.getText();
            r1.setSelected(false);
            r2.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(r1.isSelected())
        {
            String s1=r1.getText();
            try
            {   registration obj=new registration(s1);
                this.setVisible(false);
                obj.setVisible(true);
            }
            catch(Exception e){}
        }

        else if(r2.isSelected())
        {
            String s2=r2.getText();
            try
            {
                registration obj2=new registration(s2);
                this.setVisible(false);
                obj2.setVisible(true);
            }
            catch(Exception e){}
        }

        else if(r3.isSelected())
        {
            String s3=r3.getText();
            try{
                registration obj3=new registration(s3);
                this.setVisible(false);
                obj3.setVisible(true);
            }
            catch(Exception e){}
        }

        else
        {
            try{
                ImageIcon icon = new ImageIcon("E:\\Netbeans project new\\Offline-Examination\\src\\offline\\examination\\Danger.png");
                JOptionPane.showMessageDialog(this,"**CHOOSE ONE OPTION**","Offline-Examination",JOptionPane.WARNING_MESSAGE, icon);

            }
            catch(Exception e){}
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(lang_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lang_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lang_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lang_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lang_selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCEL;
    private javax.swing.JLabel dt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimize;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
