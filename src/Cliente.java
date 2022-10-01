import java.util.Date;

public class Cliente {
    private String nome;
    private int cpf;
    private int idCliente;
    private Date dataNascimento;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return cpf;
    }
    public void setCpf(int cpf) {
        cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void criarConta(){
        /*deve criar a conta */

    }
    public void logarConta(){
        /*deve entrar na conta do Cliente */


    }
    public void gerarId() {
        
    }
}
