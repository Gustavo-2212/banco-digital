package dio.java.principal;

import dio.java.entidades.Banco;
import dio.java.entidades.Cliente;
import dio.java.entidades.Conta;
import dio.java.entidades.ContaCorrente;
import dio.java.entidades.ContaPoupança;

public class App {
    public static void main(String[] args) {
        Banco bancoSantander = new Banco("Santander", "19239", "13331");
        Banco bancoItau = new Banco("Itau", "33312", "12114");

        Cliente maria = new Cliente("Maria", "900210", "18902");

        bancoItau.addCliente(new Cliente("José", "123321", "1223"));
        bancoSantander.addCliente(maria);

        Conta contaCorrenteA = new ContaCorrente(maria);
        Conta contaPoupançaA = new ContaPoupança(new Cliente("Antônia", "0100", "1433"));

        contaCorrenteA.depositar(160.6);
        contaPoupançaA.depositar(230.8);

        contaCorrenteA.transferir(new ContaPoupança(new Cliente("Gustavo", "9193", "21331")), 120);

        System.out.println("-----------------------------------------");
        contaCorrenteA.imprimirExtrato();

        System.out.println("-----------------------------------------");
        contaPoupançaA.imprimirExtrato();

        System.out.println("-----------------------------------------");
        bancoSantander.enderecoBanco();
        bancoSantander.imprimirClientes();

    }
}
