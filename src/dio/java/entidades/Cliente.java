package dio.java.entidades;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class Cliente {

    private String nome;
    private static int ID = 0;
    private Endereco endereco = new Endereco();
    private Set<Conta> contas = new LinkedHashSet<>();

    public Cliente(String nome, String cep, String numero) {
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

    public boolean addConta(Conta conta) {
        if(conta == null) return false;
        
        this.contas.add(conta);

        return true;
    }

    public Conta remContas(Conta conta) {

        if( this.contas.contains(conta) ) {
            System.out.println("Conta não cadastrado!");
            return null;
        }

        Iterator<Conta> it = this.contas.iterator();
        Conta removedConta = null;

        while(it.hasNext()) {
            if(it.next().getNumero() == conta.getNumero()) {
                removedConta = it.next();
                contas.remove(it.next());
            }
        }

        return removedConta;
    }

    public void imprimirContas(){
        System.out.println(contas);
    }

    public void enderecoBanco() { System.out.println(this.endereco); }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nID: "+ID+
               "\nNome: "+this.nome+
               "\nContas: "+this.contas;
    }
}
