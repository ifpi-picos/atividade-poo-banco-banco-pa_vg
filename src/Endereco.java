public class Endereco {
    private String nomeRua;
    private String bairro;
    private int numeroCasa;

    public Endereco (String nomeRua, String bairro, int numeroCasa) {
        setNomeRua(nomeRua);
        setBairro(bairro);
        setNumeroCasa(numeroCasa);
    }

    public String getNomeRua() {
        return nomeRua;
    }
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumeroCasa() {
        return numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    

}
