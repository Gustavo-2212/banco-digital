package dio.java.entidades;

public interface iConta {

    void sacar(double valor);

    void depositar(double valor);

    // polimorfismo: Parâmetro Conta: é geral para suas subclasses (ContaPoupança e ContaCorrente)
    void transferir(Conta contaDestino, double valor);

    void imprimirExtrato();
}
