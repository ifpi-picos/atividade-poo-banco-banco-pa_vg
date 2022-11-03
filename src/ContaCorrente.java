public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public void tranferencia(){
        /*deve pegar o valor da tranferencia e subtrair do saldo */

    }

    public ContaCorrente(double chequeEspecial, int idCliente, int numeroConta, int agenciaConta, float saldo) {
        super(idCliente, numeroConta, agenciaConta, saldo);

        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    
    


}