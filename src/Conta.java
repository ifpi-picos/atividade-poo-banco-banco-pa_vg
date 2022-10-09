import java.util.List;

public abstract class Conta {

    private int numeroConta;
    private int agenciaConta;
    private float saldo;
    private Cliente idCliente;
    private List<Conta> numeros;
    private List<Conta> agencias;
    private List<Cliente> ids;


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
    
    public void gerarNumerosConta(List<Conta> numeros) {

    }
    public void gerarNumeroAgencias(List<Conta> agencias) {

    }
    
}