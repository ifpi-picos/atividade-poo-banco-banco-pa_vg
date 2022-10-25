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
                List<Integer> opcoesTipo = new ArrayList<>();
                opcoesTipo.add(1);
                opcoesTipo.add(2);

                int tipoConta = escolherTipo(opcoesTipo);
                if (opcoesTipo.get(tipoConta) == 1) {
                    criarContaCorrente();
                } else {
                    criarContaPoupanca();
                }
            }
            else if (opcoesIniciais.get(opcaoSelecionada) == 3) {
                telaLogin();
            }
        }
    }

    private static int escolherTipo(List<Integer> opcoesTipo) {
        Object[] opcoesArray = opcoesTipo.toArray();
        int tipoEscolhido = JOptionPane.showOptionDialog(null, 
        "1 - Conta Corrente\n2 - Conta Poupança", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
        return tipoEscolhido;
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

        String estado = JOptionPane.showInputDialog("Estado que você mora: ");
        String cidade = JOptionPane.showInputDialog("Nome da cidade: ");
        String bairro = JOptionPane.showInputDialog("Nome do bairro: ");
        String rua = JOptionPane.showInputDialog("Nome da rua: ");
        String numeroCasa = JOptionPane.showInputDialog("Número da casa: ");

        Endereco endereco = new Endereco(rua, bairro, Integer.parseInt(numeroCasa), estado, cidade);

        String senha = JOptionPane.showInputDialog("Cadastre uma senha: ");

        Cliente novoCliente = new Cliente(nomeCliente, Long.parseLong(cpfCliente), idCliente, null, endereco, senha);
        clientes.add(novoCliente);

        JOptionPane.showMessageDialog(null, "Nome do cliente: " + nomeCliente + "\nCPF: " + cpfCliente + 
        "\nId: " + idCliente + "\nAnote o ID para usá-lo posteriormente", "CADASTRO REALIZADO", JOptionPane.PLAIN_MESSAGE);
    }

    private static void telaLogin(){
        String idClienteStr = JOptionPane.showInputDialog("Código de identificação(ID): ");
        String senha = JOptionPane.showInputDialog("Senha: ");
        int idCliente = Integer.parseInt(idClienteStr);

        for (Cliente cliente : clientes) {
            //JOptionPane.showMessageDialog(null, cliente.getIdCliente() + "\n" + cliente.getSenha());
            if(idCliente == cliente.getIdCliente() && senha.equals(cliente.getSenha())) {
                List<Integer> opcoes = new ArrayList<>();
                opcoes.add(1);
                opcoes.add(2);
                opcoes.add(3);

                Object[] opcoesObject = opcoes.toArray();
                int opcaoSelecionada = 1;
                while (opcoes.get(opcaoSelecionada) != 3) {
                    opcaoSelecionada = JOptionPane.showOptionDialog(null,
                    "1 - Criar conta\n2 - Acessar conta\n3 - Encerrar", " ", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, opcoesObject, null);
                    if (opcaoSelecionada == 1) {

                    }
                    else if (opcaoSelecionada == 2) {

                    }
                }
            }
        }
    }

    private static void criarContaCorrente() {
        String idCliente = JOptionPane.showInputDialog("Insira um ID de Cliente: ");
        while (numerosId.contains(Integer.parseInt(idCliente)) == false) {
            JOptionPane.showMessageDialog(null, "ID inválido\nInsira um ID válido");
            idCliente = JOptionPane.showInputDialog("Insira um ID de Cliente: ");
        }
        int numeroConta = 100000000 + (int) (Math.random() * 899999999);
        int agenciaConta = 1000 + (int) (Math.random() * 89999);

        ContaCorrente novaContaCorrente = new ContaCorrente(0, numeroConta, agenciaConta, 0, Integer.parseInt(idCliente));
        /*coloca o idcliente
         
         */
    }

    private static void criarContaPoupanca() {
        String idCliente = JOptionPane.showInputDialog("Insira um ID de Cliente: ");
        while (numerosId.contains(Integer.parseInt(idCliente)) == false) {
            JOptionPane.showMessageDialog(null, "ID inválido\nInsira um ID válido");
            idCliente = JOptionPane.showInputDialog("Insira um ID de Cliente: ");
        }
        int numeroConta = 100000000 + (int) (Math.random() * 899999999);
        int agenciaConta = 1000 + (int) (Math.random() * 89999);
        ContaPoupanca novacContaPoupanca = new ContaPoupanca(numeroConta, agenciaConta, 0, Integer.parseInt(idCliente), 1.5);
    }
    

}




