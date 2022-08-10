import java.util.Scanner;
// import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Locale locale = new Locale("pt", "BR");
        // int numerodaconta;
        // String agencia, nomeCliente;
        // double saldo;
        // System.out.println("Por favor, digite o número da Agencia: - ");
        // agencia = sc.nextLine();
        // System.out.println("Por favor, digite o número da Conta: - ");
        // numerodaconta = sc.nextInt();
        // System.out.println("Por favor, digite o nome do BENEFICIARIO da conta: - ");
        // nomeCliente = sc.next();
        // System.out.println("Por favor, digite o nome do SALDO da conta: - ");
        // saldo = sc.nextDouble();
        // System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numerodaconta + " e seu saldo de " + saldo + " já está disponível para saque.");
        String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
			nomes[i] = sc.nextLine();
			if (i == 2) {System.out.println(nomes[i]);};
			else if ( i == 6) {return nomes[i]};
			else if ( i == 8) {return nomes[i]};
        }
    }
}
