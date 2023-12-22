import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        try {
            contarNumeros(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contarNumeros(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diferenca = segundoNumero - primeiroNumero;
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
