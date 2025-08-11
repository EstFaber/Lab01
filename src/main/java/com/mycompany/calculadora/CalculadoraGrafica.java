
package com.mycompany.calculadora;


/**
 *
 * @author Faber Rodriguez, Maycol Arevalo, Daniel Montaño
 */
public class CalculadoraGrafica extends javax.swing.JFrame {
    
    private double numero1 = 0;
    private double numero2 = 0;
    private String operador = "";
    private String valor_actual = "";
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName());

    
    public CalculadoraGrafica() {
        initComponents();
    }
    
    private void agregarNumero(String num) {
        valor_actual += num;
        LabelCal.setText(valor_actual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelCal = new javax.swing.JLabel();
        sen = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        mcm = new javax.swing.JButton();
        mcd = new javax.swing.JButton();
        fibonacci = new javax.swing.JButton();
        iva = new javax.swing.JButton();
        division = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        suma = new javax.swing.JButton();

        jButton19.setText("/");

        jButton20.setText("/");

        jButton21.setText("/");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("/");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        LabelCal.setBackground(new java.awt.Color(255, 255, 255));
        LabelCal.setOpaque(true);

        sen.setBackground(new java.awt.Color(0, 255, 204));
        sen.setText("Sen");
        sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(0, 255, 204));
        cos.setText("Cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(0, 255, 204));
        tan.setText("Tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        raiz.setBackground(new java.awt.Color(0, 255, 255));
        raiz.setText("√n");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        potencia.setBackground(new java.awt.Color(0, 255, 255));
        potencia.setText("X^n");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        factorial.setBackground(new java.awt.Color(0, 255, 255));
        factorial.setText("n!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        mcm.setBackground(new java.awt.Color(0, 204, 255));
        mcm.setText("MCM");
        mcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmActionPerformed(evt);
            }
        });

        mcd.setBackground(new java.awt.Color(0, 204, 255));
        mcd.setText("MCD");
        mcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcdActionPerformed(evt);
            }
        });

        fibonacci.setBackground(new java.awt.Color(0, 255, 153));
        fibonacci.setText("Fibonacci");
        fibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibonacciActionPerformed(evt);
            }
        });

        iva.setBackground(new java.awt.Color(0, 255, 51));
        iva.setText("IVA");
        iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivaActionPerformed(evt);
            }
        });

        division.setBackground(new java.awt.Color(255, 204, 51));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        resta.setBackground(new java.awt.Color(255, 204, 51));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multi.setBackground(new java.awt.Color(255, 204, 51));
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(255, 102, 51));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        suma.setBackground(new java.awt.Color(255, 204, 51));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tan)
                                    .addComponent(cos))
                                .addGap(26, 26, 26)
                                .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(factorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sen)
                        .addGap(18, 18, 18)
                        .addComponent(potencia)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(factorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(raiz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fibonacci)
                                .addGap(18, 18, 18)
                                .addComponent(mcm)
                                .addGap(18, 18, 18)
                                .addComponent(mcd))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senActionPerformed
        try {
        double valor = Double.parseDouble(LabelCal.getText());
        LabelCal.setText(String.valueOf(Math.sin(Math.toRadians(valor))));
    } catch (NumberFormatException ex) {
        LabelCal.setText("Error");
    }
    }//GEN-LAST:event_senActionPerformed

    private void ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivaActionPerformed
        try {
        double precio = valor_actual.isEmpty() ? Double.parseDouble(LabelCal.getText()) : Double.parseDouble(valor_actual);
        double Iva = precio * 0.19;
        double total = precio + Iva;
        
        LabelCal.setText(String.format("%.2f", total));
        valor_actual = String.valueOf(total);
        operador = "";
    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
        valor_actual = "";
    }
    }//GEN-LAST:event_ivaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        numero1 = Double.parseDouble(valor_actual);
        operador = "*";
        valor_actual = "";
        LabelCal.setText("*");
    }//GEN-LAST:event_multiActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
         valor_actual+= "8";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n8ActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        numero1 = Double.parseDouble(valor_actual);
        operador = "-";
        valor_actual = "";
        LabelCal.setText("-");
    }//GEN-LAST:event_restaActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
         valor_actual+= "2";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n2ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
         valor_actual+= "6";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n6ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
         valor_actual+= "5";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n5ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        if (!valor_actual.contains(".")) {
            if (valor_actual.isEmpty()) valor_actual = "0";
            agregarNumero(".");}
    }//GEN-LAST:event_puntoActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
         try {
        double valor = Double.parseDouble(LabelCal.getText());
        LabelCal.setText(String.valueOf(Math.cos(Math.toRadians(valor))));
    } catch (NumberFormatException ex) {
        LabelCal.setText("Error");
    }
    }//GEN-LAST:event_cosActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        numero1 = Double.parseDouble(valor_actual);
        operador = "/";
        valor_actual = "";
        LabelCal.setText("/");
    }//GEN-LAST:event_divisionActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
         valor_actual+= "1";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n1ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        valor_actual+= "0";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n0ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
         valor_actual+= "3";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
         valor_actual+= "4";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n4ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
         valor_actual+= "7";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n7ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
         valor_actual+= "9";
        LabelCal.setText(valor_actual);
    }//GEN-LAST:event_n9ActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        numero1 = Double.parseDouble(valor_actual);
        operador = "+";
        valor_actual = "";
        LabelCal.setText("+");
    }//GEN-LAST:event_sumaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
         try {
        
        if (valor_actual.isEmpty()) {
            LabelCal.setText("Error");
            return;
        }

        numero2 = Double.parseDouble(valor_actual);
        double resultado = 0;

        switch (operador) {
            case "+" -> resultado = numero1 + numero2;
            case "-" -> resultado = numero1 - numero2;
            case "*" -> resultado = numero1 * numero2;
            case "/" -> {
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    LabelCal.setText("Error: División por 0");
                    valor_actual = "";
                    operador = "";
                    return;
                }
            }
            case "^" -> {
                resultado = Math.pow(numero1, numero2);
                if (Double.isNaN(resultado) || Double.isInfinite(resultado)) {
                    LabelCal.setText("Error: resultado inválido");
                    valor_actual = "";
                    operador = "";
                    return;
                }
            }
            case "MCD" -> resultado = calcularMCD((int) numero1, (int) numero2);
            case "MCM" -> resultado = calcularMCM((int) numero1, (int) numero2);
            default -> {
                
                LabelCal.setText(valor_actual);
                return;
            }
        }

        
        if (resultado == (long) resultado) {
            LabelCal.setText(String.valueOf((long) resultado));
            valor_actual = String.valueOf((long) resultado);
        } else {
            LabelCal.setText(String.valueOf(resultado));
            valor_actual = String.valueOf(resultado);
        }
        operador = "";
        
        numero1 = resultado;

    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
        valor_actual = "";
        operador = "";
    } catch (Exception e) {
        LabelCal.setText("Error");
        valor_actual = "";
        operador = "";
    }
    }//GEN-LAST:event_igualActionPerformed
    private int calcularMCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

