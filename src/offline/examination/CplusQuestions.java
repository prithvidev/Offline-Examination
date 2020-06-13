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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ttt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ttt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/icons8-c++-100.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/Go back.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/minimize.png"))); // NOI18N
        minimize.setContentAreaFilled(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });

        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/offline/examination/exit.png"))); // NOI18N
        CANCEL.setContentAreaFilled(false);
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Q1)Which of the following type of class allows only one object of it to be created?");

        r1.setText("Virtual Class");
        r1.setContentAreaFilled(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setText("Abstract Class");
        r2.setContentAreaFilled(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r3.setText("Singleton Class");
        r3.setContentAreaFilled(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r4.setText("Friend Class");
        r4.setContentAreaFilled(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Q2)Which of the following is not a type of constructor?");

        r5.setText("Copy Constructor");
        r5.setContentAreaFilled(false);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r6.setText("Friend Constructor");
        r6.setContentAreaFilled(false);
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        r7.setText("Default Constructor");
        r7.setContentAreaFilled(false);
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        r8.setText("Parameterised Constructor");
        r8.setContentAreaFilled(false);
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Q3)Which of the following is not the member of Class?");

        r9.setText("Static Function");
        r9.setContentAreaFilled(false);
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        r10.setText("Friend Function");
        r10.setContentAreaFilled(false);
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        r11.setText("Constant Function");
        r11.setContentAreaFilled(false);
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });

        r12.setText("Virtual Function");
        r12.setContentAreaFilled(false);
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Q4)Which of the following concepts means determining at runtime what method to invoke?");

        r13.setText("Data Hiding");
        r13.setContentAreaFilled(false);
        r13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r13ActionPerformed(evt);
            }
        });

        r14.setText("Dynamic Typing");
        r14.setContentAreaFilled(false);
        r14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r14ActionPerformed(evt);
            }
        });

        r15.setText("Dynamic Binding");
        r15.setContentAreaFilled(false);
        r15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r15ActionPerformed(evt);
            }
        });

        r16.setText("Dynamic Loading");
        r16.setContentAreaFilled(false);
        r16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r16ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Q5)How Many Instances of an abstract class can be created?");

        r17.setText("One");
        r17.setContentAreaFilled(false);
        r17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r17ActionPerformed(evt);
            }
        });

        r18.setText("Thirteen");
        r18.setContentAreaFilled(false);
        r18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r18ActionPerformed(evt);
            }
        });

        r19.setText("Five");
        r19.setContentAreaFilled(false);
        r19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r19ActionPerformed(evt);
            }
        });

        r20.setText("Zero");
        r20.setContentAreaFilled(false);
        r20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r20ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r1)
                            .addGap(96, 96, 96)
                            .addComponent(r2)
                            .addGap(81, 81, 81)
                            .addComponent(r3)
                            .addGap(57, 57, 57)
                            .addComponent(r4))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r5)
                            .addGap(66, 66, 66)
                            .addComponent(r6)
                            .addGap(66, 66, 66)
                            .addComponent(r7)
                            .addGap(32, 32, 32)
                            .addComponent(r8))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r9)
                            .addGap(81, 81, 81)
                            .addComponent(r10)
                            .addGap(84, 84, 84)
                            .addComponent(r11)
                            .addGap(39, 39, 39)
                            .addComponent(r12))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r13)
                            .addGap(100, 100, 100)
                            .addComponent(r14)
                            .addGap(83, 83, 83)
                            .addComponent(r15)
                            .addGap(50, 50, 50)
                            .addComponent(r16))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r17)
                            .addGap(138, 138, 138)
                            .addComponent(r18)
                            .addGap(126, 126, 126)
                            .addComponent(r19)
                            .addGap(107, 107, 107)
                            .addComponent(r20)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(CANCEL)
                    .addComponent(minimize))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r4))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5)
                    .addComponent(r6)
                    .addComponent(r7)
                    .addComponent(r8))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9)
                    .addComponent(r10)
                    .addComponent(r11)
                    .addComponent(r12))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r13)
                    .addComponent(r14)
                    .addComponent(r15)
                    .addComponent(r16))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r17)
                    .addComponent(r18)
                    .addComponent(r19)
                    .addComponent(r20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

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
