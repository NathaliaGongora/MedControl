
package Telas;

import DAO.MedicamentoDAO;
import Model.Medicamento;

import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class TelaMeusMedicamentos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMeusMedicamentos.class.getName());

    
    public TelaMeusMedicamentos() {

        initComponents();

        setLocationRelativeTo(null);

        carregarMedicamentos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMed = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblQRCode = new javax.swing.JLabel();
        btnVoltar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meus Medicamentos");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setText("Meus Medicamentos");

        tabelaMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Dosagem", "Horario", "Validade", "Quantidade", "Uso Contínuo"
            }
        ));
        jScrollPane1.setViewportView(tabelaMed);

        btnAtualizar.setBackground(new java.awt.Color(153, 204, 255));
        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(204, 255, 204));
        btnAtualizar.setText("Atualizar Tabela");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(153, 204, 255));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(204, 255, 204));
        btnExcluir.setText("Excluir Medicamento");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar1.setBackground(new java.awt.Color(153, 204, 255));
        btnVoltar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(204, 255, 204));
        btnVoltar1.setText("Voltar ao Menu Principal");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 204, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 255, 204));
        btnEditar.setText("Editar Medicamento");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnVoltar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar1)
                .addGap(27, 27, 27)
                .addComponent(lblQRCode)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        carregarMedicamentos();

        JOptionPane.showMessageDialog(
            this,
            "Tabela atualizada!"
        );
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha =
        tabelaMed.getSelectedRow();

        if(linha == -1){

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um medicamento!"
            );

            return;
        }

        int id =
                Integer.parseInt(
                        tabelaMed.getValueAt(
                                linha,
                                0
                        ).toString()
                );

        int resposta =
        JOptionPane.showConfirmDialog(
                this,
                "Deseja excluir este medicamento?"
        );

        if(resposta == JOptionPane.YES_OPTION){

            MedicamentoDAO dao =
                    new MedicamentoDAO();

            dao.excluirMedicamento(id);
            
            JOptionPane.showMessageDialog(
                    this,
                    "Medicamento excluído!"
            );

            carregarMedicamentos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaMenuPrincipal tela =
        new TelaMenuPrincipal();

        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha =
        tabelaMed.getSelectedRow();

        if(linha != -1){

            int id =
                    Integer.parseInt(
                            tabelaMed
                            .getValueAt(linha, 0)
                            .toString()
                    );

            TelaEditarMedicamento tela =
                    new TelaEditarMedicamento(id);

            tela.setVisible(true);

            dispose();

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um medicamento!"
            );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void carregarMedicamentos(){

        DefaultTableModel modelo =
                (DefaultTableModel)
                        tabelaMed.getModel();

        modelo.setRowCount(0);

        try{

            MedicamentoDAO dao =
                    new MedicamentoDAO();

            List<Medicamento> lista =
                    dao.listarMedicamentos();

            for(Medicamento med : lista){

                modelo.addRow(new Object[]{

                    med.getId(),

                    med.getNome(),

                    med.getDosagem(),

                    med.getHorario(),

                    med.getDataValidade(),

                    med.getQuantidade(),

                    med.isUsoContinuo()
                        ? "Sim"
                        : "Não"
                });
            } 
            
        }    catch(Exception e){

                JOptionPane.showMessageDialog(
                        this,
                        "Erro: " + e.getMessage()
                );

                e.printStackTrace();
            }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new TelaMeusMedicamentos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQRCode;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabelaMed;
    // End of variables declaration//GEN-END:variables
}
