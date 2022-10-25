public abstract class Conta {

    private int numeroConta;
    private int agenciaConta;
    private float saldo;

    public Conta(int numeroConta, int agenciaConta, float saldo) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.saldo = saldo;
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

    public void depositar(){
    /* deve acrescentar ao saldo*/


    }
    public void sacar(){
        /*deve retirar do saldo, digite o valor a  ser sacado(confere se o valor  é maior que o saldo)*/
    
    }
    
}