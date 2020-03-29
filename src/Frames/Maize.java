/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
//import src.*;

import bridge.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 *
 * @author User
 */
public class Maize extends javax.swing.JFrame {

    /**
     * Creates new form Maize
     */
    public Maize() {
        initComponents();
        SetCounters(0);
        jRadioButton01.setSelected(true);       
    }
    TicTacToeAI TTT=new TicTacToeAI();
    private void ComputerMove(int player, Color pcolor,int move) {
                    if (move==0) 
                            move = TTT.isGameOver() == 0 ? TTT.GenerateMove(player) : 0;
                    switch (move) {
                    case 1:
                        btn1.setEnabled(false);
                        if(player==1)
                            btn1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 2:
                            btn2.setEnabled(false);
                        if(player==1)
                            btn2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 3:
                            btn3.setEnabled(false);
                        if(player==1)
                            btn3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 4:
                            btn4.setEnabled(false);
                        if(player==1)
                            btn4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 5:
                            btn5.setEnabled(false);
                        if(player==1)
                            btn5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 6:
                            btn6.setEnabled(false);
                        if(player==1)
                            btn6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 7:
                            btn7.setEnabled(false);
                        if(player==1)
                            btn7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 8:
                            btn8.setEnabled(false);
                        if(player==1)
                            btn8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    case 9:
                            btn9.setEnabled(false);
                        if(player==1)
                            btn9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));  
                        else
                            btn9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-x.png")));                           
                            TTT.Move(move, player);
                            break;
                    }

	}
    int XWins=0, OWins=0, Draws=0;
    public void SetCounters(int Num) {
		switch (Num) {
		case 1:
			XWins++;
			break;
		case -1:
			OWins++;
			break;
		case 2:
			Draws++;
			break;
		case 0:
			XWins = 0;
			OWins = 0;
			Draws = 0;
			break;
		}
		jTextField1.setText(XWins + "");
		jTextField2.setText(OWins + "");
		jTextField3.setText(Draws + "");
	}
    private void reset(){
        btn1.setIcon(null);
        btn1.setEnabled(true);
        btn2.setIcon(null);
        btn2.setEnabled(true);
        btn3.setIcon(null);
        btn3.setEnabled(true);
        btn4.setIcon(null);
        btn4.setEnabled(true);
        btn5.setIcon(null);
        btn5.setEnabled(true);
        btn6.setIcon(null);
        btn6.setEnabled(true);
        btn7.setIcon(null);
        btn7.setEnabled(true);
        btn8.setIcon(null);
        btn8.setEnabled(true);
        btn9.setIcon(null);
        btn9.setEnabled(true);
        TTT.NewGame();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jRadioButton01 = new javax.swing.JRadioButton();
        jRadioButton02 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tic-Tac-Toe/A.R (XO)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn1.setContentAreaFilled(false);
        btn1.setDefaultCapable(false);
        btn1.setPreferredSize(new java.awt.Dimension(60, 60));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 102, -1, -1));

        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn2.setContentAreaFilled(false);
        btn2.setPreferredSize(new java.awt.Dimension(60, 60));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 102, -1, -1));

        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn3.setContentAreaFilled(false);
        btn3.setPreferredSize(new java.awt.Dimension(60, 60));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 102, -1, -1));

        btn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn4.setContentAreaFilled(false);
        btn4.setPreferredSize(new java.awt.Dimension(60, 60));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 169, -1, -1));

        btn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn5.setContentAreaFilled(false);
        btn5.setPreferredSize(new java.awt.Dimension(60, 60));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 169, -1, -1));

        btn6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn6.setContentAreaFilled(false);
        btn6.setPreferredSize(new java.awt.Dimension(60, 60));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 169, -1, -1));

        btn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn7.setContentAreaFilled(false);
        btn7.setPreferredSize(new java.awt.Dimension(60, 60));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 236, -1, -1));

        btn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn8.setContentAreaFilled(false);
        btn8.setPreferredSize(new java.awt.Dimension(60, 60));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 236, -1, -1));

        btn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btn9.setContentAreaFilled(false);
        btn9.setPreferredSize(new java.awt.Dimension(60, 60));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 236, -1, -1));

        jRadioButton01.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(jRadioButton01);
        jRadioButton01.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jRadioButton01.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jRadioButton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 240, 170, -1));

        jRadioButton02.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup1.add(jRadioButton02);
        jRadioButton02.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jRadioButton02.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton02.setText("CPU");
        jRadioButton02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jRadioButton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/boy.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 111, 142));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chip.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 121, 142));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new Color(0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 80, 40));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        jTextField3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("End Game");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        int GO = TTT.isGameOver();
        if (TTT.Move(1, 1) && GO == 0) {
                    btn1.setEnabled(false);       
                    btn1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
      int GO = TTT.isGameOver();
        if (TTT.Move(2, 1) && GO == 0) {
                    btn2.setEnabled(false);       
                    btn2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
   int GO = TTT.isGameOver();
        if (TTT.Move(3, 1) && GO == 0) {
                    btn3.setEnabled(false);       
                    btn3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    int GO = TTT.isGameOver();
        if (TTT.Move(4, 1) && GO == 0) {
                    btn4.setEnabled(false);       
                    btn4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
   int GO = TTT.isGameOver();
        if (TTT.Move(5, 1) && GO == 0) {
                    btn5.setEnabled(false);       
                    btn5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
   int GO = TTT.isGameOver();
        if (TTT.Move(6, 1) && GO == 0) {
                    btn6.setEnabled(false);       
                    btn6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
   int GO = TTT.isGameOver();
        if (TTT.Move(7, 1) && GO == 0) {
                    btn7.setEnabled(false);       
                    btn7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
   int GO = TTT.isGameOver();
        if (TTT.Move(8, 1) && GO == 0) {
                    btn8.setEnabled(false);       
                    btn8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        
        }
        
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
  int GO = TTT.isGameOver();
        if (TTT.Move(9, 1) && GO == 0) {
                    btn9.setEnabled(false);       
                    btn9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/letter-o.png")));
	ComputerMove(-1, Color.RED,0);
	if ((GO = TTT.isGameOver()) != 0){
                        SetCounters(GO);
                        reset();
        }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SetCounters(0);
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Result r = new Result();
        if(Integer.parseInt(jTextField1.getText())>Integer.parseInt(jTextField2.getText()))
            r.jLabel2.setText(jRadioButton01.getText()+" Won from "+jRadioButton02.getText()+" by "+(Integer.parseInt(jTextField1.getText())-Integer.parseInt(jTextField2.getText())) +" points.");
        else if(Integer.parseInt(jTextField2.getText())>Integer.parseInt(jTextField1.getText()))
            r.jLabel2.setText(jRadioButton02.getText()+" Won from "+jRadioButton01.getText()+" by "+(Integer.parseInt(jTextField2.getText())-Integer.parseInt(jTextField1.getText())) +" points.");
        else
            r.jLabel2.setText("It's a Tie!");
         r.setVisible(true);
         this.dispose();    
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
            java.util.logging.Logger.getLogger(Maize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton jRadioButton01;
    public javax.swing.JRadioButton jRadioButton02;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
