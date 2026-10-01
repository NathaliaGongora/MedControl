
package Telas;

import DAO.MedicamentoDAO;
import Model.Medicamento;
import Model.Sessao;
import javax.swing.JOptionPane;


public class TelaEditarMedicamento extends javax.swing.JFrame {
    
    private int idMedicamento;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEditarMedicamento.class.getName());

    public TelaEditarMedicamento(int id) {
        initComponents();

        this.idMedicamento = id;

        carregarMedicamento();

        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalvarMed = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        chkUsoContinuo = new javax.swing.JCheckBox();
        txtDescricao = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblDosagem = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtDosagem = new javax.swing.JTextField();
        lblDataFim = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Editar Medicamento");

        btnSalvarMed.setBackground(new java.awt.Color(153, 204, 255));
        btnSalvarMed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvarMed.setForeground(new java.awt.Color(204, 255, 204));
        btnSalvarMed.setText("Salvar");
        btnSalvarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMedActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        btnVoltar.setBackground(new java.awt.Color(153, 204, 255));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(204, 255, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(153, 204, 255));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(204, 255, 204));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        chkUsoContinuo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chkUsoContinuo.setText("Uso contínuo");
        chkUsoContinuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUsoContinuoActionPerformed(evt);
            }
        });

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblQuantidade.setText("Quantidade de Remedios na Caixa:");

        lblDosagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDosagem.setText("Dosagem:");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        txtDosagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosagemActionPerformed(evt);
            }
        });

        lblDataFim.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDataFim.setText("Data fim (ano-mes-dia):");

        lblHorario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblHorario.setText("Horario:");

        txtDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimActionPerformed(evt);
            }
        });

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        lblValidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblValidade.setText("Validade (ano-mes-dia):");

        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkUsoContinuo)
                            .addComponent(lblValidade)
                            .addComponent(lblDosagem)
                            .addComponent(lblDescricao)
                            .addComponent(lblNome)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtValidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHorario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDosagem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHorario)
                            .addComponent(lblDataFim)
                            .addComponent(lblQuantidade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDataFim, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvarMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDosagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataFim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkUsoContinuo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarMed)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMedActionPerformed

        try {
            String nome =
            txtNome.getText().trim();

            String descricao =
            txtDescricao.getText().trim();

            String dosagem =
            txtDosagem.getText().trim();

            String horario =
            txtHorario.getText().trim();

            String quantidadeTexto =
            txtQuantidade.getText().trim();

            if(
                nome.isEmpty()

                ||

                dosagem.isEmpty()

                ||

                horario.isEmpty()

                ||

                quantidadeTexto.isEmpty()
            ){

                javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Preencha os campos obrigatórios!"
                );

                return;
            }

            // DATA VALIDADE
            java.time.LocalDate validade =
            java.time.LocalDate.parse(
                txtValidade.getText()
            );

            // USO CONTINUO
            boolean usoContinuo =
            chkUsoContinuo.isSelected();

            // DATA FIM
            java.time.LocalDate dataFim = null;

            if(!usoContinuo){

                dataFim =
                java.time.LocalDate.parse(
                    txtDataFim.getText()
                );
            }

            // QUANTIDADE
            int quantidade =
            Integer.parseInt(
                quantidadeTexto
            );

            // CRIAR OBJETO
            Model.Medicamento med =
            new Model.Medicamento(
                idMedicamento,
                nome,
                descricao,
                dosagem,
                horario,
                validade
            );

            // NOVOS CAMPOS
            med.setUsoContinuo(
                usoContinuo
            );

            med.setDataFim(
                dataFim
            );

            med.setQuantidade(
                quantidade
            );

            // USUARIO LOGADO
            med.setUsuarioId(
                Sessao.idUsuario
            );

            System.out.println(
                "USUARIO DO MEDICAMENTO: "
                + med.getUsuarioId()
            );

            // SALVAR
            DAO.MedicamentoDAO dao =
            new DAO.MedicamentoDAO();

            dao.atualizarMedicamento(med);

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Medicamento cadastrado com sucesso!"
            );
                    
            JOptionPane.showMessageDialog(
                    this,
                    "Medicamento atualizado!"
                );

                new TelaMeusMedicamentos()
                    .setVisible(true);

                dispose();
            

        } catch (java.time.format.DateTimeParseException ex) {

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Digite as datas no formato AAAA-MM-DD"
            );

        } catch (NumberFormatException ex){

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Digite uma quantidade válida!"
            );

        } catch (Exception ex) {

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Erro ao salvar medicamento!"
            );

            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarMedActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuPrincipal tela = new TelaMenuPrincipal();

        tela.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");

        txtDescricao.setText("");

        txtDosagem.setText("");

        txtHorario.setText("");

        txtValidade.setText("");

        txtDataFim.setText("");

        txtQuantidade.setText("");

        chkUsoContinuo.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void chkUsoContinuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUsoContinuoActionPerformed
        if(chkUsoContinuo.isSelected()){

            txtDataFim.setText("");

            txtDataFim.setEnabled(false);

        }else{

            txtDataFim.setEnabled(true);
        }
    }//GEN-LAST:event_chkUsoContinuoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtDosagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosagemActionPerformed

    private void txtDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidadeActionPerformed

    public void carregarMedicamento() {

        try {

            MedicamentoDAO dao =
                    new MedicamentoDAO();

            Medicamento med =
                    dao.buscarPorId(idMedicamento);

            txtNome.setText(
                    med.getNome()
            );

            txtDescricao.setText(
                    med.getDescricao()
            );

            txtDosagem.setText(
                    med.getDosagem()
            );

            txtHorario.setText(
                    med.getHorario()
            );

            txtQuantidade.setText(
                    String.valueOf(
                            med.getQuantidade()
                    )
            );

            if(med.getDataValidade() != null){

                txtValidade.setText(
                        med.getDataValidade().toString()
                );
            }

            chkUsoContinuo.setSelected(
                    med.isUsoContinuo()
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao carregar medicamento!"
            );
        }
    }
      
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvarMed;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chkUsoContinuo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDataFim;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDosagem;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JTextField txtDataFim;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDosagem;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
