import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

    private float rendimento;

    public ContaPoupanca(int idCliente, int numeroConta, int agenciaConta, float saldo, float rendimento) {
        super(idCliente, numeroConta, agenciaConta, saldo);
        this.rendimento = rendimento;
    }
    

    public void tranferenciaTaxa(){
        /*deve pegar o valor da tranferencia adicionar a taxa e subtrair do saldo */
    }


    public float getRendimento() {
        return rendimento;
    }


    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
    @Override
    public void depositar(float valorDeposito){
        setSaldo(getSaldo() + valorDeposito + valorDeposito * getRendimento());

    }

    @Override
    public void transferirParaContaCorrente(float valorTransferir, ContaCorrente contaDestino) {
        if (valorTransferir <= getSaldo()) {
            setSaldo(getSaldo() - valorTransferir);
            if (valorTransferir <= 200 - contaDestino.getChequeEspecial()) {
                contaDestino.setChequeEspecial(contaDestino.getChequeEspecial() + valorTransferir);
                contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferir);
            } else {
                float dif = 2000 - contaDestino.getChequeEspecial();
                contaDestino.setChequeEspecial(contaDestino.getChequeEspecial() + dif);
                contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferir);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERRO", 0);
        }

        
        setSaldo(getSaldo() - valorTransferir * 0.05f); //taxa de transferência
    }

    @Override
    public void transferirParaContaPoupanca(float valorTransferir, ContaPoupanca contaDestino) {
        if (valorTransferir <= getSaldo()) {
            setSaldo(getSaldo() - valorTransferir);
            contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferir);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERRO", 0);
        }

        setSaldo(getSaldo() - valorTransferir * 0.05f); //taxa de transferência
    }
}
