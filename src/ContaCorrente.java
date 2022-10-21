public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public void tranferencia(){
        /*deve pegar o valor da tranferencia e subtrair do saldo */

    }

    public ContaCorrente(double chequeEspecial, int numeroConta, int agenciaConta, float saldo, int idCliente) {
        super(numeroConta, agenciaConta, saldo, idCliente);

        this.chequeEspecial = chequeEspecial;
    }

    


}