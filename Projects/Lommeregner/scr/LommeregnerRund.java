/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lommeregner;

/**
 *
 * @author Simon
 */
public class LommeregnerRund extends javax.swing.JFrame {
    
    double num, ans;
    int calculation;
         
    /**
     * Creates new form LommeregnerRund
     */
    public LommeregnerRund() {
        initComponents();
    }
    
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: //Plus et regnestykke
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));                
                break; 
                
            case 2: //Minus et regnestykke
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));                
                break;
                
            case 3: //Gange et regnestykke
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));                
                break; 
                
            case 4: //Dividere et regnestykke
                ans = num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));                
                break; 
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

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jBtnDivide = new javax.swing.JButton();
        jBtnBackspace = new javax.swing.JButton();
        jBtnC = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnStar = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnEquals = new javax.swing.JButton();
        jBtnZero = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("jButton1");

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("jButton1");

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("jButton1");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Lommeregner");
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(340, 470));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 312, 47));

        jBtnDivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDivide.setText("/");
        jBtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 70, 61));

        jBtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnBackspace.setText("<");
        jBtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackspaceActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 61));

        jBtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnC.setText("C");
        jBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 61));

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 61));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 61));

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 61));

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 61));

        jBtnStar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnStar.setText("*");
        jBtnStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, 61));

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 61));

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 61));

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, 61));

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 70, 61));

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 61));

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, 61));

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 70, 61));

        jBtnEquals.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnEquals.setText("=");
        jBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 70, 61));

        jBtnZero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnZero.setText("0");
        jBtnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnZeroActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 61));

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 70, 61));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -6, 70, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnZeroActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_jBtnZeroActionPerformed

    private void jBtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivideActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 4;
        jTextField1.setText("");
        jLabel1.setText(num + " /");
    }//GEN-LAST:event_jBtnDivideActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 2;
        jTextField1.setText("");
        jLabel1.setText(num + " -");
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 1;
        jTextField1.setText("");
        jLabel1.setText(num + " +");
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStarActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 3;
        jTextField1.setText("");
        jLabel1.setText(num + " *");
    }//GEN-LAST:event_jBtnStarActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jBtnCActionPerformed

    private void jBtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackspaceActionPerformed
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
            
        }
    }//GEN-LAST:event_jBtnBackspaceActionPerformed

    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualsActionPerformed
        arithmetic_operation();
        jLabel1.setText("");
    }//GEN-LAST:event_jBtnEqualsActionPerformed

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
            java.util.logging.Logger.getLogger(LommeregnerRund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LommeregnerRund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LommeregnerRund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LommeregnerRund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LommeregnerRund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnBackspace;
    private javax.swing.JButton jBtnC;
    private javax.swing.JButton jBtnDivide;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEquals;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnStar;
    private javax.swing.JButton jBtnZero;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}