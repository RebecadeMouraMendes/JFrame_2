/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primeiraquestao;

/**
 *
 * @author pedro
 */
public class primeiraquestao extends javax.swing.JFrame {

    /**
     * Creates new form primeiraquestao
     */
    public primeiraquestao() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jLabel3.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        texto1 = new javax.swing.JTextField();
        rotulo = new javax.swing.JLabel();
        texto2 = new javax.swing.JTextField();
        soma = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        subtração = new javax.swing.JRadioButton();
        multiplicação = new javax.swing.JRadioButton();
        divisão = new javax.swing.JRadioButton();
        resto = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        jLabel3.setText("Resultado:");

        jLabel2.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        jLabel2.setText("Digite o segundo número:");

        calcular.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        texto1.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        rotulo.setFont(new java.awt.Font("Yrsa Light", 1, 24)); // NOI18N
        rotulo.setText("Calculadora");

        texto2.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N

        buttonGroup1.add(soma);
        soma.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        soma.setText("Soma (+)");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        jLabel1.setText("Digite o primeiro número:");

        buttonGroup1.add(subtração);
        subtração.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        subtração.setText("Subtração (-)");
        subtração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtraçãoActionPerformed(evt);
            }
        });

        buttonGroup1.add(multiplicação);
        multiplicação.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        multiplicação.setText("Multiplicação (*)");
        multiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaçãoActionPerformed(evt);
            }
        });

        buttonGroup1.add(divisão);
        divisão.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        divisão.setText("Divisão (/)");
        divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisãoActionPerformed(evt);
            }
        });

        buttonGroup1.add(resto);
        resto.setFont(new java.awt.Font("Yrsa Light", 1, 14)); // NOI18N
        resto.setText("Resto (%)");
        resto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(79, 79, 79));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primeiraquestao/clear.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(texto1)
                                .addComponent(jLabel2)
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resto)
                                    .addComponent(divisão)
                                    .addComponent(soma))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicação)
                                    .addComponent(subtração)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(rotulo)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rotulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soma)
                    .addComponent(subtração))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisão)
                    .addComponent(multiplicação))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resto))
                .addGap(25, 25, 25)
                .addComponent(calcular)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double num1, num2;
    String str;
    double x;
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        jLabel3.setText(str);
        jLabel3.setVisible(true);
        calcular.setToolTipText("Envie os dados para o calculo");
    }//GEN-LAST:event_calcularActionPerformed

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto1ActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        num1 = Double.parseDouble(texto1.getText());
        num2 = Double.parseDouble(texto2.getText());
        x = num1 + num2;
        str = "A soma é: "+x;
    }//GEN-LAST:event_somaActionPerformed

    private void subtraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtraçãoActionPerformed
        num1 = Double.parseDouble(texto1.getText());
        num2 = Double.parseDouble(texto2.getText());
        x = num1 - num2;
        str = "A subtração é: "+x;
    }//GEN-LAST:event_subtraçãoActionPerformed

    private void multiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaçãoActionPerformed
        num1 = Double.parseDouble(texto1.getText());
        num2 = Double.parseDouble(texto2.getText());
        x = num1 * num2;
        str = "A multiplicação é: "+x;
    }//GEN-LAST:event_multiplicaçãoActionPerformed

    private void divisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisãoActionPerformed
        num1 = Double.parseDouble(texto1.getText());
        num2 = Double.parseDouble(texto2.getText());
        x = num1 / num2;
        str = "A divisão é: "+x;
    }//GEN-LAST:event_divisãoActionPerformed

    private void restoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoActionPerformed
        num1 = Double.parseDouble(texto1.getText());
        num2 = Double.parseDouble(texto2.getText());
        x = num1 % num2;
        str = "O resto é: "+x;
    }//GEN-LAST:event_restoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        texto1.setText(null);
        texto2.setText(null);
        jLabel3.setVisible(false);
        buttonGroup1.clearSelection();
        texto1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(primeiraquestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(primeiraquestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(primeiraquestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(primeiraquestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new primeiraquestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular;
    private javax.swing.JRadioButton divisão;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton multiplicação;
    private javax.swing.JRadioButton resto;
    private javax.swing.JLabel rotulo;
    private javax.swing.JRadioButton soma;
    private javax.swing.JRadioButton subtração;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    // End of variables declaration//GEN-END:variables
}
