import java.util.Scanner;

public class TesteBanco {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente();
        double saca;
        double deposita;
        double saldo;
        String nome;
            
              System.out.println("Digite o seu Nome");
              c1.nome = terminal.nextLine();
              System.out.println("Digite a Agencia");
              c1.nome = terminal.nextLine();
              System.out.println("Digite o Número da Agencia");
              c1.numero = terminal.nextDouble();
              System.out.println("Digite numero Conta Corrente");
              c1.numero = terminal.nextDouble();
              System.out.println("Digite o seu saque " );
              c1.saca = terminal.nextDouble();
              System.out.println("Digite o depósito ");
              c1.deposita = terminal.nextDouble();

             

              ContaPoupanca c2 = new ContaPoupanca();
              System.out.println("Digite o seu Nome");
              c2.nome = terminal.nextLine();
              System.out.println("Digite a Agencia");
              c2.nome = terminal.nextLine();
              System.out.println("Digite o Número da Agencia");
              c2.numero = terminal.nextDouble();
              System.out.println("Digite numero Conta Poupança");
              c2.numero = terminal.nextDouble();
              System.out.println("Digite o seu saque " );
              c2.saca = terminal.nextDouble();
              System.out.println("Digite o depósito ");
              c2.deposita = terminal.nextDouble();

		
	terminal.close();	
    }

}
