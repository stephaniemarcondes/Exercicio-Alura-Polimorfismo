public class Cliente {

       
    private String nome;
    private String cpf;
    private String profissão;

    String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String getProfissão() {
        return this.profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

}