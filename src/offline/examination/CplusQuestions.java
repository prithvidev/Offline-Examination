/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline.examination;

/**
 *
 * @author PrithviDevKumar
 */
public class CplusQuestions extends javax.swing.JFrame {

    String s;
    int count=0;
    public CplusQuestions() {
        initComponents();
    }

    CplusQuestions(String sw) {
        initComponents();
         s="Welcome "+sw+" Quiz Begins"+" ";
         ttt.setText(s); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ttt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        r9 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        r13 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        r17 = new javax.swing.JRadioButton();
        r18 = new javax.swing.JRadioButton();
        r19 = new javax.swing.JRadioButton();
        r20 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ttt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ttt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(ttt, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, 556, 88));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/icons8-c++-100.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 88));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/Go back.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 30, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/minimize.png"))); // NOI18N
        minimize.setContentAreaFilled(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 0, 27, -1));

        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/exit.png"))); // NOI18N
        CANCEL.setContentAreaFilled(false);
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel1.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 0, 27, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Q1)Which of the following type of class allows only one object of it to be created?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 117, 717, 25));

        r1.setText("Virtual Class");
        r1.setContentAreaFilled(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 149, -1, -1));

        r2.setText("Abstract Class");
        r2.setContentAreaFilled(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 149, -1, -1));

        r3.setText("Singleton Class");
        r3.setContentAreaFilled(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 149, -1, -1));

        r4.setText("Friend Class");
        r4.setContentAreaFilled(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 149, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Q2)Which of the following is not a type of constructor?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 190, 717, 25));

        r5.setText("Copy Constructor");
        r5.setContentAreaFilled(false);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });
        jPanel1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 222, -1, -1));

        r6.setText("Friend Constructor");
        r6.setContentAreaFilled(false);
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });
        jPanel1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 222, -1, -1));

        r7.setText("Default Constructor");
        r7.setContentAreaFilled(false);
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });
        jPanel1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 222, -1, -1));

        r8.setText("Parameterised Constructor");
        r8.setContentAreaFilled(false);
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });
        jPanel1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 222, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Q3)Which of the following is not the member of Class?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 263, 713, 25));

        r9.setText("Static Function");
        r9.setContentAreaFilled(false);
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });
        jPanel1.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 295, -1, -1));

        r10.setText("Friend Function");
        r10.setContentAreaFilled(false);
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });
        jPanel1.add(r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 295, -1, -1));

        r11.setText("Constant Function");
        r11.setContentAreaFilled(false);
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });
        jPanel1.add(r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 295, -1, -1));

        r12.setText("Virtual Function");
        r12.setContentAreaFilled(false);
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });
        jPanel1.add(r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 295, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Q4)Which of the following concepts means determining at runtime what method to invoke?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 336, 717, 25));

        r13.setText("Data Hiding");
        r13.setContentAreaFilled(false);
        r13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r13ActionPerformed(evt);
            }
        });
        jPanel1.add(r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 368, -1, -1));

        r14.setText("Dynamic Typing");
        r14.setContentAreaFilled(false);
        r14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r14ActionPerformed(evt);
            }
        });
        jPanel1.add(r14, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 368, -1, -1));

        r15.setText("Dynamic Binding");
        r15.setContentAreaFilled(false);
        r15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r15ActionPerformed(evt);
            }
        });
        jPanel1.add(r15, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 368, -1, -1));

        r16.setText("Dynamic Loading");
        r16.setContentAreaFilled(false);
        r16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r16ActionPerformed(evt);
            }
        });
        jPanel1.add(r16, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 368, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Q5)How Many Instances of an abstract class can be created?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 409, 717, 25));

        r17.setText("One");
        r17.setContentAreaFilled(false);
        r17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r17ActionPerformed(evt);
            }
        });
        jPanel1.add(r17, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 441, -1, -1));

        r18.setText("Thirteen");
        r18.setContentAreaFilled(false);
        r18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r18ActionPerformed(evt);
            }
        });
        jPanel1.add(r18, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 441, -1, -1));

        r19.setText("Five");
        r19.setContentAreaFilled(false);
        r19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r19ActionPerformed(evt);
            }
        });
        jPanel1.add(r19, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 441, -1, -1));

        r20.setText("Zero");
        r20.setContentAreaFilled(false);
        r20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r20ActionPerformed(evt);
            }
        });
        jPanel1.add(r20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 441, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 493, 107, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/14.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        lang_selection obj=new lang_selection();
        obj.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setExtendedState(CplusQuestions.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_CANCELActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        if(r1.isSelected())
        {
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        if(r2.isSelected())
        {
            r1.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        if(r3.isSelected())
        {
            count=count+1;
            r2.setSelected(false);
            r1.setSelected(false);
            r4.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        if(r4.isSelected())
        {
            r2.setSelected(false);
            r3.setSelected(false);
            r1.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        if(r5.isSelected())
        {
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        if(r6.isSelected())
        {count=count+1;
            r5.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r6ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        if(r7.isSelected())
        {
            r6.setSelected(false);
            r5.setSelected(false);
            r8.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        if(r8.isSelected())
        {
            r6.setSelected(false);
            r7.setSelected(false);
            r5.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r8ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
        if(r9.isSelected())
        {
            r10.setSelected(false);
            r11.setSelected(false);
            r12.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r9ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
        if(r10.isSelected())
        {count=count+1;
            r9.setSelected(false);
            r11.setSelected(false);
            r12.setSelected(false);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_r10ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
        if(r11.isSelected())
        {
            r10.setSelected(false);
            r9.setSelected(false);
            r12.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r11ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
        if(r12.isSelected())
        {
            r10.setSelected(false);
            r11.setSelected(false);
            r9.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r12ActionPerformed

    private void r13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r13ActionPerformed
        if(r13.isSelected())
        {
            r14.setSelected(false);
            r15.setSelected(false);
            r16.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r13ActionPerformed

    private void r14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r14ActionPerformed
        if(r14.isSelected())
        {count=count+1;
            r13.setSelected(false);
            r15.setSelected(false);
            r16.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r14ActionPerformed

    private void r15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r15ActionPerformed
        if(r15.isSelected())
        {count=count+1;
            r14.setSelected(false);
            r13.setSelected(false);
            r16.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r15ActionPerformed

    private void r16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r16ActionPerformed
        if(r16.isSelected())
        {
            r14.setSelected(false);
            r15.setSelected(false);
            r13.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r16ActionPerformed

    private void r17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r17ActionPerformed
        if(r17.isSelected())
        {
            r18.setSelected(false);
            r19.setSelected(false);
            r20.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_r17ActionPerformed

    private void r18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r18ActionPerformed
        if(r18.isSelected())
        {
            r17.setSelected(false);
            r19.setSelected(false);
            r20.setSelected(false);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_r18ActionPerformed

    private void r19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r19ActionPerformed
        if(r19.isSelected())
        {
            r18.setSelected(false);
            r17.setSelected(false);
            r20.setSelected(false);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_r19ActionPerformed

    private void r20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r20ActionPerformed
        if(r20.isSelected())
        {count=count+1;
            r18.setSelected(false);
            r19.setSelected(false);
            r17.setSelected(false);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_r20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String se=Integer.toString(count);
        Results obj3 =new Results(se);
        this.setVisible(false);
        obj3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CplusQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CplusQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CplusQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CplusQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CplusQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimize;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r17;
    private javax.swing.JRadioButton r18;
    private javax.swing.JRadioButton r19;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r20;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    private javax.swing.JLabel ttt;
    // End of variables declaration//GEN-END:variables
}
