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

}
