import java.util.Scanner;
public class Calculadora_com_menu_interativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = fazerSoma(scanner) ;
        double numero = 0;

        do {

            mostrarMenu();

            numero = lerOpcao(scanner);


            if (numero > 6) {

                System.out.println("digite uma opção valida. ");

            } else if (numero == 1) {
                fazerSoma(scanner);
                continuarCalculo(scanner , resultado);

            } else if (numero == 2) {
                fazerSubtracao(scanner);


            } else if (numero == 3) {
                resultado = 0;
                System.out.println("Escreva os números que quer multiplicar. ");
                String expressao = scanner.nextLine();
                if (expressao.matches("[0-9.]*")) {
                    String[] MaisDe1multiplicacao = expressao.split("\\*");
                    resultado = Double.parseDouble(MaisDe1multiplicacao[0]);
                    for (int i = 1; i < MaisDe1multiplicacao.length; i++) {
                        resultado *= Double.parseDouble(MaisDe1multiplicacao[i]);
                    }
                    System.out.println(resultado);
                } else {
                    System.out.println("Digite uma opção valida. ");
                    continue;
                }
                do {
                    System.out.println("(Escreva o próximo número ou escreva Sair voltar para ao menu.)");
                    String proxEntrada = scanner.nextLine();
                    if (proxEntrada.equalsIgnoreCase("Sair")) break;
                    try {
                        resultado *= Double.parseDouble(proxEntrada);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("Selecione uma opção válida.");
                    }
                } while (true);


            } else if (numero == 4) {
                resultado = 0;
                System.out.println("Escreva sua divisão. ");
                String expressao = scanner.nextLine();
                String[] MaisDe1divisao = expressao.split("/");
                resultado = Double.parseDouble(MaisDe1divisao[0]);
                for (int i = 1; i < MaisDe1divisao.length; i++) {

                    resultado /= Double.parseDouble(MaisDe1divisao[i]);
                }
                System.out.println(resultado);
                do {
                    System.out.println("(Escreva o próximo número pelo qual você quer dividir o número que colocou ou escreva Sair voltar para ao menu.)");
                    String proxEntrada = scanner.nextLine();
                    if (proxEntrada.equalsIgnoreCase("Sair")) break;
                    try {
                        resultado /= Double.parseDouble(proxEntrada);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("Selecione uma opção válida.");
                    }
                } while (true);

            } else if (numero == 5) {
                resultado = 0;
                System.out.println(" Escreva o número que irá ser elevado. ");
                double NumeroASeElevar = scanner.nextDouble();
                System.out.println("Escreva o quanto quer eleva-lo ");
                double elevacao = scanner.nextDouble();
                double resultadoPotencia = Math.pow(NumeroASeElevar, elevacao);
                scanner.nextLine();
                System.out.println(NumeroASeElevar + " ^ " + elevacao + " = " + resultadoPotencia);
                do {
                    System.out.println("(Escreva o próximo número que pelo qual irá elevar o resultado ou escreva Sair voltar para ao menu.)");
                    String proxEntrada = scanner.nextLine();
                    if (proxEntrada.equalsIgnoreCase("Sair")) break;
                    try {
                        resultadoPotencia = Math.pow(resultadoPotencia, Double.parseDouble(proxEntrada));
                        System.out.println(resultadoPotencia);
                    } catch (NumberFormatException e) {
                        System.out.println("Selecione uma opção válida.");
                    }
                } while (true);
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
            resultado = Double.parseDouble(partes[0]);

            for (int i = 1; i < partes.length; i++) {
                resultado += Double.parseDouble(partes[i]);
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
                resultado += Double.parseDouble(proxEntrada);
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
            resultado = Double.parseDouble(partes[0]);

            for (int i = 1; i < partes.length; i++) {
                resultado -= Double.parseDouble(partes[i]);
            }

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números separados por -");
            return 0;
        }

        while (true) {
            System.out.println("(Digite outro número ou 'Sair' para voltar ao menu)");
            String proxEntrada = scanner.nextLine();

            if (proxEntrada.equalsIgnoreCase("Sair")) break;

            try {
                resultado -= Double.parseDouble(proxEntrada);
                System.out.println(resultado);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        return resultado;

    }
}


