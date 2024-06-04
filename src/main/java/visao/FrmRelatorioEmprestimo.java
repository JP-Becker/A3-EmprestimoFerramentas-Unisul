package visao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import dao.AmigoDAO;
import dao.FerramentaDAO;
import modelo.Ferramenta;

public class FrmRelatorioEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoemprestimo = new Emprestimo();
    private AmigoDAO objetoamigoDAO = new AmigoDAO();
    private FerramentaDAO objetoferramentaDAO = new FerramentaDAO();

    public FrmRelatorioEmprestimo() {
        initComponents();
        this.carregaTabelaAtiva();
        this.carregaTabelaPassada();
        somaValorFerramentas();
        amigoMaisEmprestimos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTodosEmprestimosRealizados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTEmprestimosAtivos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();
        JLValorTotalFerramentas = new javax.swing.JLabel();
        JLAmigoMaisEmprestimos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatorio Emprestimo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Relatorio de Emprestimos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        JTTodosEmprestimosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ferramenta", "Data de empréstimo", "Data de devolução", "Amigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTTodosEmprestimosRealizados);
        if (JTTodosEmprestimosRealizados.getColumnModel().getColumnCount() > 0) {
            JTTodosEmprestimosRealizados.getColumnModel().getColumn(0).setResizable(false);
            JTTodosEmprestimosRealizados.getColumnModel().getColumn(1).setResizable(false);
        }

        JTEmprestimosAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ferramenta", "Data de empréstimo", "Amigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTEmprestimosAtivos);
        if (JTEmprestimosAtivos.getColumnModel().getColumnCount() > 0) {
            JTEmprestimosAtivos.getColumnModel().getColumn(0).setResizable(false);
            JTEmprestimosAtivos.getColumnModel().getColumn(1).setResizable(false);
            JTEmprestimosAtivos.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Emprestimos Ativos:");

        jLabel3.setText("Empréstimos passados:");

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JLValorTotalFerramentas.setText("teste");

        JLAmigoMaisEmprestimos.setText("teste2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLAmigoMaisEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(JBVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(JLValorTotalFerramentas)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(JLValorTotalFerramentas)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JLAmigoMaisEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioEmprestimo().setVisible(true);
            }
        });
    }

    //possivelmente poderia ser criado um método na classe de ferramenta
    //mas por ora vou deixar assim
    public void somaValorFerramentas() {

        double valorTotal = 0;

        ArrayList<Ferramenta> listaFerramenta = objetoferramentaDAO.getListaFerramenta();

        for (Ferramenta a : listaFerramenta) {
            valorTotal += a.getCusto();
        }

        this.JLValorTotalFerramentas.setText(Double.toString(valorTotal));

    }

    //código absolutamente RADIOATIVO abaixo, não tente entender ele
    
    //isso aconteceu porque tiraram os valores de quantidade de empréstimo do amigo
    //e não colocaram checagem dinâmicas, então eu tive que enfiar o equivalente
    //a uns 3 métodos diferentes em 1 só
    
    //dado mais tempo eu tentarra fazer uma coisa de gente sã, mas não tem tempo
    
    public void amigoMaisEmprestimos() {

        ArrayList<Emprestimo> listaEmprestimo = objetoemprestimo.getMinhaLista();

        int[][] valores = new int[2][objetoamigoDAO.getListaAmigo().size()];

        for (Emprestimo a : listaEmprestimo) {
            boolean novoAmigo = true;
            for (int i = 0; i < valores[1].length; i++) {
                if (valores[0][i] == a.getIdAmigo()) {
                    valores[1][i] += 1;
                    novoAmigo = false;
                    break;
                }
            }
            if (novoAmigo == true) {
                for (int i = 0; i < valores[1].length; i++) {
                    if (valores[0][i] == 0) {
                        valores[0][i] = a.getIdAmigo();
                        valores[1][i] = 1;
                        break;
                    }
                }
            }
        }

        ArrayList<Integer> maioresEmprestadosID = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < valores[1].length; i++) {
            int y = 0;
            int limite = maioresEmprestadosID.size();
            do {
                if (valores[1][i] > valores[1][index]) {
                    maioresEmprestadosID.clear();
                    maioresEmprestadosID.add(valores[0][i]);
                    index = i;
                    y++;
                    break;
                } else if (valores[1][i] == valores[1][index]) {
                    maioresEmprestadosID.add(valores[0][i]);
                }
                y++;
            } while (y < limite);
        }

        for (int y = 0; y < maioresEmprestadosID.size(); y++) {
            System.out.println((objetoamigoDAO.carregaAmigoPorId(maioresEmprestadosID.get(y)).getNomeAmigo()));
        }

        StringBuilder str = new StringBuilder();

        if (maioresEmprestadosID.size() > 1) {
            str.append("Maiores emprestadores:");
        } else {
            str.append("Maior emprestador:");
        }

        for (int y = 0; y < maioresEmprestadosID.size(); y++) {
            str.append(" ").append(objetoamigoDAO.carregaAmigoPorId(maioresEmprestadosID.get(y)).getNomeAmigo());
        }
        
        this.JLAmigoMaisEmprestimos.setText(str.toString());

    }

    public void carregaTabelaPassada() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTTodosEmprestimosRealizados.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos ferramenta
        ArrayList<Emprestimo> listaEmprestimo = objetoemprestimo.getMinhaLista();

        for (Emprestimo a : listaEmprestimo) {

            //deselegante, mas vai segurar as pontas até eu arrumar
            if (a.getPendente() == true) {
                continue;
            }

            modelo.addRow(new Object[]{
                objetoferramentaDAO.carregaFerramentaPorId(a.getIdFerramenta()).getNomeFerramenta(),
                a.getDataEmprestimo(),
                a.getDataDevolucao(),
                objetoamigoDAO.carregaAmigoPorId(a.getIdAmigo()).getNomeAmigo(),});
        }
    }

    public void carregaTabelaAtiva() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTEmprestimosAtivos.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos ferramenta
        ArrayList<Emprestimo> listaEmprestimo = objetoemprestimo.getMinhaLista();

        for (Emprestimo a : listaEmprestimo) {

            //mesmo de cima: feio, mas funciona até eu arrumar
            if (a.getPendente() == false) {
                continue;
            }

            modelo.addRow(new Object[]{
                objetoferramentaDAO.carregaFerramentaPorId(a.getIdFerramenta()).getNomeFerramenta(),
                a.getDataEmprestimo(),
                objetoamigoDAO.carregaAmigoPorId(a.getIdAmigo()).getNomeAmigo(),});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLAmigoMaisEmprestimos;
    private javax.swing.JLabel JLValorTotalFerramentas;
    private javax.swing.JTable JTEmprestimosAtivos;
    private javax.swing.JTable JTTodosEmprestimosRealizados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
