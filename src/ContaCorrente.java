public class ContaCorrente extends Conta {

    private float chequeEspecial;
    private int qtTransferencia;

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
    

    
    


}