public class ContaCorrente implements Conta  {

    private double saldo;
    public String nome;
    public double numero;
    public double saca;
    public double deposita;
    
    @Override
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + ", nome=" + nome + ", numero=" + numero + ", saca=" + saca
                + ", deposita=" + deposita + "]";
    }
    
    
    @Override
    public void saca(double valor) {
        throw new UnsupportedOperationException("Unimplemented method 'saca'");
    }
    @Override
    public void deposita(double valor) {
        throw new UnsupportedOperationException("Unimplemented method 'deposita'");
    }
    @Override
    public void saldo(double valor) {
        throw new UnsupportedOperationException("Unimplemented method 'saldo'");
    }
    
   

}
