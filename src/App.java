import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    //static List<Conta> contas = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static List<Integer> numerosId = new ArrayList<>();
    static List<ContaCorrente> contasC = new ArrayList<>();
    static List<ContaPoupanca> contasP = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        List<Integer> opcoesIniciais = new ArrayList<>();
        opcoesIniciais.add(1);
        opcoesIniciais.add(2);
        opcoesIniciais.add(3);

        int opcaoSelecionada = 1;
        while (opcoesIniciais.get(opcaoSelecionada) != 3) {
            opcaoSelecionada = exibirMenuInicial(opcoesIniciais);

            if (opcoesIniciais.get(opcaoSelecionada) == 1){ //cadastrar um cliente
                cadastrarCliente();
            }
            else if (opcoesIniciais.get(opcaoSelecionada) == 2) { //realizar login do cliente
                //telaLogin();
                String idClienteStr = JOptionPane.showInputDialog("Código de identificação(ID): ");
                String senha = JOptionPane.showInputDialog("Senha: ");
                int idCliente = Integer.parseInt(idClienteStr);

                for (Cliente cliente : clientes) { //percorrer a lista de clientes para encontrar o cliente com o ID e senha informado
                    if(idCliente == cliente.getIdCliente() && senha.equals(cliente.getSenha())) {
                        List<Integer> opcoes = new ArrayList<>();
                        opcoes.add(1);
                        opcoes.add(2);
                        opcoes.add(3);

                        Object[] opcoesObject = opcoes.toArray();
                        int opcaoEscolhida = 1;
                        while (opcoes.get(opcaoEscolhida) != 3) {
                            opcaoEscolhida = JOptionPane.showOptionDialog(null,
                            "1 - Criar conta\n2 - Acessar conta\n3 - Encerrar", " ", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE, null, opcoesObject, null);

                            if (opcoes.get(opcaoEscolhida) == 1) { //criar uma conta
                                List<Integer> opcoesTipo = new ArrayList<>();
                                opcoesTipo.add(1);
                                opcoesTipo.add(2);
                                //escolher o tipo de conta (corrente ou poupança)
                                Object[] opcoesArray = opcoesTipo.toArray();
                                int tipoConta = JOptionPane.showOptionDialog(null, 
                                "1 - Conta Corrente\n2 - Conta Poupança", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);                
                                if (opcoesTipo.get(tipoConta) == 1) {
                                    //criarContaCorrente();
                                    int numeroContaC = 10000 + (int) (Math.random() * 89999);
                                    int agenciaContaC = 10 + (int) (Math.random() * 89);

                                    ContaCorrente novaContaCorrente = new ContaCorrente(cliente.getIdCliente(), 2000, numeroContaC, agenciaContaC, 0);
                                    JOptionPane.showMessageDialog(null, "Cliente: " + cliente.getNome() + "\nID: " + cliente.getIdCliente() + "\n\nNúmero da conta: " + numeroContaC + "\nNúmero da agência: " + agenciaContaC,
                                    "CONTA CORRENTE CRIADA", JOptionPane.PLAIN_MESSAGE);
                                    contasC.add(novaContaCorrente);
                                }
                                else {
                                    //criarContaPoupanca();
                                    int numeroContaP = 10000 + (int) (Math.random() * 89999);
                                    int agenciaContaP = 10 + (int) (Math.random() * 89);

                                    ContaPoupanca novaContaPoupanca = new ContaPoupanca(cliente.getIdCliente(), numeroContaP, agenciaContaP, 0, 1.5);
                                    JOptionPane.showMessageDialog(null, "Cliente: " + cliente.getNome() + "\nID: " + cliente.getIdCliente() + "\n\nNúmero da conta: " + numeroContaP + "\nNúmero da agência: " + agenciaContaP,
                                    "CONTA POUPANÇA CRIADA", JOptionPane.PLAIN_MESSAGE);
                                    contasP.add(novaContaPoupanca);
                                }
                            }
                            else if (opcoes.get(opcaoEscolhida) == 2) { //entrar na conta
                                String numConta = JOptionPane.showInputDialog("Número da conta: ");
                                String agConta = JOptionPane.showInputDialog("Número da agência: ");
                                //teste:
                                for (ContaCorrente contaC:contasC) {
                                    if(Integer.parseInt(numConta) == contaC.getNumeroConta() && Integer.parseInt(agConta) == contaC.getAgenciaConta()) {
                                        System.out.println("OK");
                                    }
                                }
                            }
                        }
                    } else {
                        //senha incorreta
                        System.out.println("Senha incorreta");
                    }
                }
            }
        }
    }

    private static int exibirMenuInicial(List<Integer> opcoesIniciais) {
        Object[] opcoesArray = opcoesIniciais.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, 
        "1 - Cadastrar Cliente\n2 - Login\n3 - Encerrar", "Selecione", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesArray, opcoesArray);
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

    /*private static void criarContaCorrente() {
        int numeroConta = 100000000 + (int) (Math.random() * 899999999);
        int agenciaConta = 1000 + (int) (Math.random() * 8999);

        ContaCorrente novaContaCorrente = new ContaCorrente(2000, numeroConta, agenciaConta, 0);
        JOptionPane.showMessageDialog(null, "Número da conta: " + numeroConta + "\nNúmero da agência: " + agenciaConta,
        "CONTA CORRENTE CRIADA", JOptionPane.PLAIN_MESSAGE);
        //contas.add(novaContaCorrente);
    }*/

    /*private static void criarContaPoupanca(ContaPoupanca novaContaPoupanca) {
        int numeroConta = 100000000 + (int) (Math.random() * 899999999);
        int agenciaConta = 1000 + (int) (Math.random() * 8999);

        novaContaPoupanca = new ContaPoupanca(numeroConta, agenciaConta, 0, 1.5);
        JOptionPane.showMessageDialog(null, "Número da conta: " + numeroConta + "\nNúmero da agência: " + agenciaConta,
        "CONTA CORRENTE CRIADA", JOptionPane.PLAIN_MESSAGE);
    }*/
    

}




