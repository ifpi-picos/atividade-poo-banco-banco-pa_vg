import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

    private float chequeEspecial;
    private int qtTransferencia;//contador da quantidade de transferências realizadas

    public ContaCorrente(float chequeEspecial, int idCliente, int numeroConta, int agenciaConta, float saldo, int qtTransferencia) {
        super(idCliente, numeroConta, agenciaConta, saldo);

        setChequeEspecial(chequeEspecial);
        setQtTransferencia(qtTransferencia);
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public int getQtTransferencia() {
        return qtTransferencia;
    }

    public void setQtTransferencia(int qtTransferencia) {
        this.qtTransferencia = qtTransferencia;
    }
    
    @Override
    public void depositar(float valorDeposito) {
        if (valorDeposito <= 2000 - getChequeEspecial()){
            setChequeEspecial(getChequeEspecial() + valorDeposito);
            setSaldo(getSaldo() + valorDeposito);
        }
        else {
            float dif = 2000 - getChequeEspecial();
            setChequeEspecial(getChequeEspecial() + dif);
            setSaldo(getSaldo() + valorDeposito);
        }
    }

    @Override
    public void sacar(float valorSaque) {
        if (valorSaque <= getSaldo()) {
            setSaldo(getSaldo() - valorSaque);
        } else if (valorSaque <= getSaldo() + getChequeEspecial()) {
            setChequeEspecial(getChequeEspecial() - (valorSaque)  + getSaldo());
            setSaldo(getSaldo() - valorSaque);
        }
        else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERRO", 0);
        }
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
        }
        else if (valorTransferir <= getSaldo() + getChequeEspecial()) {
            setChequeEspecial(getChequeEspecial() - (valorTransferir) + getSaldo());
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

        if (getQtTransferencia() >= 2) {
            setSaldo(getSaldo() - valorTransferir * 0.05f); //taxa de transferência
            
        }
        setQtTransferencia(getQtTransferencia() + 1);
    }

    @Override
    public void transferirParaContaPoupanca(float valorTransferir, ContaPoupanca contaDestino) {
        if (valorTransferir <= getSaldo()) {
            setSaldo(getSaldo() - valorTransferir);
            contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferir);
        } else if (valorTransferir <= getSaldo() + getChequeEspecial()) {
            setChequeEspecial(getChequeEspecial() - (valorTransferir) + getSaldo());
            setSaldo(getSaldo() - valorTransferir);
            contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferir);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERRO", 0);
        }

        if (getQtTransferencia() >= 2) {
            setSaldo(getSaldo() - valorTransferir * 0.05f); //taxa de transferência
            
        }
        setQtTransferencia(getQtTransferencia() + 1);
    }
    


}