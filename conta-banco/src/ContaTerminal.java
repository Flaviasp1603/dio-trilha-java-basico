import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta ");
        int numConta = scanner.nextInt();

        System.out.println("Digite o número da agência ");
        String agenciaBanco = scanner.next();
        
        System.out.println("Digite seu nome ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite seu saldo ");
        double saldo = scanner.nextDouble();  
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBanco + ", " + "conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
