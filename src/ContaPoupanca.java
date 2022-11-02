public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int idCliente, int numeroConta, int agenciaConta, float saldo, double rendimento) {
        super(idCliente, numeroConta, agenciaConta, saldo);
        this.rendimento = rendimento;
    }
    

    public void tranferenciaTaxa(){
        /*deve pegar o valor da tranferencia adicionar a taxa e subtrair do saldo */
    }


    public double getRendimento() {
        return rendimento;
    }


    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

}
