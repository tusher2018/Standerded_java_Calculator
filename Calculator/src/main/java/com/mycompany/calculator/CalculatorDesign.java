package com.mycompany.calculator;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CalculatorDesign extends javax.swing.JFrame {
    
    StringBuffer input = new StringBuffer("0");
    ArrayList<Integer> numbers = new ArrayList<>();
    double FristOparand;
    boolean isSpasial=false;
    

    public CalculatorDesign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Standerd_Mode = new javax.swing.JPanel();
        PlusMinusButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        Scientific = new javax.swing.JButton();
        Text_Board = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        Scientific_Mode = new javax.swing.JPanel();
        Standerd = new javax.swing.JButton();
        Text_Board1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        PlusMinusButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PlusMinusButton.setText("+/-");
        PlusMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action_Plus_Minus(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("1");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_1(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("4");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_4(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("7");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_7(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("1/x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton13.setText("x2");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Squre(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setText("8");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_8(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setText("5");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_5(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("2");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_2(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action_0(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton28.setText(".");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action_Dot(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton27.setText("3");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_3(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton26.setText("6");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_6(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton25.setText("9");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_9(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton24.setText("root");
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Root(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton20.setText("/");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Division(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton19.setText("x");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Multiply(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton18.setText("-");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Minus(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setText("+");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Pluse(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton16.setText("=");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Action_Equal(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        Scientific.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scientific.setText("Exit");
        Scientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScientificActionPerformed(evt);
            }
        });

        Text_Board.setEditable(false);
        Text_Board.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Text_Board.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Text_Board.setText("0");
        Text_Board.setToolTipText("");
        Text_Board.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        Text_Board.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Text_Board.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Text_Board.setEnabled(false);
        Text_Board.setKeymap(null);
        Text_Board.setScrollOffset(1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Stenderd Version");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("tan-1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverse_tan(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton22.setText("clear");
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton22.setMaximumSize(new java.awt.Dimension(41, 32));
        jButton22.setMinimumSize(new java.awt.Dimension(41, 2));
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22Action_Delete(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton21.setText("(");
        jButton21.setAlignmentY(0.0F);
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton21.setPreferredSize(new java.awt.Dimension(49, 32));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perenthisis_1(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton35.setText(")");
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton35Action_Clear(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenthisis_2(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton23.setText("x!");
        jButton23.setToolTipText("");
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton23.setMaximumSize(new java.awt.Dimension(41, 32));
        jButton23.setMinimumSize(new java.awt.Dimension(41, 2));
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23Action_Delete(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fectorial(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setText("log");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton36.setText("Delete");
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton36.setMaximumSize(new java.awt.Dimension(41, 32));
        jButton36.setMinimumSize(new java.awt.Dimension(41, 2));
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Delete(evt);
            }
        });
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton37.setText("ln");
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton37Action_Clear(evt);
            }
        });
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        jButton38.setText("log_x_()");
        jButton38.setAlignmentY(0.0F);
        jButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton38.setPreferredSize(new java.awt.Dimension(49, 32));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38reminder(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton39.setText("Exp");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponential(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton40.setText("cos");
        jButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton40Action_Clear(evt);
            }
        });
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cos(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton41.setText("sin");
        jButton41.setAlignmentY(0.0F);
        jButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton41.setPreferredSize(new java.awt.Dimension(49, 32));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton42.setText("tan");
        jButton42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton42.setMaximumSize(new java.awt.Dimension(41, 32));
        jButton42.setMinimumSize(new java.awt.Dimension(41, 2));
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton42Action_Delete(evt);
            }
        });
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton43.setText("X^?");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toThePower(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setText("sin-1");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverse_sin(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton29.setText("cos-1");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverse_cos(evt);
            }
        });

        javax.swing.GroupLayout Standerd_ModeLayout = new javax.swing.GroupLayout(Standerd_Mode);
        Standerd_Mode.setLayout(Standerd_ModeLayout);
        Standerd_ModeLayout.setHorizontalGroup(
            Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standerd_ModeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Board)
                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Scientific, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlusMinusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standerd_ModeLayout.createSequentialGroup()
                                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standerd_ModeLayout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Standerd_ModeLayout.setVerticalGroup(
            Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standerd_ModeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Board, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton37))
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton40))
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton35))
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Standerd_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Standerd_ModeLayout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(Standerd_Mode, "card5");

        Standerd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Standerd.setText("Standerd");
        Standerd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StanderdActionPerformed(evt);
            }
        });

        Text_Board1.setEditable(false);
        Text_Board1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Text_Board1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Text_Board1.setText("0");
        Text_Board1.setToolTipText("");
        Text_Board1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        Text_Board1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Text_Board1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Text_Board1.setEnabled(false);
        Text_Board1.setKeymap(null);
        Text_Board1.setScrollOffset(1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Stenderd Version");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Scientific_ModeLayout = new javax.swing.GroupLayout(Scientific_Mode);
        Scientific_Mode.setLayout(Scientific_ModeLayout);
        Scientific_ModeLayout.setHorizontalGroup(
            Scientific_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scientific_ModeLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Scientific_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(Text_Board1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Standerd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        Scientific_ModeLayout.setVerticalGroup(
            Scientific_ModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scientific_ModeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Board1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Standerd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        getContentPane().add(Scientific_Mode, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel1MousePressed

    private void Action_1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_1
        OnNumberClick("1");
    }//GEN-LAST:event_Action_1

    private void Action_2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_2
        OnNumberClick("2");
    }//GEN-LAST:event_Action_2

    private void Action_3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_3
        OnNumberClick("3");
    }//GEN-LAST:event_Action_3

    private void Action_4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_4
        OnNumberClick("4");
    }//GEN-LAST:event_Action_4

    private void Action_5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_5
        OnNumberClick("5");
    }//GEN-LAST:event_Action_5

    private void Action_6(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_6
        OnNumberClick("6");
    }//GEN-LAST:event_Action_6

    private void Action_7(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_7
        OnNumberClick("7");
    }//GEN-LAST:event_Action_7

    private void Action_8(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_8
       OnNumberClick("8");
    }//GEN-LAST:event_Action_8

    private void Action_9(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_9
        OnNumberClick("9");
    }//GEN-LAST:event_Action_9

    private void Action_Equal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Equal
        System.out.println(input);
        solution();
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_Action_Equal

    private void Action_Squre(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Squre
//        isSpasial=true;
//          OnOparatorClick("^");
        solution();
        double x = Double.valueOf(input.toString());
        x*=x;
        input=new StringBuffer("").append(String.valueOf(x));
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_Action_Squre

    private void Action_Root(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Root
//        isSpasial=true;
        solution();
        double x = Double.valueOf(input.toString());
        try{x = Math.sqrt(x);}
        catch (Exception e){
        input=new StringBuffer("Invalid input");
        }
        input=new StringBuffer("").append(String.valueOf(x));
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_Action_Root

    private void Action_Pluse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Pluse
        OnOparatorClick("+");
    }//GEN-LAST:event_Action_Pluse

    private void Action_Minus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Minus
        OnOparatorClick("-");
    }//GEN-LAST:event_Action_Minus

    private void Action_Multiply(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Multiply
        OnOparatorClick("x");
    }//GEN-LAST:event_Action_Multiply

    private void Action_Division(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Action_Division
        OnOparatorClick("/");
    }//GEN-LAST:event_Action_Division

    private void Action_Plus_Minus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Action_Plus_Minus
        if(input.toString().startsWith("-")){
            input=new StringBuffer(input.substring(1));
        }else{
            input=new StringBuffer("-").append(input); 
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_Action_Plus_Minus

    private void Action_0(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Action_0
        OnNumberClick("0");
    }//GEN-LAST:event_Action_0

    private void Action_Dot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Action_Dot
        
        OnNumberClick(".");
    }//GEN-LAST:event_Action_Dot

    private void ScientificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScientificActionPerformed
