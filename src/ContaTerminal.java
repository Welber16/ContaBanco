import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa: Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;


        System.out.println(" Usuário: " + conta +  "(depois ENTER para o próximo campo)\n");

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + ", seu saldo é " + saldo + " já está disponível para saque.\n");


    }
}
