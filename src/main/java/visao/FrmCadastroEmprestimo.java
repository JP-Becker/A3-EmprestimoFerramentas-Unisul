package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Emprestimo;
import modelo.Ferramenta;
import modelo.Amigo;
import static dao.AmigoDAO.verificaEmprestimoPendente;
import static dao.FerramentaDAO.verificaDisponibilidade;
import java.util.logging.Level;
import java.util.logging.Logger;

// FEITO POR JOÃO
public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;
    private Ferramenta objetoFerramenta;
    private Amigo objetoAmigo;

    public FrmCadastroEmprestimo() {
        initComponents();

        this.objetoEmprestimo = new Emprestimo();
        this.objetoFerramenta = new Ferramenta();
        this.objetoAmigo = new Amigo();
        
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Define o formato de saída desejado
        String dataFormatada = formato.format(data);
        this.JTFData.setText(dataFormatada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBPegar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFIdAmigo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTFIdFerramenta = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTFData = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Emprestimo");

        jLabel1.setText("ID do amigo");

        jLabel2.setText("ID Ferramenta:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBPegar.setText("Pegar");
        JBPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPegarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(JTFIdAmigo);

        jScrollPane2.setViewportView(JTFIdFerramenta);

        jLabel3.setText("Data do empréstimo");

        jScrollPane3.setViewportView(JTFData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(JBPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBPegar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPegarActionPerformed

        // inicializando as variáveis que serão utilizadas
        int idAmigo = 0;
        int idFerramenta = 0;
        int idEmprestimo = objetoEmprestimo.maiorID() + 1; // definindo a ID do emprestimo automaticamente 
        Date dataEmprestimo = new Date();
        Boolean sair = true;

        // Loop while para caso alguma das condições nao sejam atendidas o código pare de rodar e não insira nada no BD
        while (sair) {
            // condicional para checar se a ID inserida não é 0 e se existe de fato na lista(não é maior do que maior Id dela).
            if (Integer.parseInt(this.JTFIdAmigo.getText()) < 1 || Integer.parseInt(this.JTFIdAmigo.getText()) > objetoAmigo.maiorID()) {
                JOptionPane.showMessageDialog(null, "insira uma ID de amigo válida.");
                sair = false;
            } else {
                idAmigo = Integer.parseInt(this.JTFIdAmigo.getText());
            }

            // condicional para checar se a ID inserida não é 0 e se existe de fato na lista(não é maior do que maior Id dela).
            if (Integer.parseInt(this.JTFIdFerramenta.getText()) < 1 || Integer.parseInt(this.JTFIdFerramenta.getText()) > objetoFerramenta.maiorID()) {
                JOptionPane.showMessageDialog(null, "Insira uma ID de ferramenta válida.!");
                sair = false;
            } else {
                idFerramenta = Integer.parseInt(this.JTFIdFerramenta.getText());
            }
            
            if (JTFData != null) {
                try {
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    dataEmprestimo = formato.parse(JTFData.getText());
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Data de empréstimo inválida. Digite no formato yyyy-MM-dd.", "Erro de formato", JOptionPane.ERROR_MESSAGE);
                }
            }

            java.sql.Date sqlDate = new java.sql.Date(dataEmprestimo.getTime());
            Ferramenta ferramentaEscolhida = objetoFerramenta.carregaFerramentaPorId(idFerramenta); // variável para guardar a ferramenta escolhida
            Amigo amigoEscolhido = objetoAmigo.carregaAmigoPorId(idAmigo);// variável para guardar o amigo escolhido
            int confirmEmprestimo = JOptionPane.showConfirmDialog(null, "O amigo " + amigoEscolhido.getNomeAmigo() + " já possui um empréstimo ativo. Deseja conceder mesmo assim?");

            // condicional para verificar se o amigo já possui empréstimo e se a ferramenta está disponviel´para avisar o tio-avô
            if (verificaEmprestimoPendente(amigoEscolhido.getIdAmigo()) && !verificaDisponibilidade(ferramentaEscolhida.getIdFerramenta())) {
                // condicional para ver se o usuário quer emprestar mesmo com o amigo ainda tendo pendencias
                if (confirmEmprestimo == JOptionPane.YES_OPTION) {
                    this.objetoEmprestimo.inserirEmprestimoBD(idEmprestimo, amigoEscolhido.getIdAmigo(), ferramentaEscolhida.getIdFerramenta(), sqlDate, true,
                        ferramentaEscolhida, amigoEscolhido); 
                    // limpa campos da interface
                    this.JTFIdAmigo.setText("");
                    this.JTFIdFerramenta.setText("");

                    // mostrando mensagem confirmando que o empréstimo foi cadastrado, para quem e quando
                    JOptionPane.showMessageDialog(null, amigoEscolhido.getNomeAmigo() + " Pegou um(a) "
                            + ferramentaEscolhida.getNomeFerramenta() + " emprestado(a)." + " na data: " + dataEmprestimo);
                    sair = false;
                } else if (confirmEmprestimo == JOptionPane.CANCEL_OPTION || confirmEmprestimo == JOptionPane.NO_OPTION) {
                    // caso o usuário clique em NO ou Cancel
                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    sair = false;
                }
            } else if (verificaDisponibilidade(ferramentaEscolhida.getIdFerramenta())) {
                JOptionPane.showMessageDialog(null, "A ferramenta " + ferramentaEscolhida.getNomeFerramenta() + " está indisponível no momento.");
                sair = false;
            } else { // se o amigo escolhido nao tiver pendencia e a ferramenta estiver disponível ele insere o emprestimo direto na BD
                if (this.objetoEmprestimo.inserirEmprestimoBD(idEmprestimo, amigoEscolhido.getIdAmigo(), ferramentaEscolhida.getIdFerramenta(), sqlDate, true,
                        ferramentaEscolhida, amigoEscolhido)) {
                    // limpa campos da interface
                    this.JTFIdAmigo.setText("");
                    this.JTFIdFerramenta.setText("");

                    // mostrando mensagem confirmando que o empréstimo foi cadastrado, para quem e quando
                    JOptionPane.showMessageDialog(null, amigoEscolhido.getNomeAmigo() + " Pegou um(a) "
                            + ferramentaEscolhida.getNomeFerramenta() + " emprestado(a)." + " na data: " + dataEmprestimo);
                    sair = false;
                }
            }

        }

        System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        System.out.println(this.objetoAmigo.carregaAmigoPorId(idAmigo).getNomeAmigo());

    }//GEN-LAST:event_JBPegarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBPegar;
    private javax.swing.JTextPane JTFData;
    private javax.swing.JTextPane JTFIdAmigo;
    private javax.swing.JTextPane JTFIdFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
