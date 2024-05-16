
package view;


public class FrmMenuPrincipal extends javax.swing.JFrame {

 
    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuCadastroAmigo = new javax.swing.JMenuItem();
        JMenuCadastroFerramenta = new javax.swing.JMenuItem();
        JMenuCadastroEmpretimo = new javax.swing.JMenuItem();
        JMenuRelatorioEmprestimo = new javax.swing.JMenuItem();
        JMenuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jMenu1.setText("arquivo");

        JMenuCadastroAmigo.setText("Cadastro Amigo");
        JMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroAmigoActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuCadastroAmigo);

        JMenuCadastroFerramenta.setText("Cadastro Ferramenta");
        JMenuCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuCadastroFerramenta);

        JMenuCadastroEmpretimo.setText("Cadastro De Emprestimo");
        JMenuCadastroEmpretimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroEmpretimoActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuCadastroEmpretimo);

        JMenuRelatorioEmprestimo.setText("Relatorio De Emprestimo");
        JMenuRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuRelatorioEmprestimoActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuRelatorioEmprestimo);

        JMenuSair.setText("Sair");
        JMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroAmigoActionPerformed
        FrmCadastroAmigo objetoTela = new FrmCadastroAmigo();
            objetoTela.setVisible(true);
    }//GEN-LAST:event_JMenuCadastroAmigoActionPerformed

    private void JMenuRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuRelatorioEmprestimoActionPerformed
       FrmRelatorioEmprestimo objetoTela = new FrmRelatorioEmprestimo();
            objetoTela.setVisible(true);
    }//GEN-LAST:event_JMenuRelatorioEmprestimoActionPerformed

    private void JMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuSairActionPerformed

    private void JMenuCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroFerramentaActionPerformed
        FrmCadastroFerramenta objetoTela = new FrmCadastroFerramenta();
            objetoTela.setVisible(true);
    }//GEN-LAST:event_JMenuCadastroFerramentaActionPerformed

    private void JMenuCadastroEmpretimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroEmpretimoActionPerformed
        FrmCadastroEmprestimo objetoTela = new FrmCadastroEmprestimo();
            objetoTela.setVisible(true);
    }//GEN-LAST:event_JMenuCadastroEmpretimoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuCadastroAmigo;
    private javax.swing.JMenuItem JMenuCadastroEmpretimo;
    private javax.swing.JMenuItem JMenuCadastroFerramenta;
    private javax.swing.JMenuItem JMenuRelatorioEmprestimo;
    private javax.swing.JMenuItem JMenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
