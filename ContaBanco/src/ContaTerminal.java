import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Declaração das Variaveis e criação do Scanner
        int nmrConta;
        String agencia;
        String nomeCliente;
        float saldoConta;
        Scanner input = new Scanner(System.in);

        //Imprime as mensagens e requisita os dados ao usuario.
        System.out.printf("Por favor, informe o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.printf("Insira o numero da conta: ");
        nmrConta = input.nextInt();
        System.out.printf("Insira o numero da agencia: ");
        agencia = input.next();
        System.out.printf("Insira o deposito Inicial: ");
        saldoConta = input.nextFloat();

        input.close();

        //Imprime a mensagem com os dados fornecidos pelo usuario.
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência %s, conta %d e seu saldo %.2f já esta disponivel para saque.",
                nomeCliente, agencia, nmrConta, saldoConta);
    }
}
