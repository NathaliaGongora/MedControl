
package Telas;

import javax.swing.Timer;
import DAO.HistoricoMedicamentoDAO;
import Model.HistoricoMedicamento;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Telas.TelaMenuPrincipal;

public class TelaHistoricoDia extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHistoricoDia.class.getName());

    public TelaHistoricoDia() {
        initComponents();

        setLocationRelativeTo(null);

        carregarHistorico();

        Timer timer =
                new Timer(
                        60000,
                        e -> carregarHistorico()
                );

        timer.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistorico = new javax.swing.JTable();
        btnTomado = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Meu Histórico Diário");

        tabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Medicamento", "Horário", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaHistorico);

        btnTomado.setBackground(new java.awt.Color(153, 204, 255));
        btnTomado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTomado.setForeground(new java.awt.Color(204, 255, 204));
        btnTomado.setText("Registrar como Tomado");
        btnTomado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomadoActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(153, 204, 255));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(204, 255, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btnTomado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnVoltar)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnTomado)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuPrincipal tela =
        new TelaMenuPrincipal();

        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnTomadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomadoActionPerformed
            
        int linha =
                tabelaHistorico.getSelectedRow();

        if (linha != -1) {

            int id =
                    Integer.parseInt(
                            tabelaHistorico
                            .getValueAt(linha, 0)
                            .toString()
                    );

            DAO.MedicamentoDAO dao =
                    new DAO.MedicamentoDAO();

            dao.marcarComoTomado(id);
            
            dao.diminuirQuantidade(id);

            tabelaHistorico.setValueAt(
                    "Tomado",
                    linha,
                    3
            );

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Medicamento marcado como tomado!"
            );

        } else {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Selecione um medicamento!"
            );
        }
    }//GEN-LAST:event_btnTomadoActionPerformed

    public void carregarHistorico() {

        try {

            javax.swing.table.DefaultTableModel modelo =
                    (javax.swing.table.DefaultTableModel)
                    tabelaHistorico.getModel();

            modelo.setRowCount(0);

            DAO.MedicamentoDAO dao =
                    new DAO.MedicamentoDAO();

            java.util.List<Model.Medicamento> lista =
                    dao.listarMedicamentos();

            for (Model.Medicamento med : lista) {

                modelo.addRow(
                        new Object[]{
                            med.getId(),
                            med.getNome(),
                            med.getHorario(),
                            med.isStatusTomado()
                                ? "Tomado"
                                : "Pendente"
                        }
                );
            }

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Erro ao carregar histórico!"
            );

            System.out.println(
                    e.getMessage()
            );
        }
    }
    
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
        java.awt.EventQueue.invokeLater(() -> new TelaHistoricoDia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTomado;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHistorico;
    // End of variables declaration//GEN-END:variables

    
}