//        Standerd_Mode.setVisible(false);
//        Scientific_Mode.setVisible(true);
System.exit(0);
    }//GEN-LAST:event_ScientificActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        solution();
        double x = Double.valueOf(input.toString());
        x=(1/x);
        input=new StringBuffer("").append(String.valueOf(x));
        Text_Board.setText(input.toString());        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void StanderdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StanderdActionPerformed
        //        Standerd_Mode.setVisible(true);
        //        Scientific_Mode.setVisible(false);
    }//GEN-LAST:event_StanderdActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void inverse_tan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverse_tan
              solution();
        double x = Double.valueOf(input.toString());
        try{
            input=new StringBuffer(String.valueOf(Math.toDegrees(Math.tan(x))));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_inverse_tan

    private void jButton22Action_Delete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22Action_Delete
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22Action_Delete

    private void perenthisis_1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perenthisis_1
        OnNumberClick("(");
    }//GEN-LAST:event_perenthisis_1

    private void jButton35Action_Clear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35Action_Clear
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35Action_Clear

    private void jButton23Action_Delete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23Action_Delete
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23Action_Delete

    private void log(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log
        solution();
        double x = Double.valueOf(input.toString());
        try{
            input=new StringBuffer(String.valueOf(Math.log10(x)));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_log

    private void Delete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete

    private void jButton37Action_Clear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton37Action_Clear
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37Action_Clear

    private void jButton38reminder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38reminder
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38reminder

    private void exponential(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponential
        OnNumberClick("E");
    }//GEN-LAST:event_exponential

    private void jButton40Action_Clear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40Action_Clear
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40Action_Clear

    private void sin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin
        solution();
        double x = Double.valueOf(input.toString());
        x=Math.toRadians(x);
        try{
            input=new StringBuffer(String.valueOf(Math.sin(x)));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_sin

    private void jButton42Action_Delete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42Action_Delete
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42Action_Delete

    private void toThePower(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toThePower
        OnOparatorClick("^");
    }//GEN-LAST:event_toThePower

    private void parenthisis_2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenthisis_2
        OnNumberClick(")");
    }//GEN-LAST:event_parenthisis_2

    private void Fectorial(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fectorial
        
    }//GEN-LAST:event_Fectorial

    private void inverse_sin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverse_sin
        solution();
        double x = Double.valueOf(input.toString());
        try{
            input=new StringBuffer(String.valueOf(Math.toDegrees(Math.asin(x))));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_inverse_sin

    private void inverse_cos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverse_cos
              solution();
        double x = Double.valueOf(input.toString());
        try{
            input=new StringBuffer(String.valueOf(Math.toDegrees(Math.acos(x))));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_inverse_cos

    private void cos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cos
        solution();
        double x = Double.valueOf(input.toString());
        x=Math.toRadians(x);
        try{
            input=new StringBuffer(String.valueOf(Math.cos(x)));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_cos

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        solution();
        double x = Double.valueOf(input.toString());
        x=Math.toRadians(x);
        try{
            input=new StringBuffer(String.valueOf(Math.tan(x)));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_jButton42ActionPerformed

    private void delete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete
        if(input.length()>1){
            input=new StringBuffer(input.substring(0, input.length()-1));
        }else{
            input=new StringBuffer("0");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_delete

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void clear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear
        input=new StringBuffer("0");
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_clear

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        solution();
        double x = Double.valueOf(input.toString());
        try{
            input=new StringBuffer(String.valueOf(Math.log(x)));
        }catch(Exception e){
            input=new StringBuffer("Invalid Input");
        }
        Text_Board.setText(input.toString());
    }//GEN-LAST:event_jButton37ActionPerformed

    
    void OnNumberClick(String number){
        if(isSpasial || containsAlphabets()){ isSpasial=false; input=new StringBuffer("0"); }
//        if(input.length()==1 && !number.contains(".")){
//        input=new StringBuffer("");
//        }
if(input.toString().equals("0") && !number.contains(".")){
input=new StringBuffer("");
}
        input.append(number);
        Text_Board.setText(input.toString());
        
    }
    
    void OnOparatorClick(String oparator){
    if(isSpasial || containsAlphabets()){ isSpasial=false; input=new StringBuffer("0"); }
        if(input.charAt(input.length()-1) == '+' || input.charAt(input.length()-1)=='-' ||
            input.charAt(input.length()-1)=='x' || input.charAt(input.length()-1)=='/' || 
                input.charAt(input.length()-1)=='%' 
                ){
            input.deleteCharAt(input.length()-1);
        }
        input.append(oparator);
        Text_Board.setText(input.toString());
    }
    
    void solution(){
//        System.out.println("i sosution");
//        if(
//            (input.toString().contains("x") ||input.toString().contains("+") ||
//            input.toString().contains("/") || input.toString().contains("-")
//                || input.toString().contains("%") || input.toString().contains("^") ||
//                 input.toString().contains("(") || input.toString().contains(")")
//                ) && 
//            (
//                Character.isDigit(input.charAt(input.length()-1)) || input.charAt(input.length()-1)==')'
//                )
//           )
//        {
            System.out.println("in solution");
        try{
            input=new StringBuffer(Calculations.infix_to_postfix(input.toString()));
        }catch (Exception e){
            input=new StringBuffer("Invalid Input");
        }
        
        
    }
    
    boolean containsAlphabets(){
        return Pattern.compile("[a-wy-zA-DF-Z]").matcher(input).find();
    }
    
    
    public static void main(String args[]) {
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               CalculatorDesign calculator = new CalculatorDesign();
               calculator.setVisible(true);
               calculator.Text_Board.setText(calculator.input.toString());
            }
        });
    }
    

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PlusMinusButton;
    private javax.swing.JButton Scientific;
    private javax.swing.JPanel Scientific_Mode;
    private javax.swing.JButton Standerd;
    private javax.swing.JPanel Standerd_Mode;
    private javax.swing.JTextField Text_Board;
    private javax.swing.JTextField Text_Board1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

class Calculations {

    public static String infix_to_postfix (String input) {
        
        Stack<String> x=new Stack<>();
        ArrayList<String> newStr=new ArrayList<>();
        if(input.startsWith("-")){
            newStr.add("0");
        }
        String demo="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch) || ch=='.' || ch=='E'){
                demo+=ch;
            }
            else if(ch=='+' || ch=='-' ||
                    ch=='x' || ch=='/' ||
                    ch=='%' || ch=='^' || ch=='(' || ch==')'
                    ){
                
                
                if(!demo.isEmpty()){
                    System.out.println(demo);
                    newStr.add(demo);
                }
                demo="";
                
                if (ch == '(') {
                    x.push("(");
                } else if (ch == ')') {
                    while (!x.isEmpty() && x.peek() != "(") {
                        newStr.add(x.pop());
                    }
                    x.pop(); // Discard the '('
                }
                
                else{
                
                while(!x.isEmpty() && (precedenceCheck(x.lastElement()) >= 
                        precedenceCheck(""+ch))){
                newStr.add(x.pop());
                }        
                
                x.add(""+ch);  
                }
            }
        }
        
        if(!demo.isEmpty()){newStr.add(demo);}
        demo="";
        while(!x.isEmpty()){
            newStr.add(x.pop());
        }
        System.out.println(newStr);
        return String.valueOf(
                evaluatingValue( newStr)
        );
    }
    
    static int precedenceCheck(String x){
        switch (x) {
            case "^":
                return 3;
            case "x":
            case "/":
            case "%":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return -1;
        }
    }
    
    
    private static double evaluatingValue(ArrayList<String> input){
        System.out.println("Calling evaluating");
        Stack<Double> x=new Stack<>();
        for(int i=0;i<input.size();i++){
            String current=input.get(i).strip();
            if(current.contains("+") || current.contains("-") ||
                    current.contains("x") || current.contains("/") || 
                    current.contains("%") || current.contains("^")
                    ){
                 if(x.size()<2){
                    System.out.println("not ok"+x);
                    continue;
                }
                System.out.println(x);
                double secound=x.pop();
                double frist=x.pop();
                System.out.println("1st: "+frist);
                System.out.println("2nd: "+secound);
                
                if(current.contains("+")){
                    x.add(frist+secound);
                    System.out.println(x);
                }else if(current.contains("-")){
                    x.add(frist-secound);
                    System.out.println(x);
                }else if(current.contains("x")){
                    x.add(frist*secound);
                    System.out.println(x);
                }else if(current.contains("/")){
                    x.add(frist/secound);
                    System.out.println(x);
                }else if(current.contains("%")){
                    x.add(frist%secound);
                    System.out.println(x);
                }else if(current.contains("^")){
                    x.add(Math.pow(frist, secound));
//                    x.add(frist%secound);
                    System.out.println(x);
                }
            }else{
                System.out.println(input.get(i));
                try{x.add(Double.valueOf(current));}
                catch (Exception e){
                    return Double.POSITIVE_INFINITY;
//                    return Math.sqrt(-1);
                }
                System.out.println(x.lastElement());
            }
        }  
      return x.pop();
    }
      
}

