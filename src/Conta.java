import java.util.List;

public class Conta {

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

    public void mostrarSaldo(){
        /*deve retonar o saldo da conta
         */

    }

    public void depositar(){
    /* deve acrescentar ao saldo*/


    }
    public void transferir(){
        /*deve tirar do saldo e transferir para outra conta */

    }
    public void sacar(){
        /*deve retirar do saldo */

    }
    
    public void gerarNumerosConta(List<Conta> numeros) {

    }
    public void gerarNumeroAgencias(List<Conta> agencias) {

    }
    
}