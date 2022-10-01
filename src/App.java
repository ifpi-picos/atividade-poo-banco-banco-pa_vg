import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    //static List<Conta> contas = new ArrayList<>();
    //static List<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        List<Integer> opcoesIniciais = new ArrayList<>();
        opcoesIniciais.add(1);
        opcoesIniciais.add(2);
        opcoesIniciais.add(3);

        int opcaoSelecionada = 1;
        while (opcoesIniciais.get(opcaoSelecionada) != 3) {
            opcaoSelecionada = exibirMenuInicial(opcoesIniciais);
            if (opcoesIniciais.get(opcaoSelecionada) == 1) {
                
            }
        }
    }
    private static int exibirMenuInicial(List<Integer> opcoesIniciais) {
        Object[] opcoesArray = opcoesIniciais.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, 
        "1 - Criar conta\n2 - Login\n3 - Encerrar", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
        return opcaoSelecionada;
    }

}




