import java.util.Scanner;
public class Calculadora_com_menu_interativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0 ;
        double numero = 0;

        do {

            mostrarMenu();

            numero = lerOpcao(scanner);


            if (numero > 6) {

                System.out.println("digite uma opção valida. ");

            } else if (numero == 1) {


                resultado = fazerSoma(scanner);
                continuarCalculo(scanner, resultado, '+');

            } else if (numero == 2) {
                resultado = fazerSubtracao(scanner );
                continuarCalculo(scanner, resultado, '-');

            } else if (numero == 3) {
                resultado = fazerMultiplicacao(scanner);
                continuarCalculo(scanner, resultado, '*');


            } else if (numero == 4) {
                resultado = fazerDivisao(scanner);
                continuarCalculo(scanner, resultado, '/');

            } else if (numero == 5) {
               resultado = fazerPotencia(scanner);
                continuarCalculo(scanner, resultado, '^');

            } else if (numero == 6) {
                System.out.println("Saindo... ");
            }
        } while (numero != 6);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Qual tipo de cálculo você quer?");
        System.out.println("Digite 1 para soma.");
        System.out.println("Digite 2 para subtração.");
        System.out.println("Digite 3 para multiplicação.");
        System.out.println("Digite 4 para divisão.");
        System.out.println("Digite 5 para elevação.");
        System.out.println("Digite 6 para sair.");
    }

    public static double lerOpcao(Scanner scanner) {
        while (true) {

            double numero = 0;
            String entrada = scanner.nextLine();
            String numeroTexto = entrada.replaceAll("[^0-9.]", "");

            try {
                return Double.parseDouble(numeroTexto);
            } catch (NumberFormatException e) {
                System.out.println("Selecione uma opção válida.");

            }
        }
    }

    public static double fazerSoma(Scanner scanner) {

        double resultado = 0;

        System.out.println("Escreva os números que quer somar: ");
        String expressao = scanner.nextLine();

        String[] partes = expressao.split("\\+");

        try {
            resultado = lerDouble(partes[0]);

            for (int i = 1; i < partes.length; i++) {
                resultado += lerDouble(partes[i]);
            }

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números separados por +");
            return 0;
        }
        return resultado;
    }

    public static double continuarCalculo(Scanner scanner, double resultado ) {

        while (true) {

            System.out.println("(Digite outro número ou 'Sair' para voltar ao menu)");
            String proxEntrada = scanner.nextLine();

            if (proxEntrada.equalsIgnoreCase("Sair")) break;

            try {
                resultado += lerDouble(proxEntrada);
                System.out.println(resultado);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }
        return resultado;
    }
    public static double fazerSubtracao(Scanner scanner) {


        double resultado = 0;

        System.out.println("Escreva os números que quer subtrair: ");
        String expressao = scanner.nextLine();

        String[] partes = expressao.split("\\-");

        try {
            resultado = lerDouble(partes[0]);


            for (int i = 1; i < partes.length; i++) {
                resultado -= lerDouble(partes[i]);
            }

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números separados por -");
            return 0;
        }
        return resultado;
    }
    public static double fazerMultiplicacao(Scanner scanner) {
        double resultado = 0;

        System.out.println("Escreva os números que quer multiplicar: ");
        String expressao = scanner.nextLine();

        String[] partes = expressao.split("\\*");

        try {
            resultado = lerDouble(partes[0]);


            for (int i = 1; i < partes.length; i++) {
                resultado *= lerDouble(partes[i]);
            }

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números separados por *");
            return 0;
        }
        return resultado;
    }
    public static double fazerDivisao(Scanner scanner) {
        double resultado = 0;
        System.out.println("Escreva sua divisão. ");
        String expressao = scanner.nextLine();
        String[] MaisDe1divisao = expressao.split("/");
        resultado = lerDouble(MaisDe1divisao[0]);
        for (int i = 1; i < MaisDe1divisao.length; i++) {

            resultado /= lerDouble(MaisDe1divisao[i]);
        }
        System.out.println(resultado);
        return resultado;
    }
    public static double fazerPotencia(Scanner scanner) {
        double resultado = 0;
        System.out.println("Escreva a potência:");
        String expressao = scanner.nextLine();

        String[] partes = expressao.split("\\^");

        try {
            double base = lerDouble(partes[0]);
            double expoente = lerDouble(partes[1]);

            resultado = Math.pow(base, expoente);

            System.out.println(resultado);

        } catch (Exception e) {
            System.out.println("Erro: digite no formato 2^3");
        }
        return resultado;
    }
    public static double lerDouble(String texto) {
        return Double.parseDouble(texto.trim().replace(',', '.'));
    }
    public static double continuarCalculo(Scanner scanner, double resultado, char operador) {
        while (true) {
            System.out.println("(Digite outro número ou 'Sair')");

            String proxEntrada = scanner.nextLine();

            if (proxEntrada.equalsIgnoreCase("Sair"))
                break;

            double numero = lerDouble(proxEntrada);

            switch (operador) {
                case '+':
                    resultado += numero;
                    break;
                case '-':
                    resultado -= numero;
                    break;
                case '*':
                    resultado *= numero;
                    break;
                case '/':
                    resultado /= numero;
                    break;
                case  '^':
                    resultado = Math.pow(resultado, numero);
                    break;

            }

            System.out.println(resultado);
        }

        return resultado;
    }
}
