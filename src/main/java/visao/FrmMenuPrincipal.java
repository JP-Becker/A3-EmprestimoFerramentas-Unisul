
package visao;


public class FrmMenuPrincipal extends javax.swing.JFrame {

 
    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBcadastrarAluno = new javax.swing.JButton();
        JBCadastrarFerramentas = new javax.swing.JButton();
        JBGerenciarAmigo = new javax.swing.JButton();
        JBEmitirRelatorio = new javax.swing.JButton();
        JBGerenciarFerramentas = new javax.swing.JButton();
        JBCadastrarEmprestimo = new javax.swing.JButton();
        JBGerenciarEmprestimo = new javax.swing.JButton();
        JBRelatorioEmprestimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JBcadastrarAluno.setText("Cadastrar Amigo");
        JBcadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcadastrarAlunoActionPerformed(evt);
            }
        });

        JBCadastrarFerramentas.setText("Cadastrar Ferramenta");
        JBCadastrarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarFerramentasActionPerformed(evt);
            }
        });

        JBGerenciarAmigo.setText("Gerenciar Amigo");
        JBGerenciarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerenciarAmigoActionPerformed(evt);
            }
        });

        JBEmitirRelatorio.setText("Emitir Relatorio");
        JBEmitirRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmitirRelatorioActionPerformed(evt);
            }
        });

        JBGerenciarFerramentas.setText("Gerenciar Ferramentas");

        JBCadastrarEmprestimo.setText("Cadastras Emprestimo");
        JBCadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarEmprestimoActionPerformed(evt);
            }
        });

        JBGerenciarEmprestimo.setText("Gerenciar Emprestimos");
        JBGerenciarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerenciarEmprestimoActionPerformed(evt);
            }
        });

        JBRelatorioEmprestimo.setText("Relatorio Emprestimo");
        JBRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatorioEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBcadastrarAluno)
                    .addComponent(JBEmitirRelatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JBCadastrarFerramentas)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBRelatorioEmprestimo)
                                    .addComponent(JBGerenciarFerramentas))
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBGerenciarAmigo)
                            .addComponent(JBCadastrarEmprestimo))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JBGerenciarEmprestimo)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcadastrarAluno)
                    .addComponent(JBCadastrarFerramentas)
                    .addComponent(JBGerenciarAmigo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(JBCadastrarEmprestimo)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JBEmitirRelatorio)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(JBGerenciarEmprestimo)
                                .addGap(62, 62, 62))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JBGerenciarFerramentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBRelatorioEmprestimo)
                        .addGap(37, 37, 37))))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bem Vindo tio-Avô!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGerenciarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenciarAmigoActionPerformed
        // TODO add your handling code here:
         FrmGerenciarAmigo objetoTela = new FrmGerenciarAmigo();
        objetoTela.setVisible(true);
    }//GEN-LAST:event_JBGerenciarAmigoActionPerformed

    private void JBEmitirRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmitirRelatorioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBEmitirRelatorioActionPerformed

    private void JBCadastrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarEmprestimoActionPerformed
        // TODO add your handling code here:
         FrmCadastroEmprestimo objetoTela = new FrmCadastroEmprestimo();
        objetoTela.setVisible(true);
    }//GEN-LAST:event_JBCadastrarEmprestimoActionPerformed

    private void JBGerenciarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenciarEmprestimoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBGerenciarEmprestimoActionPerformed

    private void JBcadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcadastrarAlunoActionPerformed
        FrmCadastroAmigo objetoTela = new FrmCadastroAmigo();
        objetoTela.setVisible(true);
    }//GEN-LAST:event_JBcadastrarAlunoActionPerformed

    private void JBCadastrarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarFerramentasActionPerformed
        // TODO add your handling code here:
         FrmCadastroFerramenta objetoTela = new FrmCadastroFerramenta();
        objetoTela.setVisible(true);
    }//GEN-LAST:event_JBCadastrarFerramentasActionPerformed

    private void JBRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioEmprestimoActionPerformed
        // TODO add your handling code here:
         FrmRelatorioEmprestimo objetoTela = new FrmRelatorioEmprestimo();
        objetoTela.setVisible(true); 
    }//GEN-LAST:event_JBRelatorioEmprestimoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrarEmprestimo;
    private javax.swing.JButton JBCadastrarFerramentas;
    private javax.swing.JButton JBEmitirRelatorio;
    private javax.swing.JButton JBGerenciarAmigo;
    private javax.swing.JButton JBGerenciarEmprestimo;
    private javax.swing.JButton JBGerenciarFerramentas;
    private javax.swing.JButton JBRelatorioEmprestimo;
    private javax.swing.JButton JBcadastrarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
