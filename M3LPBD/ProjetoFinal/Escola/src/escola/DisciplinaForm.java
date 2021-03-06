//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Celso David Lopes dos Santos
//******************************************************

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author celso
 */
public class DisciplinaForm extends javax.swing.JFrame {

    /**
     * Creates new form DisciplinaForm
     */
    public DisciplinaForm() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCargaHoraria = new javax.swing.JLabel();
        jTextFieldCargaHoraria = new javax.swing.JTextField();
        jLabelCurso = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabelVagas = new javax.swing.JLabel();
        jTextFieldVagas = new javax.swing.JTextField();
        jLabelPeriodo = new javax.swing.JLabel();
        jComboBoxPerido = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("Cadastro de Disciplinas");

        jLabelNome.setText("Nome:");

        jTextFieldNome.setToolTipText("Digite o nome da disciplina");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelCargaHoraria.setText("Carga horária:");

        jTextFieldCargaHoraria.setToolTipText("Digite o total de aulas");

        jLabelCurso.setText("Curso:");

        jTextFieldCurso.setToolTipText("Digite o nome do curso");

        jLabelVagas.setText("Vagas:");

        jTextFieldVagas.setToolTipText("Digite o total de vagas");

        jLabelPeriodo.setText("Período:");

        jComboBoxPerido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Diurno", "Noturno", "Vespertino" }));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelVagas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCargaHoraria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabelPeriodo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxPerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurso)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVagas)
                    .addComponent(jTextFieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCargaHoraria)
                    .addComponent(jTextFieldCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jComboBoxPerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonCancelar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // metodo que fecha a janela
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * Metodo responsavel por inserir uma nova disciplina
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {            
            if (String.valueOf(jComboBoxPerido.getSelectedItem()) == "Selecione") {
                throw new Exception("Preencha todos os campos corretamente!");
            }
            
            String cmd = "INSERT INTO disciplina (nome, carga_horaria, curso, vagas, periodo) "
                    + "VALUES ('"+jTextFieldNome.getText()+"', "+Integer.parseInt(jTextFieldCargaHoraria.getText())+ ", "
                    + "'"+jTextFieldCurso.getText()+"', "+Integer.parseInt(jTextFieldVagas.getText())+", "
                    + "'"+jComboBoxPerido.getSelectedItem()+"')";
                      
            Connection conn = ConexaoMySQL.getInstance().getConnection();
            conn.createStatement().executeUpdate(cmd);
            
            JOptionPane.showMessageDialog(rootPane, "Disciplina cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            DisciplinaForm disciplinaForm = new DisciplinaForm();
            disciplinaForm.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar a disciplina!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(DisciplinaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisciplinaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisciplinaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisciplinaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisciplinaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxPerido;
    private javax.swing.JLabel jLabelCargaHoraria;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVagas;
    private javax.swing.JTextField jTextFieldCargaHoraria;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldVagas;
    // End of variables declaration//GEN-END:variables
}
