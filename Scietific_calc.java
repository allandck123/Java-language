import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Scietific_calc extends javax.swing.JFrame {
    double bil1;
    double bil2;
    double hasil;
    String operasi;
    private Object hitung;
    
    public Scietific_calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtnPlusminus = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnRoot = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnPerX = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnXYpow = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnPower = new javax.swing.JButton();
        jbtnPower3 = new javax.swing.JButton();
        jbtnMod = new javax.swing.JButton();
        jbtnLnx = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setBackground(new java.awt.Color(255, 255, 153));
        jtxtDisplay.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(51, 51, 255));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(51, 51, 255));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(51, 51, 255));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtnMultiply.setBackground(new java.awt.Color(0, 153, 153));
        jbtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnMultiply.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMultiply.setText("×");
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(51, 51, 255));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(51, 51, 255));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(51, 51, 255));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnMinus.setBackground(new java.awt.Color(0, 153, 153));
        jbtnMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtnPlus.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPlus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtnEqual.setBackground(new java.awt.Color(0, 153, 153));
        jbtnEqual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        jbtnEqual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbtnEqualKeyTyped(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(51, 51, 255));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtnPlusminus.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPlusminus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPlusminus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPlusminus.setText("±");
        jbtnPlusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusminusActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(51, 51, 255));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(51, 51, 255));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn0.setBackground(new java.awt.Color(51, 51, 255));
        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(255, 255, 255));
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDot.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnBackspace.setBackground(new java.awt.Color(255, 0, 0));
        jbtnBackspace.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBackspace.setText("⌫");
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnClear.setBackground(new java.awt.Color(51, 51, 51));
        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtnRoot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnRoot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnRoot.setForeground(new java.awt.Color(0, 0, 0));
        jbtnRoot.setText("√");
        jbtnRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRootActionPerformed(evt);
            }
        });

        jbtnDivide.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDivide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDivide.setText("÷");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnLog.setBackground(new java.awt.Color(255, 255, 51));
        jbtnLog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnLog.setForeground(new java.awt.Color(0, 0, 0));
        jbtnLog.setText("Log");
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnSin.setBackground(new java.awt.Color(255, 255, 51));
        jbtnSin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSin.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSin.setText("Sin");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnPerX.setBackground(new java.awt.Color(255, 255, 51));
        jbtnPerX.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jbtnPerX.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPerX.setText("1/X");
        jbtnPerX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPerXActionPerformed(evt);
            }
        });

        jbtnCos.setBackground(new java.awt.Color(255, 255, 51));
        jbtnCos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCos.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCos.setText("Cos");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnXYpow.setBackground(new java.awt.Color(255, 255, 51));
        jbtnXYpow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnXYpow.setForeground(new java.awt.Color(0, 0, 0));
        jbtnXYpow.setText("X^Y");
        jbtnXYpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXYpowActionPerformed(evt);
            }
        });

        jbtnTan.setBackground(new java.awt.Color(255, 255, 51));
        jbtnTan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnTan.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTan.setText("Tan");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnPower.setBackground(new java.awt.Color(255, 255, 51));
        jbtnPower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPower.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPower.setText("X²");
        jbtnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPowerActionPerformed(evt);
            }
        });

        jbtnPower3.setBackground(new java.awt.Color(255, 255, 51));
        jbtnPower3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPower3.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPower3.setText("X³");
        jbtnPower3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPower3ActionPerformed(evt);
            }
        });

        jbtnMod.setBackground(new java.awt.Color(255, 255, 51));
        jbtnMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnMod.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMod.setText("Mod");
        jbtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModActionPerformed(evt);
            }
        });

        jbtnLnx.setBackground(new java.awt.Color(255, 255, 51));
        jbtnLnx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnLnx.setForeground(new java.awt.Color(0, 0, 0));
        jbtnLnx.setText("ln(x)");
        jbtnLnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLnxActionPerformed(evt);
            }
        });

        jMenu3.setText("Options");

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu3.add(About);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnPlusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnPower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnPerX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnXYpow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnPower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLnx, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtxtDisplay)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPerX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXYpow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLnx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPlusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPower3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        jtxtDisplay.setSize(380, 43);
        this.setSize(400, 430);
    }//GEN-LAST:event_formWindowActivated

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn7.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        String bsp;
        if(jtxtDisplay.getText().length()>0)
        {
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            bsp = strB.toString();
            jtxtDisplay.setText(bsp);
        }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRootActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai= Math.sqrt(nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnRootActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        String tampil = jtxtDisplay.getText() + "/";
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn6.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        if(nilai==90)
        {
            jtxtDisplay.setText("0");
        }
        else {
                nilai=Math.cos(Math.toRadians(nilai));
                jtxtDisplay.setText(String.valueOf(nilai));
            }
    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn9.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn4.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn5.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn1.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn2.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn3.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String tampil = jtxtDisplay.getText() + jbtn0.getText();
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        if(!jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText()+ jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnPlusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusminusActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai=nilai*(-1);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnPlusminusActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai=Math.log10(nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai=Math.sin(Math.toRadians(nilai));
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        if(nilai==90)
        {
            jtxtDisplay.setText("∞");
        }
        else{
                nilai=Math.tan(Math.toRadians(nilai));
                jtxtDisplay.setText(String.valueOf(nilai));
            }   
    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnPerXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPerXActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai= (1/nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnPerXActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
        String tampil = jtxtDisplay.getText() + "%";
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnLnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLnxActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai= Math.log(nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnLnxActionPerformed

    private void jbtnXYpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXYpowActionPerformed
        bil1 = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        jtxtDisplay.setText(null);
        operasi=("^");
    }//GEN-LAST:event_jbtnXYpowActionPerformed

    private void jbtnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPowerActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai= (nilai*nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnPowerActionPerformed

    private void jbtnPower3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPower3ActionPerformed
        double nilai = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        nilai= (nilai*nilai*nilai);
        jtxtDisplay.setText(String.valueOf(nilai));
    }//GEN-LAST:event_jbtnPower3ActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
       
    }//GEN-LAST:event_jtxtDisplayKeyTyped

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        String tampil = jtxtDisplay.getText();
        if("^".equals(operasi))
        {   
            String tam;
            bil2 = Double.parseDouble(jtxtDisplay.getText());
            hasil=Math.pow(bil1, bil2);
            tam=String.format("%.1f", hasil);
            jtxtDisplay.setText(tam);
            operasi=null;
        }
        else
        {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try {
            jtxtDisplay.setText(String.valueOf(engine.eval(tampil)));
            } catch (ScriptException ex) {
            Logger.getLogger(Scietific_calc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        String tampil = jtxtDisplay.getText() + "+";
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        String tampil = jtxtDisplay.getText() + "-";
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
        String tampil = jtxtDisplay.getText() + "*";
        jtxtDisplay.setText(tampil);
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        jtxtDisplay.setText("Created By : Alland Chandra Kesuma(20170801011)");
    }//GEN-LAST:event_AboutActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jbtnEqualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnEqualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEqualKeyTyped

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
            java.util.logging.Logger.getLogger(Scietific_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scietific_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scietific_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scietific_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scietific_calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnLnx;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPerX;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPlusminus;
    private javax.swing.JButton jbtnPower;
    private javax.swing.JButton jbtnPower3;
    private javax.swing.JButton jbtnRoot;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnXYpow;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables

    private void setRezizeable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
