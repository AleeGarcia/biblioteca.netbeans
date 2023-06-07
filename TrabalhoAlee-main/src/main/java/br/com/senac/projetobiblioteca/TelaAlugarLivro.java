/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import javax.swing.event.ListSelectionEvent;

import javax.swing.event.ListSelectionListener;

import javax.swing.table.TableModel;

/**
 *
 * @author userale
 */
public class TelaAlugarLivro extends javax.swing.JDialog {
 private AddLivro dados;
 
    public TelaAlugarLivro(java.awt.Frame parent, AddLivro dados) {
        
        super(parent);
        
        this.dados = dados;
        
        initComponents();
        
        
                this.JTaluguel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e)
            {
                int index = JTaluguel.getSelectedRow();
                
                if(index>=0){
                    
                    Alugar livrosAluguel = dados.getBiblioteca().getLivrosAluguel().get(index);
                    
                }
            }  
        });  
    }
    
         public TableModel initTable(){
             
        return new AlugarTableModel(this.dados.getBiblioteca().getLivrosAluguel());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBAluguel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTaluguel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JBAluguel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBAluguel.setText("Alugar Livros");
        JBAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAluguelActionPerformed(evt);
            }
        });

        JTaluguel.setModel(initTable());
        jScrollPane1.setViewportView(JTaluguel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBAluguel)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAluguelActionPerformed
        
        this.dispose();  
    }//GEN-LAST:event_JBAluguelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAluguel;
    private javax.swing.JTable JTaluguel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
