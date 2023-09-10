import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o primeiro parametro: ");
        int p1 = input.nextInt();
        System.out.print("Insira o segundo parametro: ");
        int p2 = input.nextInt();
        input.close();
        try {
            contar(p1, p2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
        
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1 > p2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = p2 - p1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }

    }
}
