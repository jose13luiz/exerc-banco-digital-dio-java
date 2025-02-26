import java.util.Arrays;

public class Banco {

    private String nome;
    private int numero;
    private Conta[] contas;

    
    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", numero=" + numero + ", contas=" + Arrays.toString(contas) + "]";
    }

    public Banco(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.contas = new ContaCorrente[10];
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Conta[] getContas() {
        return contas;
    }


    public void setContas(Conta[] contas) {
        this.contas = contas;
    }
}
