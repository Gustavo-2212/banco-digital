package dio.java.entidades;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {

    private static int ID = 0;
    private String nome;
    private Endereco endereco = new Endereco();
    private Set<Cliente> clientes = new LinkedHashSet<>();

    public Banco(String nome, String cep, String numero) {
        this.nome = nome;
        this.endereco.setCep(cep);
        this.endereco.setNumero(numero);
        ID += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public boolean addCliente(Cliente cliente) {
        if(cliente == null) return false;
        
        clientes.add(cliente);

        return true;
    }

    public Cliente remClientes(Cliente cliente) {

        if( clientes.contains(cliente) ) {
            System.out.println("Cliente não cadastrado!");
            return null;
        }

        Iterator<Cliente> it = clientes.iterator();
        Cliente removedCliente = null;

        while(it.hasNext()) {
            if(it.next().getID() == cliente.getID()) {
                removedCliente = it.next();
                clientes.remove(it.next());
            }
        }

        return removedCliente;
    }

    public void imprimirClientes(){
        System.out.println(clientes);
    }

    public void enderecoBanco() { System.out.println(this.endereco); }
}
