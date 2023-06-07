/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import br.com.senac.projetobiblioteca.AddLivro;

import br.com.senac.projetobiblioteca.BibliDuAlee;


/**
 *
 * @author userale
 */
public class TelaCadastrarClientes extends javax.swing.JDialog {
    
   private AddLivro dados;
   
    public TelaCadastrarClientes(java.awt.Frame parent,AddLivro dados) {
        
        super(parent);
        
        this.dados = dados;
        
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

        JLnomeCadastro = new javax.swing.JLabel();
        JTFnomeCadastro = new javax.swing.JTextField();
        JLcelularCadastro = new javax.swing.JLabel();
        JTFcelularCadastro = new javax.swing.JTextField();
        JLsenhaCadastro = new javax.swing.JLabel();
        JTFsenhaCadastro = new javax.swing.JPasswordField();
        JLconfirmSenhaCadastro = new javax.swing.JLabel();
        JPFconfirmSenhaCadastro = new javax.swing.JPasswordField();
        JBconfirmaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JLnomeCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLnomeCadastro.setText("Nome Cliente");

        JLcelularCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLcelularCadastro.setText("Telefone Cliente");

        JTFcelularCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcelularCadastroActionPerformed(evt);
            }
        });

        JLsenhaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLsenhaCadastro.setText("Senha Cliente");

        JTFsenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFsenhaCadastroActionPerformed(evt);
            }
        });

        JLconfirmSenhaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLconfirmSenhaCadastro.setText("Confirmação Senha");

        JBconfirmaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBconfirmaCadastro.setText("Aceitar");
        JBconfirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBconfirmaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLnomeCadastro)
                                .addGap(110, 110, 110)
                                .addComponent(JLsenhaCadastro))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLcelularCadastro)
                                    .addComponent(JTFcelularCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JPFconfirmSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLconfirmSenhaCadastro))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFnomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JTFsenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(JBconfirmaCadastro)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnomeCadastro)
                    .addComponent(JLsenhaCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFsenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBconfirmaCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLcelularCadastro)
                    .addComponent(JLconfirmSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcelularCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPFconfirmSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFcelularCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcelularCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcelularCadastroActionPerformed

    private void JBconfirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBconfirmaCadastroActionPerformed
    Clientes roger = new Clientes(
            this.JTFnomeCadastro.getText(),
            this.JTFcelularCadastro.getText(),
            this.JTFsenhaCadastro.getText());
    
    this.dados.getBiblioteca().addCliente(roger);
    this.dispose();
    }//GEN-LAST:event_JBconfirmaCadastroActionPerformed

    private void JTFsenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFsenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFsenhaCadastroActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBconfirmaCadastro;
    private javax.swing.JLabel JLcelularCadastro;
    private javax.swing.JLabel JLconfirmSenhaCadastro;
    private javax.swing.JLabel JLnomeCadastro;
    private javax.swing.JLabel JLsenhaCadastro;
    private javax.swing.JPasswordField JPFconfirmSenhaCadastro;
    private javax.swing.JTextField JTFcelularCadastro;
    private javax.swing.JTextField JTFnomeCadastro;
    private javax.swing.JPasswordField JTFsenhaCadastro;
    // End of variables declaration//GEN-END:variables
}