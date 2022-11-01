import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private long cpf;
    private int idCliente;
    private Date dataNascimento;
    private Endereco endereco;
    private String senha;
    private List<ContaCorrente> contasCorrente;
    private List<ContaPoupanca> contasPoupanca;

    public void adicionarConta() {

    }

    public Cliente(String nome, long cpf, int idCliente, Date dataNascimento, Endereco endereco, String senha){
        setNome(nome);
        setCpf(cpf);
        setIdCliente(idCliente);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setSenha(senha);
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }

    public void adicionarContaCorrente(ContaCorrente contaCorrente) {
        this.contasCorrente.add(contaCorrente);
    }

    public void adicionarContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contasPoupanca.add(contaPoupanca);
    }

    

}
