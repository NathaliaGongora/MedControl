
package Telas;

import Telas.TelaHistoricoDia;

public class TelaMenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName());

    
    public TelaMenuPrincipal() {
        initComponents();
        mostrarAlertas();
        setLocationRelativeTo(null);
        }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCadastroPaciente = new javax.swing.JButton();
        btnCadastroMedicamento = new javax.swing.JButton();
        btnMeusMedicamentos = new javax.swing.JButton();
        btnAlertas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnMeusDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDCONTROL");
        setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setText("BEM-VINDO AO MEDCONTROL");

        btnCadastroPaciente.setBackground(new java.awt.Color(153, 204, 255));
        btnCadastroPaciente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastroPaciente.setForeground(new java.awt.Color(204, 255, 204));
        btnCadastroPaciente.setText("Cadastrar Paciente");
        btnCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPacienteActionPerformed(evt);
            }
        });

        btnCadastroMedicamento.setBackground(new java.awt.Color(153, 204, 255));
        btnCadastroMedicamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastroMedicamento.setForeground(new java.awt.Color(204, 255, 204));
        btnCadastroMedicamento.setText("Cadastrar Medicamento");
        btnCadastroMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroMedicamentoActionPerformed(evt);
            }
        });

        btnMeusMedicamentos.setBackground(new java.awt.Color(153, 204, 255));
        btnMeusMedicamentos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMeusMedicamentos.setForeground(new java.awt.Color(204, 255, 204));
        btnMeusMedicamentos.setText("Meus Medicamentos");
        btnMeusMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeusMedicamentosActionPerformed(evt);
            }
        });

        btnAlertas.setBackground(new java.awt.Color(153, 204, 255));
        btnAlertas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlertas.setForeground(new java.awt.Color(204, 255, 204));
        btnAlertas.setText("Alertas");
        btnAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertasActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(153, 204, 255));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(204, 255, 204));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnHistorico.setBackground(new java.awt.Color(153, 204, 255));
        btnHistorico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHistorico.setForeground(new java.awt.Color(204, 255, 204));
        btnHistorico.setText("Histórico Diario");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnMeusDados.setBackground(new java.awt.Color(153, 204, 255));
        btnMeusDados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMeusDados.setForeground(new java.awt.Color(204, 255, 204));
        btnMeusDados.setText("Meus Dados");
        btnMeusDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeusDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlertas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeusMedicamentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroMedicamento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHistorico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeusDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblTitulo)
                .addGap(58, 58, 58)
                .addComponent(btnCadastroPaciente)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroMedicamento)
                .addGap(18, 18, 18)
                .addComponent(btnMeusMedicamentos)
                .addGap(18, 18, 18)
                .addComponent(btnHistorico)
                .addGap(18, 18, 18)
                .addComponent(btnMeusDados)
                .addGap(18, 18, 18)
                .addComponent(btnAlertas)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPacienteActionPerformed
        new TelaCadastroUsuario().setVisible(true);
    }//GEN-LAST:event_btnCadastroPacienteActionPerformed

    private void btnCadastroMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroMedicamentoActionPerformed
        new TelaCadastroMedicamento().setVisible(true);
    }//GEN-LAST:event_btnCadastroMedicamentoActionPerformed

    private void btnMeusMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeusMedicamentosActionPerformed
        new TelaMeusMedicamentos().setVisible(true);
    }//GEN-LAST:event_btnMeusMedicamentosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertasActionPerformed
        new TelaAlertas().setVisible(true);
    }//GEN-LAST:event_btnAlertasActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        TelaHistoricoDia tela =
        new TelaHistoricoDia();

        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnMeusDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeusDadosActionPerformed
        TelaMeusDados tela =
            new TelaMeusDados();

        tela.setVisible(true);
    }//GEN-LAST:event_btnMeusDadosActionPerformed

    public void mostrarAlertas() {

        DAO.MedicamentoDAO dao =
                new DAO.MedicamentoDAO();

        java.util.List<String> alertas =
                new java.util.ArrayList<>();

        alertas.addAll(
                dao.verificarAlertasVencimento()
        );

        alertas.addAll(
                dao.verificarQuantidadeBaixa()
        );

        if (!alertas.isEmpty()) {

            String mensagem = "";

            for (String alerta : alertas) {

                mensagem +=
                        "⚠ "
                        + alerta
                        + "\n";
            }

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    mensagem,
                    "ALERTAS",
                    javax.swing.JOptionPane.WARNING_MESSAGE
            );
        }
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlertas;
    private javax.swing.JButton btnCadastroMedicamento;
    private javax.swing.JButton btnCadastroPaciente;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnMeusDados;
    private javax.swing.JButton btnMeusMedicamentos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
