public abstract class Conta {

    private int numeroConta;
    private int agenciaConta;
    private float saldo;
    private Cliente idCliente;

    public Conta(int numeroConta, int agenciaConta, float saldo, Cliente idCliente) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }
    public void setAgenciaConta(int agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }


    public void depositar(){
    /* deve acrescentar ao saldo*/


    }
    public void sacar(){
        /*deve retirar do saldo, digite o valor a  ser sacado(confere se o valor  é maior que o saldo)*/
    
    }
    
}