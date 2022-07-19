package dio.java.entidades;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("*** Extrato Conta Poupança ****");
        super.imprimirStatus();
    }
}
