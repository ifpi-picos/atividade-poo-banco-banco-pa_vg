import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private long cpf;
    private int idCliente;
    private Date dataNascimento;
    private List<Conta> contas;


    public Cliente(String nome, long cpf, int idCliente, Date dataNascimento){
        setNome(nome);
        setCpf(cpf);
        setIdCliente(idCliente);
        setDataNascimento(dataNascimento);

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
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
