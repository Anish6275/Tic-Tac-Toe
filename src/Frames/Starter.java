/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class Starter extends javax.swing.JFrame {

    /**
     * Creates new form Sarter
     */
    public Starter() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        jCheckBox2.setSelected(true);
        //setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new RoundedPanel(80, Color.black);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Multi-Player");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 204), 3, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(6);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, -1));

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Single-Player");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 204), 3, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(6);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 160, -1));

        jLabel2.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BRIDGE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("powered  by-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("miniMax");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jPanel2.setBackground(new Color(0,0,0,0));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Player 1");
        jLabel6.setEnabled(false);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 0, 60, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Player 2");
        jLabel5.setEnabled(false);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 60, 49, 40);

        jTextField2.setBackground(new Color(0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setMinimumSize(new java.awt.Dimension(60, 90));
        jTextField2.setOpaque(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(60, 90));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(40, 30, 300, 40);

        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        jTextField1.setOpaque(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(40, 90, 300, 40);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Single Match");
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(40, 130, 140, 30);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setText("Rapid Fire");
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(210, 130, 120, 30);

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(140, 160, 97, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 0, 210));

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Your Name");
        jLabel7.setEnabled(false);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 40, 100, 40);

        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setMinimumSize(new java.awt.Dimension(60, 90));
        jTextField3.setOpaque(false);
        jTextField3.setPreferredSize(new java.awt.Dimension(60, 90));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(40, 70, 300, 40);

        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(130, 140, 97, 50);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 0, 210));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Developed By:- Anish Roy");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Class- XII/ Science (2019-2020)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 160, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lod.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //if(s==1){
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
            Thread th=new Thread(){
                public void run(){
                    try{

                        for(int l = jButton1.getY() ; l>=120 ; l--){
                            Thread.sleep(6);
                            jButton1.setBounds(jButton1.getX(), l, jButton1.getWidth(), jButton1.getHeight());
                            jButton2.setBounds(jButton2.getX(), l, jButton2.getWidth(), jButton2.getHeight());
                        }                        
                        for(int w=0; w<=380;w++){
                            Thread.sleep(5);
                            jPanel2.setBounds(jPanel2.getX(), jPanel2.getY(), w, jPanel2.getHeight());
                        }
                    }
                    catch(Exception e){

                    }
                }
            };th.start();
            
//            s--;
//        }
//        
//        if(r==0){
//            Thread th=new Thread(){
//                public void run(){
//                    try{
//
//                        for(int i=0;i<=305;i++){
//                            Thread.sleep(1);
//                            jPanel8.setBounds(650, 100,250,i );
//                        }
//                    }
//                    catch(Exception e){
//
//                    }
//                }
//            };th.start();
//            r++;
//        }
//        else{
//            Thread th=new Thread(){
//                public void run(){
//                    try{
//
//                        for(int i=305;i>=0;i--){
//                            Thread.sleep(1);
//                            jPanel8.setBounds(650, 100,250, i);
//                        }
//                    }
//                    catch(Exception e){
//
//                    }
//                }
//            };th.start();
//            r--;
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
      //  jTextField2.setBorder(new CompoundBorder(new LineBorder(new Color(0,102,153), 2),new EmptyBorder(7,7,7,7)));
       
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
     //   jTextField2.setBorder(new CompoundBorder(new LineBorder(new Color(0,0,0), 2),new EmptyBorder(7,7,7,7)));
        
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
//        if(jTextField2.getText().equals("")){
//            jLabel6.setVisible(true);
//        }
//        else{
//           // jLabel6.setVisible(false);
        //}
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:      
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:       
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
//        if(jTextField1.getText().equals("")){
//            jLabel5.setVisible(true);
//        }
//        else{
//            jLabel5.setVisible(false);
//        }
    }//GEN-LAST:event_jTextField1KeyReleased
    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new Color(255,255,255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (2).png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        jPanel2.setVisible(false);
        Thread th=new Thread(){
                public void run(){
                    try{
                        for(int l = jButton2.getY() ; l>=120 ; l--){
                            Thread.sleep(6);
                            jButton1.setBounds(jButton1.getX(), l, jButton1.getWidth(), jButton1.getHeight());
                            jButton2.setBounds(jButton2.getX(), l, jButton2.getWidth(), jButton2.getHeight());
                        }                        
                        for(int w=0; w<=380;w++){
                            Thread.sleep(5);
                            jPanel3.setBounds(jPanel2.getX(), jPanel3.getY(), w, jPanel3.getHeight());
                        }
                    }
                    catch(Exception e){}
                }
            };th.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
//        if(jTextField3.getText().equals("")){
//            jLabel7.setVisible(true);
//        }
//        else{
//            jLabel7.setVisible(false);
//        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(new Color(255,255,255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (2).png")));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png")));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MaizeMP mp = new MaizeMP();
        mp.jRadioButton01.setText(jTextField2.getText());
        mp.jRadioButton02.setText(jTextField1.getText());
        if(jCheckBox1.isSelected())
            mp.mode=true;
        else if(jCheckBox2.isSelected())
            mp.mode=false;
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Maize m = new Maize();
        m.jRadioButton01.setText(jTextField3.getText());
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Starter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
        super();
        cornerRadius = radius;
        }
        public RoundedPanel(int radius, Color bgColor) {
        super();
        cornerRadius = radius;
        backgroundColor = new Color(38,38,38);
        }

        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        //Draws the rounded panel with borders.
        if (backgroundColor != null) {
        graphics.setColor(backgroundColor);
        } else {
        graphics.setColor(getBackground());
        }

        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paintbackground
        graphics.setColor(getForeground());
         //graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paintborder

            }
    }
}