private int calcularMCM(int a, int b) {
    return (a * b) / calcularMCD(a, b);
}
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       numero1 = 0;
        numero2 = 0;
        operador = "";
        valor_actual = "";
        LabelCal.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
try {
        double valor = Double.parseDouble(LabelCal.getText());
        LabelCal.setText(String.valueOf(Math.tan(Math.toRadians(valor))));
    } catch (NumberFormatException ex) {
        LabelCal.setText("Error");
    }

    }//GEN-LAST:event_tanActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        try {
        double numero = Double.parseDouble(LabelCal.getText());
        LabelCal.setText(String.valueOf(Math.sqrt(numero)));
    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
    }
    }//GEN-LAST:event_raizActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        try {
        if (!valor_actual.isEmpty()) {
            // Guardamos la base en numero1 y esperamos el exponente
            numero1 = Double.parseDouble(valor_actual);
            operador = "^";
            valor_actual = "";
            LabelCal.setText("^");
        } else {
            LabelCal.setText("Error: base vacía");
        }
    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
    }
    }//GEN-LAST:event_potenciaActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
             try {
        String txt = valor_actual.isEmpty() ? LabelCal.getText() : valor_actual;
        int numero = Integer.parseInt(txt);
        if (numero < 0) {
            LabelCal.setText("No válido");
            valor_actual = "";
            return;
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) resultado *= i;
        LabelCal.setText(String.valueOf(resultado));
        valor_actual = String.valueOf(resultado);
        operador = "";
    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
        valor_actual = "";
    }

    }//GEN-LAST:event_factorialActionPerformed

    private void mcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcdActionPerformed
        operador = "MCD";
numero1 = Double.parseDouble(LabelCal.getText());
LabelCal.setText("");
    
    }//GEN-LAST:event_mcdActionPerformed

    private void mcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmActionPerformed
    operador = "MCM";
numero1 = Double.parseDouble(LabelCal.getText());
LabelCal.setText("");
    }//GEN-LAST:event_mcmActionPerformed

    private void fibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibonacciActionPerformed
         try {
        String txt = valor_actual.isEmpty() ? LabelCal.getText() : valor_actual;
        int n = Integer.parseInt(txt);
        if (n <= 0) {
            LabelCal.setText("No válido");
            valor_actual = "";
            return;
        }
        long a = 0, b = 1;
        StringBuilder secuencia = new StringBuilder();
        for (int i = 0; i < n; i++) {
            secuencia.append(a).append(" ");
            long temp = a + b;
            a = b;
            b = temp;
        }
        
        javax.swing.JOptionPane.showMessageDialog(this, secuencia.toString().trim(), "Fibonacci", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        LabelCal.setText(String.valueOf(a)); 
        valor_actual = String.valueOf(a);
        operador = "";
    } catch (NumberFormatException e) {
        LabelCal.setText("Error");
        valor_actual = "";
    }
    }//GEN-LAST:event_fibonacciActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CalculadoraGrafica().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCal;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cos;
    private javax.swing.JButton division;
    private javax.swing.JButton factorial;
    private javax.swing.JButton fibonacci;
    private javax.swing.JButton igual;
    private javax.swing.JButton iva;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mcd;
    private javax.swing.JButton mcm;
    private javax.swing.JButton multi;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton potencia;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resta;
    private javax.swing.JButton sen;
    private javax.swing.JButton suma;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables
}
