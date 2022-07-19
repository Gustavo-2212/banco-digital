package dio.java.entidades;


public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        // TODO Auto-generated method stub
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirStatus(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}
