package dio.java.entidades;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String cep, String estado, String cidade, String bairro, String rua, String numero) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
        this.cep = "";
        this.estado = "";
        this.cidade = "";
        this.bairro = "";
        this.rua = "";
        this.numero = "";
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nCEP: "+this.cep+
               "\nCidade: "+this.cidade+
               "\nBairro: "+this.bairro+
               "\nNúmero: "+this.numero;
    }
}
