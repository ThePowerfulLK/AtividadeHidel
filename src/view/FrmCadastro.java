/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import dao.AtletasDAO;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.Arquivo;

/**
 *
 * @author Leonardo
 */
public class FrmCadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public FrmCadastro() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFaixa = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO  ATLETAS DE JUDÔ");

        jLabel1.setText("Nome :");

        jLabel2.setText("Idade :");

        jLabel3.setText("Sexo :");

        jLabel5.setText("Faixa : ");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        jLabel6.setText("Peso :");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel7.setText("Altura :");

        jLabel8.setText("*Obrigatório preechimento em todos os campos!*");

        jLabel4.setText("País : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIdade)
                                            .addComponent(txtPeso)
                                            .addComponent(txtAltura)
                                            .addComponent(rbMasculino))
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFeminino))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPais, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        JTextField[] campos = camposAtletas();
        for (int i = 0; i < campos.length; i++) {
            campos[i].setText("");
        }
        this.dispose();    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String argumentos = "";
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O  campo NOME não pode estar vazio!");
        } else if (txtIdade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo IDADE não pode estar vazia!");
        } else if (rbMasculino.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo SEXO não pode estar vazio!");
        } else if (rbFeminino.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo SEXO não pode estar vazio!");
        } else if (rbFeminino.isSelected() && rbMasculino.isSelected()) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um SEXO!");
        } else if (txtAltura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo ALTURA não pode estar vazio!");
        } else if (txtPeso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo PESO não pode estar vazio!");
        } else if (txtFaixa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo FAIXA não pode estar vazio!");
        } else if (txtPais.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo PAÍS não pode estar vazio!");
        } else {
            Arquivo arq = new Arquivo();
            DecimalFormat df = new DecimalFormat("##.##");
            argumentos = argumentos.concat(txtNome.getText() + ";");
            argumentos = argumentos.concat(txtIdade.getText() + ";");
            argumentos = argumentos.concat(txtPeso.getText() + ";");
            argumentos = argumentos.concat(txtAltura.getText() + ";");

//            arq.Write("Atletas.dat", txtNome.getText() + ":" + txtIdade.getText() + ":" + txtPeso.getText() + ":" + txtAltura.getText());
            // arq.Write("Atletas.dat", "Idade: " + txtIdade.getText());
            // arq.Write("Atletas.dat", "Peso: " + txtPeso.getText());
            // arq.Write("Atletas.dat", "Altura: " + txtAltura.getText());
            if (rbMasculino.isSelected()) {
                argumentos = argumentos.concat(rbMasculino.getText() + ";");
            } else if (rbFeminino.isSelected()) {
                argumentos = argumentos.concat(rbFeminino.getText() + ";");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um SEXO!");
            }
            argumentos = argumentos.concat(txtFaixa.getText() + ";");
            argumentos = argumentos.concat(txtPais.getText() + ";");
            if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) <= 60 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) <= 48) {
                argumentos = argumentos.concat("Ligeiro" );
                JOptionPane.showMessageDialog(null, "Sua categoria é: LIGEIRO");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 61 && Integer.parseInt(txtPeso.getText()) <= 66 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 49 && Integer.parseInt(txtPeso.getText()) <= 52) {
                argumentos = argumentos.concat("Meio - Leve");
                JOptionPane.showMessageDialog(null, "Sua categoria é: MEIO - LEVE");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 67 && Integer.parseInt(txtPeso.getText()) <= 73 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 53 && Integer.parseInt(txtPeso.getText()) <= 57) {
                argumentos = argumentos.concat("Leve");
                JOptionPane.showMessageDialog(null, "Sua categoria é: LEVE");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 74 && Integer.parseInt(txtPeso.getText()) <= 81 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 58 && Integer.parseInt(txtPeso.getText()) <= 63) {
                argumentos = argumentos.concat("Meio - Médio" );
                JOptionPane.showMessageDialog(null, "Sua categoria é: MEIO - MÉDIO");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 82 && Integer.parseInt(txtPeso.getText()) <= 90 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 64 && Integer.parseInt(txtPeso.getText()) <= 70) {
                argumentos = argumentos.concat("Medio" );
                JOptionPane.showMessageDialog(null, "Sua categoria é: MÉDIO");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 91 && Integer.parseInt(txtPeso.getText()) <= 100 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 71 && Integer.parseInt(txtPeso.getText()) <= 78) {
               argumentos = argumentos.concat("Meio - Pesado");
                JOptionPane.showMessageDialog(null, "Sua categoria é: MEIO - PESADO");
            } else if (rbMasculino.isSelected() && Integer.parseInt(txtPeso.getText()) >= 101 || rbFeminino.isSelected() && Integer.parseInt(txtPeso.getText()) > 79) {
                argumentos = argumentos.concat("Pesado");
                JOptionPane.showMessageDialog(null, "Sua categoria é: PESADO");
            }
            arq.Write("Atletas.dat", argumentos);

            JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!!");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private JTextField[] camposAtletas() {
        JTextField[] campos = {txtNome, txtIdade, txtFaixa,};
        return campos;
    }

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
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtFaixa;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
