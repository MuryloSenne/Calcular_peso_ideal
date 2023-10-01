import java.util.Scanner;

public class CalculadoraPesoIdeal {
    public static double calcularPesoIdeal(double altura, String sexo) {
        double pesoIdeal;
        
        if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo não reconhecido. Use 'masculino' ou 'feminino'.");
            return 0.0;
        }

        return pesoIdeal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        System.out.print("Digite o sexo (masculino/feminino): ");
        String sexo = scanner.nextLine();

        double pesoIdeal = calcularPesoIdeal(altura, sexo);
        if (pesoIdeal != 0.0) {
            System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);
        }
    }
}
