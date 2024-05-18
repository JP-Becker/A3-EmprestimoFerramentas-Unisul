package principal;

import modelo.Ferramenta;
import visao.FrmMenuPrincipal;

public class Principal {
    public static void main(String[] args) {
        // instanciando o objeto FrmMenuPrincipal e setando visible como true para aparecer
        FrmMenuPrincipal objetoTela = new FrmMenuPrincipal();
        objetoTela.setVisible(true);
        
        Ferramenta objetoFerramenta = new Ferramenta();
        System.out.println(objetoFerramenta.getMinhaLista().toString());
    }
}
