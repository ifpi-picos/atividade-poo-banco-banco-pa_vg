import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;



public class App {
    //static List<Conta> contas = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static List<Integer> numerosId = new ArrayList<>();
    Random gerador = new Random();
    public static void main(String[] args) throws Exception {


        List<Integer> opcoesIniciais = new ArrayList<>();
        opcoesIniciais.add(1);
        opcoesIniciais.add(2);
        opcoesIniciais.add(3);
        opcoesIniciais.add(4);

        int opcaoSelecionada = 1;
        while (opcoesIniciais.get(opcaoSelecionada) != 4) {
            opcaoSelecionada = exibirMenuInicial(opcoesIniciais);

            if (opcoesIniciais.get(opcaoSelecionada) == 1){
                cadastrarCliente();
            }
            else if (opcoesIniciais.get(opcaoSelecionada) == 2) {
                criarConta();
            }
            else if (opcoesIniciais.get(opcaoSelecionada) == 3) {
                telaLogin();
            }
        }
    }

    private static int exibirMenuInicial(List<Integer> opcoesIniciais) {
        Object[] opcoesArray = opcoesIniciais.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, 
        "1 - Cadastrar Cliente\n2 - Criar conta\n3 - Login\n4 - Encerrar", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
        return opcaoSelecionada;
    }

    private static void cadastrarCliente() {
        String nomeCliente = JOptionPane.showInputDialog("Nome: ");
        String cpfCliente = JOptionPane.showInputDialog("CPF: ");
        int idCliente;
        do {
            idCliente = 10000 + (int) (Math.random() * 89999); //gerar um numero aleatorio para o id do cliente                
        } while (numerosId.contains(idCliente) == true); //verifica se o id gerado já foi gerado e adicionado no array alguma outra vez
        numerosId.add(idCliente); //adiciona o id no array para verificação

        Cliente novoCliente = new Cliente(nomeCliente, Long.parseLong(cpfCliente), idCliente, null);
        clientes.add(novoCliente);

        JOptionPane.showMessageDialog(null, "Nome do cliente: " + nomeCliente + "\nCPF: " + cpfCliente + 
        "\nId: " + idCliente, "CADASTRO REALIZADO", JOptionPane.PLAIN_MESSAGE);
    }

    private static void criarConta() {
        
    }
    
    private static void telaLogin(){
        String numeroConta = JOptionPane.showInputDialog("Número da conta: ");
        String idCliente = JOptionPane.showInputDialog("Informe seu código único: ");
    }
}




