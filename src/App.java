import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;



public class App {
    //static List<Conta> contas = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    Random gerador = new Random();
    public static void main(String[] args) throws Exception {


        List<Integer> opcoesIniciais = new ArrayList<>();
        opcoesIniciais.add(1);
        opcoesIniciais.add(2);
        opcoesIniciais.add(3);

        int opcaoSelecionada = 1;
        while (opcoesIniciais.get(opcaoSelecionada) != 3) {
            opcaoSelecionada = exibirMenuInicial(opcoesIniciais);

            if (opcoesIniciais.get(opcaoSelecionada) == 1){
                List<Integer> opcoesCliente = new ArrayList<>();
                opcoesCliente.add(1);
                opcoesCliente.add(2);

                int opcaoCliente = exibirOpcaoCliente(opcoesCliente);
                if (opcoesCliente.get(opcaoCliente) == 1) {
                    cadastrarCliente();
                }
                else if (opcoesCliente.get(opcaoCliente) == 2) {
                    escolherCliente();
                }

                criarConta();

            }
            else if (opcoesIniciais.get(opcaoSelecionada) == 2) {
                telaLogin();
            }
        }
    }

    private static int exibirMenuInicial(List<Integer> opcoesIniciais) {
        Object[] opcoesArray = opcoesIniciais.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, 
        "1 - Criar conta\n2 - Login\n3 - Encerrar", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
        return opcaoSelecionada;
    }

    private static int exibirOpcaoCliente(List<Integer> opcoesCliente) {
        Object[] opcoesArray = opcoesCliente.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, 
        "1 - Cadastrar cliente\n2 - Escolher cliente já cadastrado", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
        return opcaoSelecionada;
    }

    private static void cadastrarCliente() {
        String nomeCliente = JOptionPane.showInputDialog("Nome: ");
        String cpfCliente = JOptionPane.showInputDialog("CPF: ");
        Random gerador = new Random();
        int idCliente = 0;
        Cliente novoCliente = new Cliente(nomeCliente, Long.parseLong(cpfCliente), idCliente, null);
        clientes.add(novoCliente);
    }

    private static void escolherCliente() {
        String idCliente = JOptionPane.showInputDialog("Digite seu código: ");
    }

    private static void telaLogin(){
        String numeroConta = JOptionPane.showInputDialog("Número da conta: ");
        String idCliente = JOptionPane.showInputDialog("Informe seu código único: ");
    }
    private static void criarConta() {
        
    }
}




