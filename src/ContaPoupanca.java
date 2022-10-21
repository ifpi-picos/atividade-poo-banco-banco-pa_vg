public class ContaPoupanca extends Conta {
    
    private double rendimento;

    public ContaPoupanca(int numeroConta, int agenciaConta, float saldo, Cliente idCliente, double rendimento) {
        super(numeroConta, agenciaConta, saldo, idCliente);
        this.rendimento = rendimento;
    }

    public void tranferenciaTaxa(){
        /*deve pegar o valor da tranferencia adicionar a taxa e subtrair do saldo */
    }

}
